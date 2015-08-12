/**
 */
package org.osate.verify.verify;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.osate.verify.verify.VerifyFactory
 * @model kind="package"
 * @generated
 */
public interface VerifyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "verify";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/verify/Verify";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "verify";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VerifyPackage eINSTANCE = org.osate.verify.verify.impl.VerifyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationImpl <em>Verification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerification()
   * @generated
   */
  int VERIFICATION = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Verification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationPlanImpl <em>Verification Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationPlanImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPlan()
   * @generated
   */
  int VERIFICATION_PLAN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__TITLE = 1;

  /**
   * The feature id for the '<em><b>System Requirements</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__SYSTEM_REQUIREMENTS = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Claim</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__CLAIM = 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__RATIONALE = 5;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__ISSUES = 6;

  /**
   * The number of structural features of the '<em>Verification Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ClaimImpl <em>Claim</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ClaimImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getClaim()
   * @generated
   */
  int CLAIM = 2;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__REQUIREMENT = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__TITLE = 1;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__WEIGHT = 2;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__ACTIVITIES = 3;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__ASSERT = 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__RATIONALE = 5;

  /**
   * The feature id for the '<em><b>Subclaim</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__SUBCLAIM = 6;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__ISSUES = 7;

  /**
   * The number of structural features of the '<em>Claim</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationActivityImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationActivity()
   * @generated
   */
  int VERIFICATION_ACTIVITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__TITLE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__TARGET = 2;

  /**
   * The feature id for the '<em><b>Result</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__RESULT = 3;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__METHOD = 4;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__PARAMETERS = 5;

  /**
   * The feature id for the '<em><b>Condition</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__CONDITION = 6;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__TIMEOUT = 7;

  /**
   * The number of structural features of the '<em>Verification Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ArgumentExprImpl <em>Argument Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ArgumentExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getArgumentExpr()
   * @generated
   */
  int ARGUMENT_EXPR = 4;

  /**
   * The number of structural features of the '<em>Argument Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationMethodRegistryImpl <em>Verification Method Registry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationMethodRegistryImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethodRegistry()
   * @generated
   */
  int VERIFICATION_METHOD_REGISTRY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__METHODS = 3;

  /**
   * The number of structural features of the '<em>Verification Method Registry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationMethodImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethod()
   * @generated
   */
  int VERIFICATION_METHOD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Is Predicate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__IS_PREDICATE = 2;

  /**
   * The feature id for the '<em><b>Is Result Report</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__IS_RESULT_REPORT = 3;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__TITLE = 4;

  /**
   * The feature id for the '<em><b>Method Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__METHOD_TYPE = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__DESCRIPTION = 6;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__CONDITION = 7;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__CATEGORY = 8;

  /**
   * The number of structural features of the '<em>Verification Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.MethodTypeImpl <em>Method Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.MethodTypeImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getMethodType()
   * @generated
   */
  int METHOD_TYPE = 7;

  /**
   * The number of structural features of the '<em>Method Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ResoluteMethodImpl <em>Resolute Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ResoluteMethodImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getResoluteMethod()
   * @generated
   */
  int RESOLUTE_METHOD = 8;

  /**
   * The feature id for the '<em><b>Method Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLUTE_METHOD__METHOD_REFERENCE = METHOD_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resolute Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLUTE_METHOD_FEATURE_COUNT = METHOD_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.JavaMethodImpl <em>Java Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.JavaMethodImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getJavaMethod()
   * @generated
   */
  int JAVA_METHOD = 9;

  /**
   * The feature id for the '<em><b>Method Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD__METHOD_PATH = METHOD_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Java Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD_FEATURE_COUNT = METHOD_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ManualMethodImpl <em>Manual Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ManualMethodImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getManualMethod()
   * @generated
   */
  int MANUAL_METHOD = 10;

  /**
   * The feature id for the '<em><b>Dialog ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_METHOD__DIALOG_ID = METHOD_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Manual Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_METHOD_FEATURE_COUNT = METHOD_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.PluginMethodImpl <em>Plugin Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.PluginMethodImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getPluginMethod()
   * @generated
   */
  int PLUGIN_METHOD = 11;

  /**
   * The feature id for the '<em><b>Method ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_METHOD__METHOD_ID = METHOD_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Plugin Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_METHOD_FEATURE_COUNT = METHOD_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationConditionImpl <em>Verification Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationConditionImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationCondition()
   * @generated
   */
  int VERIFICATION_CONDITION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__METHOD = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__PARAMETERS = 4;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__TIMEOUT = 5;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__RATIONALE = 6;

  /**
   * The number of structural features of the '<em>Verification Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ThenExprImpl <em>Then Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ThenExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getThenExpr()
   * @generated
   */
  int THEN_EXPR = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_EXPR__LEFT = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Successor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_EXPR__SUCCESSOR = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Then Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ElseExprImpl <em>Else Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ElseExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getElseExpr()
   * @generated
   */
  int ELSE_EXPR = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_EXPR__LEFT = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_EXPR__OTHER = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_EXPR__FAIL = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_EXPR__TIMEOUT = ARGUMENT_EXPR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Else Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.AllExprImpl <em>All Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.AllExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getAllExpr()
   * @generated
   */
  int ALL_EXPR = 15;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_EXPR__ELEMENTS = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>All Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.RefExprImpl <em>Ref Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.RefExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getRefExpr()
   * @generated
   */
  int REF_EXPR = 16;

  /**
   * The feature id for the '<em><b>Verification</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR__VERIFICATION = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR__WEIGHT = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ref Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationValidationImpl <em>Verification Validation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationValidationImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationValidation()
   * @generated
   */
  int VERIFICATION_VALIDATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION__NAME = VERIFICATION_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION__TITLE = VERIFICATION_CONDITION__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION__DESCRIPTION = VERIFICATION_CONDITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION__METHOD = VERIFICATION_CONDITION__METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION__PARAMETERS = VERIFICATION_CONDITION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION__TIMEOUT = VERIFICATION_CONDITION__TIMEOUT;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION__RATIONALE = VERIFICATION_CONDITION__RATIONALE;

  /**
   * The number of structural features of the '<em>Verification Validation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_VALIDATION_FEATURE_COUNT = VERIFICATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationPreconditionImpl <em>Verification Precondition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationPreconditionImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPrecondition()
   * @generated
   */
  int VERIFICATION_PRECONDITION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__NAME = VERIFICATION_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__TITLE = VERIFICATION_CONDITION__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__DESCRIPTION = VERIFICATION_CONDITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__METHOD = VERIFICATION_CONDITION__METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__PARAMETERS = VERIFICATION_CONDITION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__TIMEOUT = VERIFICATION_CONDITION__TIMEOUT;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__RATIONALE = VERIFICATION_CONDITION__RATIONALE;

  /**
   * The number of structural features of the '<em>Verification Precondition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION_FEATURE_COUNT = VERIFICATION_CONDITION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.Verification <em>Verification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification</em>'.
   * @see org.osate.verify.verify.Verification
   * @generated
   */
  EClass getVerification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.Verification#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.osate.verify.verify.Verification#getContents()
   * @see #getVerification()
   * @generated
   */
  EReference getVerification_Contents();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationPlan <em>Verification Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Plan</em>'.
   * @see org.osate.verify.verify.VerificationPlan
   * @generated
   */
  EClass getVerificationPlan();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationPlan#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getName()
   * @see #getVerificationPlan()
   * @generated
   */
  EAttribute getVerificationPlan_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationPlan#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getTitle()
   * @see #getVerificationPlan()
   * @generated
   */
  EAttribute getVerificationPlan_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationPlan#getSystemRequirements <em>System Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>System Requirements</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getSystemRequirements()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_SystemRequirements();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationPlan#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getDescription()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.VerificationPlan#getClaim <em>Claim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Claim</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getClaim()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_Claim();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationPlan#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getRationale()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_Rationale();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.verify.verify.VerificationPlan#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getIssues()
   * @see #getVerificationPlan()
   * @generated
   */
  EAttribute getVerificationPlan_Issues();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.Claim <em>Claim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Claim</em>'.
   * @see org.osate.verify.verify.Claim
   * @generated
   */
  EClass getClaim();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.Claim#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Requirement</em>'.
   * @see org.osate.verify.verify.Claim#getRequirement()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Requirement();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.Claim#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.Claim#getTitle()
   * @see #getClaim()
   * @generated
   */
  EAttribute getClaim_Title();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.Claim#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see org.osate.verify.verify.Claim#getWeight()
   * @see #getClaim()
   * @generated
   */
  EAttribute getClaim_Weight();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.Claim#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activities</em>'.
   * @see org.osate.verify.verify.Claim#getActivities()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Activities();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.Claim#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert</em>'.
   * @see org.osate.verify.verify.Claim#getAssert()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Assert();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.Claim#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.verify.verify.Claim#getRationale()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Rationale();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.Claim#getSubclaim <em>Subclaim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subclaim</em>'.
   * @see org.osate.verify.verify.Claim#getSubclaim()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Subclaim();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.verify.verify.Claim#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.verify.verify.Claim#getIssues()
   * @see #getClaim()
   * @generated
   */
  EAttribute getClaim_Issues();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Activity</em>'.
   * @see org.osate.verify.verify.VerificationActivity
   * @generated
   */
  EClass getVerificationActivity();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationActivity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getName()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationActivity#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getTitle()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationActivity#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getTarget()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Target();

  /**
   * Returns the meta object for the reference list '{@link org.osate.verify.verify.VerificationActivity#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Result</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getResult()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Result();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationActivity#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getMethod()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Method();

  /**
   * Returns the meta object for the reference list '{@link org.osate.verify.verify.VerificationActivity#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameters</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getParameters()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Parameters();

  /**
   * Returns the meta object for the reference list '{@link org.osate.verify.verify.VerificationActivity#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Condition</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getCondition()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationActivity#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getTimeout()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Timeout();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.ArgumentExpr <em>Argument Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Expr</em>'.
   * @see org.osate.verify.verify.ArgumentExpr
   * @generated
   */
  EClass getArgumentExpr();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationMethodRegistry <em>Verification Method Registry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Method Registry</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry
   * @generated
   */
  EClass getVerificationMethodRegistry();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethodRegistry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getName()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EAttribute getVerificationMethodRegistry_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethodRegistry#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getTitle()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EAttribute getVerificationMethodRegistry_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationMethodRegistry#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getDescription()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EReference getVerificationMethodRegistry_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.VerificationMethodRegistry#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getMethods()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EReference getVerificationMethodRegistry_Methods();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationMethod <em>Verification Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Method</em>'.
   * @see org.osate.verify.verify.VerificationMethod
   * @generated
   */
  EClass getVerificationMethod();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getName()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.VerificationMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getParams()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_Params();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethod#isIsPredicate <em>Is Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Predicate</em>'.
   * @see org.osate.verify.verify.VerificationMethod#isIsPredicate()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_IsPredicate();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethod#isIsResultReport <em>Is Result Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Result Report</em>'.
   * @see org.osate.verify.verify.VerificationMethod#isIsResultReport()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_IsResultReport();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethod#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getTitle()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationMethod#getMethodType <em>Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Type</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getMethodType()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_MethodType();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationMethod#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getDescription()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationMethod#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getCondition()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_Condition();

  /**
   * Returns the meta object for the reference list '{@link org.osate.verify.verify.VerificationMethod#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getCategory()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_Category();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.MethodType <em>Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Type</em>'.
   * @see org.osate.verify.verify.MethodType
   * @generated
   */
  EClass getMethodType();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.ResoluteMethod <em>Resolute Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resolute Method</em>'.
   * @see org.osate.verify.verify.ResoluteMethod
   * @generated
   */
  EClass getResoluteMethod();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.ResoluteMethod#getMethodReference <em>Method Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method Reference</em>'.
   * @see org.osate.verify.verify.ResoluteMethod#getMethodReference()
   * @see #getResoluteMethod()
   * @generated
   */
  EReference getResoluteMethod_MethodReference();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.JavaMethod <em>Java Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Method</em>'.
   * @see org.osate.verify.verify.JavaMethod
   * @generated
   */
  EClass getJavaMethod();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.JavaMethod#getMethodPath <em>Method Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Path</em>'.
   * @see org.osate.verify.verify.JavaMethod#getMethodPath()
   * @see #getJavaMethod()
   * @generated
   */
  EAttribute getJavaMethod_MethodPath();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.ManualMethod <em>Manual Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manual Method</em>'.
   * @see org.osate.verify.verify.ManualMethod
   * @generated
   */
  EClass getManualMethod();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.ManualMethod#getDialogID <em>Dialog ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dialog ID</em>'.
   * @see org.osate.verify.verify.ManualMethod#getDialogID()
   * @see #getManualMethod()
   * @generated
   */
  EAttribute getManualMethod_DialogID();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.PluginMethod <em>Plugin Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Method</em>'.
   * @see org.osate.verify.verify.PluginMethod
   * @generated
   */
  EClass getPluginMethod();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.PluginMethod#getMethodID <em>Method ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method ID</em>'.
   * @see org.osate.verify.verify.PluginMethod#getMethodID()
   * @see #getPluginMethod()
   * @generated
   */
  EAttribute getPluginMethod_MethodID();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationCondition <em>Verification Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Condition</em>'.
   * @see org.osate.verify.verify.VerificationCondition
   * @generated
   */
  EClass getVerificationCondition();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationCondition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getName()
   * @see #getVerificationCondition()
   * @generated
   */
  EAttribute getVerificationCondition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationCondition#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getTitle()
   * @see #getVerificationCondition()
   * @generated
   */
  EAttribute getVerificationCondition_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationCondition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getDescription()
   * @see #getVerificationCondition()
   * @generated
   */
  EReference getVerificationCondition_Description();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationCondition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getMethod()
   * @see #getVerificationCondition()
   * @generated
   */
  EReference getVerificationCondition_Method();

  /**
   * Returns the meta object for the reference list '{@link org.osate.verify.verify.VerificationCondition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameters</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getParameters()
   * @see #getVerificationCondition()
   * @generated
   */
  EReference getVerificationCondition_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationCondition#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getTimeout()
   * @see #getVerificationCondition()
   * @generated
   */
  EAttribute getVerificationCondition_Timeout();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationCondition#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getRationale()
   * @see #getVerificationCondition()
   * @generated
   */
  EReference getVerificationCondition_Rationale();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.ThenExpr <em>Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then Expr</em>'.
   * @see org.osate.verify.verify.ThenExpr
   * @generated
   */
  EClass getThenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.ThenExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.verify.verify.ThenExpr#getLeft()
   * @see #getThenExpr()
   * @generated
   */
  EReference getThenExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.ThenExpr#getSuccessor <em>Successor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Successor</em>'.
   * @see org.osate.verify.verify.ThenExpr#getSuccessor()
   * @see #getThenExpr()
   * @generated
   */
  EReference getThenExpr_Successor();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.ElseExpr <em>Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Expr</em>'.
   * @see org.osate.verify.verify.ElseExpr
   * @generated
   */
  EClass getElseExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.ElseExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.verify.verify.ElseExpr#getLeft()
   * @see #getElseExpr()
   * @generated
   */
  EReference getElseExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.ElseExpr#getOther <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Other</em>'.
   * @see org.osate.verify.verify.ElseExpr#getOther()
   * @see #getElseExpr()
   * @generated
   */
  EReference getElseExpr_Other();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.ElseExpr#getFail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fail</em>'.
   * @see org.osate.verify.verify.ElseExpr#getFail()
   * @see #getElseExpr()
   * @generated
   */
  EReference getElseExpr_Fail();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.ElseExpr#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timeout</em>'.
   * @see org.osate.verify.verify.ElseExpr#getTimeout()
   * @see #getElseExpr()
   * @generated
   */
  EReference getElseExpr_Timeout();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.AllExpr <em>All Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>All Expr</em>'.
   * @see org.osate.verify.verify.AllExpr
   * @generated
   */
  EClass getAllExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.AllExpr#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.osate.verify.verify.AllExpr#getElements()
   * @see #getAllExpr()
   * @generated
   */
  EReference getAllExpr_Elements();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.RefExpr <em>Ref Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Expr</em>'.
   * @see org.osate.verify.verify.RefExpr
   * @generated
   */
  EClass getRefExpr();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.RefExpr#getVerification <em>Verification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Verification</em>'.
   * @see org.osate.verify.verify.RefExpr#getVerification()
   * @see #getRefExpr()
   * @generated
   */
  EReference getRefExpr_Verification();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.RefExpr#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see org.osate.verify.verify.RefExpr#getWeight()
   * @see #getRefExpr()
   * @generated
   */
  EAttribute getRefExpr_Weight();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationValidation <em>Verification Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Validation</em>'.
   * @see org.osate.verify.verify.VerificationValidation
   * @generated
   */
  EClass getVerificationValidation();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationPrecondition <em>Verification Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Precondition</em>'.
   * @see org.osate.verify.verify.VerificationPrecondition
   * @generated
   */
  EClass getVerificationPrecondition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VerifyFactory getVerifyFactory();

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
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationImpl <em>Verification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerification()
     * @generated
     */
    EClass VERIFICATION = eINSTANCE.getVerification();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION__CONTENTS = eINSTANCE.getVerification_Contents();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationPlanImpl <em>Verification Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationPlanImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPlan()
     * @generated
     */
    EClass VERIFICATION_PLAN = eINSTANCE.getVerificationPlan();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_PLAN__NAME = eINSTANCE.getVerificationPlan_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_PLAN__TITLE = eINSTANCE.getVerificationPlan_Title();

    /**
     * The meta object literal for the '<em><b>System Requirements</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__SYSTEM_REQUIREMENTS = eINSTANCE.getVerificationPlan_SystemRequirements();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__DESCRIPTION = eINSTANCE.getVerificationPlan_Description();

    /**
     * The meta object literal for the '<em><b>Claim</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__CLAIM = eINSTANCE.getVerificationPlan_Claim();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__RATIONALE = eINSTANCE.getVerificationPlan_Rationale();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_PLAN__ISSUES = eINSTANCE.getVerificationPlan_Issues();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ClaimImpl <em>Claim</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ClaimImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getClaim()
     * @generated
     */
    EClass CLAIM = eINSTANCE.getClaim();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__REQUIREMENT = eINSTANCE.getClaim_Requirement();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM__TITLE = eINSTANCE.getClaim_Title();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM__WEIGHT = eINSTANCE.getClaim_Weight();

    /**
     * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__ACTIVITIES = eINSTANCE.getClaim_Activities();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__ASSERT = eINSTANCE.getClaim_Assert();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__RATIONALE = eINSTANCE.getClaim_Rationale();

    /**
     * The meta object literal for the '<em><b>Subclaim</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__SUBCLAIM = eINSTANCE.getClaim_Subclaim();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM__ISSUES = eINSTANCE.getClaim_Issues();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationActivityImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationActivity()
     * @generated
     */
    EClass VERIFICATION_ACTIVITY = eINSTANCE.getVerificationActivity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__NAME = eINSTANCE.getVerificationActivity_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__TITLE = eINSTANCE.getVerificationActivity_Title();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__TARGET = eINSTANCE.getVerificationActivity_Target();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__RESULT = eINSTANCE.getVerificationActivity_Result();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__METHOD = eINSTANCE.getVerificationActivity_Method();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__PARAMETERS = eINSTANCE.getVerificationActivity_Parameters();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__CONDITION = eINSTANCE.getVerificationActivity_Condition();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__TIMEOUT = eINSTANCE.getVerificationActivity_Timeout();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ArgumentExprImpl <em>Argument Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ArgumentExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getArgumentExpr()
     * @generated
     */
    EClass ARGUMENT_EXPR = eINSTANCE.getArgumentExpr();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationMethodRegistryImpl <em>Verification Method Registry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationMethodRegistryImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethodRegistry()
     * @generated
     */
    EClass VERIFICATION_METHOD_REGISTRY = eINSTANCE.getVerificationMethodRegistry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD_REGISTRY__NAME = eINSTANCE.getVerificationMethodRegistry_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD_REGISTRY__TITLE = eINSTANCE.getVerificationMethodRegistry_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD_REGISTRY__DESCRIPTION = eINSTANCE.getVerificationMethodRegistry_Description();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD_REGISTRY__METHODS = eINSTANCE.getVerificationMethodRegistry_Methods();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationMethodImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethod()
     * @generated
     */
    EClass VERIFICATION_METHOD = eINSTANCE.getVerificationMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__NAME = eINSTANCE.getVerificationMethod_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__PARAMS = eINSTANCE.getVerificationMethod_Params();

    /**
     * The meta object literal for the '<em><b>Is Predicate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__IS_PREDICATE = eINSTANCE.getVerificationMethod_IsPredicate();

    /**
     * The meta object literal for the '<em><b>Is Result Report</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__IS_RESULT_REPORT = eINSTANCE.getVerificationMethod_IsResultReport();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__TITLE = eINSTANCE.getVerificationMethod_Title();

    /**
     * The meta object literal for the '<em><b>Method Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__METHOD_TYPE = eINSTANCE.getVerificationMethod_MethodType();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__DESCRIPTION = eINSTANCE.getVerificationMethod_Description();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__CONDITION = eINSTANCE.getVerificationMethod_Condition();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__CATEGORY = eINSTANCE.getVerificationMethod_Category();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.MethodTypeImpl <em>Method Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.MethodTypeImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getMethodType()
     * @generated
     */
    EClass METHOD_TYPE = eINSTANCE.getMethodType();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ResoluteMethodImpl <em>Resolute Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ResoluteMethodImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getResoluteMethod()
     * @generated
     */
    EClass RESOLUTE_METHOD = eINSTANCE.getResoluteMethod();

    /**
     * The meta object literal for the '<em><b>Method Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOLUTE_METHOD__METHOD_REFERENCE = eINSTANCE.getResoluteMethod_MethodReference();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.JavaMethodImpl <em>Java Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.JavaMethodImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getJavaMethod()
     * @generated
     */
    EClass JAVA_METHOD = eINSTANCE.getJavaMethod();

    /**
     * The meta object literal for the '<em><b>Method Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_METHOD__METHOD_PATH = eINSTANCE.getJavaMethod_MethodPath();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ManualMethodImpl <em>Manual Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ManualMethodImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getManualMethod()
     * @generated
     */
    EClass MANUAL_METHOD = eINSTANCE.getManualMethod();

    /**
     * The meta object literal for the '<em><b>Dialog ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANUAL_METHOD__DIALOG_ID = eINSTANCE.getManualMethod_DialogID();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.PluginMethodImpl <em>Plugin Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.PluginMethodImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getPluginMethod()
     * @generated
     */
    EClass PLUGIN_METHOD = eINSTANCE.getPluginMethod();

    /**
     * The meta object literal for the '<em><b>Method ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_METHOD__METHOD_ID = eINSTANCE.getPluginMethod_MethodID();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationConditionImpl <em>Verification Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationConditionImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationCondition()
     * @generated
     */
    EClass VERIFICATION_CONDITION = eINSTANCE.getVerificationCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_CONDITION__NAME = eINSTANCE.getVerificationCondition_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_CONDITION__TITLE = eINSTANCE.getVerificationCondition_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONDITION__DESCRIPTION = eINSTANCE.getVerificationCondition_Description();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONDITION__METHOD = eINSTANCE.getVerificationCondition_Method();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONDITION__PARAMETERS = eINSTANCE.getVerificationCondition_Parameters();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_CONDITION__TIMEOUT = eINSTANCE.getVerificationCondition_Timeout();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONDITION__RATIONALE = eINSTANCE.getVerificationCondition_Rationale();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ThenExprImpl <em>Then Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ThenExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getThenExpr()
     * @generated
     */
    EClass THEN_EXPR = eINSTANCE.getThenExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEN_EXPR__LEFT = eINSTANCE.getThenExpr_Left();

    /**
     * The meta object literal for the '<em><b>Successor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEN_EXPR__SUCCESSOR = eINSTANCE.getThenExpr_Successor();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ElseExprImpl <em>Else Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ElseExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getElseExpr()
     * @generated
     */
    EClass ELSE_EXPR = eINSTANCE.getElseExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_EXPR__LEFT = eINSTANCE.getElseExpr_Left();

    /**
     * The meta object literal for the '<em><b>Other</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_EXPR__OTHER = eINSTANCE.getElseExpr_Other();

    /**
     * The meta object literal for the '<em><b>Fail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_EXPR__FAIL = eINSTANCE.getElseExpr_Fail();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_EXPR__TIMEOUT = eINSTANCE.getElseExpr_Timeout();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.AllExprImpl <em>All Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.AllExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getAllExpr()
     * @generated
     */
    EClass ALL_EXPR = eINSTANCE.getAllExpr();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALL_EXPR__ELEMENTS = eINSTANCE.getAllExpr_Elements();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.RefExprImpl <em>Ref Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.RefExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getRefExpr()
     * @generated
     */
    EClass REF_EXPR = eINSTANCE.getRefExpr();

    /**
     * The meta object literal for the '<em><b>Verification</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_EXPR__VERIFICATION = eINSTANCE.getRefExpr_Verification();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_EXPR__WEIGHT = eINSTANCE.getRefExpr_Weight();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationValidationImpl <em>Verification Validation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationValidationImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationValidation()
     * @generated
     */
    EClass VERIFICATION_VALIDATION = eINSTANCE.getVerificationValidation();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationPreconditionImpl <em>Verification Precondition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationPreconditionImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPrecondition()
     * @generated
     */
    EClass VERIFICATION_PRECONDITION = eINSTANCE.getVerificationPrecondition();

  }

} //VerifyPackage
