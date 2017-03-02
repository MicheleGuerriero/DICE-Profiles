/**
 */
package es.unizar.disco.dice.DDSM.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import es.unizar.disco.dice.DDSM.DDSMFactory;
import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmBigDataJob;
import es.unizar.disco.dice.DDSM.DdsmCassandraCluster;
import es.unizar.disco.dice.DDSM.DdsmCloudElement;
import es.unizar.disco.dice.DDSM.DdsmComponent;
import es.unizar.disco.dice.DDSM.DdsmExternalComponent;
import es.unizar.disco.dice.DDSM.DdsmHdfsCluster;
import es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster;
import es.unizar.disco.dice.DDSM.DdsmInternalComponent;
import es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom;
import es.unizar.disco.dice.DDSM.DdsmJobSubmission;
import es.unizar.disco.dice.DDSM.DdsmKafkaCluster;
import es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform;
import es.unizar.disco.dice.DDSM.DdsmPeerToPeerPlatform;
import es.unizar.disco.dice.DDSM.DdsmPort;
import es.unizar.disco.dice.DDSM.DdsmStormCluster;
import es.unizar.disco.dice.DDSM.DdsmVMsCluster;
import es.unizar.disco.dice.DDSM.DdsmYarnCluster;
import es.unizar.disco.dice.DDSM.DdsmZookeeperCluster;

import es.unizar.disco.dice.DICE.DICEPackage;

import es.unizar.disco.dice.DICE.impl.DICEPackageImpl;

import es.unizar.disco.dice.DPIM.DPIMPackage;

import es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl;

import es.unizar.disco.dice.DTSM.Core.CorePackage;

import es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;

import es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;

import es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DDSMPackageImpl extends EPackageImpl implements DDSMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmExternalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmCloudElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmInternalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmHeterogeneousClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmVMsClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmYarnClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmMasterSlavePlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmZookeeperClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmPeerToPeerPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmKafkaClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmStormClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmJobSubmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmBigDataJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmJobDeployedFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmHdfsClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmCassandraClusterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DDSMPackageImpl() {
		super(eNS_URI, DDSMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DDSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DDSMPackage init() {
		if (isInited) return (DDSMPackage)EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI);

		// Obtain or create and register package
		DDSMPackageImpl theDDSMPackage = (DDSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DDSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DDSMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DAMPackage.eINSTANCE.eClass();
		Complex_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Enumeration_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DICEPackageImpl theDICEPackage = (DICEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) instanceof DICEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) : DICEPackage.eINSTANCE);
		DPIMPackageImpl theDPIMPackage = (DPIMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) instanceof DPIMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) : DPIMPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StormPackageImpl theStormPackage = (StormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) instanceof StormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) : StormPackage.eINSTANCE);
		HadoopPackageImpl theHadoopPackage = (HadoopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) instanceof HadoopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) : HadoopPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage_1 = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theDDSMPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theDPIMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStormPackage.createPackageContents();
		theHadoopPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theDDSMPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theDPIMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStormPackage.initializePackageContents();
		theHadoopPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();
		theBasic_Data_TypesPackage_1.initializePackageContents();
		theBasic_Enumeration_TypesPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDDSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DDSMPackage.eNS_URI, theDDSMPackage);
		return theDDSMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmExternalComponent() {
		return ddsmExternalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Location() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Provider() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_ServiceType() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Region() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Login() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Password() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmExternalComponent_Base_Device() {
		return (EReference)ddsmExternalComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmComponent() {
		return ddsmComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmComponent_ProvidedPortsList() {
		return (EReference)ddsmComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmCloudElement() {
		return ddsmCloudElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCloudElement_Description() {
		return (EAttribute)ddsmCloudElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCloudElement_PropertiesList() {
		return (EAttribute)ddsmCloudElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCloudElement_Id() {
		return (EAttribute)ddsmCloudElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmPort() {
		return ddsmPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmPort_IsLocal() {
		return (EAttribute)ddsmPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmPort_PortNumber() {
		return (EAttribute)ddsmPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmPort_Base_CommunicationPath() {
		return (EReference)ddsmPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmInternalComponent() {
		return ddsmInternalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmInternalComponent_RequiredPort() {
		return (EReference)ddsmInternalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmInternalComponent_IsFrontEnd() {
		return (EAttribute)ddsmInternalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmInternalComponent_ComponentType() {
		return (EAttribute)ddsmInternalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmInternalComponent_Base_Node() {
		return (EReference)ddsmInternalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmInternalComponent_Protected() {
		return (EAttribute)ddsmInternalComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmInternalComponent_Launch_script() {
		return (EAttribute)ddsmInternalComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmInternalComponent_Language() {
		return (EAttribute)ddsmInternalComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmHeterogeneousCluster() {
		return ddsmHeterogeneousClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmHeterogeneousCluster_HasVM() {
		return (EReference)ddsmHeterogeneousClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmVMsCluster() {
		return ddsmVMsClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_Is64os() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_ImageId() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_MaxCores() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_MaxRam() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_MaxStorage() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_MinCores() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_MinRam() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_MinStorage() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_Os() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_SecurityGroup() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_PrivateKey() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_SshKey() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_PublicAddress() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_Instances() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVMsCluster_GenericSize() {
		return (EAttribute)ddsmVMsClusterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmYarnCluster() {
		return ddsmYarnClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmYarnCluster_Base_ExecutionEnvironment() {
		return (EReference)ddsmYarnClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmMasterSlavePlatform() {
		return ddsmMasterSlavePlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmMasterSlavePlatform_MasterHost() {
		return (EReference)ddsmMasterSlavePlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmZookeeperCluster() {
		return ddsmZookeeperClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmZookeeperCluster_TickTime() {
		return (EAttribute)ddsmZookeeperClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmZookeeperCluster_SyncLimit() {
		return (EAttribute)ddsmZookeeperClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmZookeeperCluster_InitLimit() {
		return (EAttribute)ddsmZookeeperClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmPeerToPeerPlatform() {
		return ddsmPeerToPeerPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmKafkaCluster() {
		return ddsmKafkaClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmKafkaCluster_Base_ExecutionEnvironment() {
		return (EReference)ddsmKafkaClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmStormCluster() {
		return ddsmStormClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_TaskTimeout() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_SupervisorFrequency() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_QueueSize() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_MonitorFrequency() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_RetryTimes() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_RetryInterval() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_WorkerStartTimeout() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_CpuCapacity() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_MemoryCapacity() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmStormCluster_HeartbeatFrequency() {
		return (EAttribute)ddsmStormClusterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmStormCluster_Base_ExecutionEnvironment() {
		return (EReference)ddsmStormClusterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmJobSubmission() {
		return ddsmJobSubmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmJobSubmission_Base_Deployment() {
		return (EReference)ddsmJobSubmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmJobSubmission_NumberOfSubmission() {
		return (EAttribute)ddsmJobSubmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmJobSubmission_IntervalBetweenSubmission() {
		return (EAttribute)ddsmJobSubmissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmBigDataJob() {
		return ddsmBigDataJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmBigDataJob_Application() {
		return (EAttribute)ddsmBigDataJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmBigDataJob_Application_class() {
		return (EAttribute)ddsmBigDataJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmBigDataJob_Base_Artifact() {
		return (EReference)ddsmBigDataJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmBigDataJob_Application_name() {
		return (EAttribute)ddsmBigDataJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmBigDataJob_Arguments() {
		return (EAttribute)ddsmBigDataJobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmJobDeployedFrom() {
		return ddsmJobDeployedFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmJobDeployedFrom_Base_Dependency() {
		return (EReference)ddsmJobDeployedFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmHdfsCluster() {
		return ddsmHdfsClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmCassandraCluster() {
		return ddsmCassandraClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmCassandraCluster_SeedHost() {
		return (EReference)ddsmCassandraClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCassandraCluster_Key_cache_keys_to_save() {
		return (EAttribute)ddsmCassandraClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCassandraCluster_Key_cache_save_period() {
		return (EAttribute)ddsmCassandraClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCassandraCluster_Memtable_cleanup_threshold() {
		return (EAttribute)ddsmCassandraClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCassandraCluster_Memtable_flush_writers() {
		return (EAttribute)ddsmCassandraClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCassandraCluster_Authenticator_enabled() {
		return (EAttribute)ddsmCassandraClusterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCassandraCluster_Authorizer_enabled() {
		return (EAttribute)ddsmCassandraClusterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCassandraCluster_Permission_validity_in_ms() {
		return (EAttribute)ddsmCassandraClusterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMFactory getDDSMFactory() {
		return (DDSMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ddsmExternalComponentEClass = createEClass(DDSM_EXTERNAL_COMPONENT);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__LOCATION);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__PROVIDER);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__REGION);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__LOGIN);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__PASSWORD);
		createEReference(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__BASE_DEVICE);

		ddsmComponentEClass = createEClass(DDSM_COMPONENT);
		createEReference(ddsmComponentEClass, DDSM_COMPONENT__PROVIDED_PORTS_LIST);

		ddsmCloudElementEClass = createEClass(DDSM_CLOUD_ELEMENT);
		createEAttribute(ddsmCloudElementEClass, DDSM_CLOUD_ELEMENT__DESCRIPTION);
		createEAttribute(ddsmCloudElementEClass, DDSM_CLOUD_ELEMENT__PROPERTIES_LIST);
		createEAttribute(ddsmCloudElementEClass, DDSM_CLOUD_ELEMENT__ID);

		ddsmPortEClass = createEClass(DDSM_PORT);
		createEAttribute(ddsmPortEClass, DDSM_PORT__IS_LOCAL);
		createEAttribute(ddsmPortEClass, DDSM_PORT__PORT_NUMBER);
		createEReference(ddsmPortEClass, DDSM_PORT__BASE_COMMUNICATION_PATH);

		ddsmInternalComponentEClass = createEClass(DDSM_INTERNAL_COMPONENT);
		createEReference(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__REQUIRED_PORT);
		createEAttribute(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__IS_FRONT_END);
		createEAttribute(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE);
		createEReference(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__BASE_NODE);
		createEAttribute(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__PROTECTED);
		createEAttribute(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__LAUNCH_SCRIPT);
		createEAttribute(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__LANGUAGE);

		ddsmHeterogeneousClusterEClass = createEClass(DDSM_HETEROGENEOUS_CLUSTER);
		createEReference(ddsmHeterogeneousClusterEClass, DDSM_HETEROGENEOUS_CLUSTER__HAS_VM);

		ddsmVMsClusterEClass = createEClass(DDSM_VMS_CLUSTER);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__IS64OS);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__IMAGE_ID);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__MAX_CORES);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__MAX_RAM);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__MAX_STORAGE);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__MIN_CORES);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__MIN_RAM);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__MIN_STORAGE);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__OS);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__SECURITY_GROUP);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__PRIVATE_KEY);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__SSH_KEY);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__PUBLIC_ADDRESS);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__INSTANCES);
		createEAttribute(ddsmVMsClusterEClass, DDSM_VMS_CLUSTER__GENERIC_SIZE);

		ddsmYarnClusterEClass = createEClass(DDSM_YARN_CLUSTER);
		createEReference(ddsmYarnClusterEClass, DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT);

		ddsmMasterSlavePlatformEClass = createEClass(DDSM_MASTER_SLAVE_PLATFORM);
		createEReference(ddsmMasterSlavePlatformEClass, DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST);

		ddsmZookeeperClusterEClass = createEClass(DDSM_ZOOKEEPER_CLUSTER);
		createEAttribute(ddsmZookeeperClusterEClass, DDSM_ZOOKEEPER_CLUSTER__TICK_TIME);
		createEAttribute(ddsmZookeeperClusterEClass, DDSM_ZOOKEEPER_CLUSTER__SYNC_LIMIT);
		createEAttribute(ddsmZookeeperClusterEClass, DDSM_ZOOKEEPER_CLUSTER__INIT_LIMIT);

		ddsmPeerToPeerPlatformEClass = createEClass(DDSM_PEER_TO_PEER_PLATFORM);

		ddsmKafkaClusterEClass = createEClass(DDSM_KAFKA_CLUSTER);
		createEReference(ddsmKafkaClusterEClass, DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT);

		ddsmStormClusterEClass = createEClass(DDSM_STORM_CLUSTER);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__TASK_TIMEOUT);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__QUEUE_SIZE);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__MONITOR_FREQUENCY);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__RETRY_TIMES);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__RETRY_INTERVAL);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__CPU_CAPACITY);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__MEMORY_CAPACITY);
		createEAttribute(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY);
		createEReference(ddsmStormClusterEClass, DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT);

		ddsmJobSubmissionEClass = createEClass(DDSM_JOB_SUBMISSION);
		createEReference(ddsmJobSubmissionEClass, DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT);
		createEAttribute(ddsmJobSubmissionEClass, DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION);
		createEAttribute(ddsmJobSubmissionEClass, DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION);

		ddsmBigDataJobEClass = createEClass(DDSM_BIG_DATA_JOB);
		createEAttribute(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__APPLICATION);
		createEAttribute(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__APPLICATION_CLASS);
		createEReference(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__BASE_ARTIFACT);
		createEAttribute(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__APPLICATION_NAME);
		createEAttribute(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__ARGUMENTS);

		ddsmJobDeployedFromEClass = createEClass(DDSM_JOB_DEPLOYED_FROM);
		createEReference(ddsmJobDeployedFromEClass, DDSM_JOB_DEPLOYED_FROM__BASE_DEPENDENCY);

		ddsmHdfsClusterEClass = createEClass(DDSM_HDFS_CLUSTER);

		ddsmCassandraClusterEClass = createEClass(DDSM_CASSANDRA_CLUSTER);
		createEReference(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__SEED_HOST);
		createEAttribute(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE);
		createEAttribute(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD);
		createEAttribute(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD);
		createEAttribute(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS);
		createEAttribute(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED);
		createEAttribute(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED);
		createEAttribute(ddsmCassandraClusterEClass, DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ddsmExternalComponentEClass.getESuperTypes().add(this.getDdsmComponent());
		ddsmComponentEClass.getESuperTypes().add(this.getDdsmCloudElement());
		ddsmPortEClass.getESuperTypes().add(this.getDdsmCloudElement());
		ddsmInternalComponentEClass.getESuperTypes().add(this.getDdsmComponent());
		ddsmHeterogeneousClusterEClass.getESuperTypes().add(this.getDdsmExternalComponent());
		ddsmVMsClusterEClass.getESuperTypes().add(this.getDdsmExternalComponent());
		ddsmYarnClusterEClass.getESuperTypes().add(this.getDdsmMasterSlavePlatform());
		ddsmMasterSlavePlatformEClass.getESuperTypes().add(this.getDdsmInternalComponent());
		ddsmZookeeperClusterEClass.getESuperTypes().add(this.getDdsmPeerToPeerPlatform());
		ddsmPeerToPeerPlatformEClass.getESuperTypes().add(this.getDdsmInternalComponent());
		ddsmKafkaClusterEClass.getESuperTypes().add(this.getDdsmPeerToPeerPlatform());
		ddsmStormClusterEClass.getESuperTypes().add(this.getDdsmMasterSlavePlatform());
		ddsmHdfsClusterEClass.getESuperTypes().add(this.getDdsmMasterSlavePlatform());
		ddsmCassandraClusterEClass.getESuperTypes().add(this.getDdsmPeerToPeerPlatform());

		// Initialize classes and features; add operations and parameters
		initEClass(ddsmExternalComponentEClass, DdsmExternalComponent.class, "DdsmExternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmExternalComponent_Location(), theTypesPackage.getString(), "location", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Provider(), theBasic_Enumeration_TypesPackage_1.getProviderType(), "provider", "fco", 1, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_ServiceType(), theTypesPackage.getString(), "serviceType", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Region(), theTypesPackage.getString(), "region", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Login(), theTypesPackage.getString(), "login", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Password(), theTypesPackage.getString(), "password", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmExternalComponent_Base_Device(), theUMLPackage.getDevice(), null, "base_Device", null, 1, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmComponentEClass, DdsmComponent.class, "DdsmComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmComponent_ProvidedPortsList(), this.getDdsmPort(), null, "providedPortsList", null, 0, -1, DdsmComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmCloudElementEClass, DdsmCloudElement.class, "DdsmCloudElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmCloudElement_Description(), theTypesPackage.getString(), "description", null, 0, 1, DdsmCloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCloudElement_PropertiesList(), theTypesPackage.getString(), "propertiesList", null, 0, -1, DdsmCloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCloudElement_Id(), theTypesPackage.getString(), "id", null, 0, 1, DdsmCloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmPortEClass, DdsmPort.class, "DdsmPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmPort_IsLocal(), theTypesPackage.getBoolean(), "isLocal", "false", 0, 1, DdsmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmPort_PortNumber(), theTypesPackage.getString(), "portNumber", null, 0, 1, DdsmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmPort_Base_CommunicationPath(), theUMLPackage.getCommunicationPath(), null, "base_CommunicationPath", null, 1, 1, DdsmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmInternalComponentEClass, DdsmInternalComponent.class, "DdsmInternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmInternalComponent_RequiredPort(), this.getDdsmPort(), null, "requiredPort", null, 0, -1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmInternalComponent_IsFrontEnd(), theTypesPackage.getString(), "isFrontEnd", "false", 0, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmInternalComponent_ComponentType(), theBasic_Enumeration_TypesPackage_1.getDDSMcomponentType(), "componentType", null, 0, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmInternalComponent_Base_Node(), theUMLPackage.getNode(), null, "base_Node", null, 1, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmInternalComponent_Protected(), theTypesPackage.getBoolean(), "protected", "false", 0, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmInternalComponent_Launch_script(), theTypesPackage.getString(), "launch_script", null, 0, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmInternalComponent_Language(), theTypesPackage.getString(), "language", null, 0, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmHeterogeneousClusterEClass, DdsmHeterogeneousCluster.class, "DdsmHeterogeneousCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmHeterogeneousCluster_HasVM(), this.getDdsmVMsCluster(), null, "hasVM", null, 0, -1, DdsmHeterogeneousCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmVMsClusterEClass, DdsmVMsCluster.class, "DdsmVMsCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmVMsCluster_Is64os(), theTypesPackage.getBoolean(), "is64os", "true", 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_ImageId(), theTypesPackage.getString(), "imageId", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_MaxCores(), theTypesPackage.getInteger(), "maxCores", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_MaxRam(), theTypesPackage.getInteger(), "maxRam", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_MaxStorage(), theTypesPackage.getInteger(), "maxStorage", "0", 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_MinCores(), theTypesPackage.getInteger(), "minCores", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_MinRam(), theTypesPackage.getInteger(), "minRam", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_MinStorage(), theTypesPackage.getInteger(), "minStorage", "0", 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_Os(), theTypesPackage.getString(), "os", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_SecurityGroup(), theTypesPackage.getString(), "securityGroup", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_PrivateKey(), theTypesPackage.getString(), "privateKey", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_SshKey(), theTypesPackage.getString(), "sshKey", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_PublicAddress(), theTypesPackage.getString(), "publicAddress", null, 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_Instances(), theTypesPackage.getInteger(), "instances", "1", 0, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVMsCluster_GenericSize(), theBasic_Enumeration_TypesPackage_1.getVMSize(), "genericSize", "Small", 1, 1, DdsmVMsCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmYarnClusterEClass, DdsmYarnCluster.class, "DdsmYarnCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmYarnCluster_Base_ExecutionEnvironment(), theUMLPackage.getExecutionEnvironment(), null, "base_ExecutionEnvironment", null, 1, 1, DdsmYarnCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmMasterSlavePlatformEClass, DdsmMasterSlavePlatform.class, "DdsmMasterSlavePlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmMasterSlavePlatform_MasterHost(), this.getDdsmVMsCluster(), null, "masterHost", null, 0, 1, DdsmMasterSlavePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmZookeeperClusterEClass, DdsmZookeeperCluster.class, "DdsmZookeeperCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmZookeeperCluster_TickTime(), theTypesPackage.getInteger(), "tickTime", "1500", 0, 1, DdsmZookeeperCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmZookeeperCluster_SyncLimit(), theTypesPackage.getInteger(), "syncLimit", "10", 0, 1, DdsmZookeeperCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmZookeeperCluster_InitLimit(), theTypesPackage.getInteger(), "initLimit", "5", 0, 1, DdsmZookeeperCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmPeerToPeerPlatformEClass, DdsmPeerToPeerPlatform.class, "DdsmPeerToPeerPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ddsmKafkaClusterEClass, DdsmKafkaCluster.class, "DdsmKafkaCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmKafkaCluster_Base_ExecutionEnvironment(), theUMLPackage.getExecutionEnvironment(), null, "base_ExecutionEnvironment", null, 1, 1, DdsmKafkaCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmStormClusterEClass, DdsmStormCluster.class, "DdsmStormCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmStormCluster_TaskTimeout(), theTypesPackage.getInteger(), "taskTimeout", "60", 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_SupervisorFrequency(), theTypesPackage.getInteger(), "supervisorFrequency", "60", 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_QueueSize(), theTypesPackage.getInteger(), "queueSize", "10000", 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_MonitorFrequency(), theTypesPackage.getInteger(), "monitorFrequency", "40", 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_RetryTimes(), theTypesPackage.getInteger(), "retryTimes", "5", 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_RetryInterval(), theTypesPackage.getInteger(), "retryInterval", "2000", 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_WorkerStartTimeout(), theTypesPackage.getInteger(), "workerStartTimeout", null, 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_CpuCapacity(), theTypesPackage.getInteger(), "cpuCapacity", null, 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_MemoryCapacity(), theTypesPackage.getInteger(), "memoryCapacity", null, 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmStormCluster_HeartbeatFrequency(), theTypesPackage.getInteger(), "heartbeatFrequency", null, 0, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmStormCluster_Base_ExecutionEnvironment(), theUMLPackage.getExecutionEnvironment(), null, "base_ExecutionEnvironment", null, 1, 1, DdsmStormCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmJobSubmissionEClass, DdsmJobSubmission.class, "DdsmJobSubmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmJobSubmission_Base_Deployment(), theUMLPackage.getDeployment(), null, "base_Deployment", null, 1, 1, DdsmJobSubmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmJobSubmission_NumberOfSubmission(), theTypesPackage.getInteger(), "numberOfSubmission", null, 0, 1, DdsmJobSubmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmJobSubmission_IntervalBetweenSubmission(), theTypesPackage.getInteger(), "intervalBetweenSubmission", null, 0, 1, DdsmJobSubmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmBigDataJobEClass, DdsmBigDataJob.class, "DdsmBigDataJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmBigDataJob_Application(), theTypesPackage.getString(), "application", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmBigDataJob_Application_class(), theTypesPackage.getString(), "application_class", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmBigDataJob_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmBigDataJob_Application_name(), theTypesPackage.getString(), "application_name", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmBigDataJob_Arguments(), theTypesPackage.getString(), "arguments", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmJobDeployedFromEClass, DdsmJobDeployedFrom.class, "DdsmJobDeployedFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmJobDeployedFrom_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, DdsmJobDeployedFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmHdfsClusterEClass, DdsmHdfsCluster.class, "DdsmHdfsCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ddsmCassandraClusterEClass, DdsmCassandraCluster.class, "DdsmCassandraCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmCassandraCluster_SeedHost(), this.getDdsmVMsCluster(), null, "seedHost", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCassandraCluster_Key_cache_keys_to_save(), theTypesPackage.getInteger(), "key_cache_keys_to_save", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCassandraCluster_Key_cache_save_period(), theTypesPackage.getInteger(), "key_cache_save_period", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCassandraCluster_Memtable_cleanup_threshold(), theTypesPackage.getInteger(), "memtable_cleanup_threshold", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCassandraCluster_Memtable_flush_writers(), theTypesPackage.getInteger(), "memtable_flush_writers", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCassandraCluster_Authenticator_enabled(), theTypesPackage.getBoolean(), "authenticator_enabled", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCassandraCluster_Authorizer_enabled(), theTypesPackage.getBoolean(), "authorizer_enabled", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCassandraCluster_Permission_validity_in_ms(), theTypesPackage.getInteger(), "permission_validity_in_ms", null, 0, 1, DdsmCassandraCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //DDSMPackageImpl
