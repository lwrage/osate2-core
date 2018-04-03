/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105.
 *******************************************************************************/
package org.osate.ge.internal.ui.editor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osate.ge.internal.Activator;
import org.osate.ge.internal.services.PropertyService;

public class DecreaseNestingDepthAction extends SelectionAction {
	public static final String ID = "org.osate.ge.ui.editor.DecreaseNestingLevelAction";
	public static final ImageDescriptor IMAGE_DESCRIPTOR = Activator.getImageDescriptor("icons/arrow_decr_nesting.png");
	
	private final AgeDiagramEditor editor;
	private final PropertyService propertyService;	
	private final Adapter nestingPropertyChangeListener = new AdapterImpl() {
		@Override
		public void notifyChanged(final Notification notification) {
			if(notification.getNewValue() instanceof Property) {
				final Property property = (Property)notification.getNewValue();
				if(propertyService.getNestingDepthKey().equals(property.getKey())) {
					update();
				}
			}
		}	
	};
	
	public DecreaseNestingDepthAction(final AgeDiagramEditor editor, final PropertyService propertyService) {
		super(editor);
		this.editor = editor;
		this.propertyService = propertyService;
		setId(ID);
		setText("Decrease Nesting Depth");
		setHoverImageDescriptor(IMAGE_DESCRIPTOR);
		registerPropertyChangeListener();
	}

	@Override
	public void dispose() {
		unregisterPropertyChangeListener();
		super.dispose();
	}
	
	@Override
	public void run() {
		final Diagram diagram = editor.getDiagramTypeProvider().getDiagram();
		final UpdateContext ctx = new UpdateContext(diagram);
		final IUpdateFeature feature = editor.getDiagramTypeProvider().getFeatureProvider().getUpdateFeature(ctx);
		
		// Set the selected mode property on the diagram and update the diagram
		editor.getEditingDomain().getCommandStack().execute(new RecordingCommand(editor.getEditingDomain()) {
			@Override
			protected void doExecute() {
				final int currentDepth = propertyService.getNestingDepth(diagram);
				propertyService.setNestingDepth(diagram, currentDepth - 1);
				
				if(feature != null && feature.canUpdate(ctx)) {
					editor.getDiagramBehavior().executeFeature(feature, ctx);
				}
			}				
		});
		
		update();
	}

	@Override
	protected boolean calculateEnabled() {
		final Diagram diagram = editor.getDiagramTypeProvider().getDiagram();
		return propertyService.getNestingDepth(diagram) > 0;
	}
	
	private void registerPropertyChangeListener() {
		final Diagram diagram = editor.getDiagramTypeProvider().getDiagram();
		diagram.eAdapters().add(nestingPropertyChangeListener);
	}

	private void unregisterPropertyChangeListener() {
		if(editor != null) {
			final Diagram diagram = editor.getDiagramTypeProvider().getDiagram();
			diagram.eAdapters().remove(nestingPropertyChangeListener);
		}
	}
}
