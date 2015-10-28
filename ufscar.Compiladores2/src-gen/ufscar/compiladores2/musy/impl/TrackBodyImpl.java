/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ufscar.compiladores2.musy.BodyComponent;
import ufscar.compiladores2.musy.MoreTrackBody;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.TrackBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.TrackBodyImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.TrackBodyImpl#getMore <em>More</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackBodyImpl extends MinimalEObjectImpl.Container implements TrackBody
{
  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected BodyComponent body;

  /**
   * The cached value of the '{@link #getMore() <em>More</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMore()
   * @generated
   * @ordered
   */
  protected MoreTrackBody more;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrackBodyImpl()
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
    return MusyPackage.Literals.TRACK_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyComponent getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(BodyComponent newBody, NotificationChain msgs)
  {
    BodyComponent oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.TRACK_BODY__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(BodyComponent newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.TRACK_BODY__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.TRACK_BODY__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.TRACK_BODY__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreTrackBody getMore()
  {
    return more;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMore(MoreTrackBody newMore, NotificationChain msgs)
  {
    MoreTrackBody oldMore = more;
    more = newMore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusyPackage.TRACK_BODY__MORE, oldMore, newMore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMore(MoreTrackBody newMore)
  {
    if (newMore != more)
    {
      NotificationChain msgs = null;
      if (more != null)
        msgs = ((InternalEObject)more).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusyPackage.TRACK_BODY__MORE, null, msgs);
      if (newMore != null)
        msgs = ((InternalEObject)newMore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusyPackage.TRACK_BODY__MORE, null, msgs);
      msgs = basicSetMore(newMore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MusyPackage.TRACK_BODY__MORE, newMore, newMore));
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
      case MusyPackage.TRACK_BODY__BODY:
        return basicSetBody(null, msgs);
      case MusyPackage.TRACK_BODY__MORE:
        return basicSetMore(null, msgs);
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
      case MusyPackage.TRACK_BODY__BODY:
        return getBody();
      case MusyPackage.TRACK_BODY__MORE:
        return getMore();
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
      case MusyPackage.TRACK_BODY__BODY:
        setBody((BodyComponent)newValue);
        return;
      case MusyPackage.TRACK_BODY__MORE:
        setMore((MoreTrackBody)newValue);
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
      case MusyPackage.TRACK_BODY__BODY:
        setBody((BodyComponent)null);
        return;
      case MusyPackage.TRACK_BODY__MORE:
        setMore((MoreTrackBody)null);
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
      case MusyPackage.TRACK_BODY__BODY:
        return body != null;
      case MusyPackage.TRACK_BODY__MORE:
        return more != null;
    }
    return super.eIsSet(featureID);
  }

} //TrackBodyImpl
