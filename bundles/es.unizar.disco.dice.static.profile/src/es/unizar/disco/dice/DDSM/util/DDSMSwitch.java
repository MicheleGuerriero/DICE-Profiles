/**
 */
package es.unizar.disco.dice.DDSM.util;

import es.unizar.disco.dice.DDSM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMPackage
 * @generated
 */
public class DDSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DDSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMSwitch() {
		if (modelPackage == null) {
			modelPackage = DDSMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT: {
				DdsmExternalComponent ddsmExternalComponent = (DdsmExternalComponent)theEObject;
				T result = caseDdsmExternalComponent(ddsmExternalComponent);
				if (result == null) result = caseDdsmComponent(ddsmExternalComponent);
				if (result == null) result = caseDdsmCloudElement(ddsmExternalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_COMPONENT: {
				DdsmComponent ddsmComponent = (DdsmComponent)theEObject;
				T result = caseDdsmComponent(ddsmComponent);
				if (result == null) result = caseDdsmCloudElement(ddsmComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_CLOUD_ELEMENT: {
				DdsmCloudElement ddsmCloudElement = (DdsmCloudElement)theEObject;
				T result = caseDdsmCloudElement(ddsmCloudElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_PORT: {
				DdsmPort ddsmPort = (DdsmPort)theEObject;
				T result = caseDdsmPort(ddsmPort);
				if (result == null) result = caseDdsmCloudElement(ddsmPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_INTERNAL_COMPONENT: {
				DdsmInternalComponent ddsmInternalComponent = (DdsmInternalComponent)theEObject;
				T result = caseDdsmInternalComponent(ddsmInternalComponent);
				if (result == null) result = caseDdsmComponent(ddsmInternalComponent);
				if (result == null) result = caseDdsmCloudElement(ddsmInternalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_HETEROGENEOUS_CLUSTER: {
				DdsmHeterogeneousCluster ddsmHeterogeneousCluster = (DdsmHeterogeneousCluster)theEObject;
				T result = caseDdsmHeterogeneousCluster(ddsmHeterogeneousCluster);
				if (result == null) result = caseDdsmExternalComponent(ddsmHeterogeneousCluster);
				if (result == null) result = caseDdsmComponent(ddsmHeterogeneousCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmHeterogeneousCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_VMS_CLUSTER: {
				DdsmVMsCluster ddsmVMsCluster = (DdsmVMsCluster)theEObject;
				T result = caseDdsmVMsCluster(ddsmVMsCluster);
				if (result == null) result = caseDdsmExternalComponent(ddsmVMsCluster);
				if (result == null) result = caseDdsmComponent(ddsmVMsCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmVMsCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_YARN_CLUSTER: {
				DdsmYarnCluster ddsmYarnCluster = (DdsmYarnCluster)theEObject;
				T result = caseDdsmYarnCluster(ddsmYarnCluster);
				if (result == null) result = caseDdsmMasterSlavePlatform(ddsmYarnCluster);
				if (result == null) result = caseDdsmInternalComponent(ddsmYarnCluster);
				if (result == null) result = caseDdsmComponent(ddsmYarnCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmYarnCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM: {
				DdsmMasterSlavePlatform ddsmMasterSlavePlatform = (DdsmMasterSlavePlatform)theEObject;
				T result = caseDdsmMasterSlavePlatform(ddsmMasterSlavePlatform);
				if (result == null) result = caseDdsmInternalComponent(ddsmMasterSlavePlatform);
				if (result == null) result = caseDdsmComponent(ddsmMasterSlavePlatform);
				if (result == null) result = caseDdsmCloudElement(ddsmMasterSlavePlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_ZOOKEEPER_CLUSTER: {
				DdsmZookeeperCluster ddsmZookeeperCluster = (DdsmZookeeperCluster)theEObject;
				T result = caseDdsmZookeeperCluster(ddsmZookeeperCluster);
				if (result == null) result = caseDdsmPeerToPeerPlatform(ddsmZookeeperCluster);
				if (result == null) result = caseDdsmInternalComponent(ddsmZookeeperCluster);
				if (result == null) result = caseDdsmComponent(ddsmZookeeperCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmZookeeperCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_PEER_TO_PEER_PLATFORM: {
				DdsmPeerToPeerPlatform ddsmPeerToPeerPlatform = (DdsmPeerToPeerPlatform)theEObject;
				T result = caseDdsmPeerToPeerPlatform(ddsmPeerToPeerPlatform);
				if (result == null) result = caseDdsmInternalComponent(ddsmPeerToPeerPlatform);
				if (result == null) result = caseDdsmComponent(ddsmPeerToPeerPlatform);
				if (result == null) result = caseDdsmCloudElement(ddsmPeerToPeerPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_KAFKA_CLUSTER: {
				DdsmKafkaCluster ddsmKafkaCluster = (DdsmKafkaCluster)theEObject;
				T result = caseDdsmKafkaCluster(ddsmKafkaCluster);
				if (result == null) result = caseDdsmPeerToPeerPlatform(ddsmKafkaCluster);
				if (result == null) result = caseDdsmInternalComponent(ddsmKafkaCluster);
				if (result == null) result = caseDdsmComponent(ddsmKafkaCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmKafkaCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_STORM_CLUSTER: {
				DdsmStormCluster ddsmStormCluster = (DdsmStormCluster)theEObject;
				T result = caseDdsmStormCluster(ddsmStormCluster);
				if (result == null) result = caseDdsmMasterSlavePlatform(ddsmStormCluster);
				if (result == null) result = caseDdsmInternalComponent(ddsmStormCluster);
				if (result == null) result = caseDdsmComponent(ddsmStormCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmStormCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_JOB_SUBMISSION: {
				DdsmJobSubmission ddsmJobSubmission = (DdsmJobSubmission)theEObject;
				T result = caseDdsmJobSubmission(ddsmJobSubmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_BIG_DATA_JOB: {
				DdsmBigDataJob ddsmBigDataJob = (DdsmBigDataJob)theEObject;
				T result = caseDdsmBigDataJob(ddsmBigDataJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_JOB_DEPLOYED_FROM: {
				DdsmJobDeployedFrom ddsmJobDeployedFrom = (DdsmJobDeployedFrom)theEObject;
				T result = caseDdsmJobDeployedFrom(ddsmJobDeployedFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_HDFS_CLUSTER: {
				DdsmHdfsCluster ddsmHdfsCluster = (DdsmHdfsCluster)theEObject;
				T result = caseDdsmHdfsCluster(ddsmHdfsCluster);
				if (result == null) result = caseDdsmMasterSlavePlatform(ddsmHdfsCluster);
				if (result == null) result = caseDdsmInternalComponent(ddsmHdfsCluster);
				if (result == null) result = caseDdsmComponent(ddsmHdfsCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmHdfsCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER: {
				DdsmCassandraCluster ddsmCassandraCluster = (DdsmCassandraCluster)theEObject;
				T result = caseDdsmCassandraCluster(ddsmCassandraCluster);
				if (result == null) result = caseDdsmPeerToPeerPlatform(ddsmCassandraCluster);
				if (result == null) result = caseDdsmInternalComponent(ddsmCassandraCluster);
				if (result == null) result = caseDdsmComponent(ddsmCassandraCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmCassandraCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm External Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm External Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmExternalComponent(DdsmExternalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmComponent(DdsmComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Cloud Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Cloud Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmCloudElement(DdsmCloudElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmPort(DdsmPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Internal Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmInternalComponent(DdsmInternalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Heterogeneous Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Heterogeneous Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmHeterogeneousCluster(DdsmHeterogeneousCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm VMs Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm VMs Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmVMsCluster(DdsmVMsCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Yarn Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Yarn Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmYarnCluster(DdsmYarnCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Master Slave Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Master Slave Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmMasterSlavePlatform(DdsmMasterSlavePlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Zookeeper Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Zookeeper Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmZookeeperCluster(DdsmZookeeperCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Peer To Peer Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Peer To Peer Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmPeerToPeerPlatform(DdsmPeerToPeerPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Kafka Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Kafka Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmKafkaCluster(DdsmKafkaCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Storm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Storm Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmStormCluster(DdsmStormCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Job Submission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Job Submission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmJobSubmission(DdsmJobSubmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Big Data Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Big Data Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmBigDataJob(DdsmBigDataJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Job Deployed From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Job Deployed From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmJobDeployedFrom(DdsmJobDeployedFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Hdfs Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Hdfs Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmHdfsCluster(DdsmHdfsCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Cassandra Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Cassandra Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmCassandraCluster(DdsmCassandraCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DDSMSwitch
