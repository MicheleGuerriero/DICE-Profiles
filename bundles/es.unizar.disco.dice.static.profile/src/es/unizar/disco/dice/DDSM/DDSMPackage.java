/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMFactory
 * @model kind="package"
 * @generated
 */
public interface DDSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DDSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DDSM/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DDSM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DDSMPackage eINSTANCE = es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl <em>Ddsm Cloud Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCloudElement()
	 * @generated
	 */
	int DDSM_CLOUD_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT__PROPERTIES_LIST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Ddsm Cloud Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl <em>Ddsm Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmComponent()
	 * @generated
	 */
	int DDSM_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__DESCRIPTION = DDSM_CLOUD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__PROPERTIES_LIST = DDSM_CLOUD_ELEMENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__ID = DDSM_CLOUD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__PROVIDED_PORTS_LIST = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ddsm Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT_FEATURE_COUNT = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl <em>Ddsm External Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmExternalComponent()
	 * @generated
	 */
	int DDSM_EXTERNAL_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__DESCRIPTION = DDSM_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PROPERTIES_LIST = DDSM_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__ID = DDSM_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PROVIDED_PORTS_LIST = DDSM_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__LOCATION = DDSM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PROVIDER = DDSM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE = DDSM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__REGION = DDSM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__LOGIN = DDSM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PASSWORD = DDSM_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__BASE_DEVICE = DDSM_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ddsm External Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT = DDSM_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmPortImpl <em>Ddsm Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmPortImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmPort()
	 * @generated
	 */
	int DDSM_PORT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__DESCRIPTION = DDSM_CLOUD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__PROPERTIES_LIST = DDSM_CLOUD_ELEMENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__ID = DDSM_CLOUD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__IS_LOCAL = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__PORT_NUMBER = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Communication Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__BASE_COMMUNICATION_PATH = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ddsm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT_FEATURE_COUNT = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl <em>Ddsm Internal Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmInternalComponent()
	 * @generated
	 */
	int DDSM_INTERNAL_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__DESCRIPTION = DDSM_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST = DDSM_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__ID = DDSM_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST = DDSM_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__REQUIRED_PORT = DDSM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__IS_FRONT_END = DDSM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE = DDSM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__BASE_NODE = DDSM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__PROTECTED = DDSM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__LAUNCH_SCRIPT = DDSM_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__LANGUAGE = DDSM_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ddsm Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT_FEATURE_COUNT = DDSM_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmHeterogeneousClusterImpl <em>Ddsm Heterogeneous Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmHeterogeneousClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmHeterogeneousCluster()
	 * @generated
	 */
	int DDSM_HETEROGENEOUS_CLUSTER = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__DESCRIPTION = DDSM_EXTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__PROPERTIES_LIST = DDSM_EXTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__ID = DDSM_EXTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__PROVIDED_PORTS_LIST = DDSM_EXTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__LOCATION = DDSM_EXTERNAL_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__PROVIDER = DDSM_EXTERNAL_COMPONENT__PROVIDER;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__SERVICE_TYPE = DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__REGION = DDSM_EXTERNAL_COMPONENT__REGION;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__LOGIN = DDSM_EXTERNAL_COMPONENT__LOGIN;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__PASSWORD = DDSM_EXTERNAL_COMPONENT__PASSWORD;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__BASE_DEVICE = DDSM_EXTERNAL_COMPONENT__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Has VM</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER__HAS_VM = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ddsm Heterogeneous Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HETEROGENEOUS_CLUSTER_FEATURE_COUNT = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl <em>Ddsm VMs Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmVMsCluster()
	 * @generated
	 */
	int DDSM_VMS_CLUSTER = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__DESCRIPTION = DDSM_EXTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__PROPERTIES_LIST = DDSM_EXTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__ID = DDSM_EXTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__PROVIDED_PORTS_LIST = DDSM_EXTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__LOCATION = DDSM_EXTERNAL_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__PROVIDER = DDSM_EXTERNAL_COMPONENT__PROVIDER;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__SERVICE_TYPE = DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__REGION = DDSM_EXTERNAL_COMPONENT__REGION;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__LOGIN = DDSM_EXTERNAL_COMPONENT__LOGIN;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__PASSWORD = DDSM_EXTERNAL_COMPONENT__PASSWORD;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__BASE_DEVICE = DDSM_EXTERNAL_COMPONENT__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Is64os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__IS64OS = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__IMAGE_ID = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__MAX_CORES = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__MAX_RAM = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__MAX_STORAGE = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__MIN_CORES = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__MIN_RAM = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__MIN_STORAGE = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__OS = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__SECURITY_GROUP = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__PRIVATE_KEY = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__SSH_KEY = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__PUBLIC_ADDRESS = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__INSTANCES = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Generic Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER__GENERIC_SIZE = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Ddsm VMs Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VMS_CLUSTER_FEATURE_COUNT = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmMasterSlavePlatformImpl <em>Ddsm Master Slave Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmMasterSlavePlatformImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmMasterSlavePlatform()
	 * @generated
	 */
	int DDSM_MASTER_SLAVE_PLATFORM = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__PROTECTED = DDSM_INTERNAL_COMPONENT__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__LAUNCH_SCRIPT = DDSM_INTERNAL_COMPONENT__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__LANGUAGE = DDSM_INTERNAL_COMPONENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Master Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ddsm Master Slave Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl <em>Ddsm Yarn Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmYarnCluster()
	 * @generated
	 */
	int DDSM_YARN_CLUSTER = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__DESCRIPTION = DDSM_MASTER_SLAVE_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__PROPERTIES_LIST = DDSM_MASTER_SLAVE_PLATFORM__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__ID = DDSM_MASTER_SLAVE_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__PROVIDED_PORTS_LIST = DDSM_MASTER_SLAVE_PLATFORM__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__REQUIRED_PORT = DDSM_MASTER_SLAVE_PLATFORM__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__IS_FRONT_END = DDSM_MASTER_SLAVE_PLATFORM__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__COMPONENT_TYPE = DDSM_MASTER_SLAVE_PLATFORM__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__BASE_NODE = DDSM_MASTER_SLAVE_PLATFORM__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__PROTECTED = DDSM_MASTER_SLAVE_PLATFORM__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__LAUNCH_SCRIPT = DDSM_MASTER_SLAVE_PLATFORM__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__LANGUAGE = DDSM_MASTER_SLAVE_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Master Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__MASTER_HOST = DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ddsm Yarn Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_CLUSTER_FEATURE_COUNT = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmPeerToPeerPlatformImpl <em>Ddsm Peer To Peer Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmPeerToPeerPlatformImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmPeerToPeerPlatform()
	 * @generated
	 */
	int DDSM_PEER_TO_PEER_PLATFORM = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__PROTECTED = DDSM_INTERNAL_COMPONENT__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__LAUNCH_SCRIPT = DDSM_INTERNAL_COMPONENT__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM__LANGUAGE = DDSM_INTERNAL_COMPONENT__LANGUAGE;

	/**
	 * The number of structural features of the '<em>Ddsm Peer To Peer Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmZookeeperClusterImpl <em>Ddsm Zookeeper Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmZookeeperClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmZookeeperCluster()
	 * @generated
	 */
	int DDSM_ZOOKEEPER_CLUSTER = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__DESCRIPTION = DDSM_PEER_TO_PEER_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__PROPERTIES_LIST = DDSM_PEER_TO_PEER_PLATFORM__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__ID = DDSM_PEER_TO_PEER_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__PROVIDED_PORTS_LIST = DDSM_PEER_TO_PEER_PLATFORM__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__REQUIRED_PORT = DDSM_PEER_TO_PEER_PLATFORM__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__IS_FRONT_END = DDSM_PEER_TO_PEER_PLATFORM__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__COMPONENT_TYPE = DDSM_PEER_TO_PEER_PLATFORM__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__BASE_NODE = DDSM_PEER_TO_PEER_PLATFORM__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__PROTECTED = DDSM_PEER_TO_PEER_PLATFORM__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__LAUNCH_SCRIPT = DDSM_PEER_TO_PEER_PLATFORM__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__LANGUAGE = DDSM_PEER_TO_PEER_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Tick Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__TICK_TIME = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sync Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__SYNC_LIMIT = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER__INIT_LIMIT = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ddsm Zookeeper Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_CLUSTER_FEATURE_COUNT = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl <em>Ddsm Kafka Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmKafkaCluster()
	 * @generated
	 */
	int DDSM_KAFKA_CLUSTER = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__DESCRIPTION = DDSM_PEER_TO_PEER_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__PROPERTIES_LIST = DDSM_PEER_TO_PEER_PLATFORM__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__ID = DDSM_PEER_TO_PEER_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__PROVIDED_PORTS_LIST = DDSM_PEER_TO_PEER_PLATFORM__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__REQUIRED_PORT = DDSM_PEER_TO_PEER_PLATFORM__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__IS_FRONT_END = DDSM_PEER_TO_PEER_PLATFORM__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__COMPONENT_TYPE = DDSM_PEER_TO_PEER_PLATFORM__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__BASE_NODE = DDSM_PEER_TO_PEER_PLATFORM__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__PROTECTED = DDSM_PEER_TO_PEER_PLATFORM__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__LAUNCH_SCRIPT = DDSM_PEER_TO_PEER_PLATFORM__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__LANGUAGE = DDSM_PEER_TO_PEER_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ddsm Kafka Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_CLUSTER_FEATURE_COUNT = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl <em>Ddsm Storm Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmStormCluster()
	 * @generated
	 */
	int DDSM_STORM_CLUSTER = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__DESCRIPTION = DDSM_MASTER_SLAVE_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__PROPERTIES_LIST = DDSM_MASTER_SLAVE_PLATFORM__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__ID = DDSM_MASTER_SLAVE_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__PROVIDED_PORTS_LIST = DDSM_MASTER_SLAVE_PLATFORM__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__REQUIRED_PORT = DDSM_MASTER_SLAVE_PLATFORM__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__IS_FRONT_END = DDSM_MASTER_SLAVE_PLATFORM__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__COMPONENT_TYPE = DDSM_MASTER_SLAVE_PLATFORM__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__BASE_NODE = DDSM_MASTER_SLAVE_PLATFORM__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__PROTECTED = DDSM_MASTER_SLAVE_PLATFORM__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__LAUNCH_SCRIPT = DDSM_MASTER_SLAVE_PLATFORM__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__LANGUAGE = DDSM_MASTER_SLAVE_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Master Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__MASTER_HOST = DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST;

	/**
	 * The feature id for the '<em><b>Task Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__TASK_TIMEOUT = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supervisor Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__QUEUE_SIZE = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitor Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__MONITOR_FREQUENCY = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retry Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__RETRY_TIMES = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__RETRY_INTERVAL = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Worker Start Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cpu Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__CPU_CAPACITY = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__MEMORY_CAPACITY = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Heartbeat Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Ddsm Storm Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER_FEATURE_COUNT = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl <em>Ddsm Job Submission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobSubmission()
	 * @generated
	 */
	int DDSM_JOB_SUBMISSION = 13;

	/**
	 * The feature id for the '<em><b>Base Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Number Of Submission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION = 1;

	/**
	 * The feature id for the '<em><b>Interval Between Submission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION = 2;

	/**
	 * The number of structural features of the '<em>Ddsm Job Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_SUBMISSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl <em>Ddsm Big Data Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmBigDataJob()
	 * @generated
	 */
	int DDSM_BIG_DATA_JOB = 14;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Application class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__APPLICATION_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__BASE_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Application name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__APPLICATION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__ARGUMENTS = 4;

	/**
	 * The number of structural features of the '<em>Ddsm Big Data Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl <em>Ddsm Job Deployed From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobDeployedFrom()
	 * @generated
	 */
	int DDSM_JOB_DEPLOYED_FROM = 15;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_DEPLOYED_FROM__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Ddsm Job Deployed From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_DEPLOYED_FROM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl <em>Ddsm Hdfs Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmHdfsCluster()
	 * @generated
	 */
	int DDSM_HDFS_CLUSTER = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__DESCRIPTION = DDSM_MASTER_SLAVE_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__PROPERTIES_LIST = DDSM_MASTER_SLAVE_PLATFORM__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__ID = DDSM_MASTER_SLAVE_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__PROVIDED_PORTS_LIST = DDSM_MASTER_SLAVE_PLATFORM__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__REQUIRED_PORT = DDSM_MASTER_SLAVE_PLATFORM__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__IS_FRONT_END = DDSM_MASTER_SLAVE_PLATFORM__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__COMPONENT_TYPE = DDSM_MASTER_SLAVE_PLATFORM__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__BASE_NODE = DDSM_MASTER_SLAVE_PLATFORM__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__PROTECTED = DDSM_MASTER_SLAVE_PLATFORM__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__LAUNCH_SCRIPT = DDSM_MASTER_SLAVE_PLATFORM__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__LANGUAGE = DDSM_MASTER_SLAVE_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Master Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER__MASTER_HOST = DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST;

	/**
	 * The number of structural features of the '<em>Ddsm Hdfs Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_HDFS_CLUSTER_FEATURE_COUNT = DDSM_MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl <em>Ddsm Cassandra Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCassandraCluster()
	 * @generated
	 */
	int DDSM_CASSANDRA_CLUSTER = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__DESCRIPTION = DDSM_PEER_TO_PEER_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__PROPERTIES_LIST = DDSM_PEER_TO_PEER_PLATFORM__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__ID = DDSM_PEER_TO_PEER_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__PROVIDED_PORTS_LIST = DDSM_PEER_TO_PEER_PLATFORM__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__REQUIRED_PORT = DDSM_PEER_TO_PEER_PLATFORM__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__IS_FRONT_END = DDSM_PEER_TO_PEER_PLATFORM__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__COMPONENT_TYPE = DDSM_PEER_TO_PEER_PLATFORM__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__BASE_NODE = DDSM_PEER_TO_PEER_PLATFORM__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__PROTECTED = DDSM_PEER_TO_PEER_PLATFORM__PROTECTED;

	/**
	 * The feature id for the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__LAUNCH_SCRIPT = DDSM_PEER_TO_PEER_PLATFORM__LAUNCH_SCRIPT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__LANGUAGE = DDSM_PEER_TO_PEER_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Seed Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__SEED_HOST = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key cache keys to save</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key cache save period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memtable cleanup threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Memtable flush writers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Authenticator enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Authorizer enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Permission validity in ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ddsm Cassandra Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CASSANDRA_CLUSTER_FEATURE_COUNT = DDSM_PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent <em>Ddsm External Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm External Component</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent
	 * @generated
	 */
	EClass getDdsmExternalComponent();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLocation()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Location();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getProvider()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Provider();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getServiceType()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getRegion()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Region();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLogin()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Login();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getPassword()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Password();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getBase_Device <em>Base Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Device</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getBase_Device()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EReference getDdsmExternalComponent_Base_Device();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmComponent <em>Ddsm Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Component</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmComponent
	 * @generated
	 */
	EClass getDdsmComponent();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DDSM.DdsmComponent#getProvidedPortsList <em>Provided Ports List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Ports List</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmComponent#getProvidedPortsList()
	 * @see #getDdsmComponent()
	 * @generated
	 */
	EReference getDdsmComponent_ProvidedPortsList();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement <em>Ddsm Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Cloud Element</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement
	 * @generated
	 */
	EClass getDdsmCloudElement();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement#getDescription()
	 * @see #getDdsmCloudElement()
	 * @generated
	 */
	EAttribute getDdsmCloudElement_Description();

	/**
	 * Returns the meta object for the attribute list '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getPropertiesList <em>Properties List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties List</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement#getPropertiesList()
	 * @see #getDdsmCloudElement()
	 * @generated
	 */
	EAttribute getDdsmCloudElement_PropertiesList();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement#getId()
	 * @see #getDdsmCloudElement()
	 * @generated
	 */
	EAttribute getDdsmCloudElement_Id();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmPort <em>Ddsm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Port</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort
	 * @generated
	 */
	EClass getDdsmPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmPort#isLocal <em>Is Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort#isLocal()
	 * @see #getDdsmPort()
	 * @generated
	 */
	EAttribute getDdsmPort_IsLocal();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmPort#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort#getPortNumber()
	 * @see #getDdsmPort()
	 * @generated
	 */
	EAttribute getDdsmPort_PortNumber();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmPort#getBase_CommunicationPath <em>Base Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Communication Path</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort#getBase_CommunicationPath()
	 * @see #getDdsmPort()
	 * @generated
	 */
	EReference getDdsmPort_Base_CommunicationPath();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent <em>Ddsm Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Internal Component</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent
	 * @generated
	 */
	EClass getDdsmInternalComponent();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getRequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Port</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getRequiredPort()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EReference getDdsmInternalComponent_RequiredPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getIsFrontEnd <em>Is Front End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front End</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getIsFrontEnd()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EAttribute getDdsmInternalComponent_IsFrontEnd();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EAttribute getDdsmInternalComponent_ComponentType();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EReference getDdsmInternalComponent_Base_Node();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#isProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#isProtected()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EAttribute getDdsmInternalComponent_Protected();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLaunch_script <em>Launch script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch script</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLaunch_script()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EAttribute getDdsmInternalComponent_Launch_script();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLanguage()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EAttribute getDdsmInternalComponent_Language();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster <em>Ddsm Heterogeneous Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Heterogeneous Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster
	 * @generated
	 */
	EClass getDdsmHeterogeneousCluster();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster#getHasVM <em>Has VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has VM</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster#getHasVM()
	 * @see #getDdsmHeterogeneousCluster()
	 * @generated
	 */
	EReference getDdsmHeterogeneousCluster_HasVM();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster <em>Ddsm VMs Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm VMs Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster
	 * @generated
	 */
	EClass getDdsmVMsCluster();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#isIs64os <em>Is64os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is64os</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#isIs64os()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_Is64os();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getImageId()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMaxCores <em>Max Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cores</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMaxCores()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_MaxCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMaxRam <em>Max Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ram</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMaxRam()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_MaxRam();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMaxStorage <em>Max Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Storage</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMaxStorage()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_MaxStorage();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMinCores <em>Min Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cores</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMinCores()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_MinCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMinRam <em>Min Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ram</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMinRam()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_MinRam();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMinStorage <em>Min Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Storage</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getMinStorage()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_MinStorage();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getOs()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_Os();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getSecurityGroup()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getPrivateKey <em>Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getPrivateKey()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_PrivateKey();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getSshKey <em>Ssh Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Key</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getSshKey()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_SshKey();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getPublicAddress <em>Public Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Address</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getPublicAddress()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_PublicAddress();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getInstances()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_Instances();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVMsCluster#getGenericSize <em>Generic Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Size</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVMsCluster#getGenericSize()
	 * @see #getDdsmVMsCluster()
	 * @generated
	 */
	EAttribute getDdsmVMsCluster_GenericSize();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster <em>Ddsm Yarn Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Yarn Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmYarnCluster
	 * @generated
	 */
	EClass getDdsmYarnCluster();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Execution Environment</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmYarnCluster#getBase_ExecutionEnvironment()
	 * @see #getDdsmYarnCluster()
	 * @generated
	 */
	EReference getDdsmYarnCluster_Base_ExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform <em>Ddsm Master Slave Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Master Slave Platform</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform
	 * @generated
	 */
	EClass getDdsmMasterSlavePlatform();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform#getMasterHost <em>Master Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master Host</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform#getMasterHost()
	 * @see #getDdsmMasterSlavePlatform()
	 * @generated
	 */
	EReference getDdsmMasterSlavePlatform_MasterHost();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperCluster <em>Ddsm Zookeeper Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Zookeeper Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperCluster
	 * @generated
	 */
	EClass getDdsmZookeeperCluster();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperCluster#getTickTime <em>Tick Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Time</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperCluster#getTickTime()
	 * @see #getDdsmZookeeperCluster()
	 * @generated
	 */
	EAttribute getDdsmZookeeperCluster_TickTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperCluster#getSyncLimit <em>Sync Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Limit</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperCluster#getSyncLimit()
	 * @see #getDdsmZookeeperCluster()
	 * @generated
	 */
	EAttribute getDdsmZookeeperCluster_SyncLimit();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperCluster#getInitLimit <em>Init Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Limit</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperCluster#getInitLimit()
	 * @see #getDdsmZookeeperCluster()
	 * @generated
	 */
	EAttribute getDdsmZookeeperCluster_InitLimit();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmPeerToPeerPlatform <em>Ddsm Peer To Peer Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Peer To Peer Platform</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPeerToPeerPlatform
	 * @generated
	 */
	EClass getDdsmPeerToPeerPlatform();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster <em>Ddsm Kafka Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Kafka Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmKafkaCluster
	 * @generated
	 */
	EClass getDdsmKafkaCluster();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Execution Environment</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getBase_ExecutionEnvironment()
	 * @see #getDdsmKafkaCluster()
	 * @generated
	 */
	EReference getDdsmKafkaCluster_Base_ExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster <em>Ddsm Storm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Storm Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster
	 * @generated
	 */
	EClass getDdsmStormCluster();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getTaskTimeout <em>Task Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Timeout</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getTaskTimeout()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_TaskTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getSupervisorFrequency <em>Supervisor Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supervisor Frequency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getSupervisorFrequency()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_SupervisorFrequency();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Size</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getQueueSize()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_QueueSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getMonitorFrequency <em>Monitor Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Frequency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getMonitorFrequency()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_MonitorFrequency();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryTimes <em>Retry Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Times</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryTimes()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_RetryTimes();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Interval</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryInterval()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_RetryInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getWorkerStartTimeout <em>Worker Start Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Start Timeout</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getWorkerStartTimeout()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_WorkerStartTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getCpuCapacity <em>Cpu Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Capacity</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getCpuCapacity()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_CpuCapacity();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getMemoryCapacity <em>Memory Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Capacity</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getMemoryCapacity()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_MemoryCapacity();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getHeartbeatFrequency <em>Heartbeat Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heartbeat Frequency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getHeartbeatFrequency()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EAttribute getDdsmStormCluster_HeartbeatFrequency();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Execution Environment</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster#getBase_ExecutionEnvironment()
	 * @see #getDdsmStormCluster()
	 * @generated
	 */
	EReference getDdsmStormCluster_Base_ExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission <em>Ddsm Job Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Job Submission</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobSubmission
	 * @generated
	 */
	EClass getDdsmJobSubmission();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment <em>Base Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Deployment</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment()
	 * @see #getDdsmJobSubmission()
	 * @generated
	 */
	EReference getDdsmJobSubmission_Base_Deployment();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getNumberOfSubmission <em>Number Of Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Submission</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobSubmission#getNumberOfSubmission()
	 * @see #getDdsmJobSubmission()
	 * @generated
	 */
	EAttribute getDdsmJobSubmission_NumberOfSubmission();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getIntervalBetweenSubmission <em>Interval Between Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Between Submission</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobSubmission#getIntervalBetweenSubmission()
	 * @see #getDdsmJobSubmission()
	 * @generated
	 */
	EAttribute getDdsmJobSubmission_IntervalBetweenSubmission();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob <em>Ddsm Big Data Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Big Data Job</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob
	 * @generated
	 */
	EClass getDdsmBigDataJob();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EAttribute getDdsmBigDataJob_Application();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_class <em>Application class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application class</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_class()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EAttribute getDdsmBigDataJob_Application_class();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EReference getDdsmBigDataJob_Base_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_name <em>Application name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application name</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_name()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EAttribute getDdsmBigDataJob_Application_name();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arguments</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArguments()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EAttribute getDdsmBigDataJob_Arguments();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom <em>Ddsm Job Deployed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Job Deployed From</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom
	 * @generated
	 */
	EClass getDdsmJobDeployedFrom();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom#getBase_Dependency()
	 * @see #getDdsmJobDeployedFrom()
	 * @generated
	 */
	EReference getDdsmJobDeployedFrom_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster <em>Ddsm Hdfs Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Hdfs Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmHdfsCluster
	 * @generated
	 */
	EClass getDdsmHdfsCluster();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster <em>Ddsm Cassandra Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Cassandra Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster
	 * @generated
	 */
	EClass getDdsmCassandraCluster();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getSeedHost <em>Seed Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seed Host</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getSeedHost()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EReference getDdsmCassandraCluster_SeedHost();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_keys_to_save <em>Key cache keys to save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key cache keys to save</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_keys_to_save()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EAttribute getDdsmCassandraCluster_Key_cache_keys_to_save();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_save_period <em>Key cache save period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key cache save period</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_save_period()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EAttribute getDdsmCassandraCluster_Key_cache_save_period();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_cleanup_threshold <em>Memtable cleanup threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memtable cleanup threshold</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_cleanup_threshold()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EAttribute getDdsmCassandraCluster_Memtable_cleanup_threshold();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_flush_writers <em>Memtable flush writers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memtable flush writers</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_flush_writers()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EAttribute getDdsmCassandraCluster_Memtable_flush_writers();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthenticator_enabled <em>Authenticator enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticator enabled</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthenticator_enabled()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EAttribute getDdsmCassandraCluster_Authenticator_enabled();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthorizer_enabled <em>Authorizer enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorizer enabled</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthorizer_enabled()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EAttribute getDdsmCassandraCluster_Authorizer_enabled();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getPermission_validity_in_ms <em>Permission validity in ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission validity in ms</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getPermission_validity_in_ms()
	 * @see #getDdsmCassandraCluster()
	 * @generated
	 */
	EAttribute getDdsmCassandraCluster_Permission_validity_in_ms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DDSMFactory getDDSMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl <em>Ddsm External Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmExternalComponent()
		 * @generated
		 */
		EClass DDSM_EXTERNAL_COMPONENT = eINSTANCE.getDdsmExternalComponent();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__LOCATION = eINSTANCE.getDdsmExternalComponent_Location();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__PROVIDER = eINSTANCE.getDdsmExternalComponent_Provider();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE = eINSTANCE.getDdsmExternalComponent_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__REGION = eINSTANCE.getDdsmExternalComponent_Region();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__LOGIN = eINSTANCE.getDdsmExternalComponent_Login();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__PASSWORD = eINSTANCE.getDdsmExternalComponent_Password();

		/**
		 * The meta object literal for the '<em><b>Base Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_EXTERNAL_COMPONENT__BASE_DEVICE = eINSTANCE.getDdsmExternalComponent_Base_Device();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl <em>Ddsm Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmComponent()
		 * @generated
		 */
		EClass DDSM_COMPONENT = eINSTANCE.getDdsmComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Ports List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_COMPONENT__PROVIDED_PORTS_LIST = eINSTANCE.getDdsmComponent_ProvidedPortsList();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl <em>Ddsm Cloud Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCloudElement()
		 * @generated
		 */
		EClass DDSM_CLOUD_ELEMENT = eINSTANCE.getDdsmCloudElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CLOUD_ELEMENT__DESCRIPTION = eINSTANCE.getDdsmCloudElement_Description();

		/**
		 * The meta object literal for the '<em><b>Properties List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CLOUD_ELEMENT__PROPERTIES_LIST = eINSTANCE.getDdsmCloudElement_PropertiesList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CLOUD_ELEMENT__ID = eINSTANCE.getDdsmCloudElement_Id();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmPortImpl <em>Ddsm Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmPortImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmPort()
		 * @generated
		 */
		EClass DDSM_PORT = eINSTANCE.getDdsmPort();

		/**
		 * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_PORT__IS_LOCAL = eINSTANCE.getDdsmPort_IsLocal();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_PORT__PORT_NUMBER = eINSTANCE.getDdsmPort_PortNumber();

		/**
		 * The meta object literal for the '<em><b>Base Communication Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_PORT__BASE_COMMUNICATION_PATH = eINSTANCE.getDdsmPort_Base_CommunicationPath();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl <em>Ddsm Internal Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmInternalComponent()
		 * @generated
		 */
		EClass DDSM_INTERNAL_COMPONENT = eINSTANCE.getDdsmInternalComponent();

		/**
		 * The meta object literal for the '<em><b>Required Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_INTERNAL_COMPONENT__REQUIRED_PORT = eINSTANCE.getDdsmInternalComponent_RequiredPort();

		/**
		 * The meta object literal for the '<em><b>Is Front End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_INTERNAL_COMPONENT__IS_FRONT_END = eINSTANCE.getDdsmInternalComponent_IsFrontEnd();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE = eINSTANCE.getDdsmInternalComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_INTERNAL_COMPONENT__BASE_NODE = eINSTANCE.getDdsmInternalComponent_Base_Node();

		/**
		 * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_INTERNAL_COMPONENT__PROTECTED = eINSTANCE.getDdsmInternalComponent_Protected();

		/**
		 * The meta object literal for the '<em><b>Launch script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_INTERNAL_COMPONENT__LAUNCH_SCRIPT = eINSTANCE.getDdsmInternalComponent_Launch_script();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_INTERNAL_COMPONENT__LANGUAGE = eINSTANCE.getDdsmInternalComponent_Language();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmHeterogeneousClusterImpl <em>Ddsm Heterogeneous Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmHeterogeneousClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmHeterogeneousCluster()
		 * @generated
		 */
		EClass DDSM_HETEROGENEOUS_CLUSTER = eINSTANCE.getDdsmHeterogeneousCluster();

		/**
		 * The meta object literal for the '<em><b>Has VM</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_HETEROGENEOUS_CLUSTER__HAS_VM = eINSTANCE.getDdsmHeterogeneousCluster_HasVM();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl <em>Ddsm VMs Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmVMsCluster()
		 * @generated
		 */
		EClass DDSM_VMS_CLUSTER = eINSTANCE.getDdsmVMsCluster();

		/**
		 * The meta object literal for the '<em><b>Is64os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__IS64OS = eINSTANCE.getDdsmVMsCluster_Is64os();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__IMAGE_ID = eINSTANCE.getDdsmVMsCluster_ImageId();

		/**
		 * The meta object literal for the '<em><b>Max Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__MAX_CORES = eINSTANCE.getDdsmVMsCluster_MaxCores();

		/**
		 * The meta object literal for the '<em><b>Max Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__MAX_RAM = eINSTANCE.getDdsmVMsCluster_MaxRam();

		/**
		 * The meta object literal for the '<em><b>Max Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__MAX_STORAGE = eINSTANCE.getDdsmVMsCluster_MaxStorage();

		/**
		 * The meta object literal for the '<em><b>Min Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__MIN_CORES = eINSTANCE.getDdsmVMsCluster_MinCores();

		/**
		 * The meta object literal for the '<em><b>Min Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__MIN_RAM = eINSTANCE.getDdsmVMsCluster_MinRam();

		/**
		 * The meta object literal for the '<em><b>Min Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__MIN_STORAGE = eINSTANCE.getDdsmVMsCluster_MinStorage();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__OS = eINSTANCE.getDdsmVMsCluster_Os();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__SECURITY_GROUP = eINSTANCE.getDdsmVMsCluster_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Private Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__PRIVATE_KEY = eINSTANCE.getDdsmVMsCluster_PrivateKey();

		/**
		 * The meta object literal for the '<em><b>Ssh Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__SSH_KEY = eINSTANCE.getDdsmVMsCluster_SshKey();

		/**
		 * The meta object literal for the '<em><b>Public Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__PUBLIC_ADDRESS = eINSTANCE.getDdsmVMsCluster_PublicAddress();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__INSTANCES = eINSTANCE.getDdsmVMsCluster_Instances();

		/**
		 * The meta object literal for the '<em><b>Generic Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VMS_CLUSTER__GENERIC_SIZE = eINSTANCE.getDdsmVMsCluster_GenericSize();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl <em>Ddsm Yarn Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmYarnCluster()
		 * @generated
		 */
		EClass DDSM_YARN_CLUSTER = eINSTANCE.getDdsmYarnCluster();

		/**
		 * The meta object literal for the '<em><b>Base Execution Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT = eINSTANCE.getDdsmYarnCluster_Base_ExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmMasterSlavePlatformImpl <em>Ddsm Master Slave Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmMasterSlavePlatformImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmMasterSlavePlatform()
		 * @generated
		 */
		EClass DDSM_MASTER_SLAVE_PLATFORM = eINSTANCE.getDdsmMasterSlavePlatform();

		/**
		 * The meta object literal for the '<em><b>Master Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST = eINSTANCE.getDdsmMasterSlavePlatform_MasterHost();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmZookeeperClusterImpl <em>Ddsm Zookeeper Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmZookeeperClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmZookeeperCluster()
		 * @generated
		 */
		EClass DDSM_ZOOKEEPER_CLUSTER = eINSTANCE.getDdsmZookeeperCluster();

		/**
		 * The meta object literal for the '<em><b>Tick Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_ZOOKEEPER_CLUSTER__TICK_TIME = eINSTANCE.getDdsmZookeeperCluster_TickTime();

		/**
		 * The meta object literal for the '<em><b>Sync Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_ZOOKEEPER_CLUSTER__SYNC_LIMIT = eINSTANCE.getDdsmZookeeperCluster_SyncLimit();

		/**
		 * The meta object literal for the '<em><b>Init Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_ZOOKEEPER_CLUSTER__INIT_LIMIT = eINSTANCE.getDdsmZookeeperCluster_InitLimit();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmPeerToPeerPlatformImpl <em>Ddsm Peer To Peer Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmPeerToPeerPlatformImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmPeerToPeerPlatform()
		 * @generated
		 */
		EClass DDSM_PEER_TO_PEER_PLATFORM = eINSTANCE.getDdsmPeerToPeerPlatform();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl <em>Ddsm Kafka Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmKafkaCluster()
		 * @generated
		 */
		EClass DDSM_KAFKA_CLUSTER = eINSTANCE.getDdsmKafkaCluster();

		/**
		 * The meta object literal for the '<em><b>Base Execution Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT = eINSTANCE.getDdsmKafkaCluster_Base_ExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl <em>Ddsm Storm Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmStormCluster()
		 * @generated
		 */
		EClass DDSM_STORM_CLUSTER = eINSTANCE.getDdsmStormCluster();

		/**
		 * The meta object literal for the '<em><b>Task Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__TASK_TIMEOUT = eINSTANCE.getDdsmStormCluster_TaskTimeout();

		/**
		 * The meta object literal for the '<em><b>Supervisor Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY = eINSTANCE.getDdsmStormCluster_SupervisorFrequency();

		/**
		 * The meta object literal for the '<em><b>Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__QUEUE_SIZE = eINSTANCE.getDdsmStormCluster_QueueSize();

		/**
		 * The meta object literal for the '<em><b>Monitor Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__MONITOR_FREQUENCY = eINSTANCE.getDdsmStormCluster_MonitorFrequency();

		/**
		 * The meta object literal for the '<em><b>Retry Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__RETRY_TIMES = eINSTANCE.getDdsmStormCluster_RetryTimes();

		/**
		 * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__RETRY_INTERVAL = eINSTANCE.getDdsmStormCluster_RetryInterval();

		/**
		 * The meta object literal for the '<em><b>Worker Start Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT = eINSTANCE.getDdsmStormCluster_WorkerStartTimeout();

		/**
		 * The meta object literal for the '<em><b>Cpu Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__CPU_CAPACITY = eINSTANCE.getDdsmStormCluster_CpuCapacity();

		/**
		 * The meta object literal for the '<em><b>Memory Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__MEMORY_CAPACITY = eINSTANCE.getDdsmStormCluster_MemoryCapacity();

		/**
		 * The meta object literal for the '<em><b>Heartbeat Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY = eINSTANCE.getDdsmStormCluster_HeartbeatFrequency();

		/**
		 * The meta object literal for the '<em><b>Base Execution Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT = eINSTANCE.getDdsmStormCluster_Base_ExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl <em>Ddsm Job Submission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobSubmission()
		 * @generated
		 */
		EClass DDSM_JOB_SUBMISSION = eINSTANCE.getDdsmJobSubmission();

		/**
		 * The meta object literal for the '<em><b>Base Deployment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT = eINSTANCE.getDdsmJobSubmission_Base_Deployment();

		/**
		 * The meta object literal for the '<em><b>Number Of Submission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION = eINSTANCE.getDdsmJobSubmission_NumberOfSubmission();

		/**
		 * The meta object literal for the '<em><b>Interval Between Submission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION = eINSTANCE.getDdsmJobSubmission_IntervalBetweenSubmission();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl <em>Ddsm Big Data Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmBigDataJob()
		 * @generated
		 */
		EClass DDSM_BIG_DATA_JOB = eINSTANCE.getDdsmBigDataJob();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_BIG_DATA_JOB__APPLICATION = eINSTANCE.getDdsmBigDataJob_Application();

		/**
		 * The meta object literal for the '<em><b>Application class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_BIG_DATA_JOB__APPLICATION_CLASS = eINSTANCE.getDdsmBigDataJob_Application_class();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_BIG_DATA_JOB__BASE_ARTIFACT = eINSTANCE.getDdsmBigDataJob_Base_Artifact();

		/**
		 * The meta object literal for the '<em><b>Application name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_BIG_DATA_JOB__APPLICATION_NAME = eINSTANCE.getDdsmBigDataJob_Application_name();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_BIG_DATA_JOB__ARGUMENTS = eINSTANCE.getDdsmBigDataJob_Arguments();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl <em>Ddsm Job Deployed From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobDeployedFrom()
		 * @generated
		 */
		EClass DDSM_JOB_DEPLOYED_FROM = eINSTANCE.getDdsmJobDeployedFrom();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_JOB_DEPLOYED_FROM__BASE_DEPENDENCY = eINSTANCE.getDdsmJobDeployedFrom_Base_Dependency();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl <em>Ddsm Hdfs Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmHdfsCluster()
		 * @generated
		 */
		EClass DDSM_HDFS_CLUSTER = eINSTANCE.getDdsmHdfsCluster();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl <em>Ddsm Cassandra Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCassandraCluster()
		 * @generated
		 */
		EClass DDSM_CASSANDRA_CLUSTER = eINSTANCE.getDdsmCassandraCluster();

		/**
		 * The meta object literal for the '<em><b>Seed Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_CASSANDRA_CLUSTER__SEED_HOST = eINSTANCE.getDdsmCassandraCluster_SeedHost();

		/**
		 * The meta object literal for the '<em><b>Key cache keys to save</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE = eINSTANCE.getDdsmCassandraCluster_Key_cache_keys_to_save();

		/**
		 * The meta object literal for the '<em><b>Key cache save period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD = eINSTANCE.getDdsmCassandraCluster_Key_cache_save_period();

		/**
		 * The meta object literal for the '<em><b>Memtable cleanup threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD = eINSTANCE.getDdsmCassandraCluster_Memtable_cleanup_threshold();

		/**
		 * The meta object literal for the '<em><b>Memtable flush writers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS = eINSTANCE.getDdsmCassandraCluster_Memtable_flush_writers();

		/**
		 * The meta object literal for the '<em><b>Authenticator enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED = eINSTANCE.getDdsmCassandraCluster_Authenticator_enabled();

		/**
		 * The meta object literal for the '<em><b>Authorizer enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED = eINSTANCE.getDdsmCassandraCluster_Authorizer_enabled();

		/**
		 * The meta object literal for the '<em><b>Permission validity in ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS = eINSTANCE.getDdsmCassandraCluster_Permission_validity_in_ms();

	}

} //DDSMPackage
