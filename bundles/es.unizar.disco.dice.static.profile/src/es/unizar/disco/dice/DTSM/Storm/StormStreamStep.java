/**
 */
package es.unizar.disco.dice.DTSM.Storm;

import es.unizar.disco.dice.Basic_Enumeration_Types.StreamPolicy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getNumTuples <em>Num Tuples</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getProbFields <em>Prob Fields</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormStreamStep()
 * @model
 * @generated
 */
public interface StormStreamStep extends GaStep {
	/**
	 * Returns the value of the '<em><b>Num Tuples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Tuples</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tuples</em>' attribute.
	 * @see #setNumTuples(String)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormStreamStep_NumTuples()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getNumTuples();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getNumTuples <em>Num Tuples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Tuples</em>' attribute.
	 * @see #getNumTuples()
	 * @generated
	 */
	void setNumTuples(String value);

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.StreamPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.StreamPolicy
	 * @see #setGrouping(StreamPolicy)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormStreamStep_Grouping()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StreamPolicy getGrouping();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.StreamPolicy
	 * @see #getGrouping()
	 * @generated
	 */
	void setGrouping(StreamPolicy value);

	/**
	 * Returns the value of the '<em><b>Prob Fields</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob Fields</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob Fields</em>' attribute list.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormStreamStep_ProbFields()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getProbFields();

} // StormStreamStep
