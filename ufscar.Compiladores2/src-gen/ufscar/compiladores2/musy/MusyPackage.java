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
   * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_BODY__TRACKS = 1;

  /**
   * The number of structural features of the '<em>Midi Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_BODY_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Beat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__BEAT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Tsig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TSIG = 2;

  /**
   * The feature id for the '<em><b>Tn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TN = 3;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TP = 4;

  /**
   * The feature id for the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OCTAVE = 5;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.TrackImpl <em>Track</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.TrackImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTrack()
   * @generated
   */
  int TRACK = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__NAME = 0;

  /**
   * The feature id for the '<em><b>Tbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__TBODY = 1;

  /**
   * The number of structural features of the '<em>Track</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.TrackBodyImpl <em>Track Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.TrackBodyImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getTrackBody()
   * @generated
   */
  int TRACK_BODY = 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_BODY__BODY = 0;

  /**
   * The feature id for the '<em><b>More</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_BODY__MORE = 1;

  /**
   * The number of structural features of the '<em>Track Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.MoreTrackBodyImpl <em>More Track Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.MoreTrackBodyImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getMoreTrackBody()
   * @generated
   */
  int MORE_TRACK_BODY = 5;

  /**
   * The feature id for the '<em><b>Morebody</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_TRACK_BODY__MOREBODY = 0;

  /**
   * The number of structural features of the '<em>More Track Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_TRACK_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.BodyComponentImpl <em>Body Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.BodyComponentImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getBodyComponent()
   * @generated
   */
  int BODY_COMPONENT = 6;

  /**
   * The feature id for the '<em><b>Cnote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__CNOTE = 0;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__NOTE = 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__BLOCK = 2;

  /**
   * The feature id for the '<em><b>Chord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__CHORD = 3;

  /**
   * The number of structural features of the '<em>Body Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.BlockImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 7;

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
  int TIME_SIGNATURE = 8;

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
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ChordImpl <em>Chord</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ChordImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getChord()
   * @generated
   */
  int CHORD = 10;

  /**
   * The number of structural features of the '<em>Chord</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.ChordParamsImpl <em>Chord Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.ChordParamsImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getChordParams()
   * @generated
   */
  int CHORD_PARAMS = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_PARAMS__NAME = CHORD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cnotes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_PARAMS__CNOTES = CHORD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Chord Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_PARAMS_FEATURE_COUNT = CHORD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.CustomNoteImpl <em>Custom Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.CustomNoteImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getCustomNote()
   * @generated
   */
  int CUSTOM_NOTE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE__NAME = CHORD_PARAMS__NAME;

  /**
   * The feature id for the '<em><b>Cnotes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE__CNOTES = CHORD_PARAMS__CNOTES;

  /**
   * The number of structural features of the '<em>Custom Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_FEATURE_COUNT = CHORD_PARAMS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ufscar.compiladores2.musy.impl.CustomNoteParamImpl <em>Custom Note Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ufscar.compiladores2.musy.impl.CustomNoteParamImpl
   * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getCustomNoteParam()
   * @generated
   */
  int CUSTOM_NOTE_PARAM = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_PARAM__NAME = CUSTOM_NOTE__NAME;

  /**
   * The feature id for the '<em><b>Cnotes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_PARAM__CNOTES = CUSTOM_NOTE__CNOTES;

  /**
   * The feature id for the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_PARAM__OCTAVE = CUSTOM_NOTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Note Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_NOTE_PARAM_FEATURE_COUNT = CUSTOM_NOTE_FEATURE_COUNT + 1;


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
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Parameter#getBeat <em>Beat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beat</em>'.
   * @see ufscar.compiladores2.musy.Parameter#getBeat()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Beat();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see ufscar.compiladores2.musy.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.Parameter#getTsig <em>Tsig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tsig</em>'.
   * @see ufscar.compiladores2.musy.Parameter#getTsig()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Tsig();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Parameter#getTn <em>Tn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tn</em>'.
   * @see ufscar.compiladores2.musy.Parameter#getTn()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Tn();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Parameter#getTp <em>Tp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tp</em>'.
   * @see ufscar.compiladores2.musy.Parameter#getTp()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Tp();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.Parameter#getOctave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octave</em>'.
   * @see ufscar.compiladores2.musy.Parameter#getOctave()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Octave();

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
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.TrackBody#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ufscar.compiladores2.musy.TrackBody#getBody()
   * @see #getTrackBody()
   * @generated
   */
  EReference getTrackBody_Body();

  /**
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.TrackBody#getMore <em>More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>More</em>'.
   * @see ufscar.compiladores2.musy.TrackBody#getMore()
   * @see #getTrackBody()
   * @generated
   */
  EReference getTrackBody_More();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.MoreTrackBody <em>More Track Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>More Track Body</em>'.
   * @see ufscar.compiladores2.musy.MoreTrackBody
   * @generated
   */
  EClass getMoreTrackBody();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.MoreTrackBody#getMorebody <em>Morebody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Morebody</em>'.
   * @see ufscar.compiladores2.musy.MoreTrackBody#getMorebody()
   * @see #getMoreTrackBody()
   * @generated
   */
  EReference getMoreTrackBody_Morebody();

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
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.BodyComponent#getCnote <em>Cnote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cnote</em>'.
   * @see ufscar.compiladores2.musy.BodyComponent#getCnote()
   * @see #getBodyComponent()
   * @generated
   */
  EReference getBodyComponent_Cnote();

  /**
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.BodyComponent#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see ufscar.compiladores2.musy.BodyComponent#getNote()
   * @see #getBodyComponent()
   * @generated
   */
  EAttribute getBodyComponent_Note();

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
   * Returns the meta object for the containment reference '{@link ufscar.compiladores2.musy.BodyComponent#getChord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chord</em>'.
   * @see ufscar.compiladores2.musy.BodyComponent#getChord()
   * @see #getBodyComponent()
   * @generated
   */
  EReference getBodyComponent_Chord();

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
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.CustomNote <em>Custom Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Note</em>'.
   * @see ufscar.compiladores2.musy.CustomNote
   * @generated
   */
  EClass getCustomNote();

  /**
   * Returns the meta object for class '{@link ufscar.compiladores2.musy.Chord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chord</em>'.
   * @see ufscar.compiladores2.musy.Chord
   * @generated
   */
  EClass getChord();

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
   * Returns the meta object for the attribute '{@link ufscar.compiladores2.musy.ChordParams#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ufscar.compiladores2.musy.ChordParams#getName()
   * @see #getChordParams()
   * @generated
   */
  EAttribute getChordParams_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ufscar.compiladores2.musy.ChordParams#getCnotes <em>Cnotes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cnotes</em>'.
   * @see ufscar.compiladores2.musy.ChordParams#getCnotes()
   * @see #getChordParams()
   * @generated
   */
  EReference getChordParams_Cnotes();

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
     * The meta object literal for the '<em><b>Beat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__BEAT = eINSTANCE.getParameter_Beat();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Tsig</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TSIG = eINSTANCE.getParameter_Tsig();

    /**
     * The meta object literal for the '<em><b>Tn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__TN = eINSTANCE.getParameter_Tn();

    /**
     * The meta object literal for the '<em><b>Tp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__TP = eINSTANCE.getParameter_Tp();

    /**
     * The meta object literal for the '<em><b>Octave</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__OCTAVE = eINSTANCE.getParameter_Octave();

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
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACK_BODY__BODY = eINSTANCE.getTrackBody_Body();

    /**
     * The meta object literal for the '<em><b>More</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACK_BODY__MORE = eINSTANCE.getTrackBody_More();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.MoreTrackBodyImpl <em>More Track Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.MoreTrackBodyImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getMoreTrackBody()
     * @generated
     */
    EClass MORE_TRACK_BODY = eINSTANCE.getMoreTrackBody();

    /**
     * The meta object literal for the '<em><b>Morebody</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORE_TRACK_BODY__MOREBODY = eINSTANCE.getMoreTrackBody_Morebody();

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
     * The meta object literal for the '<em><b>Cnote</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_COMPONENT__CNOTE = eINSTANCE.getBodyComponent_Cnote();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_COMPONENT__NOTE = eINSTANCE.getBodyComponent_Note();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_COMPONENT__BLOCK = eINSTANCE.getBodyComponent_Block();

    /**
     * The meta object literal for the '<em><b>Chord</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_COMPONENT__CHORD = eINSTANCE.getBodyComponent_Chord();

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
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.CustomNoteImpl <em>Custom Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.CustomNoteImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getCustomNote()
     * @generated
     */
    EClass CUSTOM_NOTE = eINSTANCE.getCustomNote();

    /**
     * The meta object literal for the '{@link ufscar.compiladores2.musy.impl.ChordImpl <em>Chord</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ufscar.compiladores2.musy.impl.ChordImpl
     * @see ufscar.compiladores2.musy.impl.MusyPackageImpl#getChord()
     * @generated
     */
    EClass CHORD = eINSTANCE.getChord();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORD_PARAMS__NAME = eINSTANCE.getChordParams_Name();

    /**
     * The meta object literal for the '<em><b>Cnotes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORD_PARAMS__CNOTES = eINSTANCE.getChordParams_Cnotes();

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

  }

} //MusyPackage
