/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoragePool extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord> {

	private static final long serialVersionUID = 1451514919;

	/**
	 * The singleton instance of <code>dstack.storage_pool</code>
	 */
	public static final io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePool STORAGE_POOL = new io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePool();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord.class;
	}

	/**
	 * The column <code>dstack.storage_pool.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool.uuid</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool.name</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.storage_pool.description</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * The column <code>dstack.storage_pool.kind</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool.content_type</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.String> CONTENT_TYPE = createField("content_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool.state</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool.physical_total_bytes</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.Long> PHYSICAL_TOTAL_BYTES = createField("physical_total_bytes", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>dstack.storage_pool.physical_used_bytes</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.Long> PHYSICAL_USED_BYTES = createField("physical_used_bytes", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>dstack.storage_pool.virtual_total_bytes</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.Long> VIRTUAL_TOTAL_BYTES = createField("virtual_total_bytes", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>dstack.storage_pool.created</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool.removed</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>dstack.storage_pool</code> table reference
	 */
	public StoragePool() {
		super("storage_pool", io.github.ibuildthecloud.dstack.db.jooq.generated.Dstack.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.storage_pool</code> table reference
	 */
	public StoragePool(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.db.jooq.generated.Dstack.DSTACK, io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.IDENTITY_STORAGE_POOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.KEY_STORAGE_POOL_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.StoragePoolRecord>>asList(io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.KEY_STORAGE_POOL_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePool as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.db.jooq.generated.tables.StoragePool(alias);
	}
}