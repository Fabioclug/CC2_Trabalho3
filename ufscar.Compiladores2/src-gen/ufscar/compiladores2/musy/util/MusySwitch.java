/**
 */
package ufscar.compiladores2.musy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ufscar.compiladores2.musy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ufscar.compiladores2.musy.MusyPackage
 * @generated
 */
public class MusySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MusyPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MusyPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MusyPackage.MIDI:
      {
        Midi midi = (Midi)theEObject;
        T result = caseMidi(midi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.MIDI_BODY:
      {
        MidiBody midiBody = (MidiBody)theEObject;
        T result = caseMidiBody(midiBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.TRACK:
      {
        Track track = (Track)theEObject;
        T result = caseTrack(track);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.TRACK_BODY:
      {
        TrackBody trackBody = (TrackBody)theEObject;
        T result = caseTrackBody(trackBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.MORE_TRACK_BODY:
      {
        MoreTrackBody moreTrackBody = (MoreTrackBody)theEObject;
        T result = caseMoreTrackBody(moreTrackBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.BODY_COMPONENT:
      {
        BodyComponent bodyComponent = (BodyComponent)theEObject;
        T result = caseBodyComponent(bodyComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.TIME_SIGNATURE:
      {
        TimeSignature timeSignature = (TimeSignature)theEObject;
        T result = caseTimeSignature(timeSignature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.CUSTOM_NOTE:
      {
        CustomNote customNote = (CustomNote)theEObject;
        T result = caseCustomNote(customNote);
        if (result == null) result = caseChordParams(customNote);
        if (result == null) result = caseChord(customNote);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.CHORD:
      {
        Chord chord = (Chord)theEObject;
        T result = caseChord(chord);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.CHORD_PARAMS:
      {
        ChordParams chordParams = (ChordParams)theEObject;
        T result = caseChordParams(chordParams);
        if (result == null) result = caseChord(chordParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MusyPackage.CUSTOM_NOTE_PARAM:
      {
        CustomNoteParam customNoteParam = (CustomNoteParam)theEObject;
        T result = caseCustomNoteParam(customNoteParam);
        if (result == null) result = caseCustomNote(customNoteParam);
        if (result == null) result = caseChordParams(customNoteParam);
        if (result == null) result = caseChord(customNoteParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Midi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Midi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMidi(Midi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Midi Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Midi Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMidiBody(MidiBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Track</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Track</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrack(Track object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Track Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Track Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrackBody(TrackBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More Track Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More Track Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoreTrackBody(MoreTrackBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyComponent(BodyComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeSignature(TimeSignature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Note</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Note</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomNote(CustomNote object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chord</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chord</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChord(Chord object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chord Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chord Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChordParams(ChordParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Note Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Note Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomNoteParam(CustomNoteParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MusySwitch
