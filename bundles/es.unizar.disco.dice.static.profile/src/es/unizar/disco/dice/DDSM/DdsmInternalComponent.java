/**
 */
package es.unizar.disco.dice.DDSM;

import es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Internal Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getRequiredPort <em>Required Port</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getIsFrontEnd <em>Is Front End</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node <em>Base Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#isProtected <em>Protected</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLaunch_script <em>Launch script</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent()
 * @model
 * @generated
 */
public interface DdsmInternalComponent extends DdsmComponent {
	/**
	 * Returns the value of the '<em><b>Required Port</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.DDSM.DdsmPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port</em>' reference list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_RequiredPort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DdsmPort> getRequiredPort();

	/**
	 * Returns the value of the '<em><b>Is Front End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Front End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Front End</em>' attribute.
	 * @see #setIsFrontEnd(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_IsFrontEnd()
	 * @model default="false" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getIsFrontEnd();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getIsFrontEnd <em>Is Front End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Front End</em>' attribute.
	 * @see #getIsFrontEnd()
	 * @generated
	 */
	void setIsFrontEnd(String value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType
	 * @see #setComponentType(DDSMcomponentType)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_ComponentType()
	 * @model ordered="false"
	 * @generated
	 */
	DDSMcomponentType getComponentType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(DDSMcomponentType value);

	/**
	 * Returns the value of the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Node</em>' reference.
	 * @see #setBase_Node(Node)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_Base_Node()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getBase_Node();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Node</em>' reference.
	 * @see #getBase_Node()
	 * @generated
	 */
	void setBase_Node(Node value);

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see #setProtected(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_Protected()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isProtected();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#isProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see #isProtected()
	 * @generated
	 */
	void setProtected(boolean value);

	/**
	 * Returns the value of the '<em><b>Launch script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch script</em>' attribute.
	 * @see #setLaunch_script(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_Launch_script()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLaunch_script();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLaunch_script <em>Launch script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch script</em>' attribute.
	 * @see #getLaunch_script()
	 * @generated
	 */
	void setLaunch_script(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_Language()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // DdsmInternalComponent
