/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMPackage
 * @generated
 */
public interface DDSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DDSMFactory eINSTANCE = es.unizar.disco.dice.DDSM.impl.DDSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ddsm External Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm External Component</em>'.
	 * @generated
	 */
	DdsmExternalComponent createDdsmExternalComponent();

	/**
	 * Returns a new object of class '<em>Ddsm Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Port</em>'.
	 * @generated
	 */
	DdsmPort createDdsmPort();

	/**
	 * Returns a new object of class '<em>Ddsm Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Internal Component</em>'.
	 * @generated
	 */
	DdsmInternalComponent createDdsmInternalComponent();

	/**
	 * Returns a new object of class '<em>Ddsm Heterogeneous Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Heterogeneous Cluster</em>'.
	 * @generated
	 */
	DdsmHeterogeneousCluster createDdsmHeterogeneousCluster();

	/**
	 * Returns a new object of class '<em>Ddsm VMs Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm VMs Cluster</em>'.
	 * @generated
	 */
	DdsmVMsCluster createDdsmVMsCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Yarn Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Yarn Cluster</em>'.
	 * @generated
	 */
	DdsmYarnCluster createDdsmYarnCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Master Slave Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Master Slave Platform</em>'.
	 * @generated
	 */
	DdsmMasterSlavePlatform createDdsmMasterSlavePlatform();

	/**
	 * Returns a new object of class '<em>Ddsm Zookeeper Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Zookeeper Cluster</em>'.
	 * @generated
	 */
	DdsmZookeeperCluster createDdsmZookeeperCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Peer To Peer Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Peer To Peer Platform</em>'.
	 * @generated
	 */
	DdsmPeerToPeerPlatform createDdsmPeerToPeerPlatform();

	/**
	 * Returns a new object of class '<em>Ddsm Kafka Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Kafka Cluster</em>'.
	 * @generated
	 */
	DdsmKafkaCluster createDdsmKafkaCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Storm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Storm Cluster</em>'.
	 * @generated
	 */
	DdsmStormCluster createDdsmStormCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Job Submission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Job Submission</em>'.
	 * @generated
	 */
	DdsmJobSubmission createDdsmJobSubmission();

	/**
	 * Returns a new object of class '<em>Ddsm Big Data Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Big Data Job</em>'.
	 * @generated
	 */
	DdsmBigDataJob createDdsmBigDataJob();

	/**
	 * Returns a new object of class '<em>Ddsm Job Deployed From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Job Deployed From</em>'.
	 * @generated
	 */
	DdsmJobDeployedFrom createDdsmJobDeployedFrom();

	/**
	 * Returns a new object of class '<em>Ddsm Hdfs Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Hdfs Cluster</em>'.
	 * @generated
	 */
	DdsmHdfsCluster createDdsmHdfsCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Cassandra Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Cassandra Cluster</em>'.
	 * @generated
	 */
	DdsmCassandraCluster createDdsmCassandraCluster();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DDSMPackage getDDSMPackage();

} //DDSMFactory
