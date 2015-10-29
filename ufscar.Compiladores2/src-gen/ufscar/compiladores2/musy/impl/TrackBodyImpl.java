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

import ufscar.compiladores2.musy.BodyComponent;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.TrackBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.TrackBodyImpl#getBc <em>Bc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackBodyImpl extends MinimalEObjectImpl.Container implements TrackBody
{
  /**
   * The cached value of the '{@link #getBc() <em>Bc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBc()
   * @generated
   * @ordered
   */
  protected EList<BodyComponent> bc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrackBodyImpl()
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
    return MusyPackage.Literals.TRACK_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyComponent> getBc()
  {
    if (bc == null)
    {
      bc = new EObjectContainmentEList<BodyComponent>(BodyComponent.class, this, MusyPackage.TRACK_BODY__BC);
    }
    return bc;
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
      case MusyPackage.TRACK_BODY__BC:
        return ((InternalEList<?>)getBc()).basicRemove(otherEnd, msgs);
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
      case MusyPackage.TRACK_BODY__BC:
        return getBc();
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
      case MusyPackage.TRACK_BODY__BC:
        getBc().clear();
        getBc().addAll((Collection<? extends BodyComponent>)newValue);
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
      case MusyPackage.TRACK_BODY__BC:
        getBc().clear();
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
      case MusyPackage.TRACK_BODY__BC:
        return bc != null && !bc.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TrackBodyImpl
