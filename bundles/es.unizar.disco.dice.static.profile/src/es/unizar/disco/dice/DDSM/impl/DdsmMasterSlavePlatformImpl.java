/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmMasterSlavePlatform;
import es.unizar.disco.dice.DDSM.DdsmVMsCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Master Slave Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmMasterSlavePlatformImpl#getMasterHost <em>Master Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmMasterSlavePlatformImpl extends DdsmInternalComponentImpl implements DdsmMasterSlavePlatform {
	/**
	 * The cached value of the '{@link #getMasterHost() <em>Master Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterHost()
	 * @generated
	 * @ordered
	 */
	protected DdsmVMsCluster masterHost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmMasterSlavePlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_MASTER_SLAVE_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVMsCluster getMasterHost() {
		if (masterHost != null && masterHost.eIsProxy()) {
			InternalEObject oldMasterHost = (InternalEObject)masterHost;
			masterHost = (DdsmVMsCluster)eResolveProxy(oldMasterHost);
			if (masterHost != oldMasterHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST, oldMasterHost, masterHost));
			}
		}
		return masterHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVMsCluster basicGetMasterHost() {
		return masterHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterHost(DdsmVMsCluster newMasterHost) {
		DdsmVMsCluster oldMasterHost = masterHost;
		masterHost = newMasterHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST, oldMasterHost, masterHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST:
				if (resolve) return getMasterHost();
				return basicGetMasterHost();
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
			case DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST:
				setMasterHost((DdsmVMsCluster)newValue);
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
			case DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST:
				setMasterHost((DdsmVMsCluster)null);
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
			case DDSMPackage.DDSM_MASTER_SLAVE_PLATFORM__MASTER_HOST:
				return masterHost != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsmMasterSlavePlatformImpl
