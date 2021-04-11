/**
 * generated by Xtext 2.25.0
 */
package org.qwork.qiraa.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.qwork.qiraa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.qwork.qiraa.QiraaPackage
 * @generated
 */
public class QiraaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QiraaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QiraaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QiraaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QiraaSwitch<Adapter> modelSwitch =
    new QiraaSwitch<Adapter>()
    {
      @Override
      public Adapter caseQiraaModel(QiraaModel object)
      {
        return createQiraaModelAdapter();
      }
      @Override
      public Adapter caseMarjeh(Marjeh object)
      {
        return createMarjehAdapter();
      }
      @Override
      public Adapter caseTafsil(Tafsil object)
      {
        return createTafsilAdapter();
      }
      @Override
      public Adapter caseKaaedah(Kaaedah object)
      {
        return createKaaedahAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.QiraaModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.QiraaModel
   * @generated
   */
  public Adapter createQiraaModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Marjeh <em>Marjeh</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Marjeh
   * @generated
   */
  public Adapter createMarjehAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Tafsil <em>Tafsil</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Tafsil
   * @generated
   */
  public Adapter createTafsilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Kaaedah <em>Kaaedah</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Kaaedah
   * @generated
   */
  public Adapter createKaaedahAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QiraaAdapterFactory