/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chord Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.ChordParams#getName <em>Name</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.ChordParams#getCnotes <em>Cnotes</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getChordParams()
 * @model
 * @generated
 */
public interface ChordParams extends Chord
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getChordParams_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.ChordParams#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cnotes</b></em>' containment reference list.
   * The list contents are of type {@link ufscar.compiladores2.musy.CustomNote}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnotes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnotes</em>' containment reference list.
   * @see ufscar.compiladores2.musy.MusyPackage#getChordParams_Cnotes()
   * @model containment="true"
   * @generated
   */
  EList<CustomNote> getCnotes();

} // ChordParams
