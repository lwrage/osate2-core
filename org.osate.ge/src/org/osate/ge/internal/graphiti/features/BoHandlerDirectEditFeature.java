package org.osate.ge.internal.graphiti.features;

import org.eclipse.jface.dialogs.Dialog;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import javax.inject.Inject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.ICustomUndoRedoFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;
import org.eclipse.ltk.ui.refactoring.RefactoringUI;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.refactoring.IRenameRefactoringProvider;
import org.eclipse.xtext.ui.refactoring.impl.AbstractRenameProcessor;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.NamedElement;
import org.osate.ge.di.Names;
import org.osate.ge.di.ValidateName;
import org.osate.ge.internal.di.CanRename;
import org.osate.ge.internal.di.GetNameForEditing;
import org.osate.ge.internal.di.InternalNames;
import org.osate.ge.internal.diagram.DiagramElement;
import org.osate.ge.internal.graphiti.ShapeNames;
import org.osate.ge.internal.graphiti.diagram.PropertyUtil;
import org.osate.ge.internal.graphiti.services.GraphitiService;
import org.osate.ge.internal.services.ExtensionService;
import org.osate.ge.internal.util.AnnotationUtil;

// Direct Editing Feature implementation that uses Xtext/LTK refactoring to rename an element.
// Uses businesss Object Handlers to determine if an element can be renamed.
// Only supports NamedElement objects.
@SuppressWarnings("restriction")
public class BoHandlerDirectEditFeature extends AbstractDirectEditingFeature implements ICustomUndoRedoFeature {
	private final GraphitiService graphitiService;
	private final ExtensionService extService;
	
	@Inject
	public BoHandlerDirectEditFeature(final IFeatureProvider fp, 
			final GraphitiService graphitiService,
			final ExtensionService extService) {
		super(fp);
		this.graphitiService = Objects.requireNonNull(graphitiService, "graphitiService must not be null");
		this.extService = Objects.requireNonNull(extService, "extService must not be null");
	}

	@Override
    public boolean canDirectEdit(final IDirectEditingContext context) {
		final DiagramElement de = graphitiService.getGraphitiAgeDiagram().getClosestDiagramElement(context.getPictogramElement());
		if(de == null) {
			return false;
		}
		
		final Object bo = de.getBusinessObject();
		if(!(bo instanceof NamedElement)) {
			return false;
		}
		
		if(getRenameRefactoring((NamedElement)bo) == null) {
			return false;
		}
		
		if(!ShapeNames.primaryLabelShapeName.equals(PropertyUtil.getName(context.getPictogramElement()))) {
			return false;
		}
		
		final IEclipseContext childCtx = extService.createChildContext();
		final Object handler = de.getBusinessObjectHandler();
		boolean canRename = true;
		try {
			childCtx.set(Names.BUSINESS_OBJECT, bo);
			childCtx.set(Names.BUSINESS_OBJECT_CONTEXT, de);
			canRename = (boolean)ContextInjectionFactory.invoke(handler, CanRename.class, childCtx, true);
			if(!canRename) {
				return false;
			}
		} finally {
			childCtx.dispose();
		}
		
		return AnnotationUtil.hasMethodWithAnnotation(ValidateName.class, handler);
	}
	
	@Override
	public int getEditingType() {
		return TYPE_TEXT;
	}
	
	@Override
	public boolean stretchFieldToFitText() {
		return true;
	}

    @Override
    public String checkValueValid(final String value, final IDirectEditingContext context) {
		final DiagramElement de = graphitiService.getGraphitiAgeDiagram().getClosestDiagramElement(context.getPictogramElement());
		if(de == null) {
			return "Unable to get diagram element.";
		}
		
    	final Object bo = de.getBusinessObject();
		final Object handler = de.getBusinessObjectHandler();
		final IEclipseContext childCtx = extService.createChildContext();
		try {
			childCtx.set(Names.BUSINESS_OBJECT, bo);
			childCtx.set(Names.NAME, value);
			childCtx.set(InternalNames.PROJECT, graphitiService.getProject());
			return (String)ContextInjectionFactory.invoke(handler, ValidateName.class, childCtx, null);			
		} finally {
			childCtx.dispose();
		}
    }    
	
	@Override
	public String getInitialValue(final IDirectEditingContext context) {
		final DiagramElement de = graphitiService.getGraphitiAgeDiagram().getClosestDiagramElement(context.getPictogramElement());
		final Object bo = de.getBusinessObject();
		final Object handler = de.getBusinessObjectHandler();
		
		// Attempt to use the value provided by the method annotated with GetNameForEditing first
		final IEclipseContext childCtx = extService.createChildContext();
		try {
			childCtx.set(Names.BUSINESS_OBJECT, bo);
			childCtx.set(Names.BUSINESS_OBJECT_CONTEXT, de);
			String result = (String)ContextInjectionFactory.invoke(handler, GetNameForEditing.class, childCtx, null);
			if(result != null) {
				return result;
			}
		} finally {
			childCtx.dispose();
		}
		
		// Otherwise, use the element name
    	return de.getName();
	}
	
	@Override
	public void setValue(final String value, final IDirectEditingContext context) {
		final DiagramElement de = graphitiService.getGraphitiAgeDiagram().getClosestDiagramElement(context.getPictogramElement());		
    	final Object bo = de.getBusinessObject();
    	
    	// TODO
		// TODO: Need to save resources before trying to rename otherwise the refactoring won't be able to get the correct element..
		// TODO: Problem doesn't seem to be occuring now? SOMETIMES is does.. Need to investigate
		// Could also be handled by using the other IRenameElementContext.Impl constructor?
		
		final ProcessorBasedRefactoring renameRefactoring = getRenameRefactoring(bo);
		final RefactoringStatus refactoringStatus = prepareAndCheck(renameRefactoring, value);
		if(!refactoringStatus.isOK()) {
			final Dialog dlg = RefactoringUI.createRefactoringStatusDialog(refactoringStatus, Display.getCurrent().getActiveShell(), "Refactoring", false);
			if(dlg.open() != Dialog.OK) {
				// Abort
				return;
			}
		}		
		
		try {
		    final Change change = renameRefactoring.createChange(new NullProgressMonitor());
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
					change.perform(monitor);
				}
			}.run(null);
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
    }
	
	private static ProcessorBasedRefactoring getRenameRefactoring(final Object bo) {
		if(!(bo instanceof EObject)) {
			return null;
		}
		
		final EObject eObjBo = (EObject)bo;
		if(!(eObjBo.eResource() instanceof XtextResource)) {
			return null;
		}
		
		final XtextResource res = (XtextResource)eObjBo.eResource();
		final IResourceServiceProvider resourceServiceProvider = res.getResourceServiceProvider();
		if(resourceServiceProvider == null) {
			return null;
		}
		
		final IRenameRefactoringProvider renameRefactoringProvider = resourceServiceProvider.get(IRenameRefactoringProvider.class);
		if(renameRefactoringProvider == null) {
			return null;
		}
		
		final URI boUri = EcoreUtil.getURI(eObjBo);
		if(boUri == null) {
			return null;
		}
		
		return renameRefactoringProvider.getRenameRefactoring(new IRenameElementContext.Impl(boUri, Aadl2Package.eINSTANCE.getNamedElement()));
	}
	
	/**
	 * Sets the new name of the refactoring's processor. Check arguments and initial conditions. Returns true if rename can proceed.
	 * @param refactoring
	 * @param newName
	 * @return
	 */
	private static RefactoringStatus prepareAndCheck(final ProcessorBasedRefactoring refactoring, final String newName) {
		try {
			if(refactoring == null) {
				return RefactoringStatus.createFatalErrorStatus("Refactoring is null");
			}
			
			final RefactoringProcessor refactoringProcessor = refactoring.getProcessor();
			if(!(refactoringProcessor instanceof AbstractRenameProcessor)) {
				return RefactoringStatus.createFatalErrorStatus("refactoringProcessor is not an AbstractRenameProcessor");
			}
			
			// Set the name
			((AbstractRenameProcessor)refactoringProcessor).setNewName(newName);
			
			final RefactoringStatus initialStatus = refactoring.checkInitialConditions(new NullProgressMonitor());
			if(!initialStatus.isOK()) {
				return initialStatus;
			}
			
			final RefactoringStatus finalStatus = refactoring.checkFinalConditions(new NullProgressMonitor());
			if(!finalStatus.isOK()) {
				return finalStatus;
			}
		} catch(final CoreException ex) {
			return RefactoringStatus.create(ex.getStatus());
		}
		
		return new RefactoringStatus();
	}
	
	// ICustomUndoRedoFeature
	@Override
	public boolean canUndo(final IContext context) {
		return false;
	}
	
	@Override
	public void preUndo(IContext context) {
	}

	@Override
	public void postUndo(IContext context) {
	}

	@Override
	public boolean canRedo(IContext context) {
		return false;
	}

	@Override
	public void preRedo(IContext context) {
	}

	@Override
	public void postRedo(IContext context) {
	}
}
