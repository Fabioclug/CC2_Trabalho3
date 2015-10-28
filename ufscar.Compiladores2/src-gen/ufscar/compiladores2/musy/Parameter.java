/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.Parameter#getBeat <em>Beat</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Parameter#getTsig <em>Tsig</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Parameter#getTn <em>Tn</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Parameter#getTp <em>Tp</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Parameter#getOctave <em>Octave</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Beat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beat</em>' attribute.
   * @see #setBeat(int)
   * @see ufscar.compiladores2.musy.MusyPackage#getParameter_Beat()
   * @model
   * @generated
   */
  int getBeat();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Parameter#getBeat <em>Beat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beat</em>' attribute.
   * @see #getBeat()
   * @generated
   */
  void setBeat(int value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getParameter_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Parameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see ufscar.compiladores2.musy.MusyPackage#getParameter_Tsig()
   * @model containment="true"
   * @generated
   */
  TimeSignature getTsig();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Parameter#getTsig <em>Tsig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tsig</em>' containment reference.
   * @see #getTsig()
   * @generated
   */
  void setTsig(TimeSignature value);

  /**
   * Returns the value of the '<em><b>Tn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tn</em>' attribute.
   * @see #setTn(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getParameter_Tn()
   * @model
   * @generated
   */
  String getTn();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Parameter#getTn <em>Tn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tn</em>' attribute.
   * @see #getTn()
   * @generated
   */
  void setTn(String value);

  /**
   * Returns the value of the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp</em>' attribute.
   * @see #setTp(String)
   * @see ufscar.compiladores2.musy.MusyPackage#getParameter_Tp()
   * @model
   * @generated
   */
  String getTp();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Parameter#getTp <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp</em>' attribute.
   * @see #getTp()
   * @generated
   */
  void setTp(String value);

  /**
   * Returns the value of the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Octave</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Octave</em>' attribute.
   * @see #setOctave(int)
   * @see ufscar.compiladores2.musy.MusyPackage#getParameter_Octave()
   * @model
   * @generated
   */
  int getOctave();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Parameter#getOctave <em>Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Octave</em>' attribute.
   * @see #getOctave()
   * @generated
   */
  void setOctave(int value);

} // Parameter
