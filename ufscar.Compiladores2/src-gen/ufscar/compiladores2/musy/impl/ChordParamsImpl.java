/**
 */
package ufscar.compiladores2.musy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ufscar.compiladores2.musy.ChordParams;
import ufscar.compiladores2.musy.CustomNote;
import ufscar.compiladores2.musy.MusyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chord Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.ChordParamsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.ChordParamsImpl#getCnotes <em>Cnotes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChordParamsImpl extends ChordImpl implements ChordParams
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCnotes() <em>Cnotes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCnotes()
   * @generated
   * @ordered
   */
  protected EList<CustomNote> cnotes;

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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.CHORD_PARAMS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomNote> getCnotes()
  {
    if (cnotes == null)
    {
      cnotes = new EObjectContainmentEList<CustomNote>(CustomNote.class, this, MusyPackage.CHORD_PARAMS__CNOTES);
    }
    return cnotes;
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
      case MusyPackage.CHORD_PARAMS__CNOTES:
        return ((InternalEList<?>)getCnotes()).basicRemove(otherEnd, msgs);
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
      case MusyPackage.CHORD_PARAMS__NAME:
        return getName();
      case MusyPackage.CHORD_PARAMS__CNOTES:
        return getCnotes();
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
      case MusyPackage.CHORD_PARAMS__NAME:
        setName((String)newValue);
        return;
      case MusyPackage.CHORD_PARAMS__CNOTES:
        getCnotes().clear();
        getCnotes().addAll((Collection<? extends CustomNote>)newValue);
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
      case MusyPackage.CHORD_PARAMS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MusyPackage.CHORD_PARAMS__CNOTES:
        getCnotes().clear();
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
      case MusyPackage.CHORD_PARAMS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MusyPackage.CHORD_PARAMS__CNOTES:
        return cnotes != null && !cnotes.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ChordParamsImpl
