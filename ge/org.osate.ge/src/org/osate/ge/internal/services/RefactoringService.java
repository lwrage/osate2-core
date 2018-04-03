/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105.
 *******************************************************************************/
package org.osate.ge.internal.services;

import org.osate.aadl2.NamedElement;

/**
 * Service for performing refactoring operations such as rename on elements. Updates both the AADL model as well as diagram references.
 *
 */
public interface RefactoringService {
	void renameElement(NamedElement ne, final String newName);
}
