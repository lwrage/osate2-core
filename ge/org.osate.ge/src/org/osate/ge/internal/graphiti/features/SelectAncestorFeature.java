package org.osate.ge.internal.graphiti.features;

import java.util.Objects;

import javax.inject.Inject;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.osate.ge.internal.diagram.runtime.DiagramElement;
import org.osate.ge.internal.graphiti.GraphitiAgeDiagramProvider;
import org.osate.ge.internal.graphiti.diagram.GraphitiAgeDiagram;

public class SelectAncestorFeature extends AbstractCustomFeature {
	private final GraphitiAgeDiagramProvider graphitiAgeDiagramProvider;
	
	@Inject
	public SelectAncestorFeature(final IFeatureProvider fp, final GraphitiAgeDiagramProvider graphitiAgeDiagramProvider)  {
		super(fp);
		this.graphitiAgeDiagramProvider = Objects.requireNonNull(graphitiAgeDiagramProvider, "graphitiAgeDiagramProvider must not be null");
	}

	@Override
    public String getName() {
        return "Select Container";
    }
 
    @Override
    public String getDescription() {
        return "Selects a diagram element's container.";
    }
    
    @Override
	public boolean isAvailable(final IContext context) {
		return getAncestor(context) != null;
	}
   
    @Override
    public boolean canExecute(final ICustomContext context) {
		return true;
    }
    
	@Override
	public void execute(final ICustomContext context) {
		getDiagramBehavior().getDiagramContainer().selectPictogramElements(new PictogramElement[]{getAncestor(context)});			
	}
	
    @Override
	public boolean hasDoneChanges() {
		return false;
	}
 
	private PictogramElement getAncestor(final IContext context) {
		final ICustomContext customCtx = (ICustomContext)context;
		PictogramElement[] pes = customCtx.getPictogramElements();		
		if(customCtx.getPictogramElements().length != 1) {
			return null;
		}
		
		
		final GraphitiAgeDiagram gad = graphitiAgeDiagramProvider.getGraphitiAgeDiagram();
		final DiagramElement de = gad.getClosestDiagramElement(pes[0]);
		if(de == null) {
			return null;
		}
		
		if(de.getContainer() == null) {
			return null;
		}
		
		return gad.getPictogramElement(de.getContainer());
	}
}
