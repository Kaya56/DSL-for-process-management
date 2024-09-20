/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.process.process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.process.process.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.process.process.VariableDeclaration#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link org.xtext.example.process.process.VariableDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.process.process.ProcessPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends SimpleParameter
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.process.process.ProcessPackage#getVariableDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.process.process.VariableDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiant</em>' attribute.
   * @see #setIdentifiant(String)
   * @see org.xtext.example.process.process.ProcessPackage#getVariableDeclaration_Identifiant()
   * @model
   * @generated
   */
  String getIdentifiant();

  /**
   * Sets the value of the '{@link org.xtext.example.process.process.VariableDeclaration#getIdentifiant <em>Identifiant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiant</em>' attribute.
   * @see #getIdentifiant()
   * @generated
   */
  void setIdentifiant(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see org.xtext.example.process.process.ProcessPackage#getVariableDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.process.process.VariableDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // VariableDeclaration
