/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "autoscale_vmgroup_policy_map", schema = "cloud")
public class AutoscaleVmgroupPolicyMap implements java.io.Serializable {

	private static final long serialVersionUID = 1148074056;

	private java.lang.Long id;
	private java.lang.Long vmgroupId;
	private java.lang.Long policyId;

	public AutoscaleVmgroupPolicyMap() {}

	public AutoscaleVmgroupPolicyMap(
		java.lang.Long id,
		java.lang.Long vmgroupId,
		java.lang.Long policyId
	) {
		this.id = id;
		this.vmgroupId = vmgroupId;
		this.policyId = policyId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "vmgroup_id", nullable = false, precision = 20)
	public java.lang.Long getVmgroupId() {
		return this.vmgroupId;
	}

	public void setVmgroupId(java.lang.Long vmgroupId) {
		this.vmgroupId = vmgroupId;
	}

	@javax.persistence.Column(name = "policy_id", nullable = false, precision = 20)
	public java.lang.Long getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(java.lang.Long policyId) {
		this.policyId = policyId;
	}
}