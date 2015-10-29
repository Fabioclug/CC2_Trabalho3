/**
 */
package ufscar.compiladores2.musy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ufscar.compiladores2.musy.ChordParams;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chord Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.ChordParamsImpl#getCnote <em>Cnote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChordParamsImpl extends MinimalEObjectImpl.Container implements ChordParams
{
  /**
   * The cached value of the '{@link #getCnote() <em>Cnote</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCnote()
   * @generated
   * @ordered
   */
  protected EList<Note> cnote;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChordParamsImpl()
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
    return MusyPackage.Literals.CHORD_PARAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Note> getCnote()
  {
    if (cnote == null)
    {
      cnote = new EObjectContainmentEList<Note>(Note.class, this, MusyPackage.CHORD_PARAMS__CNOTE);
    }
    return cnote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MusyPackage.CHORD_PARAMS__CNOTE:
        return ((InternalEList<?>)getCnote()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MusyPackage.CHORD_PARAMS__CNOTE:
        return getCnote();
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
      case MusyPackage.CHORD_PARAMS__CNOTE:
        getCnote().clear();
        getCnote().addAll((Collection<? extends Note>)newValue);
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
      case MusyPackage.CHORD_PARAMS__CNOTE:
        getCnote().clear();
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
      case MusyPackage.CHORD_PARAMS__CNOTE:
        return cnote != null && !cnote.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChordParamsImpl
