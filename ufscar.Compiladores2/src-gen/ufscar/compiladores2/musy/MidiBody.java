/**
 */
package ufscar.compiladores2.musy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Midi Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufscar.compiladores2.musy.MidiBody#getParam <em>Param</em>}</li>
 *   <li>{@link ufscar.compiladores2.musy.MidiBody#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see ufscar.compiladores2.musy.MusyPackage#getMidiBody()
 * @model
 * @generated
 */
public interface MidiBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link ufscar.compiladores2.musy.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see ufscar.compiladores2.musy.MusyPackage#getMidiBody_Param()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParam();

  /**
   * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
   * The list contents are of type {@link ufscar.compiladores2.musy.Track}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tracks</em>' containment reference list.
   * @see ufscar.compiladores2.musy.MusyPackage#getMidiBody_Tracks()
   * @model containment="true"
   * @generated
   */
  EList<Track> getTracks();

} // MidiBody
