/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105.
 *******************************************************************************/
package org.osate.ge.graphics;

import org.osate.ge.internal.graphics.AgeConnectionTerminator;

/**
 * Builder for creating arrow connection terminators. 
 * @noextend
 * @see ConnectionTerminator
 */
public class ArrowBuilder {
	private AgeConnectionTerminator terminator = AgeConnectionTerminator.FILLED_ARROW;
	
	private ArrowBuilder() {} 
	
	/**
	 * Creates an arrow builder.
	 * @return a new arrow builder
	 */
	public static ArrowBuilder create() {
		return new ArrowBuilder();
	}
	
	/**
	 * Configures the arrow builder to create a filled arrow.
	 * @return this builder to allow method chaining.
	 */
	public ArrowBuilder filled() {
		terminator = AgeConnectionTerminator.FILLED_ARROW;
		return this;
	}
	
	/**
	 * Configures the arrow builder to create an open arrow.
	 * @return the arrow builder on which the method was invoked to allow method chaining
	 */
	public ArrowBuilder open() {
		terminator = AgeConnectionTerminator.OPEN_ARROW;
		return this;
	}
	
	/**
	 * Creates a connection terminator based on the current state of the arrow builder.
	 * @return the newly created connection terminator
	 */
	public ConnectionTerminator build() {
		return terminator;
	}
}
