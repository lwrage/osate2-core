/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105
 *******************************************************************************/
package org.osate.ge.di;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * This annotation must not be applied to more than one method per class.
 * </p>
 * <h1>Usages</h1>
 * <table summary="Annotation Usages">
 *   <tr><th>Usage</th><th>Description</th><th>Return Value</th></tr>
 *   <tr><td>Business Object Handler</td><td>Returns the {@link org.osate.ge.GraphicalConfiguration} for representing the specified business object.</td><td>{@link org.osate.ge.GraphicalConfiguration}</td></tr>
 * </table>
 * <h1>Named Parameters</h1>
 * <table summary="Named Parameters">
 *   <tr><th>Parameter</th><th>Usage</th><th>Description</th></tr>
 *   <tr><td>{@link org.osate.ge.di.Names#BUSINESS_OBJECT}</td><td>Business Object handler</td><td>The business object for which to return the graphical configuration.</td></tr>
 *   <tr><td>{@link org.osate.ge.di.Names#BUSINESS_OBJECT_CONTEXT}</td><td>Business Object handler</td><td>The business object context for which to return the graphical configuration.</td></tr>
 * </table>
 * @see org.osate.ge.graphics.Graphic
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GetGraphicalConfiguration {
}
