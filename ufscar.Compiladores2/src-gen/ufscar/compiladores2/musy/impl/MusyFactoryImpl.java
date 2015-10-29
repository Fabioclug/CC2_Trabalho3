/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ufscar.compiladores2.musy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusyFactoryImpl extends EFactoryImpl implements MusyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MusyFactory init()
  {
    try
    {
      MusyFactory theMusyFactory = (MusyFactory)EPackage.Registry.INSTANCE.getEFactory(MusyPackage.eNS_URI);
      if (theMusyFactory != null)
      {
        return theMusyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MusyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MusyPackage.MIDI: return createMidi();
      case MusyPackage.MIDI_BODY: return createMidiBody();
      case MusyPackage.PARAMETER: return createParameter();
      case MusyPackage.PARAMETER_BEAT: return createParameterBeat();
      case MusyPackage.PARAMETER_TIME_SIGNATURE: return createParameterTimeSignature();
      case MusyPackage.PARAMETER_TIME_NOTE: return createParameterTimeNote();
      case MusyPackage.PARAMETER_TIME_PAUSE: return createParameterTimePause();
      case MusyPackage.PARAMETER_OCTAVE: return createParameterOctave();
      case MusyPackage.DECLARED_CHORD: return createDeclaredChord();
      case MusyPackage.TRACK: return createTrack();
      case MusyPackage.TRACK_BODY: return createTrackBody();
      case MusyPackage.BODY_COMPONENT: return createBodyComponent();
      case MusyPackage.BLOCK: return createBlock();
      case MusyPackage.TIME_SIGNATURE: return createTimeSignature();
      case MusyPackage.CHORD_PARAMS: return createChordParams();
      case MusyPackage.NOTE: return createNote();
      case MusyPackage.CUSTOM_NOTE_PARAM: return createCustomNoteParam();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Midi createMidi()
  {
    MidiImpl midi = new MidiImpl();
    return midi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MidiBody createMidiBody()
  {
    MidiBodyImpl midiBody = new MidiBodyImpl();
    return midiBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterBeat createParameterBeat()
  {
    ParameterBeatImpl parameterBeat = new ParameterBeatImpl();
    return parameterBeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterTimeSignature createParameterTimeSignature()
  {
    ParameterTimeSignatureImpl parameterTimeSignature = new ParameterTimeSignatureImpl();
    return parameterTimeSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterTimeNote createParameterTimeNote()
  {
    ParameterTimeNoteImpl parameterTimeNote = new ParameterTimeNoteImpl();
    return parameterTimeNote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterTimePause createParameterTimePause()
  {
    ParameterTimePauseImpl parameterTimePause = new ParameterTimePauseImpl();
    return parameterTimePause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterOctave createParameterOctave()
  {
    ParameterOctaveImpl parameterOctave = new ParameterOctaveImpl();
    return parameterOctave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclaredChord createDeclaredChord()
  {
    DeclaredChordImpl declaredChord = new DeclaredChordImpl();
    return declaredChord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Track createTrack()
  {
    TrackImpl track = new TrackImpl();
    return track;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrackBody createTrackBody()
  {
    TrackBodyImpl trackBody = new TrackBodyImpl();
    return trackBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyComponent createBodyComponent()
  {
    BodyComponentImpl bodyComponent = new BodyComponentImpl();
    return bodyComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeSignature createTimeSignature()
  {
    TimeSignatureImpl timeSignature = new TimeSignatureImpl();
    return timeSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChordParams createChordParams()
  {
    ChordParamsImpl chordParams = new ChordParamsImpl();
    return chordParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomNoteParam createCustomNoteParam()
  {
    CustomNoteParamImpl customNoteParam = new CustomNoteParamImpl();
    return customNoteParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusyPackage getMusyPackage()
  {
    return (MusyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MusyPackage getPackage()
  {
    return MusyPackage.eINSTANCE;
  }

} //MusyFactoryImpl
