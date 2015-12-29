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
package org.osate.reqspec.reqSpec.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.reqspec.reqSpec.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.reqspec.reqSpec.ReqSpecPackage
 * @generated
 */
public class ReqSpecSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ReqSpecPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ReqSpecPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ReqSpecPackage.REQ_SPEC:
      {
        ReqSpec reqSpec = (ReqSpec)theEObject;
        T result = caseReqSpec(reqSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.REQ_SPEC_CONTAINER:
      {
        ReqSpecContainer reqSpecContainer = (ReqSpecContainer)theEObject;
        T result = caseReqSpecContainer(reqSpecContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.GLOBAL_CONSTANTS:
      {
        GlobalConstants globalConstants = (GlobalConstants)theEObject;
        T result = caseGlobalConstants(globalConstants);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.CONTRACTUAL_ELEMENT:
      {
        ContractualElement contractualElement = (ContractualElement)theEObject;
        T result = caseContractualElement(contractualElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.REQ_ROOT:
      {
        ReqRoot reqRoot = (ReqRoot)theEObject;
        T result = caseReqRoot(reqRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.STAKEHOLDER_GOALS:
      {
        StakeholderGoals stakeholderGoals = (StakeholderGoals)theEObject;
        T result = caseStakeholderGoals(stakeholderGoals);
        if (result == null) result = caseReqSpecContainer(stakeholderGoals);
        if (result == null) result = caseReqRoot(stakeholderGoals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.REQ_DOCUMENT:
      {
        ReqDocument reqDocument = (ReqDocument)theEObject;
        T result = caseReqDocument(reqDocument);
        if (result == null) result = caseReqSpecContainer(reqDocument);
        if (result == null) result = caseReqRoot(reqDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.DOCUMENT_SECTION:
      {
        DocumentSection documentSection = (DocumentSection)theEObject;
        T result = caseDocumentSection(documentSection);
        if (result == null) result = caseReqSpecContainer(documentSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.REQUIREMENTS:
      {
        Requirements requirements = (Requirements)theEObject;
        T result = caseRequirements(requirements);
        if (result == null) result = caseReqSpecContainer(requirements);
        if (result == null) result = caseReqRoot(requirements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = caseContractualElement(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = caseContractualElement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.INCLUDE_GLOBAL_REQUIREMENT:
      {
        IncludeGlobalRequirement includeGlobalRequirement = (IncludeGlobalRequirement)theEObject;
        T result = caseIncludeGlobalRequirement(includeGlobalRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.WHEN_CONDITION:
      {
        WhenCondition whenCondition = (WhenCondition)theEObject;
        T result = caseWhenCondition(whenCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.REQ_PREDICATE:
      {
        ReqPredicate reqPredicate = (ReqPredicate)theEObject;
        T result = caseReqPredicate(reqPredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.INFORMAL_PREDICATE:
      {
        InformalPredicate informalPredicate = (InformalPredicate)theEObject;
        T result = caseInformalPredicate(informalPredicate);
        if (result == null) result = caseReqPredicate(informalPredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = caseReqPredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.VALUE_PREDICATE:
      {
        ValuePredicate valuePredicate = (ValuePredicate)theEObject;
        T result = caseValuePredicate(valuePredicate);
        if (result == null) result = caseReqPredicate(valuePredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.DESIRED_VALUE:
      {
        DesiredValue desiredValue = (DesiredValue)theEObject;
        T result = caseDesiredValue(desiredValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.EXTERNAL_DOCUMENT:
      {
        ExternalDocument externalDocument = (ExternalDocument)theEObject;
        T result = caseExternalDocument(externalDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.SYSTEM_REQUIREMENTS:
      {
        SystemRequirements systemRequirements = (SystemRequirements)theEObject;
        T result = caseSystemRequirements(systemRequirements);
        if (result == null) result = caseRequirements(systemRequirements);
        if (result == null) result = caseReqSpecContainer(systemRequirements);
        if (result == null) result = caseReqRoot(systemRequirements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqSpecPackage.GLOBAL_REQUIREMENTS:
      {
        GlobalRequirements globalRequirements = (GlobalRequirements)theEObject;
        T result = caseGlobalRequirements(globalRequirements);
        if (result == null) result = caseRequirements(globalRequirements);
        if (result == null) result = caseReqSpecContainer(globalRequirements);
        if (result == null) result = caseReqRoot(globalRequirements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Req Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Req Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReqSpec(ReqSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReqSpecContainer(ReqSpecContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Constants</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Constants</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalConstants(GlobalConstants object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contractual Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contractual Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContractualElement(ContractualElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Req Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Req Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReqRoot(ReqRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stakeholder Goals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stakeholder Goals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStakeholderGoals(StakeholderGoals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Req Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Req Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReqDocument(ReqDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentSection(DocumentSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirements(Requirements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Global Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Global Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeGlobalRequirement(IncludeGlobalRequirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenCondition(WhenCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Req Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Req Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReqPredicate(ReqPredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Informal Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Informal Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInformalPredicate(InformalPredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuePredicate(ValuePredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desired Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desired Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesiredValue(DesiredValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalDocument(ExternalDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Requirements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Requirements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemRequirements(SystemRequirements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Requirements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Requirements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalRequirements(GlobalRequirements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ReqSpecSwitch
