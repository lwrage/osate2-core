/**
 */
package org.osate.assure.assure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.assure.assure.AssureFactory
 * @model kind="package"
 * @generated
 */
public interface AssurePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "assure";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/assure/Assure";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "assure";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AssurePackage eINSTANCE = org.osate.assure.assure.impl.AssurePackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.AssuranceResultImpl <em>Assurance Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.AssuranceResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getAssuranceResult()
   * @generated
   */
  int ASSURANCE_RESULT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__NAME = 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__WEIGHT = 1;

  /**
   * The number of structural features of the '<em>Assurance Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.CaseResultImpl <em>Case Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.CaseResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getCaseResult()
   * @generated
   */
  int CASE_RESULT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__NAME = ASSURANCE_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__WEIGHT = ASSURANCE_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__SYSTEM = ASSURANCE_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__TARGET = ASSURANCE_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pass Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__PASS_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__FAIL_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Neutral Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__NEUTRAL_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Unknown Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__UNKNOWN_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__SUCESS_MSG = ASSURANCE_RESULT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__FAIL_MSG = ASSURANCE_RESULT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Sub Case Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__SUB_CASE_RESULT = ASSURANCE_RESULT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Claim Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__CLAIM_RESULT = ASSURANCE_RESULT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Hazard Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT__HAZARD_RESULT = ASSURANCE_RESULT_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Case Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_RESULT_FEATURE_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.ClaimResultImpl <em>Claim Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.ClaimResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getClaimResult()
   * @generated
   */
  int CLAIM_RESULT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__NAME = ASSURANCE_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__WEIGHT = ASSURANCE_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__REQUIREMENT = ASSURANCE_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Success Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__SUCCESS_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__FAIL_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Neutral Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__NEUTRAL_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unknown Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__UNKNOWN_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__SUCESS_MSG = ASSURANCE_RESULT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__FAIL_MSG = ASSURANCE_RESULT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Sub Claim Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__SUB_CLAIM_RESULT = ASSURANCE_RESULT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Verification Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT__VERIFICATION_RESULT = ASSURANCE_RESULT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Claim Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_RESULT_FEATURE_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.EvidenceResultImpl <em>Evidence Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.EvidenceResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getEvidenceResult()
   * @generated
   */
  int EVIDENCE_RESULT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_RESULT__NAME = ASSURANCE_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_RESULT__WEIGHT = ASSURANCE_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_RESULT__STATE = ASSURANCE_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_RESULT__SUCESS_MSG = ASSURANCE_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_RESULT__FAIL_MSG = ASSURANCE_RESULT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Evidence Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_RESULT_FEATURE_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.VerificationResultImpl <em>Verification Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.VerificationResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getVerificationResult()
   * @generated
   */
  int VERIFICATION_RESULT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__NAME = EVIDENCE_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__WEIGHT = EVIDENCE_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATE = EVIDENCE_RESULT__STATE;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__SUCESS_MSG = EVIDENCE_RESULT__SUCESS_MSG;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__FAIL_MSG = EVIDENCE_RESULT__FAIL_MSG;

  /**
   * The feature id for the '<em><b>Verification Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__VERIFICATION_ACTIVITY = EVIDENCE_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATUS = EVIDENCE_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assumption Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__ASSUMPTION_RESULT = EVIDENCE_RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Precondition Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__PRECONDITION_RESULT = EVIDENCE_RESULT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__FIRST = EVIDENCE_RESULT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__SECOND = EVIDENCE_RESULT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Verification Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT_FEATURE_COUNT = EVIDENCE_RESULT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.AssumptionResultImpl <em>Assumption Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.AssumptionResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getAssumptionResult()
   * @generated
   */
  int ASSUMPTION_RESULT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT__NAME = EVIDENCE_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT__WEIGHT = EVIDENCE_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT__STATE = EVIDENCE_RESULT__STATE;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT__SUCESS_MSG = EVIDENCE_RESULT__SUCESS_MSG;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT__FAIL_MSG = EVIDENCE_RESULT__FAIL_MSG;

  /**
   * The feature id for the '<em><b>Verification Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT__VERIFICATION_ACTIVITY = EVIDENCE_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT__STATUS = EVIDENCE_RESULT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assumption Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_RESULT_FEATURE_COUNT = EVIDENCE_RESULT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.PreconditionResultImpl <em>Precondition Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.PreconditionResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getPreconditionResult()
   * @generated
   */
  int PRECONDITION_RESULT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT__NAME = EVIDENCE_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT__WEIGHT = EVIDENCE_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT__STATE = EVIDENCE_RESULT__STATE;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT__SUCESS_MSG = EVIDENCE_RESULT__SUCESS_MSG;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT__FAIL_MSG = EVIDENCE_RESULT__FAIL_MSG;

  /**
   * The feature id for the '<em><b>Verification Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT__VERIFICATION_ACTIVITY = EVIDENCE_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT__STATUS = EVIDENCE_RESULT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Precondition Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_RESULT_FEATURE_COUNT = EVIDENCE_RESULT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.HazardResultImpl <em>Hazard Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.HazardResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getHazardResult()
   * @generated
   */
  int HAZARD_RESULT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__NAME = ASSURANCE_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__WEIGHT = ASSURANCE_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>Hazard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__HAZARD = ASSURANCE_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__TARGET = ASSURANCE_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pass Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__PASS_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__FAIL_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Neutral Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__NEUTRAL_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Unknown Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__UNKNOWN_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Verification Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT__VERIFICATION_RESULT = ASSURANCE_RESULT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Hazard Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_RESULT_FEATURE_COUNT = ASSURANCE_RESULT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.FailThenResultImpl <em>Fail Then Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.FailThenResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getFailThenResult()
   * @generated
   */
  int FAIL_THEN_RESULT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__NAME = VERIFICATION_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__WEIGHT = VERIFICATION_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__STATE = VERIFICATION_RESULT__STATE;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__SUCESS_MSG = VERIFICATION_RESULT__SUCESS_MSG;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__FAIL_MSG = VERIFICATION_RESULT__FAIL_MSG;

  /**
   * The feature id for the '<em><b>Verification Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__VERIFICATION_ACTIVITY = VERIFICATION_RESULT__VERIFICATION_ACTIVITY;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__STATUS = VERIFICATION_RESULT__STATUS;

  /**
   * The feature id for the '<em><b>Assumption Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__ASSUMPTION_RESULT = VERIFICATION_RESULT__ASSUMPTION_RESULT;

  /**
   * The feature id for the '<em><b>Precondition Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__PRECONDITION_RESULT = VERIFICATION_RESULT__PRECONDITION_RESULT;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__FIRST = VERIFICATION_RESULT__FIRST;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT__SECOND = VERIFICATION_RESULT__SECOND;

  /**
   * The number of structural features of the '<em>Fail Then Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_RESULT_FEATURE_COUNT = VERIFICATION_RESULT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.impl.IfThenResultImpl <em>If Then Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.impl.IfThenResultImpl
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getIfThenResult()
   * @generated
   */
  int IF_THEN_RESULT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__NAME = VERIFICATION_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__WEIGHT = VERIFICATION_RESULT__WEIGHT;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__STATE = VERIFICATION_RESULT__STATE;

  /**
   * The feature id for the '<em><b>Sucess Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__SUCESS_MSG = VERIFICATION_RESULT__SUCESS_MSG;

  /**
   * The feature id for the '<em><b>Fail Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__FAIL_MSG = VERIFICATION_RESULT__FAIL_MSG;

  /**
   * The feature id for the '<em><b>Verification Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__VERIFICATION_ACTIVITY = VERIFICATION_RESULT__VERIFICATION_ACTIVITY;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__STATUS = VERIFICATION_RESULT__STATUS;

  /**
   * The feature id for the '<em><b>Assumption Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__ASSUMPTION_RESULT = VERIFICATION_RESULT__ASSUMPTION_RESULT;

  /**
   * The feature id for the '<em><b>Precondition Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__PRECONDITION_RESULT = VERIFICATION_RESULT__PRECONDITION_RESULT;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__FIRST = VERIFICATION_RESULT__FIRST;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT__SECOND = VERIFICATION_RESULT__SECOND;

  /**
   * The number of structural features of the '<em>If Then Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_RESULT_FEATURE_COUNT = VERIFICATION_RESULT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.VerificationExecutionState <em>Verification Execution State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.VerificationExecutionState
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getVerificationExecutionState()
   * @generated
   */
  int VERIFICATION_EXECUTION_STATE = 10;

  /**
   * The meta object id for the '{@link org.osate.assure.assure.VerificationResultState <em>Verification Result State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.assure.assure.VerificationResultState
   * @see org.osate.assure.assure.impl.AssurePackageImpl#getVerificationResultState()
   * @generated
   */
  int VERIFICATION_RESULT_STATE = 11;


  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.CaseResult <em>Case Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Result</em>'.
   * @see org.osate.assure.assure.CaseResult
   * @generated
   */
  EClass getCaseResult();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.CaseResult#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>System</em>'.
   * @see org.osate.assure.assure.CaseResult#getSystem()
   * @see #getCaseResult()
   * @generated
   */
  EReference getCaseResult_System();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.CaseResult#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.assure.assure.CaseResult#getTarget()
   * @see #getCaseResult()
   * @generated
   */
  EReference getCaseResult_Target();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.CaseResult#getPassCount <em>Pass Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass Count</em>'.
   * @see org.osate.assure.assure.CaseResult#getPassCount()
   * @see #getCaseResult()
   * @generated
   */
  EAttribute getCaseResult_PassCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.CaseResult#getFailCount <em>Fail Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Count</em>'.
   * @see org.osate.assure.assure.CaseResult#getFailCount()
   * @see #getCaseResult()
   * @generated
   */
  EAttribute getCaseResult_FailCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.CaseResult#getNeutralCount <em>Neutral Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neutral Count</em>'.
   * @see org.osate.assure.assure.CaseResult#getNeutralCount()
   * @see #getCaseResult()
   * @generated
   */
  EAttribute getCaseResult_NeutralCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.CaseResult#getUnknownCount <em>Unknown Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unknown Count</em>'.
   * @see org.osate.assure.assure.CaseResult#getUnknownCount()
   * @see #getCaseResult()
   * @generated
   */
  EAttribute getCaseResult_UnknownCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.CaseResult#getSucessMsg <em>Sucess Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sucess Msg</em>'.
   * @see org.osate.assure.assure.CaseResult#getSucessMsg()
   * @see #getCaseResult()
   * @generated
   */
  EAttribute getCaseResult_SucessMsg();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.CaseResult#getFailMsg <em>Fail Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Msg</em>'.
   * @see org.osate.assure.assure.CaseResult#getFailMsg()
   * @see #getCaseResult()
   * @generated
   */
  EAttribute getCaseResult_FailMsg();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.CaseResult#getSubCaseResult <em>Sub Case Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Case Result</em>'.
   * @see org.osate.assure.assure.CaseResult#getSubCaseResult()
   * @see #getCaseResult()
   * @generated
   */
  EReference getCaseResult_SubCaseResult();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.CaseResult#getClaimResult <em>Claim Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Claim Result</em>'.
   * @see org.osate.assure.assure.CaseResult#getClaimResult()
   * @see #getCaseResult()
   * @generated
   */
  EReference getCaseResult_ClaimResult();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.CaseResult#getHazardResult <em>Hazard Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hazard Result</em>'.
   * @see org.osate.assure.assure.CaseResult#getHazardResult()
   * @see #getCaseResult()
   * @generated
   */
  EReference getCaseResult_HazardResult();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.ClaimResult <em>Claim Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Claim Result</em>'.
   * @see org.osate.assure.assure.ClaimResult
   * @generated
   */
  EClass getClaimResult();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.ClaimResult#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Requirement</em>'.
   * @see org.osate.assure.assure.ClaimResult#getRequirement()
   * @see #getClaimResult()
   * @generated
   */
  EReference getClaimResult_Requirement();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.ClaimResult#getSuccessCount <em>Success Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Success Count</em>'.
   * @see org.osate.assure.assure.ClaimResult#getSuccessCount()
   * @see #getClaimResult()
   * @generated
   */
  EAttribute getClaimResult_SuccessCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.ClaimResult#getFailCount <em>Fail Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Count</em>'.
   * @see org.osate.assure.assure.ClaimResult#getFailCount()
   * @see #getClaimResult()
   * @generated
   */
  EAttribute getClaimResult_FailCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.ClaimResult#getNeutralCount <em>Neutral Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neutral Count</em>'.
   * @see org.osate.assure.assure.ClaimResult#getNeutralCount()
   * @see #getClaimResult()
   * @generated
   */
  EAttribute getClaimResult_NeutralCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.ClaimResult#getUnknownCount <em>Unknown Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unknown Count</em>'.
   * @see org.osate.assure.assure.ClaimResult#getUnknownCount()
   * @see #getClaimResult()
   * @generated
   */
  EAttribute getClaimResult_UnknownCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.ClaimResult#getSucessMsg <em>Sucess Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sucess Msg</em>'.
   * @see org.osate.assure.assure.ClaimResult#getSucessMsg()
   * @see #getClaimResult()
   * @generated
   */
  EAttribute getClaimResult_SucessMsg();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.ClaimResult#getFailMsg <em>Fail Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Msg</em>'.
   * @see org.osate.assure.assure.ClaimResult#getFailMsg()
   * @see #getClaimResult()
   * @generated
   */
  EAttribute getClaimResult_FailMsg();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.ClaimResult#getSubClaimResult <em>Sub Claim Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Claim Result</em>'.
   * @see org.osate.assure.assure.ClaimResult#getSubClaimResult()
   * @see #getClaimResult()
   * @generated
   */
  EReference getClaimResult_SubClaimResult();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.ClaimResult#getVerificationResult <em>Verification Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Verification Result</em>'.
   * @see org.osate.assure.assure.ClaimResult#getVerificationResult()
   * @see #getClaimResult()
   * @generated
   */
  EReference getClaimResult_VerificationResult();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.VerificationResult <em>Verification Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Result</em>'.
   * @see org.osate.assure.assure.VerificationResult
   * @generated
   */
  EClass getVerificationResult();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.VerificationResult#getVerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Verification Activity</em>'.
   * @see org.osate.assure.assure.VerificationResult#getVerificationActivity()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_VerificationActivity();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.VerificationResult#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see org.osate.assure.assure.VerificationResult#getStatus()
   * @see #getVerificationResult()
   * @generated
   */
  EAttribute getVerificationResult_Status();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.VerificationResult#getAssumptionResult <em>Assumption Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assumption Result</em>'.
   * @see org.osate.assure.assure.VerificationResult#getAssumptionResult()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_AssumptionResult();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.VerificationResult#getPreconditionResult <em>Precondition Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Precondition Result</em>'.
   * @see org.osate.assure.assure.VerificationResult#getPreconditionResult()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_PreconditionResult();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.VerificationResult#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>First</em>'.
   * @see org.osate.assure.assure.VerificationResult#getFirst()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_First();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.VerificationResult#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Second</em>'.
   * @see org.osate.assure.assure.VerificationResult#getSecond()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_Second();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.AssumptionResult <em>Assumption Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assumption Result</em>'.
   * @see org.osate.assure.assure.AssumptionResult
   * @generated
   */
  EClass getAssumptionResult();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.AssumptionResult#getVerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Verification Activity</em>'.
   * @see org.osate.assure.assure.AssumptionResult#getVerificationActivity()
   * @see #getAssumptionResult()
   * @generated
   */
  EReference getAssumptionResult_VerificationActivity();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.assure.assure.AssumptionResult#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Status</em>'.
   * @see org.osate.assure.assure.AssumptionResult#getStatus()
   * @see #getAssumptionResult()
   * @generated
   */
  EReference getAssumptionResult_Status();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.PreconditionResult <em>Precondition Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precondition Result</em>'.
   * @see org.osate.assure.assure.PreconditionResult
   * @generated
   */
  EClass getPreconditionResult();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.PreconditionResult#getVerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Verification Activity</em>'.
   * @see org.osate.assure.assure.PreconditionResult#getVerificationActivity()
   * @see #getPreconditionResult()
   * @generated
   */
  EReference getPreconditionResult_VerificationActivity();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.assure.assure.PreconditionResult#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Status</em>'.
   * @see org.osate.assure.assure.PreconditionResult#getStatus()
   * @see #getPreconditionResult()
   * @generated
   */
  EReference getPreconditionResult_Status();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.AssuranceResult <em>Assurance Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Result</em>'.
   * @see org.osate.assure.assure.AssuranceResult
   * @generated
   */
  EClass getAssuranceResult();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.AssuranceResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.assure.assure.AssuranceResult#getName()
   * @see #getAssuranceResult()
   * @generated
   */
  EAttribute getAssuranceResult_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.AssuranceResult#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see org.osate.assure.assure.AssuranceResult#getWeight()
   * @see #getAssuranceResult()
   * @generated
   */
  EAttribute getAssuranceResult_Weight();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.EvidenceResult <em>Evidence Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evidence Result</em>'.
   * @see org.osate.assure.assure.EvidenceResult
   * @generated
   */
  EClass getEvidenceResult();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.EvidenceResult#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see org.osate.assure.assure.EvidenceResult#getState()
   * @see #getEvidenceResult()
   * @generated
   */
  EAttribute getEvidenceResult_State();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.EvidenceResult#getSucessMsg <em>Sucess Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sucess Msg</em>'.
   * @see org.osate.assure.assure.EvidenceResult#getSucessMsg()
   * @see #getEvidenceResult()
   * @generated
   */
  EAttribute getEvidenceResult_SucessMsg();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.EvidenceResult#getFailMsg <em>Fail Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Msg</em>'.
   * @see org.osate.assure.assure.EvidenceResult#getFailMsg()
   * @see #getEvidenceResult()
   * @generated
   */
  EAttribute getEvidenceResult_FailMsg();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.HazardResult <em>Hazard Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Result</em>'.
   * @see org.osate.assure.assure.HazardResult
   * @generated
   */
  EClass getHazardResult();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.HazardResult#getHazard <em>Hazard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Hazard</em>'.
   * @see org.osate.assure.assure.HazardResult#getHazard()
   * @see #getHazardResult()
   * @generated
   */
  EReference getHazardResult_Hazard();

  /**
   * Returns the meta object for the reference '{@link org.osate.assure.assure.HazardResult#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.assure.assure.HazardResult#getTarget()
   * @see #getHazardResult()
   * @generated
   */
  EReference getHazardResult_Target();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.HazardResult#getPassCount <em>Pass Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass Count</em>'.
   * @see org.osate.assure.assure.HazardResult#getPassCount()
   * @see #getHazardResult()
   * @generated
   */
  EAttribute getHazardResult_PassCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.HazardResult#getFailCount <em>Fail Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Count</em>'.
   * @see org.osate.assure.assure.HazardResult#getFailCount()
   * @see #getHazardResult()
   * @generated
   */
  EAttribute getHazardResult_FailCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.HazardResult#getNeutralCount <em>Neutral Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neutral Count</em>'.
   * @see org.osate.assure.assure.HazardResult#getNeutralCount()
   * @see #getHazardResult()
   * @generated
   */
  EAttribute getHazardResult_NeutralCount();

  /**
   * Returns the meta object for the attribute '{@link org.osate.assure.assure.HazardResult#getUnknownCount <em>Unknown Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unknown Count</em>'.
   * @see org.osate.assure.assure.HazardResult#getUnknownCount()
   * @see #getHazardResult()
   * @generated
   */
  EAttribute getHazardResult_UnknownCount();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.assure.assure.HazardResult#getVerificationResult <em>Verification Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Verification Result</em>'.
   * @see org.osate.assure.assure.HazardResult#getVerificationResult()
   * @see #getHazardResult()
   * @generated
   */
  EReference getHazardResult_VerificationResult();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.FailThenResult <em>Fail Then Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fail Then Result</em>'.
   * @see org.osate.assure.assure.FailThenResult
   * @generated
   */
  EClass getFailThenResult();

  /**
   * Returns the meta object for class '{@link org.osate.assure.assure.IfThenResult <em>If Then Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Result</em>'.
   * @see org.osate.assure.assure.IfThenResult
   * @generated
   */
  EClass getIfThenResult();

  /**
   * Returns the meta object for enum '{@link org.osate.assure.assure.VerificationExecutionState <em>Verification Execution State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verification Execution State</em>'.
   * @see org.osate.assure.assure.VerificationExecutionState
   * @generated
   */
  EEnum getVerificationExecutionState();

  /**
   * Returns the meta object for enum '{@link org.osate.assure.assure.VerificationResultState <em>Verification Result State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verification Result State</em>'.
   * @see org.osate.assure.assure.VerificationResultState
   * @generated
   */
  EEnum getVerificationResultState();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AssureFactory getAssureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.CaseResultImpl <em>Case Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.CaseResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getCaseResult()
     * @generated
     */
    EClass CASE_RESULT = eINSTANCE.getCaseResult();

    /**
     * The meta object literal for the '<em><b>System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_RESULT__SYSTEM = eINSTANCE.getCaseResult_System();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_RESULT__TARGET = eINSTANCE.getCaseResult_Target();

    /**
     * The meta object literal for the '<em><b>Pass Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_RESULT__PASS_COUNT = eINSTANCE.getCaseResult_PassCount();

    /**
     * The meta object literal for the '<em><b>Fail Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_RESULT__FAIL_COUNT = eINSTANCE.getCaseResult_FailCount();

    /**
     * The meta object literal for the '<em><b>Neutral Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_RESULT__NEUTRAL_COUNT = eINSTANCE.getCaseResult_NeutralCount();

    /**
     * The meta object literal for the '<em><b>Unknown Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_RESULT__UNKNOWN_COUNT = eINSTANCE.getCaseResult_UnknownCount();

    /**
     * The meta object literal for the '<em><b>Sucess Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_RESULT__SUCESS_MSG = eINSTANCE.getCaseResult_SucessMsg();

    /**
     * The meta object literal for the '<em><b>Fail Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_RESULT__FAIL_MSG = eINSTANCE.getCaseResult_FailMsg();

    /**
     * The meta object literal for the '<em><b>Sub Case Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_RESULT__SUB_CASE_RESULT = eINSTANCE.getCaseResult_SubCaseResult();

    /**
     * The meta object literal for the '<em><b>Claim Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_RESULT__CLAIM_RESULT = eINSTANCE.getCaseResult_ClaimResult();

    /**
     * The meta object literal for the '<em><b>Hazard Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_RESULT__HAZARD_RESULT = eINSTANCE.getCaseResult_HazardResult();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.ClaimResultImpl <em>Claim Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.ClaimResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getClaimResult()
     * @generated
     */
    EClass CLAIM_RESULT = eINSTANCE.getClaimResult();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM_RESULT__REQUIREMENT = eINSTANCE.getClaimResult_Requirement();

    /**
     * The meta object literal for the '<em><b>Success Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM_RESULT__SUCCESS_COUNT = eINSTANCE.getClaimResult_SuccessCount();

    /**
     * The meta object literal for the '<em><b>Fail Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM_RESULT__FAIL_COUNT = eINSTANCE.getClaimResult_FailCount();

    /**
     * The meta object literal for the '<em><b>Neutral Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM_RESULT__NEUTRAL_COUNT = eINSTANCE.getClaimResult_NeutralCount();

    /**
     * The meta object literal for the '<em><b>Unknown Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM_RESULT__UNKNOWN_COUNT = eINSTANCE.getClaimResult_UnknownCount();

    /**
     * The meta object literal for the '<em><b>Sucess Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM_RESULT__SUCESS_MSG = eINSTANCE.getClaimResult_SucessMsg();

    /**
     * The meta object literal for the '<em><b>Fail Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM_RESULT__FAIL_MSG = eINSTANCE.getClaimResult_FailMsg();

    /**
     * The meta object literal for the '<em><b>Sub Claim Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM_RESULT__SUB_CLAIM_RESULT = eINSTANCE.getClaimResult_SubClaimResult();

    /**
     * The meta object literal for the '<em><b>Verification Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM_RESULT__VERIFICATION_RESULT = eINSTANCE.getClaimResult_VerificationResult();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.VerificationResultImpl <em>Verification Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.VerificationResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getVerificationResult()
     * @generated
     */
    EClass VERIFICATION_RESULT = eINSTANCE.getVerificationResult();

    /**
     * The meta object literal for the '<em><b>Verification Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__VERIFICATION_ACTIVITY = eINSTANCE.getVerificationResult_VerificationActivity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_RESULT__STATUS = eINSTANCE.getVerificationResult_Status();

    /**
     * The meta object literal for the '<em><b>Assumption Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__ASSUMPTION_RESULT = eINSTANCE.getVerificationResult_AssumptionResult();

    /**
     * The meta object literal for the '<em><b>Precondition Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__PRECONDITION_RESULT = eINSTANCE.getVerificationResult_PreconditionResult();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__FIRST = eINSTANCE.getVerificationResult_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__SECOND = eINSTANCE.getVerificationResult_Second();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.AssumptionResultImpl <em>Assumption Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.AssumptionResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getAssumptionResult()
     * @generated
     */
    EClass ASSUMPTION_RESULT = eINSTANCE.getAssumptionResult();

    /**
     * The meta object literal for the '<em><b>Verification Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSUMPTION_RESULT__VERIFICATION_ACTIVITY = eINSTANCE.getAssumptionResult_VerificationActivity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSUMPTION_RESULT__STATUS = eINSTANCE.getAssumptionResult_Status();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.PreconditionResultImpl <em>Precondition Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.PreconditionResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getPreconditionResult()
     * @generated
     */
    EClass PRECONDITION_RESULT = eINSTANCE.getPreconditionResult();

    /**
     * The meta object literal for the '<em><b>Verification Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECONDITION_RESULT__VERIFICATION_ACTIVITY = eINSTANCE.getPreconditionResult_VerificationActivity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECONDITION_RESULT__STATUS = eINSTANCE.getPreconditionResult_Status();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.AssuranceResultImpl <em>Assurance Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.AssuranceResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getAssuranceResult()
     * @generated
     */
    EClass ASSURANCE_RESULT = eINSTANCE.getAssuranceResult();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_RESULT__NAME = eINSTANCE.getAssuranceResult_Name();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_RESULT__WEIGHT = eINSTANCE.getAssuranceResult_Weight();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.EvidenceResultImpl <em>Evidence Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.EvidenceResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getEvidenceResult()
     * @generated
     */
    EClass EVIDENCE_RESULT = eINSTANCE.getEvidenceResult();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVIDENCE_RESULT__STATE = eINSTANCE.getEvidenceResult_State();

    /**
     * The meta object literal for the '<em><b>Sucess Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVIDENCE_RESULT__SUCESS_MSG = eINSTANCE.getEvidenceResult_SucessMsg();

    /**
     * The meta object literal for the '<em><b>Fail Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVIDENCE_RESULT__FAIL_MSG = eINSTANCE.getEvidenceResult_FailMsg();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.HazardResultImpl <em>Hazard Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.HazardResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getHazardResult()
     * @generated
     */
    EClass HAZARD_RESULT = eINSTANCE.getHazardResult();

    /**
     * The meta object literal for the '<em><b>Hazard</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_RESULT__HAZARD = eINSTANCE.getHazardResult_Hazard();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_RESULT__TARGET = eINSTANCE.getHazardResult_Target();

    /**
     * The meta object literal for the '<em><b>Pass Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_RESULT__PASS_COUNT = eINSTANCE.getHazardResult_PassCount();

    /**
     * The meta object literal for the '<em><b>Fail Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_RESULT__FAIL_COUNT = eINSTANCE.getHazardResult_FailCount();

    /**
     * The meta object literal for the '<em><b>Neutral Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_RESULT__NEUTRAL_COUNT = eINSTANCE.getHazardResult_NeutralCount();

    /**
     * The meta object literal for the '<em><b>Unknown Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_RESULT__UNKNOWN_COUNT = eINSTANCE.getHazardResult_UnknownCount();

    /**
     * The meta object literal for the '<em><b>Verification Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_RESULT__VERIFICATION_RESULT = eINSTANCE.getHazardResult_VerificationResult();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.FailThenResultImpl <em>Fail Then Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.FailThenResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getFailThenResult()
     * @generated
     */
    EClass FAIL_THEN_RESULT = eINSTANCE.getFailThenResult();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.impl.IfThenResultImpl <em>If Then Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.impl.IfThenResultImpl
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getIfThenResult()
     * @generated
     */
    EClass IF_THEN_RESULT = eINSTANCE.getIfThenResult();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.VerificationExecutionState <em>Verification Execution State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.VerificationExecutionState
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getVerificationExecutionState()
     * @generated
     */
    EEnum VERIFICATION_EXECUTION_STATE = eINSTANCE.getVerificationExecutionState();

    /**
     * The meta object literal for the '{@link org.osate.assure.assure.VerificationResultState <em>Verification Result State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.assure.assure.VerificationResultState
     * @see org.osate.assure.assure.impl.AssurePackageImpl#getVerificationResultState()
     * @generated
     */
    EEnum VERIFICATION_RESULT_STATE = eINSTANCE.getVerificationResultState();

  }

} //AssurePackage
