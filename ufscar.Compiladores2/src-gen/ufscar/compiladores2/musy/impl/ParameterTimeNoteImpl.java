/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.ParameterTimeNote;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Time Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterTimeNoteImpl#getTn <em>Tn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterTimeNoteImpl extends ParameterImpl implements ParameterTimeNote
{
  /**
   * The default value of the '{@link #getTn() <em>Tn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTn()
   * @generated
   * @ordered
   */
  protected static final String TN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTn() <em>Tn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTn()
   * @generated
   * @ordered
   */
  protected String tn = TN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterTimeNoteImpl()
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
    return MusyPackage.Literals.PARAMETER_TIME_NOTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTn()
  {
    return tn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTn(String newTn)
  {
    String oldTn = tn;
    tn = newTn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER_TIME_NOTE__TN, oldTn, tn));
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
      case MusyPackage.PARAMETER_TIME_NOTE__TN:
        return getTn();
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
      case MusyPackage.PARAMETER_TIME_NOTE__TN:
        setTn((String)newValue);
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
      case MusyPackage.PARAMETER_TIME_NOTE__TN:
        setTn(TN_EDEFAULT);
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
      case MusyPackage.PARAMETER_TIME_NOTE__TN:
        return TN_EDEFAULT == null ? tn != null : !TN_EDEFAULT.equals(tn);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tn: ");
    result.append(tn);
    result.append(')');
    return result.toString();
  }

} //ParameterTimeNoteImpl
