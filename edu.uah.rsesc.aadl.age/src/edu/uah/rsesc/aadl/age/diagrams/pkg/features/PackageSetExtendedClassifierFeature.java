package edu.uah.rsesc.aadl.age.diagrams.pkg.features;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.osate.aadl2.Aadl2Factory;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.FeatureGroupType;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PackageSection;
import org.osate.xtext.aadl2.properties.util.EMFIndexRetrieval;

import edu.uah.rsesc.aadl.age.dialogs.ElementSelectionDialog;
import edu.uah.rsesc.aadl.age.services.BusinessObjectResolutionService;
import edu.uah.rsesc.aadl.age.services.ModificationService;
import edu.uah.rsesc.aadl.age.services.ModificationService.Modifier;

public class PackageSetExtendedClassifierFeature extends AbstractCustomFeature {
	private final BusinessObjectResolutionService bor;
	private final ModificationService modificationService;
	
	@Inject
	public PackageSetExtendedClassifierFeature(final IFeatureProvider fp, final BusinessObjectResolutionService bor, final ModificationService modificationService) {
		super(fp);
		this.bor = bor;
		this.modificationService = modificationService;
	}

	@Override
	public String getDescription() {
		return "Set the classifier that the classifier extends.";
	}

	@Override
	public String getName() {
		return "Set Extended Classifier";
	}

	@Override
	public boolean canUndo(final IContext context) {
		return false;
	}
	
	@Override
	public boolean isAvailable(final IContext context) {
		final ICustomContext customCtx = (ICustomContext)context;
		
		if(customCtx.getPictogramElements().length < 1) {
			return false;
		}
		final Object bo = bor.getBusinessObjectForPictogramElement(customCtx.getPictogramElements()[0]);	
		return bo instanceof ComponentType || bo instanceof ComponentImplementation || bo instanceof FeatureGroupType;		
	}
	
	@Override
	public boolean canExecute(final ICustomContext context) {
		if(context.getPictogramElements().length < 1) {
			return false;
		}
		
		final Object bo = bor.getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);		
		
		// Only allow setting on classifiers that are not extending another classifier
		if(bo instanceof ComponentType) {
			return ((ComponentType) bo).getExtended() == null;
		} else if(bo instanceof ComponentImplementation) {
			return ((ComponentImplementation) bo).getExtended() == null;
		} else if(bo instanceof FeatureGroupType) {
			return ((FeatureGroupType) bo).getExtended() == null;
		}
		
		return false;
	}
	
	@Override
	public void execute(final ICustomContext context) {
		final NamedElement bo = (NamedElement)bor.getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
		
		// Prompt the user for the element
		final ElementSelectionDialog dlg = new ElementSelectionDialog(Display.getCurrent().getActiveShell(), "Select a classifier to extend.", getExtensibleClassifierDescriptions(bo));
		if(dlg.open() == Dialog.CANCEL) {
			return;
		}			
		
		// Make the modification
		final AadlPackage pkg = (AadlPackage)bor.getBusinessObjectForPictogramElement(getDiagram());
		modificationService.modifyModel(pkg, new Modifier<Object>() {
			@Override
			public Object modify(final Resource resource) {
				final AadlPackage pkg = (AadlPackage)resource.getContents().get(0);
				final PackageSection section = pkg.getPublicSection();
				
				// Resolve the selected classifier
				final Classifier selectedClassifier = (dlg.getSelectedElement() != null && dlg.getSelectedElement().eIsProxy()) ? (Classifier)EcoreUtil.resolve(dlg.getSelectedElement(), resource) : (Classifier)dlg.getSelectedElement();
				if(selectedClassifier == null) {
					return null;
				}
				
				// Import the package if necessary
				final AadlPackage selectedClassifierPkg = (AadlPackage)selectedClassifier.getNamespace().getOwner();
				if(pkg != selectedClassifierPkg && !section.getImportedUnits().contains(selectedClassifierPkg)) {
					section.getImportedUnits().add(selectedClassifierPkg);
				}
				
				// Extend the classifier
				if(bo instanceof ComponentType) {
					((ComponentType)bo).createOwnedExtension().setExtended((ComponentType)selectedClassifier);
				} else if(bo instanceof ComponentImplementation) {
					((ComponentImplementation) bo).createOwnedExtension().setExtended((ComponentImplementation)selectedClassifier);
				} else if(bo instanceof FeatureGroupType) {
					((FeatureGroupType) bo).createOwnedExtension().setExtended((FeatureGroupType)selectedClassifier);
				}

				return null;
			}			
		});
	}
	
	/**
	 * Return a list of EObjectDescriptions for classifiers that could be extended.
	 * @return
	 */
	private List<IEObjectDescription> getExtensibleClassifierDescriptions(final NamedElement bo) {
		final List<IEObjectDescription> objectDescriptions = new ArrayList<IEObjectDescription>();
		final String name = bo.getQualifiedName();
		
		// Populate the list with valid classifier descriptions
		if(name != null) {		
			for(final IEObjectDescription desc : EMFIndexRetrieval.getAllClassifiersOfTypeInWorkspace(bo.eClass())) {
				if(!name.equalsIgnoreCase(desc.getName().toString())) {
					objectDescriptions.add(desc);
				}
			}
			
			// Ensure that abstract classifiers are in the list
			if(bo instanceof ComponentType) {
				if(bo.eClass() != Aadl2Factory.eINSTANCE.getAadl2Package().getAbstractType()) {
					for(final IEObjectDescription desc : EMFIndexRetrieval.getAllClassifiersOfTypeInWorkspace(Aadl2Factory.eINSTANCE.getAadl2Package().getAbstractType())) {
						if(!name.equalsIgnoreCase(desc.getName().toString())) {
							objectDescriptions.add(desc);
						}
					}
				}
			} else if(bo instanceof ComponentImplementation) {
					if(bo.eClass() != Aadl2Factory.eINSTANCE.getAadl2Package().getAbstractImplementation()) {
					for(final IEObjectDescription desc : EMFIndexRetrieval.getAllClassifiersOfTypeInWorkspace(Aadl2Factory.eINSTANCE.getAadl2Package().getAbstractImplementation())) {
						if(!name.equalsIgnoreCase(desc.getName().toString())) {
							objectDescriptions.add(desc);
						}
					}
				}
			}	
		}
		
		return objectDescriptions;
	}
}
