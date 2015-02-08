/**
 */
package org.osate.reqspec.reqSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPe AR Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.reqspec.reqSpec.SPeARPredicate#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.reqspec.reqSpec.ReqSpecPackage#getSPeARPredicate()
 * @model
 * @generated
 */
public interface SPeARPredicate extends ReqPredicate
{
  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Expr)
   * @see org.osate.reqspec.reqSpec.ReqSpecPackage#getSPeARPredicate_Predicate()
   * @model containment="true"
   * @generated
   */
  Expr getPredicate();

  /**
   * Sets the value of the '{@link org.osate.reqspec.reqSpec.SPeARPredicate#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Expr value);

} // SPeARPredicate
