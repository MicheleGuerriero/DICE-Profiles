/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmStormCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Storm Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getTaskTimeout <em>Task Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getSupervisorFrequency <em>Supervisor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getMonitorFrequency <em>Monitor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getRetryTimes <em>Retry Times</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getWorkerStartTimeout <em>Worker Start Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getCpuCapacity <em>Cpu Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getHeartbeatFrequency <em>Heartbeat Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmStormClusterImpl extends DdsmMasterSlavePlatformImpl implements DdsmStormCluster {
	/**
	 * The default value of the '{@link #getTaskTimeout() <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TASK_TIMEOUT_EDEFAULT = 60;

	/**
	 * The cached value of the '{@link #getTaskTimeout() <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTimeout()
	 * @generated
	 * @ordered
	 */
	protected int taskTimeout = TASK_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupervisorFrequency() <em>Supervisor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int SUPERVISOR_FREQUENCY_EDEFAULT = 60;

	/**
	 * The cached value of the '{@link #getSupervisorFrequency() <em>Supervisor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorFrequency()
	 * @generated
	 * @ordered
	 */
	protected int supervisorFrequency = SUPERVISOR_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_SIZE_EDEFAULT = 10000;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitorFrequency() <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITOR_FREQUENCY_EDEFAULT = 40;

	/**
	 * The cached value of the '{@link #getMonitorFrequency() <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorFrequency()
	 * @generated
	 * @ordered
	 */
	protected int monitorFrequency = MONITOR_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryTimes() <em>Retry Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_TIMES_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getRetryTimes() <em>Retry Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTimes()
	 * @generated
	 * @ordered
	 */
	protected int retryTimes = RETRY_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_INTERVAL_EDEFAULT = 2000;

	/**
	 * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected int retryInterval = RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkerStartTimeout() <em>Worker Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int WORKER_START_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWorkerStartTimeout() <em>Worker Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected int workerStartTimeout = WORKER_START_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuCapacity() <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpuCapacity() <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCapacity()
	 * @generated
	 * @ordered
	 */
	protected int cpuCapacity = CPU_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryCapacity() <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryCapacity() <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected int memoryCapacity = MEMORY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeartbeatFrequency() <em>Heartbeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeatFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int HEARTBEAT_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeartbeatFrequency() <em>Heartbeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeatFrequency()
	 * @generated
	 * @ordered
	 */
	protected int heartbeatFrequency = HEARTBEAT_FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_ExecutionEnvironment() <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironment base_ExecutionEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmStormClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_STORM_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaskTimeout() {
		return taskTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskTimeout(int newTaskTimeout) {
		int oldTaskTimeout = taskTimeout;
		taskTimeout = newTaskTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__TASK_TIMEOUT, oldTaskTimeout, taskTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSupervisorFrequency() {
		return supervisorFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisorFrequency(int newSupervisorFrequency) {
		int oldSupervisorFrequency = supervisorFrequency;
		supervisorFrequency = newSupervisorFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY, oldSupervisorFrequency, supervisorFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(int newQueueSize) {
		int oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__QUEUE_SIZE, oldQueueSize, queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonitorFrequency() {
		return monitorFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorFrequency(int newMonitorFrequency) {
		int oldMonitorFrequency = monitorFrequency;
		monitorFrequency = newMonitorFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__MONITOR_FREQUENCY, oldMonitorFrequency, monitorFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryTimes() {
		return retryTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryTimes(int newRetryTimes) {
		int oldRetryTimes = retryTimes;
		retryTimes = newRetryTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__RETRY_TIMES, oldRetryTimes, retryTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryInterval() {
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryInterval(int newRetryInterval) {
		int oldRetryInterval = retryInterval;
		retryInterval = newRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__RETRY_INTERVAL, oldRetryInterval, retryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorkerStartTimeout() {
		return workerStartTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerStartTimeout(int newWorkerStartTimeout) {
		int oldWorkerStartTimeout = workerStartTimeout;
		workerStartTimeout = newWorkerStartTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT, oldWorkerStartTimeout, workerStartTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuCapacity() {
		return cpuCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuCapacity(int newCpuCapacity) {
		int oldCpuCapacity = cpuCapacity;
		cpuCapacity = newCpuCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__CPU_CAPACITY, oldCpuCapacity, cpuCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryCapacity() {
		return memoryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryCapacity(int newMemoryCapacity) {
		int oldMemoryCapacity = memoryCapacity;
		memoryCapacity = newMemoryCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__MEMORY_CAPACITY, oldMemoryCapacity, memoryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeartbeatFrequency() {
		return heartbeatFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeartbeatFrequency(int newHeartbeatFrequency) {
		int oldHeartbeatFrequency = heartbeatFrequency;
		heartbeatFrequency = newHeartbeatFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY, oldHeartbeatFrequency, heartbeatFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment getBase_ExecutionEnvironment() {
		if (base_ExecutionEnvironment != null && base_ExecutionEnvironment.eIsProxy()) {
			InternalEObject oldBase_ExecutionEnvironment = (InternalEObject)base_ExecutionEnvironment;
			base_ExecutionEnvironment = (ExecutionEnvironment)eResolveProxy(oldBase_ExecutionEnvironment);
			if (base_ExecutionEnvironment != oldBase_ExecutionEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
			}
		}
		return base_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment basicGetBase_ExecutionEnvironment() {
		return base_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ExecutionEnvironment(ExecutionEnvironment newBase_ExecutionEnvironment) {
		ExecutionEnvironment oldBase_ExecutionEnvironment = base_ExecutionEnvironment;
		base_ExecutionEnvironment = newBase_ExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_STORM_CLUSTER__TASK_TIMEOUT:
				return getTaskTimeout();
			case DDSMPackage.DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY:
				return getSupervisorFrequency();
			case DDSMPackage.DDSM_STORM_CLUSTER__QUEUE_SIZE:
				return getQueueSize();
			case DDSMPackage.DDSM_STORM_CLUSTER__MONITOR_FREQUENCY:
				return getMonitorFrequency();
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_TIMES:
				return getRetryTimes();
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_INTERVAL:
				return getRetryInterval();
			case DDSMPackage.DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT:
				return getWorkerStartTimeout();
			case DDSMPackage.DDSM_STORM_CLUSTER__CPU_CAPACITY:
				return getCpuCapacity();
			case DDSMPackage.DDSM_STORM_CLUSTER__MEMORY_CAPACITY:
				return getMemoryCapacity();
			case DDSMPackage.DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY:
				return getHeartbeatFrequency();
			case DDSMPackage.DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				if (resolve) return getBase_ExecutionEnvironment();
				return basicGetBase_ExecutionEnvironment();
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
			case DDSMPackage.DDSM_STORM_CLUSTER__TASK_TIMEOUT:
				setTaskTimeout((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY:
				setSupervisorFrequency((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__QUEUE_SIZE:
				setQueueSize((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__MONITOR_FREQUENCY:
				setMonitorFrequency((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_TIMES:
				setRetryTimes((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_INTERVAL:
				setRetryInterval((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT:
				setWorkerStartTimeout((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__CPU_CAPACITY:
				setCpuCapacity((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__MEMORY_CAPACITY:
				setMemoryCapacity((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY:
				setHeartbeatFrequency((Integer)newValue);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)newValue);
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
			case DDSMPackage.DDSM_STORM_CLUSTER__TASK_TIMEOUT:
				setTaskTimeout(TASK_TIMEOUT_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY:
				setSupervisorFrequency(SUPERVISOR_FREQUENCY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__QUEUE_SIZE:
				setQueueSize(QUEUE_SIZE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__MONITOR_FREQUENCY:
				setMonitorFrequency(MONITOR_FREQUENCY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_TIMES:
				setRetryTimes(RETRY_TIMES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_INTERVAL:
				setRetryInterval(RETRY_INTERVAL_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT:
				setWorkerStartTimeout(WORKER_START_TIMEOUT_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__CPU_CAPACITY:
				setCpuCapacity(CPU_CAPACITY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__MEMORY_CAPACITY:
				setMemoryCapacity(MEMORY_CAPACITY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY:
				setHeartbeatFrequency(HEARTBEAT_FREQUENCY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)null);
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
			case DDSMPackage.DDSM_STORM_CLUSTER__TASK_TIMEOUT:
				return taskTimeout != TASK_TIMEOUT_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__SUPERVISOR_FREQUENCY:
				return supervisorFrequency != SUPERVISOR_FREQUENCY_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__QUEUE_SIZE:
				return queueSize != QUEUE_SIZE_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__MONITOR_FREQUENCY:
				return monitorFrequency != MONITOR_FREQUENCY_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_TIMES:
				return retryTimes != RETRY_TIMES_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__RETRY_INTERVAL:
				return retryInterval != RETRY_INTERVAL_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__WORKER_START_TIMEOUT:
				return workerStartTimeout != WORKER_START_TIMEOUT_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__CPU_CAPACITY:
				return cpuCapacity != CPU_CAPACITY_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__MEMORY_CAPACITY:
				return memoryCapacity != MEMORY_CAPACITY_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__HEARTBEAT_FREQUENCY:
				return heartbeatFrequency != HEARTBEAT_FREQUENCY_EDEFAULT;
			case DDSMPackage.DDSM_STORM_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				return base_ExecutionEnvironment != null;
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
		result.append(" (taskTimeout: ");
		result.append(taskTimeout);
		result.append(", supervisorFrequency: ");
		result.append(supervisorFrequency);
		result.append(", queueSize: ");
		result.append(queueSize);
		result.append(", monitorFrequency: ");
		result.append(monitorFrequency);
		result.append(", retryTimes: ");
		result.append(retryTimes);
		result.append(", retryInterval: ");
		result.append(retryInterval);
		result.append(", workerStartTimeout: ");
		result.append(workerStartTimeout);
		result.append(", cpuCapacity: ");
		result.append(cpuCapacity);
		result.append(", memoryCapacity: ");
		result.append(memoryCapacity);
		result.append(", heartbeatFrequency: ");
		result.append(heartbeatFrequency);
		result.append(')');
		return result.toString();
	}

} //DdsmStormClusterImpl
