/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DcStorageNetworkIpRange extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord> {

	private static final long serialVersionUID = -376225971;

	/**
	 * The singleton instance of <code>cloud.dc_storage_network_ip_range</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange DC_STORAGE_NETWORK_IP_RANGE = new org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord.class;
	}

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.start_ip</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.String> START_IP = createField("start_ip", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.end_ip</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.String> END_IP = createField("end_ip", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.gateway</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.String> GATEWAY = createField("gateway", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.vlan</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.Integer> VLAN = createField("vlan", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.netmask</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.String> NETMASK = createField("netmask", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.data_center_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.Long> DATA_CENTER_ID = createField("data_center_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.pod_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.Long> POD_ID = createField("pod_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.dc_storage_network_ip_range.network_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.Long> NETWORK_ID = createField("network_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * Create a <code>cloud.dc_storage_network_ip_range</code> table reference
	 */
	public DcStorageNetworkIpRange() {
		super("dc_storage_network_ip_range", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.dc_storage_network_ip_range</code> table reference
	 */
	public DcStorageNetworkIpRange(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_DC_STORAGE_NETWORK_IP_RANGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_DC_STORAGE_NETWORK_IP_RANGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_DC_STORAGE_NETWORK_IP_RANGE_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_DC_STORAGE_NETWORK_IP_RANGE_UC_STORAGE_IP_RANGE__UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_STORAGE_IP_RANGE__DATA_CENTER_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_STORAGE_IP_RANGE__POD_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_STORAGE_IP_RANGE__NETWORK_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange(alias);
	}
}