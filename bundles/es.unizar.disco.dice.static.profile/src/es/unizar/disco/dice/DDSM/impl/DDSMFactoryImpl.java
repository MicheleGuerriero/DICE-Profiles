/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DDSMFactoryImpl extends EFactoryImpl implements DDSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DDSMFactory init() {
		try {
			DDSMFactory theDDSMFactory = (DDSMFactory)EPackage.Registry.INSTANCE.getEFactory(DDSMPackage.eNS_URI);
			if (theDDSMFactory != null) {
				return theDDSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DDSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT: return createDdsmExternalComponent();
			case DDSMPackage.DDSM_PORT: return createDdsmPort();
			case DDSMPackage.DDSM_INTERNAL_COMPONENT: return createDdsmInternalComponent();
			case DDSMPackage.DDSM_HETEROGENEOUS_CLUSTER: return createDdsmHeterogeneousCluster();
			case DDSMPackage.DDSM_VMS_CLUSTER: return createDdsmVMsCluster();
			case DDSMPackage.DDSM_YARN_CLUSTER: return createDdsmYarnCluster();
			case DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM: return createDdsmMasterSlavePlatform();
			case DDSMPackage.DDSM_ZOOKEEPER_CLUSTER: return createDdsmZookeeperCluster();
			case DDSMPackage.DDSM_PEER_TO_PEER_PLATFORM: return createDdsmPeerToPeerPlatform();
			case DDSMPackage.DDSM_KAFKA_CLUSTER: return createDdsmKafkaCluster();
			case DDSMPackage.DDSM_STORM_CLUSTER: return createDdsmStormCluster();
			case DDSMPackage.DDSM_JOB_SUBMISSION: return createDdsmJobSubmission();
			case DDSMPackage.DDSM_BIG_DATA_JOB: return createDdsmBigDataJob();
			case DDSMPackage.DDSM_JOB_DEPLOYED_FROM: return createDdsmJobDeployedFrom();
			case DDSMPackage.DDSM_HDFS_CLUSTER: return createDdsmHdfsCluster();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER: return createDdsmCassandraCluster();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmExternalComponent createDdsmExternalComponent() {
		DdsmExternalComponentImpl ddsmExternalComponent = new DdsmExternalComponentImpl();
		return ddsmExternalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmPort createDdsmPort() {
		DdsmPortImpl ddsmPort = new DdsmPortImpl();
		return ddsmPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmInternalComponent createDdsmInternalComponent() {
		DdsmInternalComponentImpl ddsmInternalComponent = new DdsmInternalComponentImpl();
		return ddsmInternalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmHeterogeneousCluster createDdsmHeterogeneousCluster() {
		DdsmHeterogeneousClusterImpl ddsmHeterogeneousCluster = new DdsmHeterogeneousClusterImpl();
		return ddsmHeterogeneousCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVMsCluster createDdsmVMsCluster() {
		DdsmVMsClusterImpl ddsmVMsCluster = new DdsmVMsClusterImpl();
		return ddsmVMsCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmYarnCluster createDdsmYarnCluster() {
		DdsmYarnClusterImpl ddsmYarnCluster = new DdsmYarnClusterImpl();
		return ddsmYarnCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmMasterSlavePlatform createDdsmMasterSlavePlatform() {
		DdsmMasterSlavePlatformImpl ddsmMasterSlavePlatform = new DdsmMasterSlavePlatformImpl();
		return ddsmMasterSlavePlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmZookeeperCluster createDdsmZookeeperCluster() {
		DdsmZookeeperClusterImpl ddsmZookeeperCluster = new DdsmZookeeperClusterImpl();
		return ddsmZookeeperCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmPeerToPeerPlatform createDdsmPeerToPeerPlatform() {
		DdsmPeerToPeerPlatformImpl ddsmPeerToPeerPlatform = new DdsmPeerToPeerPlatformImpl();
		return ddsmPeerToPeerPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmKafkaCluster createDdsmKafkaCluster() {
		DdsmKafkaClusterImpl ddsmKafkaCluster = new DdsmKafkaClusterImpl();
		return ddsmKafkaCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmStormCluster createDdsmStormCluster() {
		DdsmStormClusterImpl ddsmStormCluster = new DdsmStormClusterImpl();
		return ddsmStormCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmJobSubmission createDdsmJobSubmission() {
		DdsmJobSubmissionImpl ddsmJobSubmission = new DdsmJobSubmissionImpl();
		return ddsmJobSubmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmBigDataJob createDdsmBigDataJob() {
		DdsmBigDataJobImpl ddsmBigDataJob = new DdsmBigDataJobImpl();
		return ddsmBigDataJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmJobDeployedFrom createDdsmJobDeployedFrom() {
		DdsmJobDeployedFromImpl ddsmJobDeployedFrom = new DdsmJobDeployedFromImpl();
		return ddsmJobDeployedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmHdfsCluster createDdsmHdfsCluster() {
		DdsmHdfsClusterImpl ddsmHdfsCluster = new DdsmHdfsClusterImpl();
		return ddsmHdfsCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmCassandraCluster createDdsmCassandraCluster() {
		DdsmCassandraClusterImpl ddsmCassandraCluster = new DdsmCassandraClusterImpl();
		return ddsmCassandraCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMPackage getDDSMPackage() {
		return (DDSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DDSMPackage getPackage() {
		return DDSMPackage.eINSTANCE;
	}

} //DDSMFactoryImpl
