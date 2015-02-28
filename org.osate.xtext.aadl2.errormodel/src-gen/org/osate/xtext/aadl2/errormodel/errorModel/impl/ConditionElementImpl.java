/**
 */
package org.osate.xtext.aadl2.errormodel.errorModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.ElementImpl;

import org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelPackage;
import org.osate.xtext.aadl2.errormodel.errorModel.EventOrPropagation;
import org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionElementImpl extends ElementImpl implements ConditionElement
{
  /**
   * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncoming()
   * @generated
   * @ordered
   */
  protected EventOrPropagation incoming;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected TypeSet constraint;

  /**
   * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubcomponents()
   * @generated
   * @ordered
   */
  protected EList<SubcomponentElement> subcomponents;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected ErrorBehaviorState state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ErrorModelPackage.Literals.CONDITION_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventOrPropagation getIncoming()
  {
    if (incoming != null && incoming.eIsProxy())
    {
      InternalEObject oldIncoming = (InternalEObject)incoming;
      incoming = (EventOrPropagation)eResolveProxy(oldIncoming);
      if (incoming != oldIncoming)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorModelPackage.CONDITION_ELEMENT__INCOMING, oldIncoming, incoming));
      }
    }
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventOrPropagation basicGetIncoming()
  {
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncoming(EventOrPropagation newIncoming)
  {
    EventOrPropagation oldIncoming = incoming;
    incoming = newIncoming;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErrorModelPackage.CONDITION_ELEMENT__INCOMING, oldIncoming, incoming));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSet getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(TypeSet newConstraint, NotificationChain msgs)
  {
    TypeSet oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(TypeSet newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubcomponentElement> getSubcomponents()
  {
    if (subcomponents == null)
    {
      subcomponents = new EObjectContainmentEList<SubcomponentElement>(SubcomponentElement.class, this, ErrorModelPackage.CONDITION_ELEMENT__SUBCOMPONENTS);
    }
    return subcomponents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorBehaviorState getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (ErrorBehaviorState)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorModelPackage.CONDITION_ELEMENT__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorBehaviorState basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(ErrorBehaviorState newState)
  {
    ErrorBehaviorState oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErrorModelPackage.CONDITION_ELEMENT__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case ErrorModelPackage.CONDITION_ELEMENT__SUBCOMPONENTS:
        return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ErrorModelPackage.CONDITION_ELEMENT__INCOMING:
        if (resolve) return getIncoming();
        return basicGetIncoming();
      case ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT:
        return getConstraint();
      case ErrorModelPackage.CONDITION_ELEMENT__SUBCOMPONENTS:
        return getSubcomponents();
      case ErrorModelPackage.CONDITION_ELEMENT__STATE:
        if (resolve) return getState();
        return basicGetState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ErrorModelPackage.CONDITION_ELEMENT__INCOMING:
        setIncoming((EventOrPropagation)newValue);
        return;
      case ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT:
        setConstraint((TypeSet)newValue);
        return;
      case ErrorModelPackage.CONDITION_ELEMENT__SUBCOMPONENTS:
        getSubcomponents().clear();
        getSubcomponents().addAll((Collection<? extends SubcomponentElement>)newValue);
        return;
      case ErrorModelPackage.CONDITION_ELEMENT__STATE:
        setState((ErrorBehaviorState)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ErrorModelPackage.CONDITION_ELEMENT__INCOMING:
        setIncoming((EventOrPropagation)null);
        return;
      case ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT:
        setConstraint((TypeSet)null);
        return;
      case ErrorModelPackage.CONDITION_ELEMENT__SUBCOMPONENTS:
        getSubcomponents().clear();
        return;
      case ErrorModelPackage.CONDITION_ELEMENT__STATE:
        setState((ErrorBehaviorState)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ErrorModelPackage.CONDITION_ELEMENT__INCOMING:
        return incoming != null;
      case ErrorModelPackage.CONDITION_ELEMENT__CONSTRAINT:
        return constraint != null;
      case ErrorModelPackage.CONDITION_ELEMENT__SUBCOMPONENTS:
        return subcomponents != null && !subcomponents.isEmpty();
      case ErrorModelPackage.CONDITION_ELEMENT__STATE:
        return state != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionElementImpl
