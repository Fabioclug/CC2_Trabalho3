/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ufscar.compiladores2.musy.CustomNoteParam;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.NoteImpl#getNl <em>Nl</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.NoteImpl#getAcc <em>Acc</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.NoteImpl#getCnp <em>Cnp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends MinimalEObjectImpl.Container implements Note
{
  /**
   * The default value of the '{@link #getNl() <em>Nl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNl()
   * @generated
   * @ordered
   */
  protected static final String NL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNl() <em>Nl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNl()
   * @generated
   * @ordered
   */
  protected String nl = NL_EDEFAULT;

  /**
   * The default value of the '{@link #getAcc() <em>Acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcc()
   * @generated
   * @ordered
   */
  protected static final String ACC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcc() <em>Acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcc()
   * @generated
   * @ordered
   */
  protected String acc = ACC_EDEFAULT;

  /**
   * The cached value of the '{@link #getCnp() <em>Cnp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCnp()
   * @generated
   * @ordered
   */
  protected CustomNoteParam cnp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoteImpl()
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
    return MusyPackage.Literals.NOTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNl()
  {
    return nl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNl(String newNl)
  {
    String oldNl = nl;
    nl = newNl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.NOTE__NL, oldNl, nl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcc()
  {
    return acc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcc(String newAcc)
  {
    String oldAcc = acc;
    acc = newAcc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.NOTE__ACC, oldAcc, acc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomNoteParam getCnp()
  {
    return cnp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCnp(CustomNoteParam newCnp, NotificationChain msgs)
  {
    CustomNoteParam oldCnp = cnp;
    cnp = newCnp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.NOTE__CNP, oldCnp, newCnp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCnp(CustomNoteParam newCnp)
  {
    if (newCnp != cnp)
    {
      NotificationChain msgs = null;
      if (cnp != null)
        msgs = ((InternalEObject)cnp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.NOTE__CNP, null, msgs);
      if (newCnp != null)
        msgs = ((InternalEObject)newCnp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.NOTE__CNP, null, msgs);
      msgs = basicSetCnp(newCnp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.NOTE__CNP, newCnp, newCnp));
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
      case MusyPackage.NOTE__CNP:
        return basicSetCnp(null, msgs);
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
      case MusyPackage.NOTE__NL:
        return getNl();
      case MusyPackage.NOTE__ACC:
        return getAcc();
      case MusyPackage.NOTE__CNP:
        return getCnp();
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
      case MusyPackage.NOTE__NL:
        setNl((String)newValue);
        return;
      case MusyPackage.NOTE__ACC:
        setAcc((String)newValue);
        return;
      case MusyPackage.NOTE__CNP:
        setCnp((CustomNoteParam)newValue);
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
      case MusyPackage.NOTE__NL:
        setNl(NL_EDEFAULT);
        return;
      case MusyPackage.NOTE__ACC:
        setAcc(ACC_EDEFAULT);
        return;
      case MusyPackage.NOTE__CNP:
        setCnp((CustomNoteParam)null);
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
      case MusyPackage.NOTE__NL:
        return NL_EDEFAULT == null ? nl != null : !NL_EDEFAULT.equals(nl);
      case MusyPackage.NOTE__ACC:
        return ACC_EDEFAULT == null ? acc != null : !ACC_EDEFAULT.equals(acc);
      case MusyPackage.NOTE__CNP:
        return cnp != null;
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
    result.append(" (nl: ");
    result.append(nl);
    result.append(", acc: ");
    result.append(acc);
    result.append(')');
    return result.toString();
  }

} //NoteImpl
