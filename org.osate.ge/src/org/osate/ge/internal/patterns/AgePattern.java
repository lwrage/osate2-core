/*******************************************************************************
 * Copyright (C) 2013 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0073.
 *******************************************************************************/
package org.osate.ge.internal.patterns;

import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.pattern.AbstractPattern;
import org.eclipse.graphiti.pattern.ICustomUndoablePattern;
import org.eclipse.graphiti.pattern.IPattern;
import org.eclipse.graphiti.pattern.MoveShapeFeatureForPattern;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.FeatureGroupType;
import org.osate.ge.internal.AadlElementWrapper;

/**
 * Base class for all shape patterns for AGE. Contains logic shared between all shape patterns.
 *
 */
public abstract class AgePattern extends AbstractPattern implements IPattern, ICustomUndoablePattern {
	public static final String chopboxAnchorName = "chopbox";

	public AgePattern() {
		super(null);
	}
	
	@Override
	protected boolean isPatternControlled(final PictogramElement pictogramElement) {
		final Object domainObject = getBusinessObjectForPictogramElement(pictogramElement);
	    return isMainBusinessObjectApplicable(domainObject);
	}

	@Override
	protected boolean isPatternRoot(final PictogramElement pictogramElement) {
		final Object domainObject = getBusinessObjectForPictogramElement(pictogramElement);
	    return isMainBusinessObjectApplicable(domainObject) && pictogramElement instanceof ContainerShape;
	}
		
	@Override
	public boolean canUpdate(final IUpdateContext context) {
		return isMainBusinessObjectApplicable(getBusinessObjectForPictogramElement(context.getPictogramElement())) && context.getPictogramElement() instanceof ContainerShape;
	}
	
	@Override
	public boolean canUndo(final IFeature feature, final IContext context) {
		if(feature instanceof MoveShapeFeatureForPattern) {
			return true;
		}
		
		return false;
	}

	@Override
	public void undo(final IFeature feature, final IContext context) {
	}

	@Override
	public boolean canRedo(final IFeature feature, final IContext context) {
		return false;
	}

	@Override
	public void redo(final IFeature feature, final IContext context) {
	}
	
	@Override
	public boolean canRemove(final IRemoveContext context) {
		return false;
	}	
	
	@Override
	public boolean canDelete(final IDeleteContext context) {
		return false;
	}
	
	protected boolean isPackageDiagram() {
		return AadlElementWrapper.unwrap(getBusinessObjectForPictogramElement(getDiagram())) instanceof AadlPackage;
	}
	
	protected boolean isClassifierDiagram() {
		return isTypeDiagram() || isComponentImplementationDiagram();
	}
	
	protected boolean isTypeDiagram() {
		final Object diagramBo = AadlElementWrapper.unwrap(getBusinessObjectForPictogramElement(getDiagram()));
		return diagramBo instanceof ComponentType || diagramBo instanceof FeatureGroupType;
	}
	
	protected boolean isComponentImplementationDiagram() {
		return AadlElementWrapper.unwrap(getBusinessObjectForPictogramElement(getDiagram())) instanceof ComponentImplementation;
	}
}
