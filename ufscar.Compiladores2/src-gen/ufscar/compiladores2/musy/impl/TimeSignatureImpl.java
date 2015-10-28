/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.TimeSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.TimeSignatureImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.TimeSignatureImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSignatureImpl extends MinimalEObjectImpl.Container implements TimeSignature
{
  /**
   * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected static final int QUANTITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected int quantity = QUANTITY_EDEFAULT;

  /**
   * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected static final int NOTE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected int note = NOTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeSignatureImpl()
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
    return MusyPackage.Literals.TIME_SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getQuantity()
  {
    return quantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantity(int newQuantity)
  {
    int oldQuantity = quantity;
    quantity = newQuantity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.TIME_SIGNATURE__QUANTITY, oldQuantity, quantity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(int newNote)
  {
    int oldNote = note;
    note = newNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.TIME_SIGNATURE__NOTE, oldNote, note));
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
      case MusyPackage.TIME_SIGNATURE__QUANTITY:
        return getQuantity();
      case MusyPackage.TIME_SIGNATURE__NOTE:
        return getNote();
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
      case MusyPackage.TIME_SIGNATURE__QUANTITY:
        setQuantity((Integer)newValue);
        return;
      case MusyPackage.TIME_SIGNATURE__NOTE:
        setNote((Integer)newValue);
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
      case MusyPackage.TIME_SIGNATURE__QUANTITY:
        setQuantity(QUANTITY_EDEFAULT);
        return;
      case MusyPackage.TIME_SIGNATURE__NOTE:
        setNote(NOTE_EDEFAULT);
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
      case MusyPackage.TIME_SIGNATURE__QUANTITY:
        return quantity != QUANTITY_EDEFAULT;
      case MusyPackage.TIME_SIGNATURE__NOTE:
        return note != NOTE_EDEFAULT;
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
    result.append(" (quantity: ");
    result.append(quantity);
    result.append(", note: ");
    result.append(note);
    result.append(')');
    return result.toString();
  }

} //TimeSignatureImpl
