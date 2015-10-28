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
import ufscar.compiladores2.musy.Chord;
import ufscar.compiladores2.musy.ChordParams;
import ufscar.compiladores2.musy.CustomNote;
import ufscar.compiladores2.musy.CustomNoteParam;
import ufscar.compiladores2.musy.Midi;
import ufscar.compiladores2.musy.MidiBody;
import ufscar.compiladores2.musy.MoreTrackBody;
import ufscar.compiladores2.musy.MusyFactory;
import ufscar.compiladores2.musy.MusyPackage;
import ufscar.compiladores2.musy.Parameter;
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
  private EClass moreTrackBodyEClass = null;

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
  private EClass customNoteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chordEClass = null;

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
  public EReference getMidiBody_Tracks()
  {
    return (EReference)midiBodyEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getParameter_Beat()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Type()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Tsig()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Tn()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Tp()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Octave()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
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
  public EReference getTrack_Tbody()
  {
    return (EReference)trackEClass.getEStructuralFeatures().get(1);
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
  public EReference getTrackBody_Body()
  {
    return (EReference)trackBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrackBody_More()
  {
    return (EReference)trackBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoreTrackBody()
  {
    return moreTrackBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMoreTrackBody_Morebody()
  {
    return (EReference)moreTrackBodyEClass.getEStructuralFeatures().get(0);
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
  public EReference getBodyComponent_Cnote()
  {
    return (EReference)bodyComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyComponent_Note()
  {
    return (EAttribute)bodyComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyComponent_Block()
  {
    return (EReference)bodyComponentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyComponent_Chord()
  {
    return (EReference)bodyComponentEClass.getEStructuralFeatures().get(3);
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
  public EClass getCustomNote()
  {
    return customNoteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChord()
  {
    return chordEClass;
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
  public EAttribute getChordParams_Name()
  {
    return (EAttribute)chordParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChordParams_Cnotes()
  {
    return (EReference)chordParamsEClass.getEStructuralFeatures().get(1);
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
    createEReference(midiBodyEClass, MIDI_BODY__TRACKS);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__BEAT);
    createEAttribute(parameterEClass, PARAMETER__TYPE);
    createEReference(parameterEClass, PARAMETER__TSIG);
    createEAttribute(parameterEClass, PARAMETER__TN);
    createEAttribute(parameterEClass, PARAMETER__TP);
    createEAttribute(parameterEClass, PARAMETER__OCTAVE);

    trackEClass = createEClass(TRACK);
    createEAttribute(trackEClass, TRACK__NAME);
    createEReference(trackEClass, TRACK__TBODY);

    trackBodyEClass = createEClass(TRACK_BODY);
    createEReference(trackBodyEClass, TRACK_BODY__BODY);
    createEReference(trackBodyEClass, TRACK_BODY__MORE);

    moreTrackBodyEClass = createEClass(MORE_TRACK_BODY);
    createEReference(moreTrackBodyEClass, MORE_TRACK_BODY__MOREBODY);

    bodyComponentEClass = createEClass(BODY_COMPONENT);
    createEReference(bodyComponentEClass, BODY_COMPONENT__CNOTE);
    createEAttribute(bodyComponentEClass, BODY_COMPONENT__NOTE);
    createEReference(bodyComponentEClass, BODY_COMPONENT__BLOCK);
    createEReference(bodyComponentEClass, BODY_COMPONENT__CHORD);

    blockEClass = createEClass(BLOCK);
    createEAttribute(blockEClass, BLOCK__NAME);
    createEReference(blockEClass, BLOCK__BLOCKBODY);

    timeSignatureEClass = createEClass(TIME_SIGNATURE);
    createEAttribute(timeSignatureEClass, TIME_SIGNATURE__QUANTITY);
    createEAttribute(timeSignatureEClass, TIME_SIGNATURE__NOTE);

    customNoteEClass = createEClass(CUSTOM_NOTE);

    chordEClass = createEClass(CHORD);

    chordParamsEClass = createEClass(CHORD_PARAMS);
    createEAttribute(chordParamsEClass, CHORD_PARAMS__NAME);
    createEReference(chordParamsEClass, CHORD_PARAMS__CNOTES);

    customNoteParamEClass = createEClass(CUSTOM_NOTE_PARAM);
    createEAttribute(customNoteParamEClass, CUSTOM_NOTE_PARAM__OCTAVE);
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
    customNoteEClass.getESuperTypes().add(this.getChordParams());
    chordParamsEClass.getESuperTypes().add(this.getChord());
    customNoteParamEClass.getESuperTypes().add(this.getCustomNote());

    // Initialize classes and features; add operations and parameters
    initEClass(midiEClass, Midi.class, "Midi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMidi_Name(), ecorePackage.getEString(), "name", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMidi_Body(), this.getMidiBody(), null, "body", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(midiBodyEClass, MidiBody.class, "MidiBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMidiBody_Param(), this.getParameter(), null, "param", null, 0, -1, MidiBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMidiBody_Tracks(), this.getTrack(), null, "tracks", null, 0, -1, MidiBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Beat(), ecorePackage.getEInt(), "beat", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Tsig(), this.getTimeSignature(), null, "tsig", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Tn(), ecorePackage.getEString(), "tn", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Tp(), ecorePackage.getEString(), "tp", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Octave(), ecorePackage.getEInt(), "octave", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrack_Name(), ecorePackage.getEString(), "name", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrack_Tbody(), this.getTrackBody(), null, "tbody", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trackBodyEClass, TrackBody.class, "TrackBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrackBody_Body(), this.getBodyComponent(), null, "body", null, 0, 1, TrackBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrackBody_More(), this.getMoreTrackBody(), null, "more", null, 0, 1, TrackBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moreTrackBodyEClass, MoreTrackBody.class, "MoreTrackBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMoreTrackBody_Morebody(), this.getBodyComponent(), null, "morebody", null, 0, -1, MoreTrackBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyComponentEClass, BodyComponent.class, "BodyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBodyComponent_Cnote(), this.getCustomNote(), null, "cnote", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBodyComponent_Note(), ecorePackage.getEString(), "note", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyComponent_Block(), this.getBlock(), null, "block", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyComponent_Chord(), this.getChord(), null, "chord", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlock_Blockbody(), this.getTrackBody(), null, "blockbody", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeSignatureEClass, TimeSignature.class, "TimeSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeSignature_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, TimeSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeSignature_Note(), ecorePackage.getEInt(), "note", null, 0, 1, TimeSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customNoteEClass, CustomNote.class, "CustomNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(chordEClass, Chord.class, "Chord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(chordParamsEClass, ChordParams.class, "ChordParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChordParams_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChordParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChordParams_Cnotes(), this.getCustomNote(), null, "cnotes", null, 0, -1, ChordParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customNoteParamEClass, CustomNoteParam.class, "CustomNoteParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomNoteParam_Octave(), ecorePackage.getEInt(), "octave", null, 0, 1, CustomNoteParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MusyPackageImpl
