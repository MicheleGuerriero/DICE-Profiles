/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmJobSubmission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Deployment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Job Submission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl#getBase_Deployment <em>Base Deployment</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl#getNumberOfSubmission <em>Number Of Submission</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl#getIntervalBetweenSubmission <em>Interval Between Submission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmJobSubmissionImpl extends MinimalEObjectImpl.Container implements DdsmJobSubmission {
	/**
	 * The cached value of the '{@link #getBase_Deployment() <em>Base Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Deployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment base_Deployment;

	/**
	 * The default value of the '{@link #getNumberOfSubmission() <em>Number Of Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSubmission()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SUBMISSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSubmission() <em>Number Of Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSubmission()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSubmission = NUMBER_OF_SUBMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalBetweenSubmission() <em>Interval Between Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalBetweenSubmission()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_BETWEEN_SUBMISSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntervalBetweenSubmission() <em>Interval Between Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalBetweenSubmission()
	 * @generated
	 * @ordered
	 */
	protected int intervalBetweenSubmission = INTERVAL_BETWEEN_SUBMISSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmJobSubmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_JOB_SUBMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getBase_Deployment() {
		if (base_Deployment != null && base_Deployment.eIsProxy()) {
			InternalEObject oldBase_Deployment = (InternalEObject)base_Deployment;
			base_Deployment = (Deployment)eResolveProxy(oldBase_Deployment);
			if (base_Deployment != oldBase_Deployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT, oldBase_Deployment, base_Deployment));
			}
		}
		return base_Deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetBase_Deployment() {
		return base_Deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Deployment(Deployment newBase_Deployment) {
		Deployment oldBase_Deployment = base_Deployment;
		base_Deployment = newBase_Deployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT, oldBase_Deployment, base_Deployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSubmission() {
		return numberOfSubmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSubmission(int newNumberOfSubmission) {
		int oldNumberOfSubmission = numberOfSubmission;
		numberOfSubmission = newNumberOfSubmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION, oldNumberOfSubmission, numberOfSubmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntervalBetweenSubmission() {
		return intervalBetweenSubmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalBetweenSubmission(int newIntervalBetweenSubmission) {
		int oldIntervalBetweenSubmission = intervalBetweenSubmission;
		intervalBetweenSubmission = newIntervalBetweenSubmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION, oldIntervalBetweenSubmission, intervalBetweenSubmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				if (resolve) return getBase_Deployment();
				return basicGetBase_Deployment();
			case DDSMPackage.DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION:
				return getNumberOfSubmission();
			case DDSMPackage.DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION:
				return getIntervalBetweenSubmission();
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
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				setBase_Deployment((Deployment)newValue);
				return;
			case DDSMPackage.DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION:
				setNumberOfSubmission((Integer)newValue);
				return;
			case DDSMPackage.DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION:
				setIntervalBetweenSubmission((Integer)newValue);
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
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				setBase_Deployment((Deployment)null);
				return;
			case DDSMPackage.DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION:
				setNumberOfSubmission(NUMBER_OF_SUBMISSION_EDEFAULT);
				return;
			case DDSMPackage.DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION:
				setIntervalBetweenSubmission(INTERVAL_BETWEEN_SUBMISSION_EDEFAULT);
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
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				return base_Deployment != null;
			case DDSMPackage.DDSM_JOB_SUBMISSION__NUMBER_OF_SUBMISSION:
				return numberOfSubmission != NUMBER_OF_SUBMISSION_EDEFAULT;
			case DDSMPackage.DDSM_JOB_SUBMISSION__INTERVAL_BETWEEN_SUBMISSION:
				return intervalBetweenSubmission != INTERVAL_BETWEEN_SUBMISSION_EDEFAULT;
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
		result.append(" (numberOfSubmission: ");
		result.append(numberOfSubmission);
		result.append(", intervalBetweenSubmission: ");
		result.append(intervalBetweenSubmission);
		result.append(')');
		return result.toString();
	}

} //DdsmJobSubmissionImpl
