/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.Track#getName <em>Name</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.Track#getTbody <em>Tbody</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends EObject
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
   * @see ufscar.compiladores2.musy.MusyPackage#getTrack_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Track#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tbody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tbody</em>' containment reference.
   * @see #setTbody(TrackBody)
   * @see ufscar.compiladores2.musy.MusyPackage#getTrack_Tbody()
   * @model containment="true"
   * @generated
   */
  TrackBody getTbody();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.Track#getTbody <em>Tbody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tbody</em>' containment reference.
   * @see #getTbody()
   * @generated
   */
  void setTbody(TrackBody value);

} // Track
