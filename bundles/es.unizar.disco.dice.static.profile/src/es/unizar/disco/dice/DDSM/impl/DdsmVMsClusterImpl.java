/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.VMSize;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmVMsCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm VMs Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#isIs64os <em>Is64os</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getMaxRam <em>Max Ram</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getOs <em>Os</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getPublicAddress <em>Public Address</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmVMsClusterImpl#getGenericSize <em>Generic Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmVMsClusterImpl extends DdsmExternalComponentImpl implements DdsmVMsCluster {
	/**
	 * The default value of the '{@link #isIs64os() <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs64os()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS64OS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIs64os() <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs64os()
	 * @generated
	 * @ordered
	 */
	protected boolean is64os = IS64OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected String imageId = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCores()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCores()
	 * @generated
	 * @ordered
	 */
	protected int maxCores = MAX_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRam() <em>Max Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRam()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRam() <em>Max Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRam()
	 * @generated
	 * @ordered
	 */
	protected int maxRam = MAX_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxStorage() <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxStorage() <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStorage()
	 * @generated
	 * @ordered
	 */
	protected int maxStorage = MAX_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCores()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCores()
	 * @generated
	 * @ordered
	 */
	protected int minCores = MIN_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRam()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRam()
	 * @generated
	 * @ordered
	 */
	protected int minRam = MIN_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinStorage() <em>Min Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinStorage() <em>Min Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStorage()
	 * @generated
	 * @ordered
	 */
	protected int minStorage = MIN_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected String securityGroup = SECURITY_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshKey()
	 * @generated
	 * @ordered
	 */
	protected String sshKey = SSH_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicAddress()
	 * @generated
	 * @ordered
	 */
	protected String publicAddress = PUBLIC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected int instances = INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenericSize() <em>Generic Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericSize()
	 * @generated
	 * @ordered
	 */
	protected static final VMSize GENERIC_SIZE_EDEFAULT = VMSize.SMALL;

	/**
	 * The cached value of the '{@link #getGenericSize() <em>Generic Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericSize()
	 * @generated
	 * @ordered
	 */
	protected VMSize genericSize = GENERIC_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmVMsClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_VMS_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs64os() {
		return is64os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs64os(boolean newIs64os) {
		boolean oldIs64os = is64os;
		is64os = newIs64os;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__IS64OS, oldIs64os, is64os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageId(String newImageId) {
		String oldImageId = imageId;
		imageId = newImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__IMAGE_ID, oldImageId, imageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCores() {
		return maxCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCores(int newMaxCores) {
		int oldMaxCores = maxCores;
		maxCores = newMaxCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__MAX_CORES, oldMaxCores, maxCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRam() {
		return maxRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRam(int newMaxRam) {
		int oldMaxRam = maxRam;
		maxRam = newMaxRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__MAX_RAM, oldMaxRam, maxRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxStorage() {
		return maxStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStorage(int newMaxStorage) {
		int oldMaxStorage = maxStorage;
		maxStorage = newMaxStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__MAX_STORAGE, oldMaxStorage, maxStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCores() {
		return minCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCores(int newMinCores) {
		int oldMinCores = minCores;
		minCores = newMinCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__MIN_CORES, oldMinCores, minCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinRam() {
		return minRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRam(int newMinRam) {
		int oldMinRam = minRam;
		minRam = newMinRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__MIN_RAM, oldMinRam, minRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinStorage() {
		return minStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStorage(int newMinStorage) {
		int oldMinStorage = minStorage;
		minStorage = newMinStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__MIN_STORAGE, oldMinStorage, minStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroup() {
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroup(String newSecurityGroup) {
		String oldSecurityGroup = securityGroup;
		securityGroup = newSecurityGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__SECURITY_GROUP, oldSecurityGroup, securityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__PRIVATE_KEY, oldPrivateKey, privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshKey() {
		return sshKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshKey(String newSshKey) {
		String oldSshKey = sshKey;
		sshKey = newSshKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__SSH_KEY, oldSshKey, sshKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicAddress() {
		return publicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicAddress(String newPublicAddress) {
		String oldPublicAddress = publicAddress;
		publicAddress = newPublicAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__PUBLIC_ADDRESS, oldPublicAddress, publicAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(int newInstances) {
		int oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__INSTANCES, oldInstances, instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMSize getGenericSize() {
		return genericSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericSize(VMSize newGenericSize) {
		VMSize oldGenericSize = genericSize;
		genericSize = newGenericSize == null ? GENERIC_SIZE_EDEFAULT : newGenericSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_VMS_CLUSTER__GENERIC_SIZE, oldGenericSize, genericSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_VMS_CLUSTER__IS64OS:
				return isIs64os();
			case DDSMPackage.DDSM_VMS_CLUSTER__IMAGE_ID:
				return getImageId();
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_CORES:
				return getMaxCores();
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_RAM:
				return getMaxRam();
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_STORAGE:
				return getMaxStorage();
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_CORES:
				return getMinCores();
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_RAM:
				return getMinRam();
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_STORAGE:
				return getMinStorage();
			case DDSMPackage.DDSM_VMS_CLUSTER__OS:
				return getOs();
			case DDSMPackage.DDSM_VMS_CLUSTER__SECURITY_GROUP:
				return getSecurityGroup();
			case DDSMPackage.DDSM_VMS_CLUSTER__PRIVATE_KEY:
				return getPrivateKey();
			case DDSMPackage.DDSM_VMS_CLUSTER__SSH_KEY:
				return getSshKey();
			case DDSMPackage.DDSM_VMS_CLUSTER__PUBLIC_ADDRESS:
				return getPublicAddress();
			case DDSMPackage.DDSM_VMS_CLUSTER__INSTANCES:
				return getInstances();
			case DDSMPackage.DDSM_VMS_CLUSTER__GENERIC_SIZE:
				return getGenericSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDSMPackage.DDSM_VMS_CLUSTER__IS64OS:
				setIs64os((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__IMAGE_ID:
				setImageId((String)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_CORES:
				setMaxCores((Integer)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_RAM:
				setMaxRam((Integer)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_STORAGE:
				setMaxStorage((Integer)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_CORES:
				setMinCores((Integer)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_RAM:
				setMinRam((Integer)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_STORAGE:
				setMinStorage((Integer)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__OS:
				setOs((String)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__SECURITY_GROUP:
				setSecurityGroup((String)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__PRIVATE_KEY:
				setPrivateKey((String)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__SSH_KEY:
				setSshKey((String)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__PUBLIC_ADDRESS:
				setPublicAddress((String)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__INSTANCES:
				setInstances((Integer)newValue);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__GENERIC_SIZE:
				setGenericSize((VMSize)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_VMS_CLUSTER__IS64OS:
				setIs64os(IS64OS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__IMAGE_ID:
				setImageId(IMAGE_ID_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_CORES:
				setMaxCores(MAX_CORES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_RAM:
				setMaxRam(MAX_RAM_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_STORAGE:
				setMaxStorage(MAX_STORAGE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_CORES:
				setMinCores(MIN_CORES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_RAM:
				setMinRam(MIN_RAM_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_STORAGE:
				setMinStorage(MIN_STORAGE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__OS:
				setOs(OS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__SECURITY_GROUP:
				setSecurityGroup(SECURITY_GROUP_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__PRIVATE_KEY:
				setPrivateKey(PRIVATE_KEY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__SSH_KEY:
				setSshKey(SSH_KEY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__PUBLIC_ADDRESS:
				setPublicAddress(PUBLIC_ADDRESS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__INSTANCES:
				setInstances(INSTANCES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_VMS_CLUSTER__GENERIC_SIZE:
				setGenericSize(GENERIC_SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_VMS_CLUSTER__IS64OS:
				return is64os != IS64OS_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_CORES:
				return maxCores != MAX_CORES_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_RAM:
				return maxRam != MAX_RAM_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__MAX_STORAGE:
				return maxStorage != MAX_STORAGE_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_CORES:
				return minCores != MIN_CORES_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_RAM:
				return minRam != MIN_RAM_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__MIN_STORAGE:
				return minStorage != MIN_STORAGE_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DDSMPackage.DDSM_VMS_CLUSTER__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? securityGroup != null : !SECURITY_GROUP_EDEFAULT.equals(securityGroup);
			case DDSMPackage.DDSM_VMS_CLUSTER__PRIVATE_KEY:
				return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
			case DDSMPackage.DDSM_VMS_CLUSTER__SSH_KEY:
				return SSH_KEY_EDEFAULT == null ? sshKey != null : !SSH_KEY_EDEFAULT.equals(sshKey);
			case DDSMPackage.DDSM_VMS_CLUSTER__PUBLIC_ADDRESS:
				return PUBLIC_ADDRESS_EDEFAULT == null ? publicAddress != null : !PUBLIC_ADDRESS_EDEFAULT.equals(publicAddress);
			case DDSMPackage.DDSM_VMS_CLUSTER__INSTANCES:
				return instances != INSTANCES_EDEFAULT;
			case DDSMPackage.DDSM_VMS_CLUSTER__GENERIC_SIZE:
				return genericSize != GENERIC_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (is64os: ");
		result.append(is64os);
		result.append(", imageId: ");
		result.append(imageId);
		result.append(", maxCores: ");
		result.append(maxCores);
		result.append(", maxRam: ");
		result.append(maxRam);
		result.append(", maxStorage: ");
		result.append(maxStorage);
		result.append(", minCores: ");
		result.append(minCores);
		result.append(", minRam: ");
		result.append(minRam);
		result.append(", minStorage: ");
		result.append(minStorage);
		result.append(", os: ");
		result.append(os);
		result.append(", securityGroup: ");
		result.append(securityGroup);
		result.append(", privateKey: ");
		result.append(privateKey);
		result.append(", sshKey: ");
		result.append(sshKey);
		result.append(", publicAddress: ");
		result.append(publicAddress);
		result.append(", instances: ");
		result.append(instances);
		result.append(", genericSize: ");
		result.append(genericSize);
		result.append(')');
		return result.toString();
	}

} //DdsmVMsClusterImpl
