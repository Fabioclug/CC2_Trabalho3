/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.BodyComponent#getCnote <em>Cnote</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.BodyComponent#getNote <em>Note</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.BodyComponent#getBlock <em>Block</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.BodyComponent#getChord <em>Chord</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent()
 * @model
 * @generated
 */
public interface BodyComponent extends EObject
{
  /**
   * Returns the value of the '<em><b>Cnote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnote</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnote</em>' containment reference.
   * @see #setCnote(CustomNote)
   * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent_Cnote()
   * @model containment="true"
   * @generated
   */
  CustomNote getCnote();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.BodyComponent#getCnote <em>Cnote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnote</em>' containment reference.
   * @see #getCnote()
   * @generated
   */
  void setCnote(CustomNote value);

  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see #setNote(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.BodyComponent#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.BodyComponent#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

  /**
   * Returns the value of the '<em><b>Chord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chord</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chord</em>' containment reference.
   * @see #setChord(Chord)
   * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent_Chord()
   * @model containment="true"
   * @generated
   */
  Chord getChord();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.BodyComponent#getChord <em>Chord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chord</em>' containment reference.
   * @see #getChord()
   * @generated
   */
  void setChord(Chord value);

} // BodyComponent
