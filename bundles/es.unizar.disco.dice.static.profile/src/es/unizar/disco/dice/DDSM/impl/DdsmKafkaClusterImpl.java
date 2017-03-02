/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmKafkaCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Kafka Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmKafkaClusterImpl extends DdsmPeerToPeerPlatformImpl implements DdsmKafkaCluster {
	/**
	 * The cached value of the '{@link #getBase_ExecutionEnvironment() <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironment base_ExecutionEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmKafkaClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_KAFKA_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment getBase_ExecutionEnvironment() {
		if (base_ExecutionEnvironment != null && base_ExecutionEnvironment.eIsProxy()) {
			InternalEObject oldBase_ExecutionEnvironment = (InternalEObject)base_ExecutionEnvironment;
			base_ExecutionEnvironment = (ExecutionEnvironment)eResolveProxy(oldBase_ExecutionEnvironment);
			if (base_ExecutionEnvironment != oldBase_ExecutionEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
			}
		}
		return base_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment basicGetBase_ExecutionEnvironment() {
		return base_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ExecutionEnvironment(ExecutionEnvironment newBase_ExecutionEnvironment) {
		ExecutionEnvironment oldBase_ExecutionEnvironment = base_ExecutionEnvironment;
		base_ExecutionEnvironment = newBase_ExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				if (resolve) return getBase_ExecutionEnvironment();
				return basicGetBase_ExecutionEnvironment();
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
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)newValue);
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
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)null);
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
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				return base_ExecutionEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsmKafkaClusterImpl
