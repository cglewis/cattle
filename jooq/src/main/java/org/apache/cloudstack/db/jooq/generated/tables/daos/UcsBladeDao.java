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
public class UcsBladeDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.UcsBladeRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade, java.lang.Long> {

	/**
	 * Create a new UcsBladeDao without any configuration
	 */
	public UcsBladeDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE, org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade.class);
	}

	/**
	 * Create a new UcsBladeDao with an attached configuration
	 */
	public UcsBladeDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE, org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.UUID, value);
	}

	/**
	 * Fetch records that have <code>ucs_manager_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade> fetchByUcsManagerId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.UCS_MANAGER_ID, values);
	}

	/**
	 * Fetch records that have <code>host_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade> fetchByHostId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.HOST_ID, values);
	}

	/**
	 * Fetch records that have <code>dn IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade> fetchByDn(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.DN, values);
	}

	/**
	 * Fetch records that have <code>profile_dn IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.UcsBlade> fetchByProfileDn(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.UcsBlade.UCS_BLADE.PROFILE_DN, values);
	}
}