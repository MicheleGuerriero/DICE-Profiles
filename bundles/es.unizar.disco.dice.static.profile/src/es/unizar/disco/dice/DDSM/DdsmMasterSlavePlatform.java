/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Master Slave Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform#getMasterHost <em>Master Host</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmMasterSlavePlatform()
 * @model
 * @generated
 */
public interface DdsmMasterSlavePlatform extends DdsmInternalComponent {
	/**
	 * Returns the value of the '<em><b>Master Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Host</em>' reference.
	 * @see #setMasterHost(DdsmVMsCluster)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmMasterSlavePlatform_MasterHost()
	 * @model ordered="false"
	 * @generated
	 */
	DdsmVMsCluster getMasterHost();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform#getMasterHost <em>Master Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Host</em>' reference.
	 * @see #getMasterHost()
	 * @generated
	 */
	void setMasterHost(DdsmVMsCluster value);

} // DdsmMasterSlavePlatform
