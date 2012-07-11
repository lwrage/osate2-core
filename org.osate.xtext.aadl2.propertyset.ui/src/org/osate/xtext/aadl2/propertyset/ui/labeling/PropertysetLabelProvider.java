/*
* <copyright>
 * Copyright  2012 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/org/documents/epl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE ''DELIVERABLES'') ARE ON AN ''AS-IS'' BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE
*/
package org.osate.xtext.aadl2.propertyset.ui.labeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.osate.aadl2.AadlInteger;
import org.osate.aadl2.AadlReal;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.Mode;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.PropertyConstant;
import org.osate.aadl2.PropertySet;
import org.osate.aadl2.PropertyType;
import org.osate.aadl2.RealLiteral;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 *
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class PropertysetLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public PropertysetLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Property set and properties
	String text(PropertySet ele) {
		  return "Propertyset "+ele.getName();
		}

	String text(PropertyType ele) {
		if (ele.getName()==null) return "Unnamed Property Type";
		  return "Property Type  "+ele.getName();
	}

	String text(PropertyConstant ele) {
		  return "Property Constant "+ele.getName();
		}

	String text(Property ele) {
		  return "Property "+ele.getName();
		}

	String text(PropertyAssociation ele) {
		if (ele.getProperty()!= null)
		  return "Property "+ele.getProperty().getName()+" =>";
		return "Property =>";
		}

	String text(ModalPropertyValue ele) {
		EList<Mode> ml = ele.getInModes();
		if (ml.isEmpty())
		  return "Property value ";
		String modes = "";
		for (Mode m : ml)
			modes = modes + " "+m.getName();
		return "Modal property value ("+modes+")";
		}

	String text(IntegerLiteral ele) {
		  return "int "+ele.getValue();
	}
	String text(RealLiteral ele) {
		  return "real "+ele.getValue();
	}


	String text(ListValue ele) {
		  return "()";
		}
	String text(AadlInteger ele) {
		  return "aadlinteger";
		}
	String text(AadlReal ele) {
		  return "aadlreal";
		}


    String image(NamedElement ele) {
        return ele.eClass().getName() + ".gif";
      }

    String image(PropertyType ele) {
        return "PropertyType.gif";
      }
}
