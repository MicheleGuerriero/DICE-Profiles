/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmCassandraCluster;
import es.unizar.disco.dice.DDSM.DdsmVMsCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Cassandra Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#getSeedHost <em>Seed Host</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#getKey_cache_keys_to_save <em>Key cache keys to save</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#getKey_cache_save_period <em>Key cache save period</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#getMemtable_cleanup_threshold <em>Memtable cleanup threshold</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#getMemtable_flush_writers <em>Memtable flush writers</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#isAuthenticator_enabled <em>Authenticator enabled</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#isAuthorizer_enabled <em>Authorizer enabled</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmCassandraClusterImpl#getPermission_validity_in_ms <em>Permission validity in ms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmCassandraClusterImpl extends DdsmPeerToPeerPlatformImpl implements DdsmCassandraCluster {
	/**
	 * The cached value of the '{@link #getSeedHost() <em>Seed Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedHost()
	 * @generated
	 * @ordered
	 */
	protected DdsmVMsCluster seedHost;

	/**
	 * The default value of the '{@link #getKey_cache_keys_to_save() <em>Key cache keys to save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_cache_keys_to_save()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_CACHE_KEYS_TO_SAVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey_cache_keys_to_save() <em>Key cache keys to save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_cache_keys_to_save()
	 * @generated
	 * @ordered
	 */
	protected int key_cache_keys_to_save = KEY_CACHE_KEYS_TO_SAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey_cache_save_period() <em>Key cache save period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_cache_save_period()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_CACHE_SAVE_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey_cache_save_period() <em>Key cache save period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_cache_save_period()
	 * @generated
	 * @ordered
	 */
	protected int key_cache_save_period = KEY_CACHE_SAVE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemtable_cleanup_threshold() <em>Memtable cleanup threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemtable_cleanup_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMTABLE_CLEANUP_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemtable_cleanup_threshold() <em>Memtable cleanup threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemtable_cleanup_threshold()
	 * @generated
	 * @ordered
	 */
	protected int memtable_cleanup_threshold = MEMTABLE_CLEANUP_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemtable_flush_writers() <em>Memtable flush writers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemtable_flush_writers()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMTABLE_FLUSH_WRITERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemtable_flush_writers() <em>Memtable flush writers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemtable_flush_writers()
	 * @generated
	 * @ordered
	 */
	protected int memtable_flush_writers = MEMTABLE_FLUSH_WRITERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAuthenticator_enabled() <em>Authenticator enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticator_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHENTICATOR_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthenticator_enabled() <em>Authenticator enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticator_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean authenticator_enabled = AUTHENTICATOR_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAuthorizer_enabled() <em>Authorizer enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorizer_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHORIZER_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthorizer_enabled() <em>Authorizer enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorizer_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean authorizer_enabled = AUTHORIZER_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermission_validity_in_ms() <em>Permission validity in ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission_validity_in_ms()
	 * @generated
	 * @ordered
	 */
	protected static final int PERMISSION_VALIDITY_IN_MS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPermission_validity_in_ms() <em>Permission validity in ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission_validity_in_ms()
	 * @generated
	 * @ordered
	 */
	protected int permission_validity_in_ms = PERMISSION_VALIDITY_IN_MS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmCassandraClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_CASSANDRA_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVMsCluster getSeedHost() {
		if (seedHost != null && seedHost.eIsProxy()) {
			InternalEObject oldSeedHost = (InternalEObject)seedHost;
			seedHost = (DdsmVMsCluster)eResolveProxy(oldSeedHost);
			if (seedHost != oldSeedHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_CASSANDRA_CLUSTER__SEED_HOST, oldSeedHost, seedHost));
			}
		}
		return seedHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVMsCluster basicGetSeedHost() {
		return seedHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeedHost(DdsmVMsCluster newSeedHost) {
		DdsmVMsCluster oldSeedHost = seedHost;
		seedHost = newSeedHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__SEED_HOST, oldSeedHost, seedHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey_cache_keys_to_save() {
		return key_cache_keys_to_save;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey_cache_keys_to_save(int newKey_cache_keys_to_save) {
		int oldKey_cache_keys_to_save = key_cache_keys_to_save;
		key_cache_keys_to_save = newKey_cache_keys_to_save;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE, oldKey_cache_keys_to_save, key_cache_keys_to_save));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey_cache_save_period() {
		return key_cache_save_period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey_cache_save_period(int newKey_cache_save_period) {
		int oldKey_cache_save_period = key_cache_save_period;
		key_cache_save_period = newKey_cache_save_period;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD, oldKey_cache_save_period, key_cache_save_period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemtable_cleanup_threshold() {
		return memtable_cleanup_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemtable_cleanup_threshold(int newMemtable_cleanup_threshold) {
		int oldMemtable_cleanup_threshold = memtable_cleanup_threshold;
		memtable_cleanup_threshold = newMemtable_cleanup_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD, oldMemtable_cleanup_threshold, memtable_cleanup_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemtable_flush_writers() {
		return memtable_flush_writers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemtable_flush_writers(int newMemtable_flush_writers) {
		int oldMemtable_flush_writers = memtable_flush_writers;
		memtable_flush_writers = newMemtable_flush_writers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS, oldMemtable_flush_writers, memtable_flush_writers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthenticator_enabled() {
		return authenticator_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticator_enabled(boolean newAuthenticator_enabled) {
		boolean oldAuthenticator_enabled = authenticator_enabled;
		authenticator_enabled = newAuthenticator_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED, oldAuthenticator_enabled, authenticator_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthorizer_enabled() {
		return authorizer_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizer_enabled(boolean newAuthorizer_enabled) {
		boolean oldAuthorizer_enabled = authorizer_enabled;
		authorizer_enabled = newAuthorizer_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED, oldAuthorizer_enabled, authorizer_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPermission_validity_in_ms() {
		return permission_validity_in_ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission_validity_in_ms(int newPermission_validity_in_ms) {
		int oldPermission_validity_in_ms = permission_validity_in_ms;
		permission_validity_in_ms = newPermission_validity_in_ms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS, oldPermission_validity_in_ms, permission_validity_in_ms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__SEED_HOST:
				if (resolve) return getSeedHost();
				return basicGetSeedHost();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE:
				return getKey_cache_keys_to_save();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD:
				return getKey_cache_save_period();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD:
				return getMemtable_cleanup_threshold();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS:
				return getMemtable_flush_writers();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED:
				return isAuthenticator_enabled();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED:
				return isAuthorizer_enabled();
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS:
				return getPermission_validity_in_ms();
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
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__SEED_HOST:
				setSeedHost((DdsmVMsCluster)newValue);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE:
				setKey_cache_keys_to_save((Integer)newValue);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD:
				setKey_cache_save_period((Integer)newValue);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD:
				setMemtable_cleanup_threshold((Integer)newValue);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS:
				setMemtable_flush_writers((Integer)newValue);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED:
				setAuthenticator_enabled((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED:
				setAuthorizer_enabled((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS:
				setPermission_validity_in_ms((Integer)newValue);
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
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__SEED_HOST:
				setSeedHost((DdsmVMsCluster)null);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE:
				setKey_cache_keys_to_save(KEY_CACHE_KEYS_TO_SAVE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD:
				setKey_cache_save_period(KEY_CACHE_SAVE_PERIOD_EDEFAULT);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD:
				setMemtable_cleanup_threshold(MEMTABLE_CLEANUP_THRESHOLD_EDEFAULT);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS:
				setMemtable_flush_writers(MEMTABLE_FLUSH_WRITERS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED:
				setAuthenticator_enabled(AUTHENTICATOR_ENABLED_EDEFAULT);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED:
				setAuthorizer_enabled(AUTHORIZER_ENABLED_EDEFAULT);
				return;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS:
				setPermission_validity_in_ms(PERMISSION_VALIDITY_IN_MS_EDEFAULT);
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
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__SEED_HOST:
				return seedHost != null;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_KEYS_TO_SAVE:
				return key_cache_keys_to_save != KEY_CACHE_KEYS_TO_SAVE_EDEFAULT;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__KEY_CACHE_SAVE_PERIOD:
				return key_cache_save_period != KEY_CACHE_SAVE_PERIOD_EDEFAULT;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_CLEANUP_THRESHOLD:
				return memtable_cleanup_threshold != MEMTABLE_CLEANUP_THRESHOLD_EDEFAULT;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__MEMTABLE_FLUSH_WRITERS:
				return memtable_flush_writers != MEMTABLE_FLUSH_WRITERS_EDEFAULT;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHENTICATOR_ENABLED:
				return authenticator_enabled != AUTHENTICATOR_ENABLED_EDEFAULT;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__AUTHORIZER_ENABLED:
				return authorizer_enabled != AUTHORIZER_ENABLED_EDEFAULT;
			case DDSMPackage.DDSM_CASSANDRA_CLUSTER__PERMISSION_VALIDITY_IN_MS:
				return permission_validity_in_ms != PERMISSION_VALIDITY_IN_MS_EDEFAULT;
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
		result.append(" (key_cache_keys_to_save: ");
		result.append(key_cache_keys_to_save);
		result.append(", key_cache_save_period: ");
		result.append(key_cache_save_period);
		result.append(", memtable_cleanup_threshold: ");
		result.append(memtable_cleanup_threshold);
		result.append(", memtable_flush_writers: ");
		result.append(memtable_flush_writers);
		result.append(", authenticator_enabled: ");
		result.append(authenticator_enabled);
		result.append(", authorizer_enabled: ");
		result.append(authorizer_enabled);
		result.append(", permission_validity_in_ms: ");
		result.append(permission_validity_in_ms);
		result.append(')');
		return result.toString();
	}

} //DdsmCassandraClusterImpl
