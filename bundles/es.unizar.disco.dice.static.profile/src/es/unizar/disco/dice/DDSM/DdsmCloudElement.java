/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Cloud Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getDescription <em>Description</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getPropertiesList <em>Properties List</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCloudElement()
 * @model abstract="true"
 * @generated
 */
public interface DdsmCloudElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCloudElement_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Properties List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties List</em>' attribute list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCloudElement_PropertiesList()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getPropertiesList();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCloudElement_Id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DdsmCloudElement
