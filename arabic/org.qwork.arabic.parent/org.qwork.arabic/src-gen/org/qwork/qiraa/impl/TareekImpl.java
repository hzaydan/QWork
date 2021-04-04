/**
 * generated by Xtext 2.25.0
 */
package org.qwork.qiraa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.qwork.qiraa.QiraaPackage;
import org.qwork.qiraa.Tareek;
import org.qwork.qiraa.YokraaLah;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tareek</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qwork.qiraa.impl.TareekImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.qwork.qiraa.impl.TareekImpl#isSimple <em>Simple</em>}</li>
 *   <li>{@link org.qwork.qiraa.impl.TareekImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.qwork.qiraa.impl.TareekImpl#isComplex <em>Complex</em>}</li>
 *   <li>{@link org.qwork.qiraa.impl.TareekImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareekImpl extends MinimalEObjectImpl.Container implements Tareek
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isSimple() <em>Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSimple()
   * @generated
   * @ordered
   */
  protected static final boolean SIMPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSimple() <em>Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSimple()
   * @generated
   * @ordered
   */
  protected boolean simple = SIMPLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected YokraaLah ref;

  /**
   * The default value of the '{@link #isComplex() <em>Complex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComplex()
   * @generated
   * @ordered
   */
  protected static final boolean COMPLEX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isComplex() <em>Complex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComplex()
   * @generated
   * @ordered
   */
  protected boolean complex = COMPLEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Tareek> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TareekImpl()
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
    return QiraaPackage.Literals.TAREEK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QiraaPackage.TAREEK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSimple()
  {
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSimple(boolean newSimple)
  {
    boolean oldSimple = simple;
    simple = newSimple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QiraaPackage.TAREEK__SIMPLE, oldSimple, simple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YokraaLah getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (YokraaLah)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QiraaPackage.TAREEK__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YokraaLah basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(YokraaLah newRef)
  {
    YokraaLah oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QiraaPackage.TAREEK__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isComplex()
  {
    return complex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComplex(boolean newComplex)
  {
    boolean oldComplex = complex;
    complex = newComplex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QiraaPackage.TAREEK__COMPLEX, oldComplex, complex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Tareek> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Tareek>(Tareek.class, this, QiraaPackage.TAREEK__REFS);
    }
    return refs;
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
      case QiraaPackage.TAREEK__NAME:
        return getName();
      case QiraaPackage.TAREEK__SIMPLE:
        return isSimple();
      case QiraaPackage.TAREEK__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case QiraaPackage.TAREEK__COMPLEX:
        return isComplex();
      case QiraaPackage.TAREEK__REFS:
        return getRefs();
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
      case QiraaPackage.TAREEK__NAME:
        setName((String)newValue);
        return;
      case QiraaPackage.TAREEK__SIMPLE:
        setSimple((Boolean)newValue);
        return;
      case QiraaPackage.TAREEK__REF:
        setRef((YokraaLah)newValue);
        return;
      case QiraaPackage.TAREEK__COMPLEX:
        setComplex((Boolean)newValue);
        return;
      case QiraaPackage.TAREEK__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Tareek>)newValue);
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
      case QiraaPackage.TAREEK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QiraaPackage.TAREEK__SIMPLE:
        setSimple(SIMPLE_EDEFAULT);
        return;
      case QiraaPackage.TAREEK__REF:
        setRef((YokraaLah)null);
        return;
      case QiraaPackage.TAREEK__COMPLEX:
        setComplex(COMPLEX_EDEFAULT);
        return;
      case QiraaPackage.TAREEK__REFS:
        getRefs().clear();
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
      case QiraaPackage.TAREEK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QiraaPackage.TAREEK__SIMPLE:
        return simple != SIMPLE_EDEFAULT;
      case QiraaPackage.TAREEK__REF:
        return ref != null;
      case QiraaPackage.TAREEK__COMPLEX:
        return complex != COMPLEX_EDEFAULT;
      case QiraaPackage.TAREEK__REFS:
        return refs != null && !refs.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", simple: ");
    result.append(simple);
    result.append(", complex: ");
    result.append(complex);
    result.append(')');
    return result.toString();
  }

} //TareekImpl
