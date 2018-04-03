package org.osate.ge.internal.graphiti.features;

import java.util.Objects;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.ICustomUndoRedoFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.impl.AbstractFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.osate.ge.EmfContainerProvider;
import org.osate.ge.di.CanDelete;
import org.osate.ge.di.Delete;
import org.osate.ge.di.Names;
import org.osate.ge.internal.diagram.runtime.DiagramElement;
import org.osate.ge.internal.graphiti.GraphitiAgeDiagramProvider;
import org.osate.ge.internal.services.AadlModificationService;
import org.osate.ge.internal.services.ExtensionService;
import org.osate.ge.internal.services.UserInputService;
import org.osate.ge.internal.services.AadlModificationService.AbstractModifier;

// IDeleteFeature implementation that delegates behavior to a business object handler
public class BoHandlerDeleteFeature extends AbstractFeature implements IDeleteFeature, ICustomUndoRedoFeature {
	private final GraphitiAgeDiagramProvider graphitiAgeDiagramProvider;
	private final ExtensionService extService;
	private final AadlModificationService aadlModService;
	private final UserInputService userInputService;
	
	@Inject
	public BoHandlerDeleteFeature(final GraphitiAgeDiagramProvider graphitiAgeDiagramProvider,
			final ExtensionService extService,
			final AadlModificationService aadlModService, 
			final UserInputService userInputService, 
			final IFeatureProvider fp) {
		super(fp);
		this.graphitiAgeDiagramProvider = Objects.requireNonNull(graphitiAgeDiagramProvider, "graphitiAgeDiagramProvider must not be null");
		this.aadlModService = Objects.requireNonNull(aadlModService, "aadlModService must not be null");
		this.userInputService = Objects.requireNonNull(userInputService, "userInputService must not be null");
		this.extService = Objects.requireNonNull(extService, "extService must not be null");
	}

	@Override
	public boolean canExecute(IContext context) {
		boolean ret = false;
		if (context instanceof IDeleteContext) {
			ret = canDelete((IDeleteContext) context);
		}
		return ret;
	}

	@Override
	public void execute(IContext context) {
		if (context instanceof IDeleteContext) {
			delete((IDeleteContext) context);
		}
	}

	@Override
	public void preDelete(IDeleteContext context) {
	}

	@Override
	public boolean isDeleteAbort() {
		return false;
	}

	@Override
	public void postDelete(IDeleteContext context) {
	}
	
	@Override
	public boolean canDelete(final IDeleteContext context) {
		final DiagramElement de = graphitiAgeDiagramProvider.getGraphitiAgeDiagram().getClosestDiagramElement(context.getPictogramElement());
		if(de == null) {
			return false;
		}
		
		final Object bo = de.getBusinessObject();
		
		// Business object must be an EObject or an EmfContainerProvider
		if(!(bo instanceof EObject || bo instanceof EmfContainerProvider)) {
			return false;
		}
		
		final IEclipseContext childCtx = extService.createChildContext();
		try {
			childCtx.set(Names.BUSINESS_OBJECT, bo);	
			childCtx.set(Names.BUSINESS_OBJECT_CONTEXT, de);
			final Object boHandler = de.getBusinessObjectHandler();
			return boHandler == null ? false : (boolean)ContextInjectionFactory.invoke(boHandler, CanDelete.class, childCtx, false);
		} finally {
			childCtx.dispose();
		}
	}

	@Override
	public void delete(final IDeleteContext context) {
		if(!userInputService.confirmDelete(context)) {
			return;
		}

		// Remove the EObject from the model
		final DiagramElement de = graphitiAgeDiagramProvider.getGraphitiAgeDiagram().getClosestDiagramElement(context.getPictogramElement());		
		final Object bo = de.getBusinessObject();
		
		if(bo instanceof EObject) {
			final EObject boEObj = (EObject)bo;
			aadlModService.modify(boEObj, new AbstractModifier<EObject, Object>() {
				@Override
				public Object modify(final Resource resource, final EObject boEObj) {
					EcoreUtil.remove(boEObj);
					return null;
				}		
			});	
		} else if(bo instanceof EmfContainerProvider) {
			final EObject ownerBo = ((EmfContainerProvider)bo).getEmfContainer();
			aadlModService.modify(ownerBo, new AbstractModifier<EObject, Object>() {
				@Override
				public Object modify(final Resource resource, final EObject ownerBo) {
					// Call delete
					final IEclipseContext eclipseCtx = extService.createChildContext();
					try {
						eclipseCtx.set(Names.BUSINESS_OBJECT, bo);
						eclipseCtx.set(Names.OWNER_BO, ownerBo);
						final Object boHandler = de.getBusinessObjectHandler();
						ContextInjectionFactory.invoke(boHandler, Delete.class, eclipseCtx);						
					} finally {
						eclipseCtx.dispose();
					}
					return null;
				}		
			});
		} else {
			// canDelete() should have returned false in this case
			throw new RuntimeException("Unhandled case: " + bo);
		}

		// Clear selection
		getFeatureProvider().getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer().selectPictogramElements(new PictogramElement[0]);
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
