/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Big Data Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication <em>Application</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_class <em>Application class</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_name <em>Application name</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob()
 * @model
 * @generated
 */
public interface DdsmBigDataJob extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_Application()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Application class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application class</em>' attribute.
	 * @see #setApplication_class(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_Application_class()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getApplication_class();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_class <em>Application class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application class</em>' attribute.
	 * @see #getApplication_class()
	 * @generated
	 */
	void setApplication_class(String value);

	/**
	 * Returns the value of the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Artifact</em>' reference.
	 * @see #setBase_Artifact(Artifact)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_Base_Artifact()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Artifact getBase_Artifact();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Artifact</em>' reference.
	 * @see #getBase_Artifact()
	 * @generated
	 */
	void setBase_Artifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Application name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application name</em>' attribute.
	 * @see #setApplication_name(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_Application_name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getApplication_name();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getApplication_name <em>Application name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application name</em>' attribute.
	 * @see #getApplication_name()
	 * @generated
	 */
	void setApplication_name(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute.
	 * @see #setArguments(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_Arguments()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getArguments();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArguments <em>Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' attribute.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(String value);

} // DdsmBigDataJob
