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
public class SshKeypairsDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.SshKeypairsRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs, java.lang.Long> {

	/**
	 * Create a new SshKeypairsDao without any configuration
	 */
	public SshKeypairsDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS, org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs.class);
	}

	/**
	 * Create a new SshKeypairsDao with an attached configuration
	 */
	public SshKeypairsDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS, org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS.ID, value);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>keypair_name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs> fetchByKeypairName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS.KEYPAIR_NAME, values);
	}

	/**
	 * Fetch records that have <code>fingerprint IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs> fetchByFingerprint(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS.FINGERPRINT, values);
	}

	/**
	 * Fetch records that have <code>public_key IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SshKeypairs> fetchByPublicKey(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SshKeypairs.SSH_KEYPAIRS.PUBLIC_KEY, values);
	}
}