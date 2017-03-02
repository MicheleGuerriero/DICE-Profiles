/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.uml2.uml.CommunicationPath;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmPort#isLocal <em>Is Local</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmPort#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmPort#getBase_CommunicationPath <em>Base Communication Path</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmPort()
 * @model
 * @generated
 */
public interface DdsmPort extends DdsmCloudElement {
	/**
	 * Returns the value of the '<em><b>Is Local</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Local</em>' attribute.
	 * @see #setIsLocal(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmPort_IsLocal()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmPort#isLocal <em>Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setIsLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmPort_PortNumber()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPortNumber();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmPort#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(String value);

	/**
	 * Returns the value of the '<em><b>Base Communication Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Communication Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Communication Path</em>' reference.
	 * @see #setBase_CommunicationPath(CommunicationPath)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmPort_Base_CommunicationPath()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CommunicationPath getBase_CommunicationPath();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmPort#getBase_CommunicationPath <em>Base Communication Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Communication Path</em>' reference.
	 * @see #getBase_CommunicationPath()
	 * @generated
	 */
	void setBase_CommunicationPath(CommunicationPath value);

} // DdsmPort
