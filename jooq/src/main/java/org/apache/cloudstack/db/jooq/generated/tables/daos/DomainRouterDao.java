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
public class DomainRouterDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter, java.lang.Long> {

	/**
	 * Create a new DomainRouterDao without any configuration
	 */
	public DomainRouterDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER, org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter.class);
	}

	/**
	 * Create a new DomainRouterDao with an attached configuration
	 */
	public DomainRouterDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER, org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.ID, value);
	}

	/**
	 * Fetch records that have <code>element_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByElementId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.ELEMENT_ID, values);
	}

	/**
	 * Fetch records that have <code>public_mac_address IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByPublicMacAddress(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.PUBLIC_MAC_ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>public_ip_address IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByPublicIpAddress(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.PUBLIC_IP_ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>public_netmask IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByPublicNetmask(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.PUBLIC_NETMASK, values);
	}

	/**
	 * Fetch records that have <code>guest_netmask IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByGuestNetmask(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.GUEST_NETMASK, values);
	}

	/**
	 * Fetch records that have <code>guest_ip_address IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByGuestIpAddress(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.GUEST_IP_ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>is_redundant_router IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByIsRedundantRouter(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.IS_REDUNDANT_ROUTER, values);
	}

	/**
	 * Fetch records that have <code>priority IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByPriority(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.PRIORITY, values);
	}

	/**
	 * Fetch records that have <code>is_priority_bumpup IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByIsPriorityBumpup(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.IS_PRIORITY_BUMPUP, values);
	}

	/**
	 * Fetch records that have <code>redundant_state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByRedundantState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.REDUNDANT_STATE, values);
	}

	/**
	 * Fetch records that have <code>stop_pending IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByStopPending(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.STOP_PENDING, values);
	}

	/**
	 * Fetch records that have <code>role IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByRole(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.ROLE, values);
	}

	/**
	 * Fetch records that have <code>template_version IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByTemplateVersion(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.TEMPLATE_VERSION, values);
	}

	/**
	 * Fetch records that have <code>scripts_version IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByScriptsVersion(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.SCRIPTS_VERSION, values);
	}

	/**
	 * Fetch records that have <code>vpc_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.DomainRouter> fetchByVpcId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER.VPC_ID, values);
	}
}