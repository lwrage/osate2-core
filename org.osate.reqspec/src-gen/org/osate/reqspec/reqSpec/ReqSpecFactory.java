/**
 */
package org.osate.reqspec.reqSpec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.reqspec.reqSpec.ReqSpecPackage
 * @generated
 */
public interface ReqSpecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReqSpecFactory eINSTANCE = org.osate.reqspec.reqSpec.impl.ReqSpecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Req Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Req Spec</em>'.
   * @generated
   */
  ReqSpec createReqSpec();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  ReqSpecContainer createReqSpecContainer();

  /**
   * Returns a new object of class '<em>Contractual Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contractual Element</em>'.
   * @generated
   */
  ContractualElement createContractualElement();

  /**
   * Returns a new object of class '<em>Req Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Req Root</em>'.
   * @generated
   */
  ReqRoot createReqRoot();

  /**
   * Returns a new object of class '<em>Stakeholder Goals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stakeholder Goals</em>'.
   * @generated
   */
  StakeholderGoals createStakeholderGoals();

  /**
   * Returns a new object of class '<em>Req Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Req Document</em>'.
   * @generated
   */
  ReqDocument createReqDocument();

  /**
   * Returns a new object of class '<em>Document Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Section</em>'.
   * @generated
   */
  DocumentSection createDocumentSection();

  /**
   * Returns a new object of class '<em>System Requirements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Requirements</em>'.
   * @generated
   */
  SystemRequirements createSystemRequirements();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement</em>'.
   * @generated
   */
  Requirement createRequirement();

  /**
   * Returns a new object of class '<em>Req Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Req Predicate</em>'.
   * @generated
   */
  ReqPredicate createReqPredicate();

  /**
   * Returns a new object of class '<em>Informal Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Informal Predicate</em>'.
   * @generated
   */
  InformalPredicate createInformalPredicate();

  /**
   * Returns a new object of class '<em>XPredicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XPredicate</em>'.
   * @generated
   */
  XPredicate createXPredicate();

  /**
   * Returns a new object of class '<em>External Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Document</em>'.
   * @generated
   */
  ExternalDocument createExternalDocument();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ReqSpecPackage getReqSpecPackage();

} //ReqSpecFactory
