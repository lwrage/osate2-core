package org.osate.ge.internal.refactoring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.eclipse.xtext.resource.IFragmentProvider;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.RefactoringResourceSetProvider;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.ComponentTypeRename;
import org.osate.aadl2.Feature;
import org.osate.aadl2.Realization;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.aadl2.modelsupport.resources.PredeclaredProperties;
import org.osate.ge.internal.diagram.runtime.CanonicalBusinessObjectReference;
import org.osate.ge.internal.diagram.runtime.RelativeBusinessObjectReference;
import org.osate.ge.internal.services.DiagramService;
import org.osate.ge.internal.services.ReferenceService;
import org.osate.ge.internal.ui.xtext.AgeXtextUtil;
import org.osate.ge.internal.util.ScopedEMFIndexRetrieval;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

@SuppressWarnings("restriction")
public class AgeRenameParticipant extends RenameParticipant {
	private final Map<CanonicalBusinessObjectReference, UriAndRelativeReference> originalCanRefToNewInfoMap = new HashMap<>();
	private IRenameElementContext ctx;
	private EObject targetObject;
	private ReferenceService referenceService;
	private DiagramService diagramService;
	private ResourceSet refactoringResourceSet;
	private IProject project;
	private DiagramService.ReferenceCollection originalReferences; // The original set of references during the refactoring. They are stored before the change because the model change will have occured before the change is executed.
	
	private static class UriAndRelativeReference {
		public final URI uri;
		public final RelativeBusinessObjectReference relRef;
		
		public UriAndRelativeReference(final URI uri, final RelativeBusinessObjectReference relRef) {
			this.uri = Objects.requireNonNull(uri, "uri must not be null");
			this.relRef = Objects.requireNonNull(relRef, "relRef must not be null");			
		}
	}
	
	@Override
	protected boolean initialize(final Object element) {
		originalCanRefToNewInfoMap.clear();
		
		if(!(element instanceof IRenameElementContext)) {
			return false;
		}

		ctx = (IRenameElementContext)element;

		final URI targetElementUri = ctx.getTargetElementURI();
		if(targetElementUri == null) {
			return false;
		}
		
		final IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(targetElementUri.toPlatformString(true)));
		if(resource == null) {
			return false;
		}
		
		XtextResource xtextResource = AgeXtextUtil.getOpenXtextResource(resource);
		final XtextResourceSet tmpRs = xtextResource == null ? OsateResourceUtil.createXtextResourceSet() : (XtextResourceSet)xtextResource.getResourceSet();
		if(tmpRs == null) {
			return false;			
		}
		
		targetObject = tmpRs.getEObject(targetElementUri, true);
		if(targetObject == null || !(targetObject.eResource() instanceof XtextResource)) {
			return false;				
		}
		
		xtextResource = (XtextResource)targetObject.eResource();
	
		// Get the provider for the refactoring resource set
		final RefactoringResourceSetProvider refactoringResourceSetProvider = xtextResource.getResourceServiceProvider().get(RefactoringResourceSetProvider.class);
		final IPath projectPath = new Path(targetElementUri.toPlatformString(true)).uptoSegment(1);
		final IResource projectResource = ResourcesPlugin.getWorkspace().getRoot().findMember(projectPath);
		if(!(projectResource instanceof IProject)) {
			return false;
		}
		project = (IProject)projectResource;
		
		// Get the refactoring resource set
		refactoringResourceSet = (XtextResourceSet)refactoringResourceSetProvider.get(project);
		if(refactoringResourceSet == null) {
			return false;
		}

		// Get global services
		final Bundle bundle = FrameworkUtil.getBundle(getClass());	
		final IEclipseContext context =  EclipseContextFactory.getServiceContext(bundle.getBundleContext()).createChild();
		referenceService = Objects.requireNonNull(context.get(ReferenceService.class), "Unable to get reference service"); 
		diagramService = Objects.requireNonNull(context.get(DiagramService.class), "Unable to get diagram service");
			
		// Get projects with are affected by the refactoring.
		final Set<IProject> relevantProjects = getAffectedProjects(project, new HashSet<>());
		
		// Build a mapping between an EObject URI and the URIs of EObjects that it affects.
		final Map<URI, Set<URI>> externalReferencesMap = buildExternalReferenceMap(relevantProjects);
		
		// Find all dependent objects
		final Set<EObject> dependentObjects = getDependentObjects(targetObject, targetObject.eResource().getResourceSet(), externalReferencesMap);
		dependentObjects.add(targetObject);
				
		for(final EObject dirtyObject : dependentObjects) {
			final URI uri = getNameIndependentUri(dirtyObject);
			if(uri != null) {
				final CanonicalBusinessObjectReference canonicalReference = referenceService.getCanonicalReference(dirtyObject);
				final RelativeBusinessObjectReference relativeReference = referenceService.getRelativeReference(dirtyObject);
				if(canonicalReference != null && relativeReference != null) {
					originalCanRefToNewInfoMap.put(canonicalReference, new UriAndRelativeReference(uri, relativeReference));
				}
			}
		}

		// Initialize is called many times so it would be best to do it before the change is made but not in the initialization phase
		originalReferences = diagramService.getReferences(relevantProjects, originalCanRefToNewInfoMap.keySet());
		
		return true;
	}
	
	/**
	 * Get affects projects. At this point, this function returns projects which directly or indirectly reference the project containing the model element.
	 * @param project
	 * @param relevantProjects
	 * @return relevantProjects
	 */
	private static Set<IProject> getAffectedProjects(final IProject project, final Set<IProject> relevantProjects) {
		if(project.isAccessible()) {
			if(relevantProjects.add(project)) {
				// Get referencing projects if the project was not already part of the relevant projects set
				for(final IProject referencingProject : project.getReferencingProjects()) {
					getAffectedProjects(referencingProject, relevantProjects);
				}
				
				// Get referencing projects if the project was not already part of the relevant projects set
				try {
					for(final IProject referencedProject : project.getReferencedProjects()) {
						// Don't handle the plugin resources project or the set of referencing and referenced projects will likely contain all AADL projects
						if(!PredeclaredProperties.PLUGIN_RESOURCES_PROJECT_NAME.equalsIgnoreCase(referencedProject.getName())) {
							getAffectedProjects(referencedProject, relevantProjects);	
						}						
					}
				} catch (final CoreException e) {
					// Ignore
				}
			}
		}
		
		return relevantProjects;
	}

	@Override
	public String getName() {
		return "AgeRenameParticipant";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context)
			throws OperationCanceledException {
		return null;
	}

	@Override
	public Change createChange(final IProgressMonitor pm) throws CoreException, OperationCanceledException {
		return new Change() {
			@Override
			public String getName() {
				return "OSATE Graphical Editor Diagram Change";
			}

			@Override
			public void initializeValidationData(final IProgressMonitor pm) {
			}

			@Override
			public RefactoringStatus isValid(final IProgressMonitor pm) throws CoreException, OperationCanceledException {
				return new RefactoringStatus();
			}

			@Override
			public Change perform(final IProgressMonitor pm) throws CoreException {
				final Map<CanonicalBusinessObjectReference, CanonicalBusinessObjectReference> originalCanRefToNewCanRefMap = new HashMap<>();
				final Map<CanonicalBusinessObjectReference, RelativeBusinessObjectReference> originalCanRefToNewRelRefMap = new HashMap<>();
				final Map<CanonicalBusinessObjectReference, CanonicalBusinessObjectReference> newCanRefToOriginalCanRefMap = new HashMap<>();
				final Map<CanonicalBusinessObjectReference, RelativeBusinessObjectReference> newCanRefToOriginalRelRefMap = new HashMap<>();
				
				// Build a mapping from the original canonical reference to the new business object
				//final Map<CanonicalBusinessObjectReference, Object> originalCanonicalReferenceToNewObjectMap = new HashMap<>();
				for(final Entry<CanonicalBusinessObjectReference, UriAndRelativeReference> entry : originalCanRefToNewInfoMap.entrySet()) {
					final EObject newObject = refactoringResourceSet.getEObject(entry.getValue().uri, true);
					if(newObject != null) {
						final CanonicalBusinessObjectReference originalCanRef = entry.getKey();						
						final CanonicalBusinessObjectReference newCanRef = referenceService.getCanonicalReference(newObject);
						final RelativeBusinessObjectReference newRelRef = referenceService.getRelativeReference(newObject);
						final RelativeBusinessObjectReference originalRelRef = entry.getValue().relRef;
						
						if(newCanRef != null && newRelRef != null) {
							originalCanRefToNewCanRefMap.put(originalCanRef, newCanRef);
							originalCanRefToNewRelRefMap.put(originalCanRef, newRelRef);			
							newCanRefToOriginalCanRefMap.put(newCanRef, originalCanRef);
							newCanRefToOriginalRelRefMap.put(newCanRef, originalRelRef);
						}
					}
				}
				
				// Update the references
				final ReversableUpdatedReferencedValueProvider mapping = new ReversableUpdatedReferencedValueProvider(originalCanRefToNewCanRefMap, originalCanRefToNewRelRefMap, newCanRefToOriginalCanRefMap, newCanRefToOriginalRelRefMap);
				originalReferences.update(mapping);						
				return new UndoChange(mapping.getReverse());
			}
			
			@Override
			public Object getModifiedElement() {
				return null;
			}
			
		};
	}

	// Builds a mapping between EObject URIs and the URIs of EObjects that it affects based on the EMF Index.
	private static final Map<URI, Set<URI>> buildExternalReferenceMap(final Set<IProject> projects) {
		final Map<URI, Set<URI>> externalReferencesMap = new HashMap<>();
		for(final IResourceDescription resourceDescription : ScopedEMFIndexRetrieval.calculateResourceDescriptions(projects)) {
			for(final IReferenceDescription refDescription : resourceDescription.getReferenceDescriptions()) {
				final EReference ref = refDescription.getEReference();				
				if(isHandledRefinedReference(ref)) {
					if(refDescription.getSourceEObjectUri() != null && refDescription.getTargetEObjectUri() != null) {
						Set<URI> affectedUris = externalReferencesMap.get(refDescription.getTargetEObjectUri());
						if(affectedUris == null) {
							affectedUris = new HashSet<>();
							externalReferencesMap.put(refDescription.getTargetEObjectUri(), affectedUris);
						}
						
						affectedUris.add(refDescription.getSourceEObjectUri());
					}
				}
			}
		}
		
		return externalReferencesMap;
	}
	
	/**
	 * Gets the URI for the object using the default referencing scheme. That is, it does not use the specialized fragment provider the resource may have.
	 * This is needed to allow creating URIs which do not include the name of the object being referenced but rather describe the position of the object in the resource.
	 * This type of URI is better suited to getting the new objects after renaming. 
	 * @param obj
	 * @return
	 */
	private static URI getNameIndependentUri(final EObject obj) {
		// Set the fragment processor of the resources to null so that the URI generated will be based on ordering and not actual names
		IFragmentProvider oldFragmentProvider = null;
		XtextResource res = null;
		try {
			if(obj.eResource() instanceof XtextResource) {
				res = (XtextResource)obj.eResource();
				oldFragmentProvider = res.getFragmentProvider();
				res.setFragmentProvider(null);
			}
			
			// Store the URIs
			return EcoreUtil.getURI(obj);
	
			
		} finally {
			// Restore the old fragment processor
			if(oldFragmentProvider != null) {
				res.setFragmentProvider(oldFragmentProvider);
			}
		}
	}

	private static Set<EObject> getDependentObjects(final EObject obj, final ResourceSet rs, final Map<URI, Set<URI>> externalReferencesMap) {
		final Set<EObject> results = new HashSet<>();
		final EObject objectOfInterest;
		
		// If the object is a component type rename, replace it with the component type it renames. This will result in additional objects being returned but it
		// is the only known way of getting types related to the renames.
		if(obj instanceof ComponentTypeRename) {
			final ComponentType renamedComponentType = ((ComponentTypeRename)obj).getRenamedComponentType();
			objectOfInterest = renamedComponentType == null ? null : renamedComponentType;
		} else {
			objectOfInterest = obj;
		}

		if(objectOfInterest != null) {
			getRelatedObjects(Collections.singleton(objectOfInterest), rs, results, externalReferencesMap, obj instanceof Feature);
		}
		
		return results;
	}
	
	// Gets objects related to the specified objects of interest
	private static void getRelatedObjects(Collection<EObject> objectsOfInterest, 
			final ResourceSet rs, 
			final Set<EObject> results, 
			final Map<URI, Set<URI>> externalReferencesMap,
			final boolean recursive) {
		final Collection<EObject> newObjects = new ArrayList<>();
		for(final Collection<Setting> settings : UsageCrossReferencer.findAll(objectsOfInterest, rs).values()) {
			for(final Setting s : settings) {
				final EStructuralFeature sf = s.getEStructuralFeature();
				if(isHandledRefinedReference(sf)) {
					newObjects.add(s.getEObject());
				} else if(sf == Aadl2Package.eINSTANCE.getRealization_Implemented()) {
					// Get the component implementation from the realization
					final Realization realization = (Realization)s.getEObject();
					newObjects.add(realization.getSpecific());
				}
			}
		}
		
		for(final EObject objectOfInterest : objectsOfInterest) {
			final URI objectOfInterestUri = EcoreUtil.getURI(objectOfInterest);
			if(objectOfInterestUri != null) {
				// Add objects references in the external references map
				final Set<URI> affectedUris = externalReferencesMap.get(objectOfInterestUri);
				if(affectedUris != null) {
					for(final URI affectedUri : affectedUris) {
						final EObject affectedObject = rs.getEObject(affectedUri, true);
						if(affectedObject != null) {
							newObjects.add(affectedObject);
						}
					}
				}
			}
		}
		
		if(results.addAll(newObjects)) {
			if(recursive) {
				getRelatedObjects(newObjects, rs, results, externalReferencesMap, recursive);
			}
		}
	}

	private static boolean isHandledRefinedReference(final EStructuralFeature sf) {
		return sf == Aadl2Package.eINSTANCE.getFeature_Refined() ||
			sf == Aadl2Package.eINSTANCE.getConnection_Refined() || 
			sf == Aadl2Package.eINSTANCE.getSubcomponent_Refined() ||
			sf == Aadl2Package.eINSTANCE.getSubcomponent_Refined() ||
			sf == Aadl2Package.eINSTANCE.getFlowSpecification_Refined();
	}
		
	

	private static class ReversableUpdatedReferencedValueProvider implements DiagramService.UpdatedReferenceValueProvider {
		private final Map<CanonicalBusinessObjectReference, CanonicalBusinessObjectReference> originalCanRefToNewCanRefMap;
		private final Map<CanonicalBusinessObjectReference, RelativeBusinessObjectReference> originalCanRefToNewRelRefMap;
		private final Map<CanonicalBusinessObjectReference, CanonicalBusinessObjectReference> newCanRefToOriginalCanRefMap;
		private final Map<CanonicalBusinessObjectReference, RelativeBusinessObjectReference> newCanRefToOriginalRelRefMap;
		
		public ReversableUpdatedReferencedValueProvider(final Map<CanonicalBusinessObjectReference, CanonicalBusinessObjectReference> originalCanRefToNewCanRefMap,
				final Map<CanonicalBusinessObjectReference, RelativeBusinessObjectReference> originalCanRefToNewRelRefMap,
				final Map<CanonicalBusinessObjectReference, CanonicalBusinessObjectReference> newCanRefToOriginalCanRefMap,
				final Map<CanonicalBusinessObjectReference, RelativeBusinessObjectReference> newCanRefToOriginalRelRefMap) {
			this.originalCanRefToNewCanRefMap = originalCanRefToNewCanRefMap;
			this.originalCanRefToNewRelRefMap = originalCanRefToNewRelRefMap;
			this.newCanRefToOriginalCanRefMap = newCanRefToOriginalCanRefMap;
			this.newCanRefToOriginalRelRefMap = newCanRefToOriginalRelRefMap;
		}
		
		@Override
		public CanonicalBusinessObjectReference getNewCanonicalReference(
				final CanonicalBusinessObjectReference originalCanonicalReference) {
			return originalCanRefToNewCanRefMap.get(originalCanonicalReference);
		}

		@Override
		public RelativeBusinessObjectReference getNewRelativeReference(
				final CanonicalBusinessObjectReference originalCanonicalReference) {
			return originalCanRefToNewRelRefMap.get(originalCanonicalReference);
		}		
		
		// Result shares mappings with original
		public ReversableUpdatedReferencedValueProvider getReverse() {
			return new ReversableUpdatedReferencedValueProvider(newCanRefToOriginalCanRefMap, newCanRefToOriginalRelRefMap,
					originalCanRefToNewCanRefMap, originalCanRefToNewRelRefMap);
		}
		
		public Set<CanonicalBusinessObjectReference> getOriginalCanonicalReferences() {
			return originalCanRefToNewCanRefMap.keySet();
		}
	};
	
	private class UndoChange extends Change {
		private final ReversableUpdatedReferencedValueProvider mapping;
		
		public UndoChange(final ReversableUpdatedReferencedValueProvider mapping) {
			this.mapping = Objects.requireNonNull(mapping, "mapping must not be null");
		}
		
		@Override
		public String getName() {
			return "OSATE Graphical Editor Diagram Change";
		}

		@Override
		public void initializeValidationData(final IProgressMonitor pm) {
		}

		@Override
		public RefactoringStatus isValid(final IProgressMonitor pm) throws CoreException, OperationCanceledException {
			return new RefactoringStatus();
		}

		@Override
		public Change perform(final IProgressMonitor pm) throws CoreException {
			final Set<IProject> relevantProjects = getAffectedProjects(project, new HashSet<>());
			final DiagramService.ReferenceCollection references = diagramService.getReferences(relevantProjects, mapping.getOriginalCanonicalReferences());			
			references.update(mapping);
	
			return new UndoChange(mapping.getReverse());
		}
		
		@Override
		public Object getModifiedElement() {
			return null;
		}
	}
}
