/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Job Submission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment <em>Base Deployment</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getNumberOfSubmission <em>Number Of Submission</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getIntervalBetweenSubmission <em>Interval Between Submission</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmJobSubmission()
 * @model
 * @generated
 */
public interface DdsmJobSubmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Deployment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Deployment</em>' reference.
	 * @see #setBase_Deployment(Deployment)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmJobSubmission_Base_Deployment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Deployment getBase_Deployment();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment <em>Base Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Deployment</em>' reference.
	 * @see #getBase_Deployment()
	 * @generated
	 */
	void setBase_Deployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Number Of Submission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Submission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Submission</em>' attribute.
	 * @see #setNumberOfSubmission(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmJobSubmission_NumberOfSubmission()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNumberOfSubmission();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getNumberOfSubmission <em>Number Of Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Submission</em>' attribute.
	 * @see #getNumberOfSubmission()
	 * @generated
	 */
	void setNumberOfSubmission(int value);

	/**
	 * Returns the value of the '<em><b>Interval Between Submission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Between Submission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Between Submission</em>' attribute.
	 * @see #setIntervalBetweenSubmission(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmJobSubmission_IntervalBetweenSubmission()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getIntervalBetweenSubmission();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getIntervalBetweenSubmission <em>Interval Between Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Between Submission</em>' attribute.
	 * @see #getIntervalBetweenSubmission()
	 * @generated
	 */
	void setIntervalBetweenSubmission(int value);

} // DdsmJobSubmission
