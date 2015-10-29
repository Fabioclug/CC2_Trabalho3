/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.Note#getNl <em>Nl</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Note#getAcc <em>Acc</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Note#getCnp <em>Cnp</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject
{
  /**
   * Returns the value of the '<em><b>Nl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nl</em>' attribute.
   * @see #setNl(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getNote_Nl()
   * @model
   * @generated
   */
  String getNl();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Note#getNl <em>Nl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nl</em>' attribute.
   * @see #getNl()
   * @generated
   */
  void setNl(String value);

  /**
   * Returns the value of the '<em><b>Acc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acc</em>' attribute.
   * @see #setAcc(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getNote_Acc()
   * @model
   * @generated
   */
  String getAcc();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Note#getAcc <em>Acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acc</em>' attribute.
   * @see #getAcc()
   * @generated
   */
  void setAcc(String value);

  /**
   * Returns the value of the '<em><b>Cnp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnp</em>' containment reference.
   * @see #setCnp(CustomNoteParam)
   * @see ufscar.compiladores2.musy.MusyPackage#getNote_Cnp()
   * @model containment="true"
   * @generated
   */
  CustomNoteParam getCnp();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Note#getCnp <em>Cnp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnp</em>' containment reference.
   * @see #getCnp()
   * @generated
   */
  void setCnp(CustomNoteParam value);

} // Note
