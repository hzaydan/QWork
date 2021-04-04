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
      public Adapter caseQaree(Qaree object)
      {
        return createQareeAdapter();
      }
      @Override
      public Adapter caseRawee(Rawee object)
      {
        return createRaweeAdapter();
      }
      @Override
      public Adapter caseYokraaLah(YokraaLah object)
      {
        return createYokraaLahAdapter();
      }
      @Override
      public Adapter casePerson(Person object)
      {
        return createPersonAdapter();
      }
      @Override
      public Adapter caseDouaa(Douaa object)
      {
        return createDouaaAdapter();
      }
      @Override
      public Adapter caseTareek(Tareek object)
      {
        return createTareekAdapter();
      }
      @Override
      public Adapter caseIMAM(IMAM object)
      {
        return createIMAMAdapter();
      }
      @Override
      public Adapter caseMarjeh(Marjeh object)
      {
        return createMarjehAdapter();
      }
      @Override
      public Adapter caseMaktah(Maktah object)
      {
        return createMaktahAdapter();
      }
      @Override
      public Adapter caseKayd(Kayd object)
      {
        return createKaydAdapter();
      }
      @Override
      public Adapter caseIstelah(Istelah object)
      {
        return createIstelahAdapter();
      }
      @Override
      public Adapter caseRamz(Ramz object)
      {
        return createRamzAdapter();
      }
      @Override
      public Adapter caseYokraaLahWaRamz(YokraaLahWaRamz object)
      {
        return createYokraaLahWaRamzAdapter();
      }
      @Override
      public Adapter caseKaaedah(Kaaedah object)
      {
        return createKaaedahAdapter();
      }
      @Override
      public Adapter caseHarfQuran(HarfQuran object)
      {
        return createHarfQuranAdapter();
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
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Qaree <em>Qaree</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Qaree
   * @generated
   */
  public Adapter createQareeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Rawee <em>Rawee</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Rawee
   * @generated
   */
  public Adapter createRaweeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.YokraaLah <em>Yokraa Lah</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.YokraaLah
   * @generated
   */
  public Adapter createYokraaLahAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Person
   * @generated
   */
  public Adapter createPersonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Douaa <em>Douaa</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Douaa
   * @generated
   */
  public Adapter createDouaaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Tareek <em>Tareek</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Tareek
   * @generated
   */
  public Adapter createTareekAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.IMAM <em>IMAM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.IMAM
   * @generated
   */
  public Adapter createIMAMAdapter()
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
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Maktah <em>Maktah</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Maktah
   * @generated
   */
  public Adapter createMaktahAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Kayd <em>Kayd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Kayd
   * @generated
   */
  public Adapter createKaydAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Istelah <em>Istelah</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Istelah
   * @generated
   */
  public Adapter createIstelahAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.Ramz <em>Ramz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.Ramz
   * @generated
   */
  public Adapter createRamzAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.YokraaLahWaRamz <em>Yokraa Lah Wa Ramz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.YokraaLahWaRamz
   * @generated
   */
  public Adapter createYokraaLahWaRamzAdapter()
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
   * Creates a new adapter for an object of class '{@link org.qwork.qiraa.HarfQuran <em>Harf Quran</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.qwork.qiraa.HarfQuran
   * @generated
   */
  public Adapter createHarfQuranAdapter()
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
