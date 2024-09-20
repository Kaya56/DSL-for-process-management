/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.process.process.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.process.process.ConcretActor;
import org.xtext.example.process.process.ProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concret Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.process.process.impl.ConcretActorImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link org.xtext.example.process.process.impl.ConcretActorImpl#getDescriptionActeur <em>Description Acteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcretActorImpl extends ComplexParameterImpl implements ConcretActor
{
  /**
   * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiant()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiant()
   * @generated
   * @ordered
   */
  protected String identifiant = IDENTIFIANT_EDEFAULT;

  /**
   * The default value of the '{@link #getDescriptionActeur() <em>Description Acteur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionActeur()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_ACTEUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescriptionActeur() <em>Description Acteur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionActeur()
   * @generated
   * @ordered
   */
  protected String descriptionActeur = DESCRIPTION_ACTEUR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcretActorImpl()
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
    return ProcessPackage.Literals.CONCRET_ACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIdentifiant()
  {
    return identifiant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIdentifiant(String newIdentifiant)
  {
    String oldIdentifiant = identifiant;
    identifiant = newIdentifiant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONCRET_ACTOR__IDENTIFIANT, oldIdentifiant, identifiant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescriptionActeur()
  {
    return descriptionActeur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescriptionActeur(String newDescriptionActeur)
  {
    String oldDescriptionActeur = descriptionActeur;
    descriptionActeur = newDescriptionActeur;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONCRET_ACTOR__DESCRIPTION_ACTEUR, oldDescriptionActeur, descriptionActeur));
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
      case ProcessPackage.CONCRET_ACTOR__IDENTIFIANT:
        return getIdentifiant();
      case ProcessPackage.CONCRET_ACTOR__DESCRIPTION_ACTEUR:
        return getDescriptionActeur();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessPackage.CONCRET_ACTOR__IDENTIFIANT:
        setIdentifiant((String)newValue);
        return;
      case ProcessPackage.CONCRET_ACTOR__DESCRIPTION_ACTEUR:
        setDescriptionActeur((String)newValue);
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
      case ProcessPackage.CONCRET_ACTOR__IDENTIFIANT:
        setIdentifiant(IDENTIFIANT_EDEFAULT);
        return;
      case ProcessPackage.CONCRET_ACTOR__DESCRIPTION_ACTEUR:
        setDescriptionActeur(DESCRIPTION_ACTEUR_EDEFAULT);
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
      case ProcessPackage.CONCRET_ACTOR__IDENTIFIANT:
        return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
      case ProcessPackage.CONCRET_ACTOR__DESCRIPTION_ACTEUR:
        return DESCRIPTION_ACTEUR_EDEFAULT == null ? descriptionActeur != null : !DESCRIPTION_ACTEUR_EDEFAULT.equals(descriptionActeur);
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
    result.append(" (identifiant: ");
    result.append(identifiant);
    result.append(", descriptionActeur: ");
    result.append(descriptionActeur);
    result.append(')');
    return result.toString();
  }

} //ConcretActorImpl
