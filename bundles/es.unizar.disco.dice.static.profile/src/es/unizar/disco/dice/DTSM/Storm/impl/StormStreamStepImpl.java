/**
 */
package es.unizar.disco.dice.DTSM.Storm.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.StreamPolicy;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;
import es.unizar.disco.dice.DTSM.Storm.StormStreamStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormStreamStepImpl#getNumTuples <em>Num Tuples</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormStreamStepImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormStreamStepImpl#getProbFields <em>Prob Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormStreamStepImpl extends GaStepImpl implements StormStreamStep {
	/**
	 * The default value of the '{@link #getNumTuples() <em>Num Tuples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTuples()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_TUPLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumTuples() <em>Num Tuples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTuples()
	 * @generated
	 * @ordered
	 */
	protected String numTuples = NUM_TUPLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final StreamPolicy GROUPING_EDEFAULT = StreamPolicy.ALL;

	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected StreamPolicy grouping = GROUPING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProbFields() <em>Prob Fields</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbFields()
	 * @generated
	 * @ordered
	 */
	protected EList<String> probFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormStreamStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.STORM_STREAM_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumTuples() {
		return numTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTuples(String newNumTuples) {
		String oldNumTuples = numTuples;
		numTuples = newNumTuples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_STREAM_STEP__NUM_TUPLES, oldNumTuples, numTuples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamPolicy getGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(StreamPolicy newGrouping) {
		StreamPolicy oldGrouping = grouping;
		grouping = newGrouping == null ? GROUPING_EDEFAULT : newGrouping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_STREAM_STEP__GROUPING, oldGrouping, grouping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProbFields() {
		if (probFields == null) {
			probFields = new EDataTypeUniqueEList<String>(String.class, this, StormPackage.STORM_STREAM_STEP__PROB_FIELDS);
		}
		return probFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StormPackage.STORM_STREAM_STEP__NUM_TUPLES:
				return getNumTuples();
			case StormPackage.STORM_STREAM_STEP__GROUPING:
				return getGrouping();
			case StormPackage.STORM_STREAM_STEP__PROB_FIELDS:
				return getProbFields();
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
			case StormPackage.STORM_STREAM_STEP__NUM_TUPLES:
				setNumTuples((String)newValue);
				return;
			case StormPackage.STORM_STREAM_STEP__GROUPING:
				setGrouping((StreamPolicy)newValue);
				return;
			case StormPackage.STORM_STREAM_STEP__PROB_FIELDS:
				getProbFields().clear();
				getProbFields().addAll((Collection<? extends String>)newValue);
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
			case StormPackage.STORM_STREAM_STEP__NUM_TUPLES:
				setNumTuples(NUM_TUPLES_EDEFAULT);
				return;
			case StormPackage.STORM_STREAM_STEP__GROUPING:
				setGrouping(GROUPING_EDEFAULT);
				return;
			case StormPackage.STORM_STREAM_STEP__PROB_FIELDS:
				getProbFields().clear();
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
			case StormPackage.STORM_STREAM_STEP__NUM_TUPLES:
				return NUM_TUPLES_EDEFAULT == null ? numTuples != null : !NUM_TUPLES_EDEFAULT.equals(numTuples);
			case StormPackage.STORM_STREAM_STEP__GROUPING:
				return grouping != GROUPING_EDEFAULT;
			case StormPackage.STORM_STREAM_STEP__PROB_FIELDS:
				return probFields != null && !probFields.isEmpty();
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
		result.append(" (numTuples: ");
		result.append(numTuples);
		result.append(", grouping: ");
		result.append(grouping);
		result.append(", probFields: ");
		result.append(probFields);
		result.append(')');
		return result.toString();
	}

} //StormStreamStepImpl
