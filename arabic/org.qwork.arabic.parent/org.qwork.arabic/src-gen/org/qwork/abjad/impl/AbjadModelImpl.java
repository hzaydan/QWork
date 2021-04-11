/**
 * generated by Xtext 2.25.0
 */
package org.qwork.abjad.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.qwork.abjad.AbjadModel;
import org.qwork.abjad.AbjadPackage;
import org.qwork.abjad.Harakah;
import org.qwork.abjad.Harf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qwork.abjad.impl.AbjadModelImpl#getHourouf <em>Hourouf</em>}</li>
 *   <li>{@link org.qwork.abjad.impl.AbjadModelImpl#getHarakat <em>Harakat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbjadModelImpl extends MinimalEObjectImpl.Container implements AbjadModel
{
  /**
   * The cached value of the '{@link #getHourouf() <em>Hourouf</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHourouf()
   * @generated
   * @ordered
   */
  protected EList<Harf> hourouf;

  /**
   * The cached value of the '{@link #getHarakat() <em>Harakat</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHarakat()
   * @generated
   * @ordered
   */
  protected EList<Harakah> harakat;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbjadModelImpl()
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
    return AbjadPackage.Literals.ABJAD_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Harf> getHourouf()
  {
    if (hourouf == null)
    {
      hourouf = new EObjectContainmentEList<Harf>(Harf.class, this, AbjadPackage.ABJAD_MODEL__HOUROUF);
    }
    return hourouf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Harakah> getHarakat()
  {
    if (harakat == null)
    {
      harakat = new EObjectContainmentEList<Harakah>(Harakah.class, this, AbjadPackage.ABJAD_MODEL__HARAKAT);
    }
    return harakat;
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
      case AbjadPackage.ABJAD_MODEL__HOUROUF:
        return ((InternalEList<?>)getHourouf()).basicRemove(otherEnd, msgs);
      case AbjadPackage.ABJAD_MODEL__HARAKAT:
        return ((InternalEList<?>)getHarakat()).basicRemove(otherEnd, msgs);
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
      case AbjadPackage.ABJAD_MODEL__HOUROUF:
        return getHourouf();
      case AbjadPackage.ABJAD_MODEL__HARAKAT:
        return getHarakat();
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
      case AbjadPackage.ABJAD_MODEL__HOUROUF:
        getHourouf().clear();
        getHourouf().addAll((Collection<? extends Harf>)newValue);
        return;
      case AbjadPackage.ABJAD_MODEL__HARAKAT:
        getHarakat().clear();
        getHarakat().addAll((Collection<? extends Harakah>)newValue);
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
      case AbjadPackage.ABJAD_MODEL__HOUROUF:
        getHourouf().clear();
        return;
      case AbjadPackage.ABJAD_MODEL__HARAKAT:
        getHarakat().clear();
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
      case AbjadPackage.ABJAD_MODEL__HOUROUF:
        return hourouf != null && !hourouf.isEmpty();
      case AbjadPackage.ABJAD_MODEL__HARAKAT:
        return harakat != null && !harakat.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AbjadModelImpl