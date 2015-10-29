/**
 */
package ufscar.compiladores2.musy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Time Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.ParameterTimeSignature#getTsig <em>Tsig</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getParameterTimeSignature()
 * @model
 * @generated
 */
public interface ParameterTimeSignature extends Parameter
{
  /**
   * Returns the value of the '<em><b>Tsig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tsig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tsig</em>' containment reference.
   * @see #setTsig(TimeSignature)
   * @see ufscar.compiladores2.musy.MusyPackage#getParameterTimeSignature_Tsig()
   * @model containment="true"
   * @generated
   */
  TimeSignature getTsig();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.ParameterTimeSignature#getTsig <em>Tsig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tsig</em>' containment reference.
   * @see #getTsig()
   * @generated
   */
  void setTsig(TimeSignature value);

} // ParameterTimeSignature
