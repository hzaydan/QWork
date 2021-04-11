/**
 * generated by Xtext 2.25.0
 */
package org.qwork.qiraa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.qwork.matn.Matn;

import org.qwork.osolqiraa.Ramz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marjeh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qwork.qiraa.Marjeh#getName <em>Name</em>}</li>
 *   <li>{@link org.qwork.qiraa.Marjeh#getMatn <em>Matn</em>}</li>
 *   <li>{@link org.qwork.qiraa.Marjeh#getRomoz <em>Romoz</em>}</li>
 *   <li>{@link org.qwork.qiraa.Marjeh#getTafsil <em>Tafsil</em>}</li>
 * </ul>
 *
 * @see org.qwork.qiraa.QiraaPackage#getMarjeh()
 * @model
 * @generated
 */
public interface Marjeh extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.qwork.qiraa.QiraaPackage#getMarjeh_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.qwork.qiraa.Marjeh#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Matn</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matn</em>' reference.
   * @see #setMatn(Matn)
   * @see org.qwork.qiraa.QiraaPackage#getMarjeh_Matn()
   * @model
   * @generated
   */
  Matn getMatn();

  /**
   * Sets the value of the '{@link org.qwork.qiraa.Marjeh#getMatn <em>Matn</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matn</em>' reference.
   * @see #getMatn()
   * @generated
   */
  void setMatn(Matn value);

  /**
   * Returns the value of the '<em><b>Romoz</b></em>' containment reference list.
   * The list contents are of type {@link org.qwork.osolqiraa.Ramz}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Romoz</em>' containment reference list.
   * @see org.qwork.qiraa.QiraaPackage#getMarjeh_Romoz()
   * @model containment="true"
   * @generated
   */
  EList<Ramz> getRomoz();

  /**
   * Returns the value of the '<em><b>Tafsil</b></em>' containment reference list.
   * The list contents are of type {@link org.qwork.qiraa.Tafsil}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tafsil</em>' containment reference list.
   * @see org.qwork.qiraa.QiraaPackage#getMarjeh_Tafsil()
   * @model containment="true"
   * @generated
   */
  EList<Tafsil> getTafsil();

} // Marjeh