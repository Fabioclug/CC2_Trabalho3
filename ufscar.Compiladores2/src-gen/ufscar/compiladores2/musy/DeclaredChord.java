/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Chord</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.DeclaredChord#getCp <em>Cp</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.DeclaredChord#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getDeclaredChord()
 * @model
 * @generated
 */
public interface DeclaredChord extends EObject
{
  /**
   * Returns the value of the '<em><b>Cp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cp</em>' containment reference.
   * @see #setCp(ChordParams)
   * @see ufscar.compiladores2.musy.MusyPackage#getDeclaredChord_Cp()
   * @model containment="true"
   * @generated
   */
  ChordParams getCp();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.DeclaredChord#getCp <em>Cp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cp</em>' containment reference.
   * @see #getCp()
   * @generated
   */
  void setCp(ChordParams value);

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
   * @see ufscar.compiladores2.musy.MusyPackage#getDeclaredChord_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.DeclaredChord#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DeclaredChord
