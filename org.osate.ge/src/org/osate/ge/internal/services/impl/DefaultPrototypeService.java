/*******************************************************************************
 * Copyright (C) 2013 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0073.
 *******************************************************************************/
package org.osate.ge.internal.services.impl;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.FeatureGroupPrototypeActual;
import org.osate.aadl2.FeatureGroupPrototypeBinding;
import org.osate.aadl2.FeatureGroupType;
import org.osate.aadl2.Prototype;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.modelsupport.util.ResolvePrototypeUtil;
import org.osate.ge.internal.services.BusinessObjectResolutionService;
import org.osate.ge.internal.services.PrototypeService;

public class DefaultPrototypeService implements PrototypeService {
	private BusinessObjectResolutionService bor;
	
	public DefaultPrototypeService(final BusinessObjectResolutionService bor) {
		this.bor = bor;
	}
	
	@Override
	public ComponentClassifier getComponentClassifier(final Element bindingContext, final Subcomponent sc) {
		if(sc.getPrototype() == null) {
			return sc.getClassifier();
		} else {
			if(bindingContext == null) {
				return null;
			}
			
			final ComponentClassifier cc = ResolvePrototypeUtil.resolveComponentPrototype(sc.getPrototype(), bindingContext);
			if(cc != null) {
				return cc;
			}

			return sc.getPrototype().getConstrainingClassifier();	
		}
	}
	
	@Override
	public FeatureGroupType getFeatureGroupType(final Element bindingContext, final FeatureGroup fg) {
		if(fg.getFeatureGroupPrototype() == null) {
			return fg.getAllFeatureGroupType();
		} else {
			if(bindingContext != null) {
				final FeatureGroupType fgt = ResolvePrototypeUtil.resolveFeatureGroupPrototype(fg.getFeatureGroupPrototype(), bindingContext);
				if(fgt != null) {
					return fgt;
				}
				return fg.getFeatureGroupPrototype().getConstrainingFeatureGroupType();
			}			
		}

		return null;
	}
	
	@Override
	public Element getPrototypeBindingContext(final Shape shape) {
		ContainerShape temp = shape.getContainer();
		
		while(temp != null) {
			Object bo = bor.getBusinessObjectForPictogramElement(temp);
			if(bo instanceof ComponentClassifier || bo instanceof FeatureGroupType) {
				return (Classifier)bo;
			} else if(bo instanceof Subcomponent) {
				return (Subcomponent)bo;
			} else if(bo instanceof FeatureGroup){
				return getFeatureGroupTypeOrActual(temp.getContainer(), (FeatureGroup)bo);
			}

			temp = temp.getContainer();
		}
		return null;
	}
	
	/**
	 * Returns either the feature group type or the actual prototype
	 * @param shape
	 * @param fg
	 * @param fp
	 * @return
	 */
	// TODO: Define what shape is supposed to be
	private Element getFeatureGroupTypeOrActual(final Shape shape, final FeatureGroup fg) {
		if(fg.getFeatureGroupPrototype() == null) {
			return fg.getAllFeatureGroupType();
		} else {
			final Element bindingContext = getPrototypeBindingContext(shape);
			if(bindingContext != null) {
				return resolveFeatureGroupPrototypeToActual(fg.getFeatureGroupPrototype(), bindingContext);
			} else {
				return null;
			}
		}
	}

	private FeatureGroupPrototypeActual resolveFeatureGroupPrototypeToActual(Prototype proto, Element context) {
		FeatureGroupPrototypeBinding fgpb = (FeatureGroupPrototypeBinding)ResolvePrototypeUtil.resolvePrototype(proto, context);

		if (fgpb == null) {
			// cannot resolve
			return null;
		}
		
		return fgpb.getActual();
	}
}
