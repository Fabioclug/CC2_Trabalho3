/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.Parameter;
import ufscar.compiladores2.musy.TimeSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterImpl#getBeat <em>Beat</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterImpl#getTsig <em>Tsig</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterImpl#getTn <em>Tn</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.ParameterImpl#getOctave <em>Octave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The default value of the '{@link #getBeat() <em>Beat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeat()
   * @generated
   * @ordered
   */
  protected static final int BEAT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBeat() <em>Beat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeat()
   * @generated
   * @ordered
   */
  protected int beat = BEAT_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected static final String TP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected String tp = TP_EDEFAULT;

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
  protected ParameterImpl()
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
    return MusyPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBeat()
  {
    return beat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeat(int newBeat)
  {
    int oldBeat = beat;
    beat = newBeat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER__BEAT, oldBeat, beat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER__TYPE, oldType, type));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER__TSIG, oldTsig, newTsig);
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
        msgs = ((InternalEObject)tsig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.PARAMETER__TSIG, null, msgs);
      if (newTsig != null)
        msgs = ((InternalEObject)newTsig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.PARAMETER__TSIG, null, msgs);
      msgs = basicSetTsig(newTsig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER__TSIG, newTsig, newTsig));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER__TN, oldTn, tn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTp()
  {
    return tp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp(String newTp)
  {
    String oldTp = tp;
    tp = newTp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER__TP, oldTp, tp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.PARAMETER__OCTAVE, oldOctave, octave));
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
      case MusyPackage.PARAMETER__TSIG:
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
      case MusyPackage.PARAMETER__BEAT:
        return getBeat();
      case MusyPackage.PARAMETER__TYPE:
        return getType();
      case MusyPackage.PARAMETER__TSIG:
        return getTsig();
      case MusyPackage.PARAMETER__TN:
        return getTn();
      case MusyPackage.PARAMETER__TP:
        return getTp();
      case MusyPackage.PARAMETER__OCTAVE:
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
      case MusyPackage.PARAMETER__BEAT:
        setBeat((Integer)newValue);
        return;
      case MusyPackage.PARAMETER__TYPE:
        setType((String)newValue);
        return;
      case MusyPackage.PARAMETER__TSIG:
        setTsig((TimeSignature)newValue);
        return;
      case MusyPackage.PARAMETER__TN:
        setTn((String)newValue);
        return;
      case MusyPackage.PARAMETER__TP:
        setTp((String)newValue);
        return;
      case MusyPackage.PARAMETER__OCTAVE:
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
      case MusyPackage.PARAMETER__BEAT:
        setBeat(BEAT_EDEFAULT);
        return;
      case MusyPackage.PARAMETER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MusyPackage.PARAMETER__TSIG:
        setTsig((TimeSignature)null);
        return;
      case MusyPackage.PARAMETER__TN:
        setTn(TN_EDEFAULT);
        return;
      case MusyPackage.PARAMETER__TP:
        setTp(TP_EDEFAULT);
        return;
      case MusyPackage.PARAMETER__OCTAVE:
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
      case MusyPackage.PARAMETER__BEAT:
        return beat != BEAT_EDEFAULT;
      case MusyPackage.PARAMETER__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case MusyPackage.PARAMETER__TSIG:
        return tsig != null;
      case MusyPackage.PARAMETER__TN:
        return TN_EDEFAULT == null ? tn != null : !TN_EDEFAULT.equals(tn);
      case MusyPackage.PARAMETER__TP:
        return TP_EDEFAULT == null ? tp != null : !TP_EDEFAULT.equals(tp);
      case MusyPackage.PARAMETER__OCTAVE:
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
    result.append(" (beat: ");
    result.append(beat);
    result.append(", type: ");
    result.append(type);
    result.append(", tn: ");
    result.append(tn);
    result.append(", tp: ");
    result.append(tp);
    result.append(", octave: ");
    result.append(octave);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
