/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chord Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.ChordParams#getCnote <em>Cnote</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getChordParams()
 * @model
 * @generated
 */
public interface ChordParams extends EObject
{
  /**
   * Returns the value of the '<em><b>Cnote</b></em>' containment reference list.
   * The list contents are of type {@link ufscar.compiladores2.musy.Note}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnote</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnote</em>' containment reference list.
   * @see ufscar.compiladores2.musy.MusyPackage#getChordParams_Cnote()
   * @model containment="true"
   * @generated
   */
  EList<Note> getCnote();

} // ChordParams
