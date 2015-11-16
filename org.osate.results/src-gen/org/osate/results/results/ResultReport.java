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
package org.osate.results.results;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.results.results.ResultReport#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.osate.results.results.ResultReport#getContent <em>Content</em>}</li>
 *   <li>{@link org.osate.results.results.ResultReport#getResultData <em>Result Data</em>}</li>
 * </ul>
 *
 * @see org.osate.results.results.ResultsPackage#getResultReport()
 * @model
 * @generated
 */
public interface ResultReport extends ResultReports
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' attribute.
   * @see #setHeading(String)
   * @see org.osate.results.results.ResultsPackage#getResultReport_Heading()
   * @model
   * @generated
   */
  String getHeading();

  /**
   * Sets the value of the '{@link org.osate.results.results.ResultReport#getHeading <em>Heading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' attribute.
   * @see #getHeading()
   * @generated
   */
  void setHeading(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.results.results.ResultContributor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see org.osate.results.results.ResultsPackage#getResultReport_Content()
   * @model containment="true"
   * @generated
   */
  EList<ResultContributor> getContent();

  /**
   * Returns the value of the '<em><b>Result Data</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.results.results.ResultData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Data</em>' containment reference list.
   * @see org.osate.results.results.ResultsPackage#getResultReport_ResultData()
   * @model containment="true"
   * @generated
   */
  EList<ResultData> getResultData();

} // ResultReport
