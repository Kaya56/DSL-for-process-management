/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.process.process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custum Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.process.process.CustumParameter#getNomParametre <em>Nom Parametre</em>}</li>
 *   <li>{@link org.xtext.example.process.process.CustumParameter#getParametresEntree <em>Parametres Entree</em>}</li>
 *   <li>{@link org.xtext.example.process.process.CustumParameter#getParametresSortie <em>Parametres Sortie</em>}</li>
 *   <li>{@link org.xtext.example.process.process.CustumParameter#getDescriptionActeur <em>Description Acteur</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.process.process.ProcessPackage#getCustumParameter()
 * @model
 * @generated
 */
public interface CustumParameter extends ComplexParameter
{
  /**
   * Returns the value of the '<em><b>Nom Parametre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom Parametre</em>' attribute.
   * @see #setNomParametre(String)
   * @see org.xtext.example.process.process.ProcessPackage#getCustumParameter_NomParametre()
   * @model
   * @generated
   */
  String getNomParametre();

  /**
   * Sets the value of the '{@link org.xtext.example.process.process.CustumParameter#getNomParametre <em>Nom Parametre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom Parametre</em>' attribute.
   * @see #getNomParametre()
   * @generated
   */
  void setNomParametre(String value);

  /**
   * Returns the value of the '<em><b>Parametres Entree</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.process.process.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametres Entree</em>' containment reference list.
   * @see org.xtext.example.process.process.ProcessPackage#getCustumParameter_ParametresEntree()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParametresEntree();

  /**
   * Returns the value of the '<em><b>Parametres Sortie</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.process.process.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametres Sortie</em>' containment reference list.
   * @see org.xtext.example.process.process.ProcessPackage#getCustumParameter_ParametresSortie()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParametresSortie();

  /**
   * Returns the value of the '<em><b>Description Acteur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description Acteur</em>' attribute.
   * @see #setDescriptionActeur(String)
   * @see org.xtext.example.process.process.ProcessPackage#getCustumParameter_DescriptionActeur()
   * @model
   * @generated
   */
  String getDescriptionActeur();

  /**
   * Sets the value of the '{@link org.xtext.example.process.process.CustumParameter#getDescriptionActeur <em>Description Acteur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description Acteur</em>' attribute.
   * @see #getDescriptionActeur()
   * @generated
   */
  void setDescriptionActeur(String value);

} // CustumParameter
