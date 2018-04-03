/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105.
 *******************************************************************************/
package org.osate.ge.graphics;

import org.osate.ge.internal.graphics.Ellipse;

/**
 * Builder for creating ellipse graphics.
 * @noextend
 * @see Graphic
 */
public class EllipseBuilder {
	private EllipseBuilder() {}
	
	/**
	 * Creates an ellipse builder.
	 * @return a new ellipse builder
	 */
	public static EllipseBuilder create() {
		return new EllipseBuilder();
	}
	
	/**
	 * Creates an ellipse graphic based on the current state of the builder.
	 * @return the newly created graphic
	 */
	public Graphic build() {
		return new Ellipse();
	}
}
