/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.reqspec.reqSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Mode;
import org.osate.aadl2.PropertyExpression;

import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.reqspec.reqSpec.WhenCondition#getInMode <em>In Mode</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.WhenCondition#getInErrorState <em>In Error State</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.WhenCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.osate.reqspec.reqSpec.ReqSpecPackage#getWhenCondition()
 * @model
 * @generated
 */
public interface WhenCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>In Mode</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.Mode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Mode</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Mode</em>' reference list.
   * @see org.osate.reqspec.reqSpec.ReqSpecPackage#getWhenCondition_InMode()
   * @model
   * @generated
   */
  EList<Mode> getInMode();

  /**
   * Returns the value of the '<em><b>In Error State</b></em>' reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Error State</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Error State</em>' reference list.
   * @see org.osate.reqspec.reqSpec.ReqSpecPackage#getWhenCondition_InErrorState()
   * @model
   * @generated
   */
  EList<ErrorBehaviorState> getInErrorState();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(PropertyExpression)
   * @see org.osate.reqspec.reqSpec.ReqSpecPackage#getWhenCondition_Condition()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getCondition();

  /**
   * Sets the value of the '{@link org.osate.reqspec.reqSpec.WhenCondition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(PropertyExpression value);

} // WhenCondition
