/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.ProviderType;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmExternalComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Device;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm External Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl#getBase_Device <em>Base Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmExternalComponentImpl extends DdsmComponentImpl implements DdsmExternalComponent {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderType PROVIDER_EDEFAULT = ProviderType.FCO;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected ProviderType provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected String serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Device() <em>Base Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Device()
	 * @generated
	 * @ordered
	 */
	protected Device base_Device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmExternalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_EXTERNAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(ProviderType newProvider) {
		ProviderType oldProvider = provider;
		provider = newProvider == null ? PROVIDER_EDEFAULT : newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_EXTERNAL_COMPONENT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(String newServiceType) {
		String oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_EXTERNAL_COMPONENT__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_EXTERNAL_COMPONENT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getBase_Device() {
		if (base_Device != null && base_Device.eIsProxy()) {
			InternalEObject oldBase_Device = (InternalEObject)base_Device;
			base_Device = (Device)eResolveProxy(oldBase_Device);
			if (base_Device != oldBase_Device) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_EXTERNAL_COMPONENT__BASE_DEVICE, oldBase_Device, base_Device));
			}
		}
		return base_Device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetBase_Device() {
		return base_Device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Device(Device newBase_Device) {
		Device oldBase_Device = base_Device;
		base_Device = newBase_Device;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_EXTERNAL_COMPONENT__BASE_DEVICE, oldBase_Device, base_Device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOCATION:
				return getLocation();
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PROVIDER:
				return getProvider();
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE:
				return getServiceType();
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__REGION:
				return getRegion();
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOGIN:
				return getLogin();
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PASSWORD:
				return getPassword();
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__BASE_DEVICE:
				if (resolve) return getBase_Device();
				return basicGetBase_Device();
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
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOCATION:
				setLocation((String)newValue);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PROVIDER:
				setProvider((ProviderType)newValue);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE:
				setServiceType((String)newValue);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__REGION:
				setRegion((String)newValue);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOGIN:
				setLogin((String)newValue);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PASSWORD:
				setPassword((String)newValue);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__BASE_DEVICE:
				setBase_Device((Device)newValue);
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
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__BASE_DEVICE:
				setBase_Device((Device)null);
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
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PROVIDER:
				return provider != PROVIDER_EDEFAULT;
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE:
				return SERVICE_TYPE_EDEFAULT == null ? serviceType != null : !SERVICE_TYPE_EDEFAULT.equals(serviceType);
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT__BASE_DEVICE:
				return base_Device != null;
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
		result.append(" (location: ");
		result.append(location);
		result.append(", provider: ");
		result.append(provider);
		result.append(", serviceType: ");
		result.append(serviceType);
		result.append(", region: ");
		result.append(region);
		result.append(", login: ");
		result.append(login);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //DdsmExternalComponentImpl
