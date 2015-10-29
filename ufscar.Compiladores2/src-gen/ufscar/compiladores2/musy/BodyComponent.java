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
 *   <li>{@link ufscar.compiladores2.musy.BodyComponent#getNote <em>Note</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.BodyComponent#getBlock <em>Block</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.BodyComponent#getCh <em>Ch</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent()
 * @model
 * @generated
 */
public interface BodyComponent extends EObject
{
  /**
   * Returns the value of the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' containment reference.
   * @see #setNote(Note)
   * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent_Note()
   * @model containment="true"
   * @generated
   */
  Note getNote();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.BodyComponent#getNote <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' containment reference.
   * @see #getNote()
   * @generated
   */
  void setNote(Note value);

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
   * Returns the value of the '<em><b>Ch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ch</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ch</em>' reference.
   * @see #setCh(DeclaredChord)
   * @see ufscar.compiladores2.musy.MusyPackage#getBodyComponent_Ch()
   * @model
   * @generated
   */
  DeclaredChord getCh();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.BodyComponent#getCh <em>Ch</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ch</em>' reference.
   * @see #getCh()
   * @generated
   */
  void setCh(DeclaredChord value);

} // BodyComponent
