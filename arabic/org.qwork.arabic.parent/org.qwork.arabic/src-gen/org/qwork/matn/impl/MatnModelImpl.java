/**
 * generated by Xtext 2.25.0
 */
package org.qwork.matn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.qwork.matn.Matn;
import org.qwork.matn.MatnModel;
import org.qwork.matn.MatnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qwork.matn.impl.MatnModelImpl#getMatn <em>Matn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatnModelImpl extends MinimalEObjectImpl.Container implements MatnModel
{
  /**
   * The cached value of the '{@link #getMatn() <em>Matn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatn()
   * @generated
   * @ordered
   */
  protected Matn matn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatnModelImpl()
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
    return MatnPackage.Literals.MATN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Matn getMatn()
  {
    return matn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMatn(Matn newMatn, NotificationChain msgs)
  {
    Matn oldMatn = matn;
    matn = newMatn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MatnPackage.MATN_MODEL__MATN, oldMatn, newMatn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMatn(Matn newMatn)
  {
    if (newMatn != matn)
    {
      NotificationChain msgs = null;
      if (matn != null)
        msgs = ((InternalEObject)matn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MatnPackage.MATN_MODEL__MATN, null, msgs);
      if (newMatn != null)
        msgs = ((InternalEObject)newMatn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MatnPackage.MATN_MODEL__MATN, null, msgs);
      msgs = basicSetMatn(newMatn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MatnPackage.MATN_MODEL__MATN, newMatn, newMatn));
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
      case MatnPackage.MATN_MODEL__MATN:
        return basicSetMatn(null, msgs);
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
      case MatnPackage.MATN_MODEL__MATN:
        return getMatn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MatnPackage.MATN_MODEL__MATN:
        setMatn((Matn)newValue);
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
      case MatnPackage.MATN_MODEL__MATN:
        setMatn((Matn)null);
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
      case MatnPackage.MATN_MODEL__MATN:
        return matn != null;
    }
    return super.eIsSet(featureID);
  }

} //MatnModelImpl