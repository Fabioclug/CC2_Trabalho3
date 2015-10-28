/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.TrackBody#getBody <em>Body</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.TrackBody#getMore <em>More</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getTrackBody()
 * @model
 * @generated
 */
public interface TrackBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(BodyComponent)
   * @see ufscar.compiladores2.musy.MusyPackage#getTrackBody_Body()
   * @model containment="true"
   * @generated
   */
  BodyComponent getBody();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.TrackBody#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BodyComponent value);

  /**
   * Returns the value of the '<em><b>More</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>More</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>More</em>' containment reference.
   * @see #setMore(MoreTrackBody)
   * @see ufscar.compiladores2.musy.MusyPackage#getTrackBody_More()
   * @model containment="true"
   * @generated
   */
  MoreTrackBody getMore();

  /**
   * Sets the value of the '{@link ufscar.compiladores2.musy.TrackBody#getMore <em>More</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>More</em>' containment reference.
   * @see #getMore()
   * @generated
   */
  void setMore(MoreTrackBody value);

} // TrackBody
