/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ufscar.compiladores2.musy.Block;
import ufscar.compiladores2.musy.BodyComponent;
import ufscar.compiladores2.musy.Chord;
import ufscar.compiladores2.musy.CustomNote;
import ufscar.compiladores2.musy.MusyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.BodyComponentImpl#getCnote <em>Cnote</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.BodyComponentImpl#getNote <em>Note</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.BodyComponentImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.BodyComponentImpl#getChord <em>Chord</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyComponentImpl extends MinimalEObjectImpl.Container implements BodyComponent
{
  /**
   * The cached value of the '{@link #getCnote() <em>Cnote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCnote()
   * @generated
   * @ordered
   */
  protected CustomNote cnote;

  /**
   * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected static final String NOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected String note = NOTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * The cached value of the '{@link #getChord() <em>Chord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChord()
   * @generated
   * @ordered
   */
  protected Chord chord;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyComponentImpl()
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
    return MusyPackage.Literals.BODY_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomNote getCnote()
  {
    return cnote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCnote(CustomNote newCnote, NotificationChain msgs)
  {
    CustomNote oldCnote = cnote;
    cnote = newCnote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__CNOTE, oldCnote, newCnote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCnote(CustomNote newCnote)
  {
    if (newCnote != cnote)
    {
      NotificationChain msgs = null;
      if (cnote != null)
        msgs = ((InternalEObject)cnote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__CNOTE, null, msgs);
      if (newCnote != null)
        msgs = ((InternalEObject)newCnote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__CNOTE, null, msgs);
      msgs = basicSetCnote(newCnote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__CNOTE, newCnote, newCnote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(String newNote)
  {
    String oldNote = note;
    note = newNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__NOTE, oldNote, note));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chord getChord()
  {
    return chord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChord(Chord newChord, NotificationChain msgs)
  {
    Chord oldChord = chord;
    chord = newChord;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__CHORD, oldChord, newChord);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChord(Chord newChord)
  {
    if (newChord != chord)
    {
      NotificationChain msgs = null;
      if (chord != null)
        msgs = ((InternalEObject)chord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__CHORD, null, msgs);
      if (newChord != null)
        msgs = ((InternalEObject)newChord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__CHORD, null, msgs);
      msgs = basicSetChord(newChord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__CHORD, newChord, newChord));
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
      case MusyPackage.BODY_COMPONENT__CNOTE:
        return basicSetCnote(null, msgs);
      case MusyPackage.BODY_COMPONENT__BLOCK:
        return basicSetBlock(null, msgs);
      case MusyPackage.BODY_COMPONENT__CHORD:
        return basicSetChord(null, msgs);
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
      case MusyPackage.BODY_COMPONENT__CNOTE:
        return getCnote();
      case MusyPackage.BODY_COMPONENT__NOTE:
        return getNote();
      case MusyPackage.BODY_COMPONENT__BLOCK:
        return getBlock();
      case MusyPackage.BODY_COMPONENT__CHORD:
        return getChord();
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
      case MusyPackage.BODY_COMPONENT__CNOTE:
        setCnote((CustomNote)newValue);
        return;
      case MusyPackage.BODY_COMPONENT__NOTE:
        setNote((String)newValue);
        return;
      case MusyPackage.BODY_COMPONENT__BLOCK:
        setBlock((Block)newValue);
        return;
      case MusyPackage.BODY_COMPONENT__CHORD:
        setChord((Chord)newValue);
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
      case MusyPackage.BODY_COMPONENT__CNOTE:
        setCnote((CustomNote)null);
        return;
      case MusyPackage.BODY_COMPONENT__NOTE:
        setNote(NOTE_EDEFAULT);
        return;
      case MusyPackage.BODY_COMPONENT__BLOCK:
        setBlock((Block)null);
        return;
      case MusyPackage.BODY_COMPONENT__CHORD:
        setChord((Chord)null);
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
      case MusyPackage.BODY_COMPONENT__CNOTE:
        return cnote != null;
      case MusyPackage.BODY_COMPONENT__NOTE:
        return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
      case MusyPackage.BODY_COMPONENT__BLOCK:
        return block != null;
      case MusyPackage.BODY_COMPONENT__CHORD:
        return chord != null;
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
    result.append(" (note: ");
    result.append(note);
    result.append(')');
    return result.toString();
  }

} //BodyComponentImpl
