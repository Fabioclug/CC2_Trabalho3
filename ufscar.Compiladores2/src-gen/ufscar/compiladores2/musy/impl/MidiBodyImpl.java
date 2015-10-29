/**
 */
package ufscar.compiladores2.musy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ufscar.compiladores2.musy.DeclaredChord;
import ufscar.compiladores2.musy.MidiBody;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.Parameter;
import ufscar.compiladores2.musy.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Midi Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.impl.MidiBodyImpl#getParam <em>Param</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.MidiBodyImpl#getChords <em>Chords</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.impl.MidiBodyImpl#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MidiBodyImpl extends MinimalEObjectImpl.Container implements MidiBody
{
  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected EList<Parameter> param;

  /**
   * The cached value of the '{@link #getChords() <em>Chords</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChords()
   * @generated
   * @ordered
   */
  protected EList<DeclaredChord> chords;

  /**
   * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTracks()
   * @generated
   * @ordered
   */
  protected EList<Track> tracks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MidiBodyImpl()
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
    return MusyPackage.Literals.MIDI_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParam()
  {
    if (param == null)
    {
      param = new EObjectContainmentEList<Parameter>(Parameter.class, this, MusyPackage.MIDI_BODY__PARAM);
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeclaredChord> getChords()
  {
    if (chords == null)
    {
      chords = new EObjectContainmentEList<DeclaredChord>(DeclaredChord.class, this, MusyPackage.MIDI_BODY__CHORDS);
    }
    return chords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Track> getTracks()
  {
    if (tracks == null)
    {
      tracks = new EObjectContainmentEList<Track>(Track.class, this, MusyPackage.MIDI_BODY__TRACKS);
    }
    return tracks;
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
      case MusyPackage.MIDI_BODY__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
      case MusyPackage.MIDI_BODY__CHORDS:
        return ((InternalEList<?>)getChords()).basicRemove(otherEnd, msgs);
      case MusyPackage.MIDI_BODY__TRACKS:
        return ((InternalEList<?>)getTracks()).basicRemove(otherEnd, msgs);
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
      case MusyPackage.MIDI_BODY__PARAM:
        return getParam();
      case MusyPackage.MIDI_BODY__CHORDS:
        return getChords();
      case MusyPackage.MIDI_BODY__TRACKS:
        return getTracks();
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
      case MusyPackage.MIDI_BODY__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends Parameter>)newValue);
        return;
      case MusyPackage.MIDI_BODY__CHORDS:
        getChords().clear();
        getChords().addAll((Collection<? extends DeclaredChord>)newValue);
        return;
      case MusyPackage.MIDI_BODY__TRACKS:
        getTracks().clear();
        getTracks().addAll((Collection<? extends Track>)newValue);
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
      case MusyPackage.MIDI_BODY__PARAM:
        getParam().clear();
        return;
      case MusyPackage.MIDI_BODY__CHORDS:
        getChords().clear();
        return;
      case MusyPackage.MIDI_BODY__TRACKS:
        getTracks().clear();
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
      case MusyPackage.MIDI_BODY__PARAM:
        return param != null && !param.isEmpty();
      case MusyPackage.MIDI_BODY__CHORDS:
        return chords != null && !chords.isEmpty();
      case MusyPackage.MIDI_BODY__TRACKS:
        return tracks != null && !tracks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MidiBodyImpl
