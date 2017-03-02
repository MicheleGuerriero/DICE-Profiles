/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Heterogeneous Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHeterogeneousCluster#getHasVM <em>Has VM</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHeterogeneousCluster()
 * @model
 * @generated
 */
public interface DdsmHeterogeneousCluster extends DdsmExternalComponent {
	/**
	 * Returns the value of the '<em><b>Has VM</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.DDSM.DdsmVMsCluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has VM</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has VM</em>' reference list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHeterogeneousCluster_HasVM()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DdsmVMsCluster> getHasVM();

} // DdsmHeterogeneousCluster
