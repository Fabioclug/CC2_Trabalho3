/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link ufscar.compiladores2.musy.TrackBody#getBc <em>Bc</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getTrackBody()
 * @model
 * @generated
 */
public interface TrackBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Bc</b></em>' containment reference list.
   * The list contents are of type {@link ufscar.compiladores2.musy.BodyComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bc</em>' containment reference list.
   * @see ufscar.compiladores2.musy.MusyPackage#getTrackBody_Bc()
   * @model containment="true"
   * @generated
   */
  EList<BodyComponent> getBc();

} // TrackBody
