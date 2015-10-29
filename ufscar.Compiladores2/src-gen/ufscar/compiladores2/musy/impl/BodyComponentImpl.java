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
import ufscar.compiladores2.musy.DeclaredChord;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.BodyComponentImpl#getNote <em>Note</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.BodyComponentImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.BodyComponentImpl#getCh <em>Ch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyComponentImpl extends MinimalEObjectImpl.Container implements BodyComponent
{
  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected Note note;

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
   * The cached value of the '{@link #getCh() <em>Ch</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCh()
   * @generated
   * @ordered
   */
  protected DeclaredChord ch;

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
  public Note getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNote(Note newNote, NotificationChain msgs)
  {
    Note oldNote = note;
    note = newNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__NOTE, oldNote, newNote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(Note newNote)
  {
    if (newNote != note)
    {
      NotificationChain msgs = null;
      if (note != null)
        msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__NOTE, null, msgs);
      if (newNote != null)
        msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.BODY_COMPONENT__NOTE, null, msgs);
      msgs = basicSetNote(newNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__NOTE, newNote, newNote));
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
  public DeclaredChord getCh()
  {
    if (ch != null && ch.eIsProxy())
    {
      InternalEObject oldCh = (InternalEObject)ch;
      ch = (DeclaredChord)eResolveProxy(oldCh);
      if (ch != oldCh)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MusyPackage.BODY_COMPONENT__CH, oldCh, ch));
      }
    }
    return ch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclaredChord basicGetCh()
  {
    return ch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCh(DeclaredChord newCh)
  {
    DeclaredChord oldCh = ch;
    ch = newCh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.BODY_COMPONENT__CH, oldCh, ch));
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
      case MusyPackage.BODY_COMPONENT__NOTE:
        return basicSetNote(null, msgs);
      case MusyPackage.BODY_COMPONENT__BLOCK:
        return basicSetBlock(null, msgs);
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
      case MusyPackage.BODY_COMPONENT__NOTE:
        return getNote();
      case MusyPackage.BODY_COMPONENT__BLOCK:
        return getBlock();
      case MusyPackage.BODY_COMPONENT__CH:
        if (resolve) return getCh();
        return basicGetCh();
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
      case MusyPackage.BODY_COMPONENT__NOTE:
        setNote((Note)newValue);
        return;
      case MusyPackage.BODY_COMPONENT__BLOCK:
        setBlock((Block)newValue);
        return;
      case MusyPackage.BODY_COMPONENT__CH:
        setCh((DeclaredChord)newValue);
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
      case MusyPackage.BODY_COMPONENT__NOTE:
        setNote((Note)null);
        return;
      case MusyPackage.BODY_COMPONENT__BLOCK:
        setBlock((Block)null);
        return;
      case MusyPackage.BODY_COMPONENT__CH:
        setCh((DeclaredChord)null);
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
      case MusyPackage.BODY_COMPONENT__NOTE:
        return note != null;
      case MusyPackage.BODY_COMPONENT__BLOCK:
        return block != null;
      case MusyPackage.BODY_COMPONENT__CH:
        return ch != null;
    }
    return super.eIsSet(featureID);
  }

} //BodyComponentImpl
