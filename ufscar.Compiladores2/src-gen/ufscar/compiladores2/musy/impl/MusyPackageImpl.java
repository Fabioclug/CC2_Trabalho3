/**
 */
package ufscar.compiladores2.musy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ufscar.compiladores2.musy.Block;
import ufscar.compiladores2.musy.BodyComponent;
import ufscar.compiladores2.musy.ChordParams;
import ufscar.compiladores2.musy.CustomNoteParam;
import ufscar.compiladores2.musy.DeclaredChord;
import ufscar.compiladores2.musy.Midi;
import ufscar.compiladores2.musy.MidiBody;
import ufscar.compiladores2.musy.MusyFactory;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.Note;
import ufscar.compiladores2.musy.Parameter;
import ufscar.compiladores2.musy.ParameterBeat;
import ufscar.compiladores2.musy.ParameterOctave;
import ufscar.compiladores2.musy.ParameterTimeNote;
import ufscar.compiladores2.musy.ParameterTimePause;
import ufscar.compiladores2.musy.ParameterTimeSignature;
import ufscar.compiladores2.musy.TimeSignature;
import ufscar.compiladores2.musy.Track;
import ufscar.compiladores2.musy.TrackBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusyPackageImpl extends EPackageImpl implements MusyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass midiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass midiBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterBeatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTimeSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTimeNoteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTimePauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterOctaveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaredChordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trackEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trackBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chordParamsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customNoteParamEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ufscar.compiladores2.musy.MusyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MusyPackageImpl()
  {
    super(eNS_URI, MusyFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MusyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MusyPackage init()
  {
    if (isInited) return (MusyPackage)EPackage.Registry.INSTANCE.getEPackage(MusyPackage.eNS_URI);

    // Obtain or create and register package
    MusyPackageImpl theMusyPackage = (MusyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MusyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MusyPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMusyPackage.createPackageContents();

    // Initialize created meta-data
    theMusyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMusyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MusyPackage.eNS_URI, theMusyPackage);
    return theMusyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMidi()
  {
    return midiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMidi_Name()
  {
    return (EAttribute)midiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMidi_Body()
  {
    return (EReference)midiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMidiBody()
  {
    return midiBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMidiBody_Param()
  {
    return (EReference)midiBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMidiBody_Chords()
  {
    return (EReference)midiBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMidiBody_Tracks()
  {
    return (EReference)midiBodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterBeat()
  {
    return parameterBeatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterBeat_Beat()
  {
    return (EAttribute)parameterBeatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterTimeSignature()
  {
    return parameterTimeSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterTimeSignature_Tsig()
  {
    return (EReference)parameterTimeSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterTimeNote()
  {
    return parameterTimeNoteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterTimeNote_Tn()
  {
    return (EAttribute)parameterTimeNoteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterTimePause()
  {
    return parameterTimePauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterTimePause_Tp()
  {
    return (EAttribute)parameterTimePauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterOctave()
  {
    return parameterOctaveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterOctave_Octave()
  {
    return (EAttribute)parameterOctaveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaredChord()
  {
    return declaredChordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclaredChord_Cp()
  {
    return (EReference)declaredChordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaredChord_Name()
  {
    return (EAttribute)declaredChordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrack()
  {
    return trackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrack_Name()
  {
    return (EAttribute)trackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrack_I()
  {
    return (EAttribute)trackEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrack_Tbody()
  {
    return (EReference)trackEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrackBody()
  {
    return trackBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrackBody_Bc()
  {
    return (EReference)trackBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyComponent()
  {
    return bodyComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyComponent_Note()
  {
    return (EReference)bodyComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyComponent_Block()
  {
    return (EReference)bodyComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyComponent_Ch()
  {
    return (EReference)bodyComponentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlock_Name()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Blockbody()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeSignature()
  {
    return timeSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSignature_Quantity()
  {
    return (EAttribute)timeSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSignature_Note()
  {
    return (EAttribute)timeSignatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChordParams()
  {
    return chordParamsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChordParams_Cnote()
  {
    return (EReference)chordParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNote()
  {
    return noteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNote_Nl()
  {
    return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNote_Acc()
  {
    return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNote_Cnp()
  {
    return (EReference)noteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomNoteParam()
  {
    return customNoteParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomNoteParam_Octave()
  {
    return (EAttribute)customNoteParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomNoteParam_Duration()
  {
    return (EAttribute)customNoteParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusyFactory getMusyFactory()
  {
    return (MusyFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    midiEClass = createEClass(MIDI);
    createEAttribute(midiEClass, MIDI__NAME);
    createEReference(midiEClass, MIDI__BODY);

    midiBodyEClass = createEClass(MIDI_BODY);
    createEReference(midiBodyEClass, MIDI_BODY__PARAM);
    createEReference(midiBodyEClass, MIDI_BODY__CHORDS);
    createEReference(midiBodyEClass, MIDI_BODY__TRACKS);

    parameterEClass = createEClass(PARAMETER);

    parameterBeatEClass = createEClass(PARAMETER_BEAT);
    createEAttribute(parameterBeatEClass, PARAMETER_BEAT__BEAT);

    parameterTimeSignatureEClass = createEClass(PARAMETER_TIME_SIGNATURE);
    createEReference(parameterTimeSignatureEClass, PARAMETER_TIME_SIGNATURE__TSIG);

    parameterTimeNoteEClass = createEClass(PARAMETER_TIME_NOTE);
    createEAttribute(parameterTimeNoteEClass, PARAMETER_TIME_NOTE__TN);

    parameterTimePauseEClass = createEClass(PARAMETER_TIME_PAUSE);
    createEAttribute(parameterTimePauseEClass, PARAMETER_TIME_PAUSE__TP);

    parameterOctaveEClass = createEClass(PARAMETER_OCTAVE);
    createEAttribute(parameterOctaveEClass, PARAMETER_OCTAVE__OCTAVE);

    declaredChordEClass = createEClass(DECLARED_CHORD);
    createEReference(declaredChordEClass, DECLARED_CHORD__CP);
    createEAttribute(declaredChordEClass, DECLARED_CHORD__NAME);

    trackEClass = createEClass(TRACK);
    createEAttribute(trackEClass, TRACK__NAME);
    createEAttribute(trackEClass, TRACK__I);
    createEReference(trackEClass, TRACK__TBODY);

    trackBodyEClass = createEClass(TRACK_BODY);
    createEReference(trackBodyEClass, TRACK_BODY__BC);

    bodyComponentEClass = createEClass(BODY_COMPONENT);
    createEReference(bodyComponentEClass, BODY_COMPONENT__NOTE);
    createEReference(bodyComponentEClass, BODY_COMPONENT__BLOCK);
    createEReference(bodyComponentEClass, BODY_COMPONENT__CH);

    blockEClass = createEClass(BLOCK);
    createEAttribute(blockEClass, BLOCK__NAME);
    createEReference(blockEClass, BLOCK__BLOCKBODY);

    timeSignatureEClass = createEClass(TIME_SIGNATURE);
    createEAttribute(timeSignatureEClass, TIME_SIGNATURE__QUANTITY);
    createEAttribute(timeSignatureEClass, TIME_SIGNATURE__NOTE);

    chordParamsEClass = createEClass(CHORD_PARAMS);
    createEReference(chordParamsEClass, CHORD_PARAMS__CNOTE);

    noteEClass = createEClass(NOTE);
    createEAttribute(noteEClass, NOTE__NL);
    createEAttribute(noteEClass, NOTE__ACC);
    createEReference(noteEClass, NOTE__CNP);

    customNoteParamEClass = createEClass(CUSTOM_NOTE_PARAM);
    createEAttribute(customNoteParamEClass, CUSTOM_NOTE_PARAM__OCTAVE);
    createEAttribute(customNoteParamEClass, CUSTOM_NOTE_PARAM__DURATION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    parameterBeatEClass.getESuperTypes().add(this.getParameter());
    parameterTimeSignatureEClass.getESuperTypes().add(this.getParameter());
    parameterTimeNoteEClass.getESuperTypes().add(this.getParameter());
    parameterTimePauseEClass.getESuperTypes().add(this.getParameter());
    parameterOctaveEClass.getESuperTypes().add(this.getParameter());

    // Initialize classes and features; add operations and parameters
    initEClass(midiEClass, Midi.class, "Midi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMidi_Name(), ecorePackage.getEString(), "name", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMidi_Body(), this.getMidiBody(), null, "body", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(midiBodyEClass, MidiBody.class, "MidiBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMidiBody_Param(), this.getParameter(), null, "param", null, 0, -1, MidiBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMidiBody_Chords(), this.getDeclaredChord(), null, "chords", null, 0, -1, MidiBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMidiBody_Tracks(), this.getTrack(), null, "tracks", null, 0, -1, MidiBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterBeatEClass, ParameterBeat.class, "ParameterBeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterBeat_Beat(), ecorePackage.getEInt(), "beat", null, 0, 1, ParameterBeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterTimeSignatureEClass, ParameterTimeSignature.class, "ParameterTimeSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterTimeSignature_Tsig(), this.getTimeSignature(), null, "tsig", null, 0, 1, ParameterTimeSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterTimeNoteEClass, ParameterTimeNote.class, "ParameterTimeNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterTimeNote_Tn(), ecorePackage.getEString(), "tn", null, 0, 1, ParameterTimeNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterTimePauseEClass, ParameterTimePause.class, "ParameterTimePause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterTimePause_Tp(), ecorePackage.getEString(), "tp", null, 0, 1, ParameterTimePause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterOctaveEClass, ParameterOctave.class, "ParameterOctave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterOctave_Octave(), ecorePackage.getEInt(), "octave", null, 0, 1, ParameterOctave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaredChordEClass, DeclaredChord.class, "DeclaredChord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaredChord_Cp(), this.getChordParams(), null, "cp", null, 0, 1, DeclaredChord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaredChord_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeclaredChord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrack_Name(), ecorePackage.getEString(), "name", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrack_I(), ecorePackage.getEString(), "i", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrack_Tbody(), this.getTrackBody(), null, "tbody", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trackBodyEClass, TrackBody.class, "TrackBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrackBody_Bc(), this.getBodyComponent(), null, "bc", null, 0, -1, TrackBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyComponentEClass, BodyComponent.class, "BodyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBodyComponent_Note(), this.getNote(), null, "note", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyComponent_Block(), this.getBlock(), null, "block", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyComponent_Ch(), this.getDeclaredChord(), null, "ch", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlock_Blockbody(), this.getTrackBody(), null, "blockbody", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeSignatureEClass, TimeSignature.class, "TimeSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeSignature_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, TimeSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeSignature_Note(), ecorePackage.getEInt(), "note", null, 0, 1, TimeSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chordParamsEClass, ChordParams.class, "ChordParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChordParams_Cnote(), this.getNote(), null, "cnote", null, 0, -1, ChordParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNote_Nl(), ecorePackage.getEString(), "nl", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNote_Acc(), ecorePackage.getEString(), "acc", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNote_Cnp(), this.getCustomNoteParam(), null, "cnp", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customNoteParamEClass, CustomNoteParam.class, "CustomNoteParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomNoteParam_Octave(), ecorePackage.getEInt(), "octave", null, 0, 1, CustomNoteParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomNoteParam_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, CustomNoteParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MusyPackageImpl
