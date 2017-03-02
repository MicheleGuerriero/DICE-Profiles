/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster;
import es.unizar.disco.dice.DDSM.DdsmVMsCluster;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Heterogeneous Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHeterogeneousClusterImpl#getHasVM <em>Has VM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmHeterogeneousClusterImpl extends DdsmExternalComponentImpl implements DdsmHeterogeneousCluster {
	/**
	 * The cached value of the '{@link #getHasVM() <em>Has VM</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasVM()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsmVMsCluster> hasVM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmHeterogeneousClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_HETEROGENEOUS_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsmVMsCluster> getHasVM() {
		if (hasVM == null) {
			hasVM = new EObjectResolvingEList<DdsmVMsCluster>(DdsmVMsCluster.class, this, DDSMPackage.DDSM_HETEROGENEOUS_CLUSTER__HAS_VM);
		}
		return hasVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_HETEROGENEOUS_CLUSTER__HAS_VM:
				return getHasVM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDSMPackage.DDSM_HETEROGENEOUS_CLUSTER__HAS_VM:
				getHasVM().clear();
				getHasVM().addAll((Collection<? extends DdsmVMsCluster>)newValue);
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
			case DDSMPackage.DDSM_HETEROGENEOUS_CLUSTER__HAS_VM:
				getHasVM().clear();
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
			case DDSMPackage.DDSM_HETEROGENEOUS_CLUSTER__HAS_VM:
				return hasVM != null && !hasVM.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DdsmHeterogeneousClusterImpl
