/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Storm Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getTaskTimeout <em>Task Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getSupervisorFrequency <em>Supervisor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getMonitorFrequency <em>Monitor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryTimes <em>Retry Times</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getWorkerStartTimeout <em>Worker Start Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getCpuCapacity <em>Cpu Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getHeartbeatFrequency <em>Heartbeat Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster()
 * @model
 * @generated
 */
public interface DdsmStormCluster extends DdsmMasterSlavePlatform {
	/**
	 * Returns the value of the '<em><b>Task Timeout</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Timeout</em>' attribute.
	 * @see #setTaskTimeout(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_TaskTimeout()
	 * @model default="60" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getTaskTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getTaskTimeout <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Timeout</em>' attribute.
	 * @see #getTaskTimeout()
	 * @generated
	 */
	void setTaskTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Supervisor Frequency</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Frequency</em>' attribute.
	 * @see #setSupervisorFrequency(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_SupervisorFrequency()
	 * @model default="60" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getSupervisorFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getSupervisorFrequency <em>Supervisor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor Frequency</em>' attribute.
	 * @see #getSupervisorFrequency()
	 * @generated
	 */
	void setSupervisorFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #setQueueSize(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_QueueSize()
	 * @model default="10000" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Monitor Frequency</b></em>' attribute.
	 * The default value is <code>"40"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Frequency</em>' attribute.
	 * @see #setMonitorFrequency(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_MonitorFrequency()
	 * @model default="40" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMonitorFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getMonitorFrequency <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Frequency</em>' attribute.
	 * @see #getMonitorFrequency()
	 * @generated
	 */
	void setMonitorFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Retry Times</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Times</em>' attribute.
	 * @see #setRetryTimes(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_RetryTimes()
	 * @model default="5" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getRetryTimes();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryTimes <em>Retry Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Times</em>' attribute.
	 * @see #getRetryTimes()
	 * @generated
	 */
	void setRetryTimes(int value);

	/**
	 * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
	 * The default value is <code>"2000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Interval</em>' attribute.
	 * @see #setRetryInterval(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_RetryInterval()
	 * @model default="2000" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getRetryInterval();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(int value);

	/**
	 * Returns the value of the '<em><b>Worker Start Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Start Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Start Timeout</em>' attribute.
	 * @see #setWorkerStartTimeout(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_WorkerStartTimeout()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getWorkerStartTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getWorkerStartTimeout <em>Worker Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Start Timeout</em>' attribute.
	 * @see #getWorkerStartTimeout()
	 * @generated
	 */
	void setWorkerStartTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Capacity</em>' attribute.
	 * @see #setCpuCapacity(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_CpuCapacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getCpuCapacity();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getCpuCapacity <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Capacity</em>' attribute.
	 * @see #getCpuCapacity()
	 * @generated
	 */
	void setCpuCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Capacity</em>' attribute.
	 * @see #setMemoryCapacity(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_MemoryCapacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMemoryCapacity();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getMemoryCapacity <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Capacity</em>' attribute.
	 * @see #getMemoryCapacity()
	 * @generated
	 */
	void setMemoryCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Heartbeat Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heartbeat Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heartbeat Frequency</em>' attribute.
	 * @see #setHeartbeatFrequency(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_HeartbeatFrequency()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getHeartbeatFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getHeartbeatFrequency <em>Heartbeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbeat Frequency</em>' attribute.
	 * @see #getHeartbeatFrequency()
	 * @generated
	 */
	void setHeartbeatFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Execution Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Execution Environment</em>' reference.
	 * @see #setBase_ExecutionEnvironment(ExecutionEnvironment)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmStormCluster_Base_ExecutionEnvironment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionEnvironment getBase_ExecutionEnvironment();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Execution Environment</em>' reference.
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 */
	void setBase_ExecutionEnvironment(ExecutionEnvironment value);

} // DdsmStormCluster
