/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Note Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.CustomNoteParam#getOctave <em>Octave</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.CustomNoteParam#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getCustomNoteParam()
 * @model
 * @generated
 */
public interface CustomNoteParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Octave</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Octave</em>' attribute.
   * @see #setOctave(int)
   * @see ufscar.compiladores2.musy.MusyPackage#getCustomNoteParam_Octave()
   * @model
   * @generated
   */
  int getOctave();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.CustomNoteParam#getOctave <em>Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Octave</em>' attribute.
   * @see #getOctave()
   * @generated
   */
  void setOctave(int value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getCustomNoteParam_Duration()
   * @model
   * @generated
   */
  String getDuration();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.CustomNoteParam#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(String value);

} // CustomNoteParam
