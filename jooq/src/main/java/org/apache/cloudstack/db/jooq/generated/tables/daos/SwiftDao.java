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
public class SwiftDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.SwiftRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift, java.lang.Long> {

	/**
	 * Create a new SwiftDao without any configuration
	 */
	public SwiftDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT, org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift.class);
	}

	/**
	 * Create a new SwiftDao with an attached configuration
	 */
	public SwiftDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT, org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.UUID, value);
	}

	/**
	 * Fetch records that have <code>url IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift> fetchByUrl(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.URL, values);
	}

	/**
	 * Fetch records that have <code>account IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift> fetchByAccount(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.ACCOUNT, values);
	}

	/**
	 * Fetch records that have <code>username IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift> fetchByUsername(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.USERNAME, values);
	}

	/**
	 * Fetch records that have <code>key IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift> fetchByKey(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.KEY, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Swift> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Swift.SWIFT.CREATED, values);
	}
}