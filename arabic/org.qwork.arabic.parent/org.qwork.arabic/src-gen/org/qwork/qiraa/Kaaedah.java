/**
 * generated by Xtext 2.25.0
 */
package org.qwork.qiraa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.qwork.osolqiraa.HarfQuran;
import org.qwork.osolqiraa.Kayd;
import org.qwork.osolqiraa.YokraaLahWaRamz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kaaedah</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qwork.qiraa.Kaaedah#getRefs <em>Refs</em>}</li>
 *   <li>{@link org.qwork.qiraa.Kaaedah#getKayd <em>Kayd</em>}</li>
 *   <li>{@link org.qwork.qiraa.Kaaedah#getHarf <em>Harf</em>}</li>
 * </ul>
 *
 * @see org.qwork.qiraa.QiraaPackage#getKaaedah()
 * @model
 * @generated
 */
public interface Kaaedah extends EObject
{
  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link org.qwork.osolqiraa.YokraaLahWaRamz}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see org.qwork.qiraa.QiraaPackage#getKaaedah_Refs()
   * @model
   * @generated
   */
  EList<YokraaLahWaRamz> getRefs();

  /**
   * Returns the value of the '<em><b>Kayd</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kayd</em>' reference.
   * @see #setKayd(Kayd)
   * @see org.qwork.qiraa.QiraaPackage#getKaaedah_Kayd()
   * @model
   * @generated
   */
  Kayd getKayd();

  /**
   * Sets the value of the '{@link org.qwork.qiraa.Kaaedah#getKayd <em>Kayd</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kayd</em>' reference.
   * @see #getKayd()
   * @generated
   */
  void setKayd(Kayd value);

  /**
   * Returns the value of the '<em><b>Harf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Harf</em>' containment reference.
   * @see #setHarf(HarfQuran)
   * @see org.qwork.qiraa.QiraaPackage#getKaaedah_Harf()
   * @model containment="true"
   * @generated
   */
  HarfQuran getHarf();

  /**
   * Sets the value of the '{@link org.qwork.qiraa.Kaaedah#getHarf <em>Harf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Harf</em>' containment reference.
   * @see #getHarf()
   * @generated
   */
  void setHarf(HarfQuran value);

} // Kaaedah
