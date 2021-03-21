/**
 * generated by Xtext 2.24.0
 */
package org.qwork.arabic.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.qwork.arabic.ArabicPackage;
import org.qwork.arabic.Phrase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qwork.arabic.impl.PhraseImpl#getWords <em>Words</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhraseImpl extends MinimalEObjectImpl.Container implements Phrase
{
  /**
   * The cached value of the '{@link #getWords() <em>Words</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWords()
   * @generated
   * @ordered
   */
  protected EList<String> words;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhraseImpl()
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
    return ArabicPackage.Literals.PHRASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getWords()
  {
    if (words == null)
    {
      words = new EDataTypeEList<String>(String.class, this, ArabicPackage.PHRASE__WORDS);
    }
    return words;
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
      case ArabicPackage.PHRASE__WORDS:
        return getWords();
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
      case ArabicPackage.PHRASE__WORDS:
        getWords().clear();
        getWords().addAll((Collection<? extends String>)newValue);
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
      case ArabicPackage.PHRASE__WORDS:
        getWords().clear();
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
      case ArabicPackage.PHRASE__WORDS:
        return words != null && !words.isEmpty();
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
    result.append(" (words: ");
    result.append(words);
    result.append(')');
    return result.toString();
  }

} //PhraseImpl
