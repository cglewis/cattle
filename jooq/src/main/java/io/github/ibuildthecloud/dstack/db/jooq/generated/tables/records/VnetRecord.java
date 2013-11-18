/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "vnet", schema = "dstack")
public class VnetRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.VnetRecord> implements org.jooq.Record5<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 779553251;

	/**
	 * Setter for <code>dstack.vnet.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.vnet.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.vnet.uri</code>. 
	 */
	public void setUri(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.vnet.uri</code>. 
	 */
	@javax.persistence.Column(name = "uri", nullable = false, length = 128)
	public java.lang.String getUri() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.vnet.scope</code>. 
	 */
	public void setScope(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.vnet.scope</code>. 
	 */
	@javax.persistence.Column(name = "scope", nullable = false, length = 128)
	public java.lang.String getScope() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.vnet.ip_pool_qualifier</code>. 
	 */
	public void setIpPoolQualifier(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.vnet.ip_pool_qualifier</code>. 
	 */
	@javax.persistence.Column(name = "ip_pool_qualifier", length = 128)
	public java.lang.String getIpPoolQualifier() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.vnet.ip_pool_segment</code>. 
	 */
	public void setIpPoolSegment(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.vnet.ip_pool_segment</code>. 
	 */
	@javax.persistence.Column(name = "ip_pool_segment", length = 128)
	public java.lang.String getIpPoolSegment() {
		return (java.lang.String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Vnet.VNET.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Vnet.VNET.URI;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Vnet.VNET.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Vnet.VNET.IP_POOL_QUALIFIER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Vnet.VNET.IP_POOL_SEGMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUri();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getIpPoolQualifier();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getIpPoolSegment();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VnetRecord
	 */
	public VnetRecord() {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Vnet.VNET);
	}

	/**
	 * Create a detached, initialised VnetRecord
	 */
	public VnetRecord(java.lang.Long id, java.lang.String uri, java.lang.String scope, java.lang.String ipPoolQualifier, java.lang.String ipPoolSegment) {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Vnet.VNET);

		setValue(0, id);
		setValue(1, uri);
		setValue(2, scope);
		setValue(3, ipPoolQualifier);
		setValue(4, ipPoolSegment);
	}
}