/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>More Track Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.MoreTrackBody#getMorebody <em>Morebody</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getMoreTrackBody()
 * @model
 * @generated
 */
public interface MoreTrackBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Morebody</b></em>' containment reference list.
   * The list contents are of type {@link ufscar.compiladores2.musy.BodyComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Morebody</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Morebody</em>' containment reference list.
   * @see ufscar.compiladores2.musy.MusyPackage#getMoreTrackBody_Morebody()
   * @model containment="true"
   * @generated
   */
  EList<BodyComponent> getMorebody();

} // MoreTrackBody
