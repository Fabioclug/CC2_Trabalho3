/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ufscar.compiladores2.musy.MusyFactory
 * @model kind="package"
 * @generated
 */
public interface MusyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "musy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.compiladores2.ufscar/Musy";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "musy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MusyPackage eINSTANCE = ufscar.compiladores2.musy.impl.MusyPackageImpl.init();

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.MidiImpl <em>Midi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.MidiImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getMidi()
   * @generated
   */
  int MIDI = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI__BODY = 1;

  /**
   * The number of structural features of the '<em>Midi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.MidiBodyImpl <em>Midi Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.MidiBodyImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getMidiBody()
   * @generated
   */
  int MIDI_BODY = 1;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_BODY__PARAM = 0;

  /**
   * The feature id for the '<em><b>Chords</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_BODY__CHORDS = 1;

  /**
   * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_BODY__TRACKS = 2;

  /**
   * The number of structural features of the '<em>Midi Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_BODY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ParameterImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ParameterBeatImpl <em>Parameter Beat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ParameterBeatImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterBeat()
   * @generated
   */
  int PARAMETER_BEAT = 3;

  /**
   * The feature id for the '<em><b>Beat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BEAT__BEAT = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Beat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BEAT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ParameterTimeSignatureImpl <em>Parameter Time Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ParameterTimeSignatureImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterTimeSignature()
   * @generated
   */
  int PARAMETER_TIME_SIGNATURE = 4;

  /**
   * The feature id for the '<em><b>Tsig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TIME_SIGNATURE__TSIG = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Time Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TIME_SIGNATURE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ParameterTimeNoteImpl <em>Parameter Time Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ParameterTimeNoteImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterTimeNote()
   * @generated
   */
  int PARAMETER_TIME_NOTE = 5;

  /**
   * The feature id for the '<em><b>Tn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TIME_NOTE__TN = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Time Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TIME_NOTE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ParameterTimePauseImpl <em>Parameter Time Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ParameterTimePauseImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterTimePause()
   * @generated
   */
  int PARAMETER_TIME_PAUSE = 6;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TIME_PAUSE__TP = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Time Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TIME_PAUSE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ParameterOctaveImpl <em>Parameter Octave</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ParameterOctaveImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterOctave()
   * @generated
   */
  int PARAMETER_OCTAVE = 7;

  /**
   * The feature id for the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_OCTAVE__OCTAVE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Octave</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_OCTAVE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.DeclaredChordImpl <em>Declared Chord</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.DeclaredChordImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getDeclaredChord()
   * @generated
   */
  int DECLARED_CHORD = 8;

  /**
   * The feature id for the '<em><b>Cp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_CHORD__CP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_CHORD__NAME = 1;

  /**
   * The number of structural features of the '<em>Declared Chord</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_CHORD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.TrackImpl <em>Track</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.TrackImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTrack()
   * @generated
   */
  int TRACK = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__NAME = 0;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__I = 1;

  /**
   * The feature id for the '<em><b>Tbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__TBODY = 2;

  /**
   * The number of structural features of the '<em>Track</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.TrackBodyImpl <em>Track Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.TrackBodyImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTrackBody()
   * @generated
   */
  int TRACK_BODY = 10;

  /**
   * The feature id for the '<em><b>Bc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_BODY__BC = 0;

  /**
   * The number of structural features of the '<em>Track Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.BodyComponentImpl <em>Body Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.BodyComponentImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getBodyComponent()
   * @generated
   */
  int BODY_COMPONENT = 11;

  /**
   * The feature id for the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__NOTE = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__BLOCK = 1;

  /**
   * The feature id for the '<em><b>Ch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__CH = 2;

  /**
   * The number of structural features of the '<em>Body Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.BlockImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Blockbody</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__BLOCKBODY = 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.TimeSignatureImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTimeSignature()
   * @generated
   */
  int TIME_SIGNATURE = 13;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SIGNATURE__QUANTITY = 0;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SIGNATURE__NOTE = 1;

  /**
   * The number of structural features of the '<em>Time Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SIGNATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ChordParamsImpl <em>Chord Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ChordParamsImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getChordParams()
   * @generated
   */
  int CHORD_PARAMS = 14;

  /**
   * The feature id for the '<em><b>Cnote</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_PARAMS__CNOTE = 0;

  /**
   * The number of structural features of the '<em>Chord Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_PARAMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.NoteImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getNote()
   * @generated
   */
  int NOTE = 15;

  /**
   * The feature id for the '<em><b>Nl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__NL = 0;

  /**
   * The feature id for the '<em><b>Acc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__ACC = 1;

  /**
   * The feature id for the '<em><b>Cnp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__CNP = 2;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.CustomNoteParamImpl <em>Custom Note Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.CustomNoteParamImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getCustomNoteParam()
   * @generated
   */
  int CUSTOM_NOTE_PARAM = 16;

  /**
   * The feature id for the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_PARAM__OCTAVE = 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_PARAM__DURATION = 1;

  /**
   * The number of structural features of the '<em>Custom Note Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_PARAM_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.Midi <em>Midi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Midi</em>'.
   * @see ufscar.compiladores2.musy.Midi
   * @generated
   */
  EClass getMidi();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Midi#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ufscar.compiladores2.musy.Midi#getName()
   * @see #getMidi()
   * @generated
   */
  EAttribute getMidi_Name();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.Midi#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ufscar.compiladores2.musy.Midi#getBody()
   * @see #getMidi()
   * @generated
   */
  EReference getMidi_Body();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.MidiBody <em>Midi Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Midi Body</em>'.
   * @see ufscar.compiladores2.musy.MidiBody
   * @generated
   */
  EClass getMidiBody();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.MidiBody#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param</em>'.
   * @see ufscar.compiladores2.musy.MidiBody#getParam()
   * @see #getMidiBody()
   * @generated
   */
  EReference getMidiBody_Param();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.MidiBody#getChords <em>Chords</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Chords</em>'.
   * @see ufscar.compiladores2.musy.MidiBody#getChords()
   * @see #getMidiBody()
   * @generated
   */
  EReference getMidiBody_Chords();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.MidiBody#getTracks <em>Tracks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tracks</em>'.
   * @see ufscar.compiladores2.musy.MidiBody#getTracks()
   * @see #getMidiBody()
   * @generated
   */
  EReference getMidiBody_Tracks();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see ufscar.compiladores2.musy.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.ParameterBeat <em>Parameter Beat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Beat</em>'.
   * @see ufscar.compiladores2.musy.ParameterBeat
   * @generated
   */
  EClass getParameterBeat();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.ParameterBeat#getBeat <em>Beat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beat</em>'.
   * @see ufscar.compiladores2.musy.ParameterBeat#getBeat()
   * @see #getParameterBeat()
   * @generated
   */
  EAttribute getParameterBeat_Beat();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.ParameterTimeSignature <em>Parameter Time Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Time Signature</em>'.
   * @see ufscar.compiladores2.musy.ParameterTimeSignature
   * @generated
   */
  EClass getParameterTimeSignature();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.ParameterTimeSignature#getTsig <em>Tsig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tsig</em>'.
   * @see ufscar.compiladores2.musy.ParameterTimeSignature#getTsig()
   * @see #getParameterTimeSignature()
   * @generated
   */
  EReference getParameterTimeSignature_Tsig();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.ParameterTimeNote <em>Parameter Time Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Time Note</em>'.
   * @see ufscar.compiladores2.musy.ParameterTimeNote
   * @generated
   */
  EClass getParameterTimeNote();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.ParameterTimeNote#getTn <em>Tn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tn</em>'.
   * @see ufscar.compiladores2.musy.ParameterTimeNote#getTn()
   * @see #getParameterTimeNote()
   * @generated
   */
  EAttribute getParameterTimeNote_Tn();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.ParameterTimePause <em>Parameter Time Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Time Pause</em>'.
   * @see ufscar.compiladores2.musy.ParameterTimePause
   * @generated
   */
  EClass getParameterTimePause();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.ParameterTimePause#getTp <em>Tp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tp</em>'.
   * @see ufscar.compiladores2.musy.ParameterTimePause#getTp()
   * @see #getParameterTimePause()
   * @generated
   */
  EAttribute getParameterTimePause_Tp();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.ParameterOctave <em>Parameter Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Octave</em>'.
   * @see ufscar.compiladores2.musy.ParameterOctave
   * @generated
   */
  EClass getParameterOctave();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.ParameterOctave#getOctave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octave</em>'.
   * @see ufscar.compiladores2.musy.ParameterOctave#getOctave()
   * @see #getParameterOctave()
   * @generated
   */
  EAttribute getParameterOctave_Octave();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.DeclaredChord <em>Declared Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declared Chord</em>'.
   * @see ufscar.compiladores2.musy.DeclaredChord
   * @generated
   */
  EClass getDeclaredChord();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.DeclaredChord#getCp <em>Cp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cp</em>'.
   * @see ufscar.compiladores2.musy.DeclaredChord#getCp()
   * @see #getDeclaredChord()
   * @generated
   */
  EReference getDeclaredChord_Cp();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.DeclaredChord#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ufscar.compiladores2.musy.DeclaredChord#getName()
   * @see #getDeclaredChord()
   * @generated
   */
  EAttribute getDeclaredChord_Name();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.Track <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Track</em>'.
   * @see ufscar.compiladores2.musy.Track
   * @generated
   */
  EClass getTrack();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Track#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ufscar.compiladores2.musy.Track#getName()
   * @see #getTrack()
   * @generated
   */
  EAttribute getTrack_Name();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Track#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see ufscar.compiladores2.musy.Track#getI()
   * @see #getTrack()
   * @generated
   */
  EAttribute getTrack_I();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.Track#getTbody <em>Tbody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tbody</em>'.
   * @see ufscar.compiladores2.musy.Track#getTbody()
   * @see #getTrack()
   * @generated
   */
  EReference getTrack_Tbody();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.TrackBody <em>Track Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Track Body</em>'.
   * @see ufscar.compiladores2.musy.TrackBody
   * @generated
   */
  EClass getTrackBody();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.TrackBody#getBc <em>Bc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bc</em>'.
   * @see ufscar.compiladores2.musy.TrackBody#getBc()
   * @see #getTrackBody()
   * @generated
   */
  EReference getTrackBody_Bc();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.BodyComponent <em>Body Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Component</em>'.
   * @see ufscar.compiladores2.musy.BodyComponent
   * @generated
   */
  EClass getBodyComponent();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.BodyComponent#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Note</em>'.
   * @see ufscar.compiladores2.musy.BodyComponent#getNote()
   * @see #getBodyComponent()
   * @generated
   */
  EReference getBodyComponent_Note();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.BodyComponent#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see ufscar.compiladores2.musy.BodyComponent#getBlock()
   * @see #getBodyComponent()
   * @generated
   */
  EReference getBodyComponent_Block();

  /**
   * Returns the meta object for the reference '{@link ufscar.compiladores2.musy.BodyComponent#getCh <em>Ch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ch</em>'.
   * @see ufscar.compiladores2.musy.BodyComponent#getCh()
   * @see #getBodyComponent()
   * @generated
   */
  EReference getBodyComponent_Ch();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see ufscar.compiladores2.musy.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Block#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ufscar.compiladores2.musy.Block#getName()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.Block#getBlockbody <em>Blockbody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blockbody</em>'.
   * @see ufscar.compiladores2.musy.Block#getBlockbody()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Blockbody();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.TimeSignature <em>Time Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Signature</em>'.
   * @see ufscar.compiladores2.musy.TimeSignature
   * @generated
   */
  EClass getTimeSignature();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.TimeSignature#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantity</em>'.
   * @see ufscar.compiladores2.musy.TimeSignature#getQuantity()
   * @see #getTimeSignature()
   * @generated
   */
  EAttribute getTimeSignature_Quantity();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.TimeSignature#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see ufscar.compiladores2.musy.TimeSignature#getNote()
   * @see #getTimeSignature()
   * @generated
   */
  EAttribute getTimeSignature_Note();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.ChordParams <em>Chord Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chord Params</em>'.
   * @see ufscar.compiladores2.musy.ChordParams
   * @generated
   */
  EClass getChordParams();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.ChordParams#getCnote <em>Cnote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cnote</em>'.
   * @see ufscar.compiladores2.musy.ChordParams#getCnote()
   * @see #getChordParams()
   * @generated
   */
  EReference getChordParams_Cnote();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see ufscar.compiladores2.musy.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Note#getNl <em>Nl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nl</em>'.
   * @see ufscar.compiladores2.musy.Note#getNl()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Nl();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Note#getAcc <em>Acc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acc</em>'.
   * @see ufscar.compiladores2.musy.Note#getAcc()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Acc();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.Note#getCnp <em>Cnp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cnp</em>'.
   * @see ufscar.compiladores2.musy.Note#getCnp()
   * @see #getNote()
   * @generated
   */
  EReference getNote_Cnp();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.CustomNoteParam <em>Custom Note Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Note Param</em>'.
   * @see ufscar.compiladores2.musy.CustomNoteParam
   * @generated
   */
  EClass getCustomNoteParam();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.CustomNoteParam#getOctave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octave</em>'.
   * @see ufscar.compiladores2.musy.CustomNoteParam#getOctave()
   * @see #getCustomNoteParam()
   * @generated
   */
  EAttribute getCustomNoteParam_Octave();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.CustomNoteParam#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see ufscar.compiladores2.musy.CustomNoteParam#getDuration()
   * @see #getCustomNoteParam()
   * @generated
   */
  EAttribute getCustomNoteParam_Duration();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MusyFactory getMusyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.MidiImpl <em>Midi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.MidiImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getMidi()
     * @generated
     */
    EClass MIDI = eINSTANCE.getMidi();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIDI__NAME = eINSTANCE.getMidi_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIDI__BODY = eINSTANCE.getMidi_Body();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.MidiBodyImpl <em>Midi Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.MidiBodyImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getMidiBody()
     * @generated
     */
    EClass MIDI_BODY = eINSTANCE.getMidiBody();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIDI_BODY__PARAM = eINSTANCE.getMidiBody_Param();

    /**
     * The meta object literal for the '<em><b>Chords</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIDI_BODY__CHORDS = eINSTANCE.getMidiBody_Chords();

    /**
     * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIDI_BODY__TRACKS = eINSTANCE.getMidiBody_Tracks();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ParameterImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ParameterBeatImpl <em>Parameter Beat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ParameterBeatImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterBeat()
     * @generated
     */
    EClass PARAMETER_BEAT = eINSTANCE.getParameterBeat();

    /**
     * The meta object literal for the '<em><b>Beat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_BEAT__BEAT = eINSTANCE.getParameterBeat_Beat();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ParameterTimeSignatureImpl <em>Parameter Time Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ParameterTimeSignatureImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterTimeSignature()
     * @generated
     */
    EClass PARAMETER_TIME_SIGNATURE = eINSTANCE.getParameterTimeSignature();

    /**
     * The meta object literal for the '<em><b>Tsig</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_TIME_SIGNATURE__TSIG = eINSTANCE.getParameterTimeSignature_Tsig();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ParameterTimeNoteImpl <em>Parameter Time Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ParameterTimeNoteImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterTimeNote()
     * @generated
     */
    EClass PARAMETER_TIME_NOTE = eINSTANCE.getParameterTimeNote();

    /**
     * The meta object literal for the '<em><b>Tn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_TIME_NOTE__TN = eINSTANCE.getParameterTimeNote_Tn();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ParameterTimePauseImpl <em>Parameter Time Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ParameterTimePauseImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterTimePause()
     * @generated
     */
    EClass PARAMETER_TIME_PAUSE = eINSTANCE.getParameterTimePause();

    /**
     * The meta object literal for the '<em><b>Tp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_TIME_PAUSE__TP = eINSTANCE.getParameterTimePause_Tp();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ParameterOctaveImpl <em>Parameter Octave</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ParameterOctaveImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getParameterOctave()
     * @generated
     */
    EClass PARAMETER_OCTAVE = eINSTANCE.getParameterOctave();

    /**
     * The meta object literal for the '<em><b>Octave</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_OCTAVE__OCTAVE = eINSTANCE.getParameterOctave_Octave();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.DeclaredChordImpl <em>Declared Chord</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.DeclaredChordImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getDeclaredChord()
     * @generated
     */
    EClass DECLARED_CHORD = eINSTANCE.getDeclaredChord();

    /**
     * The meta object literal for the '<em><b>Cp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARED_CHORD__CP = eINSTANCE.getDeclaredChord_Cp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARED_CHORD__NAME = eINSTANCE.getDeclaredChord_Name();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.TrackImpl <em>Track</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.TrackImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTrack()
     * @generated
     */
    EClass TRACK = eINSTANCE.getTrack();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACK__NAME = eINSTANCE.getTrack_Name();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACK__I = eINSTANCE.getTrack_I();

    /**
     * The meta object literal for the '<em><b>Tbody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACK__TBODY = eINSTANCE.getTrack_Tbody();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.TrackBodyImpl <em>Track Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.TrackBodyImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTrackBody()
     * @generated
     */
    EClass TRACK_BODY = eINSTANCE.getTrackBody();

    /**
     * The meta object literal for the '<em><b>Bc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACK_BODY__BC = eINSTANCE.getTrackBody_Bc();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.BodyComponentImpl <em>Body Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.BodyComponentImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getBodyComponent()
     * @generated
     */
    EClass BODY_COMPONENT = eINSTANCE.getBodyComponent();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_COMPONENT__NOTE = eINSTANCE.getBodyComponent_Note();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_COMPONENT__BLOCK = eINSTANCE.getBodyComponent_Block();

    /**
     * The meta object literal for the '<em><b>Ch</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_COMPONENT__CH = eINSTANCE.getBodyComponent_Ch();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.BlockImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

    /**
     * The meta object literal for the '<em><b>Blockbody</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__BLOCKBODY = eINSTANCE.getBlock_Blockbody();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.TimeSignatureImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTimeSignature()
     * @generated
     */
    EClass TIME_SIGNATURE = eINSTANCE.getTimeSignature();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_SIGNATURE__QUANTITY = eINSTANCE.getTimeSignature_Quantity();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_SIGNATURE__NOTE = eINSTANCE.getTimeSignature_Note();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ChordParamsImpl <em>Chord Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ChordParamsImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getChordParams()
     * @generated
     */
    EClass CHORD_PARAMS = eINSTANCE.getChordParams();

    /**
     * The meta object literal for the '<em><b>Cnote</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORD_PARAMS__CNOTE = eINSTANCE.getChordParams_Cnote();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.NoteImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getNote()
     * @generated
     */
    EClass NOTE = eINSTANCE.getNote();

    /**
     * The meta object literal for the '<em><b>Nl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__NL = eINSTANCE.getNote_Nl();

    /**
     * The meta object literal for the '<em><b>Acc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__ACC = eINSTANCE.getNote_Acc();

    /**
     * The meta object literal for the '<em><b>Cnp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTE__CNP = eINSTANCE.getNote_Cnp();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.CustomNoteParamImpl <em>Custom Note Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.CustomNoteParamImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getCustomNoteParam()
     * @generated
     */
    EClass CUSTOM_NOTE_PARAM = eINSTANCE.getCustomNoteParam();

    /**
     * The meta object literal for the '<em><b>Octave</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_NOTE_PARAM__OCTAVE = eINSTANCE.getCustomNoteParam_Octave();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_NOTE_PARAM__DURATION = eINSTANCE.getCustomNoteParam_Duration();

  }

} //MusyPackage
