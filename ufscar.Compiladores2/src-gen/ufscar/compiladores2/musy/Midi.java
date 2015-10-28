/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Midi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.Midi#getName <em>Name</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Midi#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getMidi()
 * @model
 * @generated
 */
public interface Midi extends EObject
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
   * @see ufscar.compiladores2.musy.MusyPackage#getMidi_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Midi#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(MidiBody)
   * @see ufscar.compiladores2.musy.MusyPackage#getMidi_Body()
   * @model containment="true"
   * @generated
   */
  MidiBody getBody();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Midi#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(MidiBody value);

} // Midi
