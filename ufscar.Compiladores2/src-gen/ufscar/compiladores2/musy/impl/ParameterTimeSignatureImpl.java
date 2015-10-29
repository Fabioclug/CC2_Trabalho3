/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.ParameterTimeSignature;
import ufscar.compiladores2.musy.TimeSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Time Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterTimeSignatureImpl#getTsig <em>Tsig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterTimeSignatureImpl extends ParameterImpl implements ParameterTimeSignature
{
  /**
   * The cached value of the '{@link #getTsig() <em>Tsig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTsig()
   * @generated
   * @ordered
   */
  protected TimeSignature tsig;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterTimeSignatureImpl()
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
    return MusyPackage.Literals.PARAMETER_TIME_SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeSignature getTsig()
  {
    return tsig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTsig(TimeSignature newTsig, NotificationChain msgs)
  {
    TimeSignature oldTsig = tsig;
    tsig = newTsig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG, oldTsig, newTsig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTsig(TimeSignature newTsig)
  {
    if (newTsig != tsig)
    {
      NotificationChain msgs = null;
      if (tsig != null)
        msgs = ((InternalEObject)tsig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG, null, msgs);
      if (newTsig != null)
        msgs = ((InternalEObject)newTsig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG, null, msgs);
      msgs = basicSetTsig(newTsig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG, newTsig, newTsig));
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
      case MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG:
        return basicSetTsig(null, msgs);
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
      case MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG:
        return getTsig();
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
      case MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG:
        setTsig((TimeSignature)newValue);
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
      case MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG:
        setTsig((TimeSignature)null);
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
      case MusyPackage.PARAMETER_TIME_SIGNATURE__TSIG:
        return tsig != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterTimeSignatureImpl
