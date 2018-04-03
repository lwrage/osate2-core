/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105.
 *******************************************************************************/
package org.osate.ge.internal.features;

import javax.inject.Inject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.ArrayDimension;
import org.osate.aadl2.ArraySize;
import org.osate.aadl2.ArrayableElement;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.ge.internal.services.AadlModificationService;
import org.osate.ge.internal.services.BusinessObjectResolutionService;
import org.osate.ge.internal.services.DiagramModificationService;
import org.osate.ge.internal.services.AadlModificationService.AbstractModifier;
import org.osate.ge.internal.ui.dialogs.EditDimensionsDialog;
import org.osate.ge.internal.ui.util.SelectionHelper;

public class SetDimensionsFeature extends AbstractCustomFeature {
	private final AadlModificationService aadlModService;
	private final DiagramModificationService diagramModService;
	private final BusinessObjectResolutionService bor;
	
	@Inject
	public SetDimensionsFeature(final AadlModificationService aadlModService, final DiagramModificationService diagramModService, final BusinessObjectResolutionService bor, final IFeatureProvider fp) {
		super(fp);
		this.aadlModService = aadlModService;
		this.diagramModService = diagramModService;
		this.bor = bor;
	}
	
	@Override
    public String getName() {
        return "Modify Dimensions...";
    }
	
	@Override
	public boolean canUndo(final IContext context) {
		return false;
	}
	
	@Override
	public boolean isAvailable(final IContext context) {
		final ICustomContext customCtx = (ICustomContext)context;
		final PictogramElement[] pes = customCtx.getPictogramElements();		
		if(customCtx.getPictogramElements().length != 1) {
			return false;
		}
		
		final PictogramElement pe = pes[0];
		if(!(pe instanceof Shape)) {
			return false;
		}
		
		// Check that the pictogram represents an Arrayable Element
		final Object bo = bor.getBusinessObjectForPictogramElement(pe);
		if(!(bo instanceof ArrayableElement)) {
			return false;
		}
		
		final Object diagramBo = bor.getBusinessObjectForPictogramElement(getDiagram());
		final ArrayableElement ae = (ArrayableElement)bo;
		return ae.getContainingClassifier() == diagramBo;
	}
	
    @Override
    public boolean canExecute(final ICustomContext context) {
    	return true;
    }
        
	@Override
	public void execute(final ICustomContext context) {
		final PictogramElement pe = (PictogramElement)context.getPictogramElements()[0];
		final ArrayableElement ae = (ArrayableElement)bor.getBusinessObjectForPictogramElement(pe);
		
		final EditDimensionsDialog dlg = new EditDimensionsDialog(Display.getCurrent().getActiveShell(), SelectionHelper.getProject(ae.eResource()), ae.getArrayDimensions(), ae instanceof Subcomponent);
		if(dlg.open() == Dialog.CANCEL) {
			return;
		}
		
		// Update the dimensions
		aadlModService.modify(ae, new AbstractModifier<ArrayableElement, Object>() {
			private DiagramModificationService.Modification diagramMod;    	
			
			@Override
			public Object modify(final Resource resource, final ArrayableElement ae) {
				// Start the diagram modification
     			diagramMod = diagramModService.startModification();
   			
     			// Replace the element's array dimensions in a round about way.
     			// For some reason, if the dimension is a dimension property and it is replaced with a copy, the aadl source is updated properly but the reference to the property is broken.
     			for(int dimIndex = 0; dimIndex < dlg.getDimensions().size(); dimIndex++) {
     				final ArrayDimension newDimension = dlg.getDimensions().get(dimIndex);
     				if(ae.getArrayDimensions().size() > dimIndex) {
     					// See if it changed
     					final ArrayDimension oldDimension = ae.getArrayDimensions().get(dimIndex);
 						final ArraySize oldSize = oldDimension.getSize();
 						final ArraySize newSize = newDimension.getSize();
 						boolean equals = false;
 						if(oldSize == null && newSize == null) {
 							equals = true;
 						} else if(oldSize != null && newSize != null) {
 							// Possibly equals
 							if(oldSize.getSizeProperty() == null && newSize.getSizeProperty() == null) {
 								if(oldSize.getSize() == newSize.getSize()) {
 									equals = true;
 								}
 							} else if(oldSize.getSizeProperty() instanceof NamedElement && newSize.getSizeProperty() instanceof NamedElement) {
 								final NamedElement oldSizeProperty = (NamedElement)oldSize.getSizeProperty();
 								final NamedElement newSizeProperty = (NamedElement)newSize.getSizeProperty();
 								if(newSizeProperty.getQualifiedName() != null && newSizeProperty.getQualifiedName().equalsIgnoreCase(oldSizeProperty.getQualifiedName())) {
 									equals = true;
 								}
 							}
 						}
 						
 						if(!equals) {
 							ae.getArrayDimensions().set(dimIndex, newDimension);
 						}
     				} else {
     					// Add the array dimension
     					ae.getArrayDimensions().add(newDimension);
     				}     				
     			}
     		
     			// Remove array dimensions that are not in the specified list so that the dimensions will match
     			while(ae.getArrayDimensions().size() > dlg.getDimensions().size()) {
     				ae.getArrayDimensions().remove(dlg.getDimensions().size());
     			}
				
     			// Add imports as needed
				// Get current package
				if(ae.getElementRoot() instanceof AadlPackage) {
					final PackageSection section = ((AadlPackage)ae.getElementRoot()).getPublicSection();
					if(section != null) {
						// Import packages if necessary
						for(final ArrayDimension dim : ae.getArrayDimensions()) {
							if(dim.getSize() != null) {
								final ArraySize size = dim.getSize();
								if(size.getSizeProperty() instanceof Element) {
									final Element sizeProperty = (Element)size.getSizeProperty();
									
									if(sizeProperty.getElementRoot() instanceof ModelUnit) {
										final ModelUnit propertyModelUnit = (ModelUnit)sizeProperty.getElementRoot();
										if(propertyModelUnit.getQualifiedName() != null && !AadlUtil.isPredeclaredPropertySet(propertyModelUnit.getQualifiedName())) {
											boolean imported = false;
											for(final ModelUnit importedUnit : section.getImportedUnits()) {
												if(propertyModelUnit.getQualifiedName().equalsIgnoreCase(importedUnit.getQualifiedName())) {
													imported = true;
												}
											}
											
											if(!imported) {
												section.getImportedUnits().add((ModelUnit)sizeProperty.getElementRoot());
											}
										}
									}
								}
							}
						}
					}
				}
				
				diagramMod.markOpenRelatedDiagramsAsDirty(ae.getContainingClassifier());
				
				return null;
			}
			
	 		@Override
			public void beforeCommit(final Resource resource, final ArrayableElement ae, final Object modificationResult) {				
				diagramMod.commit();
			}
		});
	}

}
