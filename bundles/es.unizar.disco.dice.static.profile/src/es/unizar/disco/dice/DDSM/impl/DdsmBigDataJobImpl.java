/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmBigDataJob;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Big Data Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getApplication_class <em>Application class</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getApplication_name <em>Application name</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmBigDataJobImpl extends MinimalEObjectImpl.Container implements DdsmBigDataJob {
	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplication_class() <em>Application class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication_class()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication_class() <em>Application class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication_class()
	 * @generated
	 * @ordered
	 */
	protected String application_class = APPLICATION_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Artifact() <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Artifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact base_Artifact;

	/**
	 * The default value of the '{@link #getApplication_name() <em>Application name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication_name()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication_name() <em>Application name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication_name()
	 * @generated
	 * @ordered
	 */
	protected String application_name = APPLICATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArguments() <em>Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected String arguments = ARGUMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmBigDataJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_BIG_DATA_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication_class() {
		return application_class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication_class(String newApplication_class) {
		String oldApplication_class = application_class;
		application_class = newApplication_class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_CLASS, oldApplication_class, application_class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getBase_Artifact() {
		if (base_Artifact != null && base_Artifact.eIsProxy()) {
			InternalEObject oldBase_Artifact = (InternalEObject)base_Artifact;
			base_Artifact = (Artifact)eResolveProxy(oldBase_Artifact);
			if (base_Artifact != oldBase_Artifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
			}
		}
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetBase_Artifact() {
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Artifact(Artifact newBase_Artifact) {
		Artifact oldBase_Artifact = base_Artifact;
		base_Artifact = newBase_Artifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication_name() {
		return application_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication_name(String newApplication_name) {
		String oldApplication_name = application_name;
		application_name = newApplication_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_NAME, oldApplication_name, application_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArguments() {
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArguments(String newArguments) {
		String oldArguments = arguments;
		arguments = newArguments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__ARGUMENTS, oldArguments, arguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION:
				return getApplication();
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_CLASS:
				return getApplication_class();
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_NAME:
				return getApplication_name();
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARGUMENTS:
				return getArguments();
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
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION:
				setApplication((String)newValue);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_CLASS:
				setApplication_class((String)newValue);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_NAME:
				setApplication_name((String)newValue);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARGUMENTS:
				setArguments((String)newValue);
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
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_CLASS:
				setApplication_class(APPLICATION_CLASS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_NAME:
				setApplication_name(APPLICATION_NAME_EDEFAULT);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARGUMENTS:
				setArguments(ARGUMENTS_EDEFAULT);
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
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_CLASS:
				return APPLICATION_CLASS_EDEFAULT == null ? application_class != null : !APPLICATION_CLASS_EDEFAULT.equals(application_class);
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				return base_Artifact != null;
			case DDSMPackage.DDSM_BIG_DATA_JOB__APPLICATION_NAME:
				return APPLICATION_NAME_EDEFAULT == null ? application_name != null : !APPLICATION_NAME_EDEFAULT.equals(application_name);
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARGUMENTS:
				return ARGUMENTS_EDEFAULT == null ? arguments != null : !ARGUMENTS_EDEFAULT.equals(arguments);
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
		result.append(" (application: ");
		result.append(application);
		result.append(", application_class: ");
		result.append(application_class);
		result.append(", application_name: ");
		result.append(application_name);
		result.append(", arguments: ");
		result.append(arguments);
		result.append(')');
		return result.toString();
	}

} //DdsmBigDataJobImpl
