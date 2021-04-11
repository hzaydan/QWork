/**
 * generated by Xtext 2.25.0
 */
package org.qwork.matn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.qwork.matn.Bayt;
import org.qwork.matn.MatnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bayt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qwork.matn.impl.BaytImpl#getRakm <em>Rakm</em>}</li>
 *   <li>{@link org.qwork.matn.impl.BaytImpl#getSadr <em>Sadr</em>}</li>
 *   <li>{@link org.qwork.matn.impl.BaytImpl#getAjoz <em>Ajoz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaytImpl extends MinimalEObjectImpl.Container implements Bayt
{
  /**
   * The default value of the '{@link #getRakm() <em>Rakm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRakm()
   * @generated
   * @ordered
   */
  protected static final int RAKM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRakm() <em>Rakm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRakm()
   * @generated
   * @ordered
   */
  protected int rakm = RAKM_EDEFAULT;

  /**
   * The cached value of the '{@link #getSadr() <em>Sadr</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSadr()
   * @generated
   * @ordered
   */
  protected EList<String> sadr;

  /**
   * The cached value of the '{@link #getAjoz() <em>Ajoz</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAjoz()
   * @generated
   * @ordered
   */
  protected EList<String> ajoz;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaytImpl()
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
    return MatnPackage.Literals.BAYT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRakm()
  {
    return rakm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRakm(int newRakm)
  {
    int oldRakm = rakm;
    rakm = newRakm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MatnPackage.BAYT__RAKM, oldRakm, rakm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getSadr()
  {
    if (sadr == null)
    {
      sadr = new EDataTypeEList<String>(String.class, this, MatnPackage.BAYT__SADR);
    }
    return sadr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getAjoz()
  {
    if (ajoz == null)
    {
      ajoz = new EDataTypeEList<String>(String.class, this, MatnPackage.BAYT__AJOZ);
    }
    return ajoz;
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
      case MatnPackage.BAYT__RAKM:
        return getRakm();
      case MatnPackage.BAYT__SADR:
        return getSadr();
      case MatnPackage.BAYT__AJOZ:
        return getAjoz();
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
      case MatnPackage.BAYT__RAKM:
        setRakm((Integer)newValue);
        return;
      case MatnPackage.BAYT__SADR:
        getSadr().clear();
        getSadr().addAll((Collection<? extends String>)newValue);
        return;
      case MatnPackage.BAYT__AJOZ:
        getAjoz().clear();
        getAjoz().addAll((Collection<? extends String>)newValue);
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
      case MatnPackage.BAYT__RAKM:
        setRakm(RAKM_EDEFAULT);
        return;
      case MatnPackage.BAYT__SADR:
        getSadr().clear();
        return;
      case MatnPackage.BAYT__AJOZ:
        getAjoz().clear();
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
      case MatnPackage.BAYT__RAKM:
        return rakm != RAKM_EDEFAULT;
      case MatnPackage.BAYT__SADR:
        return sadr != null && !sadr.isEmpty();
      case MatnPackage.BAYT__AJOZ:
        return ajoz != null && !ajoz.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (rakm: ");
    result.append(rakm);
    result.append(", sadr: ");
    result.append(sadr);
    result.append(", ajoz: ");
    result.append(ajoz);
    result.append(')');
    return result.toString();
  }

} //BaytImpl
