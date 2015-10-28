/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ufscar.compiladores2.musy.MusyPackage
 * @generated
 */
public interface MusyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MusyFactory eINSTANCE = ufscar.compiladores2.musy.impl.MusyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Midi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Midi</em>'.
   * @generated
   */
  Midi createMidi();

  /**
   * Returns a new object of class '<em>Midi Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Midi Body</em>'.
   * @generated
   */
  MidiBody createMidiBody();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Track</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Track</em>'.
   * @generated
   */
  Track createTrack();

  /**
   * Returns a new object of class '<em>Track Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Track Body</em>'.
   * @generated
   */
  TrackBody createTrackBody();

  /**
   * Returns a new object of class '<em>More Track Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More Track Body</em>'.
   * @generated
   */
  MoreTrackBody createMoreTrackBody();

  /**
   * Returns a new object of class '<em>Body Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Component</em>'.
   * @generated
   */
  BodyComponent createBodyComponent();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Time Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Signature</em>'.
   * @generated
   */
  TimeSignature createTimeSignature();

  /**
   * Returns a new object of class '<em>Custom Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Note</em>'.
   * @generated
   */
  CustomNote createCustomNote();

  /**
   * Returns a new object of class '<em>Chord</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chord</em>'.
   * @generated
   */
  Chord createChord();

  /**
   * Returns a new object of class '<em>Chord Params</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chord Params</em>'.
   * @generated
   */
  ChordParams createChordParams();

  /**
   * Returns a new object of class '<em>Custom Note Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Note Param</em>'.
   * @generated
   */
  CustomNoteParam createCustomNoteParam();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MusyPackage getMusyPackage();

} //MusyFactory
