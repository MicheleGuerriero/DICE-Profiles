/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Kafka Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster()
 * @model
 * @generated
 */
public interface DdsmKafkaCluster extends DdsmPeerToPeerPlatform {
	/**
	 * Returns the value of the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Execution Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Execution Environment</em>' reference.
	 * @see #setBase_ExecutionEnvironment(ExecutionEnvironment)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Base_ExecutionEnvironment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionEnvironment getBase_ExecutionEnvironment();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Execution Environment</em>' reference.
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 */
	void setBase_ExecutionEnvironment(ExecutionEnvironment value);

} // DdsmKafkaCluster
