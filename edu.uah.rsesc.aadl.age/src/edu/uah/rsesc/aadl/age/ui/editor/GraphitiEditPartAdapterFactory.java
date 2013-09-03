package edu.uah.rsesc.aadl.age.ui.editor;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.graphiti.ui.platform.GraphitiConnectionEditPart;
import org.eclipse.graphiti.ui.platform.GraphitiShapeEditPart;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.osate.aadl2.NamedElement;
import org.osate.xtext.aadl2.ui.propertyview.IAadlPropertySource;

import edu.uah.rsesc.aadl.age.diagrams.common.AadlElementWrapper;
import edu.uah.rsesc.aadl.age.ui.xtext.AgeXtextUtil;

/**
 * Adapter implementation for adapting selections to IAadlPropertySource for integration with the AADL Property Values view.
 * @author philip.alldredge
 *
 */
public class GraphitiEditPartAdapterFactory implements IAdapterFactory {
	@Override
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		// Get the business object
		Object bo = null;
		if (adaptableObject instanceof GraphitiShapeEditPart) {
			final GraphitiShapeEditPart part = (GraphitiShapeEditPart)adaptableObject;
			bo = part.getFeatureProvider().getBusinessObjectForPictogramElement(part.getPictogramElement());
		} else if (adaptableObject instanceof GraphitiConnectionEditPart) {
			final GraphitiConnectionEditPart part = (GraphitiConnectionEditPart)adaptableObject;
			bo = part.getFeatureProvider().getBusinessObjectForPictogramElement(part.getPictogramElement());
		}
		
		// Unwrap the object
		bo = AadlElementWrapper.unwrap(bo);
		
		// If the business object is an AADL Element
		if(bo instanceof NamedElement && IAadlPropertySource.class.equals(adapterType)) {
			final NamedElement namedElement = (NamedElement)bo;			
			return new IAadlPropertySource() {
				private final IXtextDocument document = AgeXtextUtil.getDocumentByQualifiedName(namedElement.getQualifiedName());
				private final NamedElement element = namedElement;
				
				@Override
				public IXtextDocument getDocument() {
					return document;
				}

				@Override
				public NamedElement getNamedElement() {
					return element;
				}				
			};
		}

		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		return new Class[] { IAadlPropertySource.class };
	}
}
