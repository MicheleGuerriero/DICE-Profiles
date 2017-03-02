/**
 */
package es.unizar.disco.dice.DDSM;

import es.unizar.disco.dice.Basic_Enumeration_Types.ProviderType;

import org.eclipse.uml2.uml.Device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm External Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLocation <em>Location</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getProvider <em>Provider</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getRegion <em>Region</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLogin <em>Login</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getPassword <em>Password</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getBase_Device <em>Base Device</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent()
 * @model
 * @generated
 */
public interface DdsmExternalComponent extends DdsmComponent {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent_Location()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The default value is <code>"fco"</code>.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.ProviderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ProviderType
	 * @see #setProvider(ProviderType)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent_Provider()
	 * @model default="fco" required="true" ordered="false"
	 * @generated
	 */
	ProviderType getProvider();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ProviderType
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(ProviderType value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see #setServiceType(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent_ServiceType()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getServiceType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent_Region()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent_Login()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent_Password()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Device</em>' reference.
	 * @see #setBase_Device(Device)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmExternalComponent_Base_Device()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Device getBase_Device();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getBase_Device <em>Base Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Device</em>' reference.
	 * @see #getBase_Device()
	 * @generated
	 */
	void setBase_Device(Device value);

} // DdsmExternalComponent
