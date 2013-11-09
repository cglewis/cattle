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
public class VpcOfferingServiceMap extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord> {

	private static final long serialVersionUID = 255100563;

	/**
	 * The singleton instance of <code>cloud.vpc_offering_service_map</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.VpcOfferingServiceMap VPC_OFFERING_SERVICE_MAP = new org.apache.cloudstack.db.jooq.generated.tables.VpcOfferingServiceMap();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord.class;
	}

	/**
	 * The column <code>cloud.vpc_offering_service_map.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vpc_offering_service_map.vpc_offering_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, java.lang.Long> VPC_OFFERING_ID = createField("vpc_offering_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vpc_offering_service_map.service</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, java.lang.String> SERVICE = createField("service", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vpc_offering_service_map.provider</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, java.lang.String> PROVIDER = createField("provider", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.vpc_offering_service_map.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cloud.vpc_offering_service_map</code> table reference
	 */
	public VpcOfferingServiceMap() {
		super("vpc_offering_service_map", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.vpc_offering_service_map</code> table reference
	 */
	public VpcOfferingServiceMap(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.VpcOfferingServiceMap.VPC_OFFERING_SERVICE_MAP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_VPC_OFFERING_SERVICE_MAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_VPC_OFFERING_SERVICE_MAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_VPC_OFFERING_SERVICE_MAP_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VPC_OFFERING_SERVICE_MAP_VPC_OFFERING_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpcOfferingServiceMapRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_VPC_OFFERING_SERVICE_MAP__VPC_OFFERING_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.VpcOfferingServiceMap as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.VpcOfferingServiceMap(alias);
	}
}