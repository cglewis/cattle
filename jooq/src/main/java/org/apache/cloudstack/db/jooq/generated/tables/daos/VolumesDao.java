/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VolumesDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VolumesRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes, java.lang.Long> {

	/**
	 * Create a new VolumesDao without any configuration
	 */
	public VolumesDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES, org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes.class);
	}

	/**
	 * Create a new VolumesDao with an attached configuration
	 */
	public VolumesDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES, org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.ID, value);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>pool_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByPoolId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.POOL_ID, values);
	}

	/**
	 * Fetch records that have <code>last_pool_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByLastPoolId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.LAST_POOL_ID, values);
	}

	/**
	 * Fetch records that have <code>instance_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByInstanceId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.INSTANCE_ID, values);
	}

	/**
	 * Fetch records that have <code>device_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByDeviceId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.DEVICE_ID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.NAME, values);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.UUID, value);
	}

	/**
	 * Fetch records that have <code>size IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchBySize(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.SIZE, values);
	}

	/**
	 * Fetch records that have <code>folder IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByFolder(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.FOLDER, values);
	}

	/**
	 * Fetch records that have <code>path IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByPath(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.PATH, values);
	}

	/**
	 * Fetch records that have <code>pod_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByPodId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.POD_ID, values);
	}

	/**
	 * Fetch records that have <code>data_center_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByDataCenterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.DATA_CENTER_ID, values);
	}

	/**
	 * Fetch records that have <code>iscsi_name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByIscsiName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.ISCSI_NAME, values);
	}

	/**
	 * Fetch records that have <code>host_ip IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByHostIp(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.HOST_IP, values);
	}

	/**
	 * Fetch records that have <code>volume_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByVolumeType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.VOLUME_TYPE, values);
	}

	/**
	 * Fetch records that have <code>pool_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByPoolType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.POOL_TYPE, values);
	}

	/**
	 * Fetch records that have <code>disk_offering_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByDiskOfferingId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.DISK_OFFERING_ID, values);
	}

	/**
	 * Fetch records that have <code>template_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByTemplateId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.TEMPLATE_ID, values);
	}

	/**
	 * Fetch records that have <code>first_snapshot_backup_uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByFirstSnapshotBackupUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.FIRST_SNAPSHOT_BACKUP_UUID, values);
	}

	/**
	 * Fetch records that have <code>recreatable IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByRecreatable(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.RECREATABLE, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.CREATED, values);
	}

	/**
	 * Fetch records that have <code>attached IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByAttached(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.ATTACHED, values);
	}

	/**
	 * Fetch records that have <code>updated IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByUpdated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.UPDATED, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.REMOVED, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.STATE, values);
	}

	/**
	 * Fetch records that have <code>chain_info IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByChainInfo(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.CHAIN_INFO, values);
	}

	/**
	 * Fetch records that have <code>update_count IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByUpdateCount(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.UPDATE_COUNT, values);
	}

	/**
	 * Fetch records that have <code>disk_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByDiskType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.DISK_TYPE, values);
	}

	/**
	 * Fetch records that have <code>vm_snapshot_chain_size IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByVmSnapshotChainSize(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.VM_SNAPSHOT_CHAIN_SIZE, values);
	}

	/**
	 * Fetch records that have <code>iso_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByIsoId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.ISO_ID, values);
	}

	/**
	 * Fetch records that have <code>display_volume IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByDisplayVolume(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.DISPLAY_VOLUME, values);
	}

	/**
	 * Fetch records that have <code>format IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByFormat(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.FORMAT, values);
	}

	/**
	 * Fetch records that have <code>min_iops IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByMinIops(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.MIN_IOPS, values);
	}

	/**
	 * Fetch records that have <code>max_iops IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Volumes> fetchByMaxIops(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Volumes.VOLUMES.MAX_IOPS, values);
	}
}