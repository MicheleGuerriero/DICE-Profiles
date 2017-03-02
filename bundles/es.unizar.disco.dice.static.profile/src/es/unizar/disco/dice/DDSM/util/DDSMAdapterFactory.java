/**
 */
package es.unizar.disco.dice.DDSM.util;

import es.unizar.disco.dice.DDSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMPackage
 * @generated
 */
public class DDSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DDSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DDSMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDSMSwitch<Adapter> modelSwitch =
		new DDSMSwitch<Adapter>() {
			@Override
			public Adapter caseDdsmExternalComponent(DdsmExternalComponent object) {
				return createDdsmExternalComponentAdapter();
			}
			@Override
			public Adapter caseDdsmComponent(DdsmComponent object) {
				return createDdsmComponentAdapter();
			}
			@Override
			public Adapter caseDdsmCloudElement(DdsmCloudElement object) {
				return createDdsmCloudElementAdapter();
			}
			@Override
			public Adapter caseDdsmPort(DdsmPort object) {
				return createDdsmPortAdapter();
			}
			@Override
			public Adapter caseDdsmInternalComponent(DdsmInternalComponent object) {
				return createDdsmInternalComponentAdapter();
			}
			@Override
			public Adapter caseDdsmHeterogeneousCluster(DdsmHeterogeneousCluster object) {
				return createDdsmHeterogeneousClusterAdapter();
			}
			@Override
			public Adapter caseDdsmVMsCluster(DdsmVMsCluster object) {
				return createDdsmVMsClusterAdapter();
			}
			@Override
			public Adapter caseDdsmYarnCluster(DdsmYarnCluster object) {
				return createDdsmYarnClusterAdapter();
			}
			@Override
			public Adapter caseDdsmMasterSlavePlatform(DdsmMasterSlavePlatform object) {
				return createDdsmMasterSlavePlatformAdapter();
			}
			@Override
			public Adapter caseDdsmZookeeperCluster(DdsmZookeeperCluster object) {
				return createDdsmZookeeperClusterAdapter();
			}
			@Override
			public Adapter caseDdsmPeerToPeerPlatform(DdsmPeerToPeerPlatform object) {
				return createDdsmPeerToPeerPlatformAdapter();
			}
			@Override
			public Adapter caseDdsmKafkaCluster(DdsmKafkaCluster object) {
				return createDdsmKafkaClusterAdapter();
			}
			@Override
			public Adapter caseDdsmStormCluster(DdsmStormCluster object) {
				return createDdsmStormClusterAdapter();
			}
			@Override
			public Adapter caseDdsmJobSubmission(DdsmJobSubmission object) {
				return createDdsmJobSubmissionAdapter();
			}
			@Override
			public Adapter caseDdsmBigDataJob(DdsmBigDataJob object) {
				return createDdsmBigDataJobAdapter();
			}
			@Override
			public Adapter caseDdsmJobDeployedFrom(DdsmJobDeployedFrom object) {
				return createDdsmJobDeployedFromAdapter();
			}
			@Override
			public Adapter caseDdsmHdfsCluster(DdsmHdfsCluster object) {
				return createDdsmHdfsClusterAdapter();
			}
			@Override
			public Adapter caseDdsmCassandraCluster(DdsmCassandraCluster object) {
				return createDdsmCassandraClusterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent <em>Ddsm External Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent
	 * @generated
	 */
	public Adapter createDdsmExternalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmComponent <em>Ddsm Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmComponent
	 * @generated
	 */
	public Adapter createDdsmComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement <em>Ddsm Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement
	 * @generated
	 */
	public Adapter createDdsmCloudElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmPort <em>Ddsm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort
	 * @generated
	 */
	public Adapter createDdsmPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent <em>Ddsm Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent
	 * @generated
	 */
	public Adapter createDdsmInternalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster <em>Ddsm Heterogeneous Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster
	 * @generated
	 */
	public Adapter createDdsmHeterogeneousClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster <em>Ddsm VMs Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster
	 * @generated
	 */
	public Adapter createDdsmVMsClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster <em>Ddsm Yarn Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmYarnCluster
	 * @generated
	 */
	public Adapter createDdsmYarnClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform <em>Ddsm Master Slave Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform
	 * @generated
	 */
	public Adapter createDdsmMasterSlavePlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperCluster <em>Ddsm Zookeeper Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperCluster
	 * @generated
	 */
	public Adapter createDdsmZookeeperClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmPeerToPeerPlatform <em>Ddsm Peer To Peer Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmPeerToPeerPlatform
	 * @generated
	 */
	public Adapter createDdsmPeerToPeerPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster <em>Ddsm Kafka Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmKafkaCluster
	 * @generated
	 */
	public Adapter createDdsmKafkaClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster <em>Ddsm Storm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster
	 * @generated
	 */
	public Adapter createDdsmStormClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission <em>Ddsm Job Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobSubmission
	 * @generated
	 */
	public Adapter createDdsmJobSubmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob <em>Ddsm Big Data Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob
	 * @generated
	 */
	public Adapter createDdsmBigDataJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom <em>Ddsm Job Deployed From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom
	 * @generated
	 */
	public Adapter createDdsmJobDeployedFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster <em>Ddsm Hdfs Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmHdfsCluster
	 * @generated
	 */
	public Adapter createDdsmHdfsClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster <em>Ddsm Cassandra Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster
	 * @generated
	 */
	public Adapter createDdsmCassandraClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DDSMAdapterFactory
