/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105.
 *******************************************************************************/
package org.osate.ge.internal.services.impl;

import java.util.Objects;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.osate.ge.internal.services.GraphitiService;

public class DefaultGraphitiService implements GraphitiService {
	private final IDiagramTypeProvider dtp;
	private final IFeatureProvider fp;
	
	public DefaultGraphitiService(final IDiagramTypeProvider dtp, final IFeatureProvider fp) {
		this.dtp = Objects.requireNonNull(dtp, "dtp must not be null");
		this.fp = Objects.requireNonNull(fp, "fp must not be null");
	}
	
	@Override
	public Diagram getDiagram() {
		return dtp.getDiagram();
	}
	
	@Override
	public IDiagramTypeProvider getDiagramTypeProvider() {
		return dtp;
	}
	
	@Override
	public IFeatureProvider getFeatureProvider() {
		return fp;
	}
}
