/**
 * generated by Xtext 2.25.0
 */
package org.qwork.qiraa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.qwork.qiraa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QiraaFactoryImpl extends EFactoryImpl implements QiraaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QiraaFactory init()
  {
    try
    {
      QiraaFactory theQiraaFactory = (QiraaFactory)EPackage.Registry.INSTANCE.getEFactory(QiraaPackage.eNS_URI);
      if (theQiraaFactory != null)
      {
        return theQiraaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QiraaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QiraaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QiraaPackage.QIRAA_MODEL: return createQiraaModel();
      case QiraaPackage.MARJEH: return createMarjeh();
      case QiraaPackage.TAFSIL: return createTafsil();
      case QiraaPackage.KAAEDAH: return createKaaedah();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QiraaModel createQiraaModel()
  {
    QiraaModelImpl qiraaModel = new QiraaModelImpl();
    return qiraaModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Marjeh createMarjeh()
  {
    MarjehImpl marjeh = new MarjehImpl();
    return marjeh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tafsil createTafsil()
  {
    TafsilImpl tafsil = new TafsilImpl();
    return tafsil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Kaaedah createKaaedah()
  {
    KaaedahImpl kaaedah = new KaaedahImpl();
    return kaaedah;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QiraaPackage getQiraaPackage()
  {
    return (QiraaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QiraaPackage getPackage()
  {
    return QiraaPackage.eINSTANCE;
  }

} //QiraaFactoryImpl
