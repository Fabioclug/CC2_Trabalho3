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
import ufscar.compiladores2.musy.MoreTrackBody;
import ufscar.compiladores2.musy.MusyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>More Track Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.MoreTrackBodyImpl#getMorebody <em>Morebody</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoreTrackBodyImpl extends MinimalEObjectImpl.Container implements MoreTrackBody
{
  /**
   * The cached value of the '{@link #getMorebody() <em>Morebody</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMorebody()
   * @generated
   * @ordered
   */
  protected EList<BodyComponent> morebody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoreTrackBodyImpl()
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
    return MusyPackage.Literals.MORE_TRACK_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyComponent> getMorebody()
  {
    if (morebody == null)
    {
      morebody = new EObjectContainmentEList<BodyComponent>(BodyComponent.class, this, MusyPackage.MORE_TRACK_BODY__MOREBODY);
    }
    return morebody;
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
      case MusyPackage.MORE_TRACK_BODY__MOREBODY:
        return ((InternalEList<?>)getMorebody()).basicRemove(otherEnd, msgs);
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
      case MusyPackage.MORE_TRACK_BODY__MOREBODY:
        return getMorebody();
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
      case MusyPackage.MORE_TRACK_BODY__MOREBODY:
        getMorebody().clear();
        getMorebody().addAll((Collection<? extends BodyComponent>)newValue);
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
      case MusyPackage.MORE_TRACK_BODY__MOREBODY:
        getMorebody().clear();
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
      case MusyPackage.MORE_TRACK_BODY__MOREBODY:
        return morebody != null && !morebody.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MoreTrackBodyImpl
