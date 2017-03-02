/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Cassandra Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getSeedHost <em>Seed Host</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_keys_to_save <em>Key cache keys to save</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_save_period <em>Key cache save period</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_cleanup_threshold <em>Memtable cleanup threshold</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_flush_writers <em>Memtable flush writers</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthenticator_enabled <em>Authenticator enabled</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthorizer_enabled <em>Authorizer enabled</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getPermission_validity_in_ms <em>Permission validity in ms</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster()
 * @model
 * @generated
 */
public interface DdsmCassandraCluster extends DdsmPeerToPeerPlatform {
	/**
	 * Returns the value of the '<em><b>Seed Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Host</em>' reference.
	 * @see #setSeedHost(DdsmVMsCluster)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_SeedHost()
	 * @model ordered="false"
	 * @generated
	 */
	DdsmVMsCluster getSeedHost();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getSeedHost <em>Seed Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Host</em>' reference.
	 * @see #getSeedHost()
	 * @generated
	 */
	void setSeedHost(DdsmVMsCluster value);

	/**
	 * Returns the value of the '<em><b>Key cache keys to save</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key cache keys to save</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key cache keys to save</em>' attribute.
	 * @see #setKey_cache_keys_to_save(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_Key_cache_keys_to_save()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getKey_cache_keys_to_save();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_keys_to_save <em>Key cache keys to save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key cache keys to save</em>' attribute.
	 * @see #getKey_cache_keys_to_save()
	 * @generated
	 */
	void setKey_cache_keys_to_save(int value);

	/**
	 * Returns the value of the '<em><b>Key cache save period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key cache save period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key cache save period</em>' attribute.
	 * @see #setKey_cache_save_period(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_Key_cache_save_period()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getKey_cache_save_period();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getKey_cache_save_period <em>Key cache save period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key cache save period</em>' attribute.
	 * @see #getKey_cache_save_period()
	 * @generated
	 */
	void setKey_cache_save_period(int value);

	/**
	 * Returns the value of the '<em><b>Memtable cleanup threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memtable cleanup threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memtable cleanup threshold</em>' attribute.
	 * @see #setMemtable_cleanup_threshold(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_Memtable_cleanup_threshold()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMemtable_cleanup_threshold();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_cleanup_threshold <em>Memtable cleanup threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memtable cleanup threshold</em>' attribute.
	 * @see #getMemtable_cleanup_threshold()
	 * @generated
	 */
	void setMemtable_cleanup_threshold(int value);

	/**
	 * Returns the value of the '<em><b>Memtable flush writers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memtable flush writers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memtable flush writers</em>' attribute.
	 * @see #setMemtable_flush_writers(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_Memtable_flush_writers()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMemtable_flush_writers();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getMemtable_flush_writers <em>Memtable flush writers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memtable flush writers</em>' attribute.
	 * @see #getMemtable_flush_writers()
	 * @generated
	 */
	void setMemtable_flush_writers(int value);

	/**
	 * Returns the value of the '<em><b>Authenticator enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticator enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticator enabled</em>' attribute.
	 * @see #setAuthenticator_enabled(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_Authenticator_enabled()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isAuthenticator_enabled();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthenticator_enabled <em>Authenticator enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticator enabled</em>' attribute.
	 * @see #isAuthenticator_enabled()
	 * @generated
	 */
	void setAuthenticator_enabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Authorizer enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorizer enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorizer enabled</em>' attribute.
	 * @see #setAuthorizer_enabled(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_Authorizer_enabled()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isAuthorizer_enabled();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#isAuthorizer_enabled <em>Authorizer enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorizer enabled</em>' attribute.
	 * @see #isAuthorizer_enabled()
	 * @generated
	 */
	void setAuthorizer_enabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Permission validity in ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission validity in ms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission validity in ms</em>' attribute.
	 * @see #setPermission_validity_in_ms(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmCassandraCluster_Permission_validity_in_ms()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getPermission_validity_in_ms();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmCassandraCluster#getPermission_validity_in_ms <em>Permission validity in ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission validity in ms</em>' attribute.
	 * @see #getPermission_validity_in_ms()
	 * @generated
	 */
	void setPermission_validity_in_ms(int value);

} // DdsmCassandraCluster
