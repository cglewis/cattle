/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "vpn_users", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"owner_id", "username"})
})
public class VpnUsersRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord> implements org.jooq.Record7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1170225213;

	/**
	 * Setter for <code>cloud.vpn_users.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.vpn_users.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.vpn_users.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.vpn_users.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.vpn_users.owner_id</code>. 
	 */
	public void setOwnerId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.vpn_users.owner_id</code>. 
	 */
	@javax.persistence.Column(name = "owner_id", nullable = false, precision = 20)
	public java.lang.Long getOwnerId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.vpn_users.domain_id</code>. 
	 */
	public void setDomainId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.vpn_users.domain_id</code>. 
	 */
	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>cloud.vpn_users.username</code>. 
	 */
	public void setUsername(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.vpn_users.username</code>. 
	 */
	@javax.persistence.Column(name = "username", nullable = false, length = 255)
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.vpn_users.password</code>. 
	 */
	public void setPassword(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.vpn_users.password</code>. 
	 */
	@javax.persistence.Column(name = "password", nullable = false, length = 255)
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cloud.vpn_users.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.vpn_users.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS.OWNER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS.STATE;
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
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getOwnerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getState();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VpnUsersRecord
	 */
	public VpnUsersRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS);
	}

	/**
	 * Create a detached, initialised VpnUsersRecord
	 */
	public VpnUsersRecord(java.lang.Long id, java.lang.String uuid, java.lang.Long ownerId, java.lang.Long domainId, java.lang.String username, java.lang.String password, java.lang.String state) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, ownerId);
		setValue(3, domainId);
		setValue(4, username);
		setValue(5, password);
		setValue(6, state);
	}
}