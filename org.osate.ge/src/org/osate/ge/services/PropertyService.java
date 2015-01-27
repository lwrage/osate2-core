/*******************************************************************************
 * Copyright (C) 2013 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0073.
 *******************************************************************************/
package org.osate.ge.services;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * Contains methods to access the properties of pictogram elements. Unless otherwise specified, setting a property value does not update the diagram shapes to reflect changes visually.
 * @author philip.alldredge
 *
 */
public interface PropertyService {
	String getName(PictogramElement pe);

	void setName(PictogramElement pe, String typeName);

	// Is on the left side of the container. Defaults to true if there isn't a value assigned to the property
	boolean getIsLeft(PictogramElement pe);

	void setIsLeft(PictogramElement pe, boolean value);

	// If it is layed out such that it is on the left side of the layout container. Defaults to true if there isn't a value assigned to the property
	boolean getIsLeftLayout(PictogramElement pe);

	void setIsLeftLayout(PictogramElement pe, boolean value);

	// Nesting depth determines the maximum number of levels for the diagram. Must be greater than or equal to 0. A level of 0 indicates that only the top level should be shown.
	int getNestingDepth(Diagram diagram);
	void setNestingDepth(Diagram diagram, int depth);
	String getNestingDepthKey();
	
	String getSelectedMode(Diagram diagram);

	void setSelectedMode(Diagram diagram, String modeName);

	String getSelectedFlow(Diagram diagram);

	void setSelectedFlow(Diagram diagram, String flowName);

	boolean isLayedOut(PictogramElement pe);

	void setIsLayedOut(PictogramElement pe, boolean value);
	
	/**
	 * Being manually positioned indicates the the pictogram is manually positioned by the editor or by the user. Manually positions shapes should not
	 * be moved by automatic diagram layout or adjustment algorithms An example of such a pictogram is a label shape.
	 * @param pe
	 * @return
	 */
	boolean isManuallyPositioned(PictogramElement pe);	
	void setIsManuallyPositioned(PictogramElement pe, boolean value);

	boolean isGhost(PictogramElement pe);

	void setIsGhost(PictogramElement pe, boolean value);
	
	String getConnectionType(Connection c);
	void setConnectionType(Connection c, String type);
	
	// Inner objects may have parents with the same business object as themselves. It is best to get the business object from the parent.
	boolean isInnerShape(PictogramElement pe);
	void setIsInnerShape(PictogramElement pe, boolean value);
	
	boolean isUnselectable(PictogramElement pe);
	void setIsUnselectable(PictogramElement pe, boolean value);
	
	// Sets whether a pictogram element is transient. A transient pictogram element is a pictogram element that is recreated whenever its owner is updated. Transient shapes
	// should not be referenced.
	boolean isTransient(PictogramElement pe);
	void setIsTransient(PictogramElement pe, boolean value);
	
	/**
	 * Sets whether the shape is a "background" shape. Background shapes are inner shape that are used when a non-selectable inner shape that will be behind other features is needed. Disables overlap checks.
	 * @param pe
	 * @return
	 */
	boolean isBackground(PictogramElement pe);
	void setIsBackground(PictogramElement pe, boolean value);
	
	// Bindings
	BindingType getBindingType(Connection c);
	void setBindingType(Connection c, BindingType value);
	boolean getShowConnectionBindingType(Diagram diagram, BindingType type);
	void setShowConnectionBindingType(Diagram diagram, BindingType type, boolean value);
	
	static enum BindingType {
		ACTUAL_CONNECTION("actual_connection"),
		ACTUAL_MEMORY("actual_memory"),
		ACTUAL_PROCESSOR("actual_processor"),
		ALLOWED_CONNECTION("allowed_connection"),
		ALLOWED_MEMORY("allowed_memory"),
		ALLOWED_PROCESSOR("allowed_processor");
		
		private static Map<String, BindingType> keyToBindingTypeMap = new HashMap<String, BindingType>();
		public final String key;

		static {
			for(final BindingType bindingType : values()) {
				keyToBindingTypeMap.put(bindingType.key, bindingType);
			}
		}
		
		BindingType(final String key) {
			this.key = key;
		}
		
		/**
		 * Returns the binding type with the specified key.
		 * @param key the key of the binding type to be returned. A null value will result in a null binding type being returned.
		 * @return the appropriate binding type. Returns null if it is not found or if key is null.
		 */
		public static BindingType getByKey(final String key) {
			return keyToBindingTypeMap.get(key);
		}
	};
}