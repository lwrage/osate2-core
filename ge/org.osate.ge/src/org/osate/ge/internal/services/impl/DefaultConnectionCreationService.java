/*******************************************************************************
 * Copyright (C) 2013 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0073.
 *******************************************************************************/
package org.osate.ge.internal.services.impl;

import java.util.List;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.osate.aadl2.Element;
import org.osate.ge.internal.AadlElementWrapper;
import org.osate.ge.internal.services.ConnectionCreationService;
import org.osate.ge.internal.services.ConnectionService;

public class DefaultConnectionCreationService implements ConnectionCreationService {
	private final ConnectionService connectionService;
	private final IFeatureProvider fp;
	
	public DefaultConnectionCreationService(final ConnectionService connectionService, final IFeatureProvider fp) {
		this.connectionService = connectionService;
		this.fp = fp;
	}

	@Override
	public void createUpdateConnections(final ContainerShape ownerShape, final List<?> businessObjects) {
		for(final Object bo : businessObjects) {
			createUpdateConnection(ownerShape, bo);
		}
	}
	
	@Override
	public Connection createUpdateConnection(final ContainerShape ownerShape, final Object bo) {
		Connection connection = connectionService.getConnection(ownerShape, bo);
		if(connection == null) {
			final Anchor[] anchors = connectionService.getAnchors(ownerShape, bo);
			if(anchors != null) {
				final AddConnectionContext addContext = new AddConnectionContext(anchors[0], anchors[1]);
				addContext.setNewObject(bo instanceof Element ? new AadlElementWrapper((Element)bo) : bo);	
				addContext.setTargetContainer(ownerShape);
				
				final IAddFeature addFeature = fp.getAddFeature(addContext);
				if(addFeature != null && addFeature.canAdd(addContext)) {
					connection = (Connection)addFeature.add(addContext);
					if(connection != null) {
						connectionService.onConnectionCreated(ownerShape, bo, connection);
					}
				}
			}
		} else {
			final UpdateContext updateContext = new UpdateContext(connection);
			final IUpdateFeature updateFeature = fp.getUpdateFeature(updateContext);
			
			// Update the connection regardless of whether it is "needed" or not.
			if(updateFeature != null && updateFeature.canUpdate(updateContext)) {
				updateFeature.update(updateContext);
			}
		}
		
		return connection;
	}
}
