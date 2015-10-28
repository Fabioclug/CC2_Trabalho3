/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ufscar.compiladores2.musy.CustomNoteParam;
import ufscar.compiladores2.musy.MusyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Note Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.CustomNoteParamImpl#getOctave <em>Octave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomNoteParamImpl extends CustomNoteImpl implements CustomNoteParam
{
  /**
   * The default value of the '{@link #getOctave() <em>Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctave()
   * @generated
   * @ordered
   */
  protected static final int OCTAVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOctave() <em>Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctave()
   * @generated
   * @ordered
   */
  protected int octave = OCTAVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomNoteParamImpl()
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
    return MusyPackage.Literals.CUSTOM_NOTE_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOctave()
  {
    return octave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOctave(int newOctave)
  {
    int oldOctave = octave;
    octave = newOctave;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.CUSTOM_NOTE_PARAM__OCTAVE, oldOctave, octave));
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
      case MusyPackage.CUSTOM_NOTE_PARAM__OCTAVE:
        return getOctave();
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
      case MusyPackage.CUSTOM_NOTE_PARAM__OCTAVE:
        setOctave((Integer)newValue);
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
      case MusyPackage.CUSTOM_NOTE_PARAM__OCTAVE:
        setOctave(OCTAVE_EDEFAULT);
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
      case MusyPackage.CUSTOM_NOTE_PARAM__OCTAVE:
        return octave != OCTAVE_EDEFAULT;
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
    result.append(" (octave: ");
    result.append(octave);
    result.append(')');
    return result.toString();
  }

} //CustomNoteParamImpl
