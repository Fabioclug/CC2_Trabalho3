/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.TimeSignature#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.TimeSignature#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getTimeSignature()
 * @model
 * @generated
 */
public interface TimeSignature extends EObject
{
  /**
   * Returns the value of the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' attribute.
   * @see #setQuantity(int)
   * @see ufscar.compiladores2.musy.MusyPackage#getTimeSignature_Quantity()
   * @model
   * @generated
   */
  int getQuantity();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.TimeSignature#getQuantity <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' attribute.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(int value);

  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see #setNote(int)
   * @see ufscar.compiladores2.musy.MusyPackage#getTimeSignature_Note()
   * @model
   * @generated
   */
  int getNote();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.TimeSignature#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(int value);

} // TimeSignature
