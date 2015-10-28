/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.Block#getName <em>Name</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Block#getBlockbody <em>Blockbody</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
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
   * @see ufscar.compiladores2.musy.MusyPackage#getBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Block#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Blockbody</b></em>' containment reference list.
   * The list contents are of type {@link ufscar.compiladores2.musy.TrackBody}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blockbody</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blockbody</em>' containment reference list.
   * @see ufscar.compiladores2.musy.MusyPackage#getBlock_Blockbody()
   * @model containment="true"
   * @generated
   */
  EList<TrackBody> getBlockbody();

} // Block
