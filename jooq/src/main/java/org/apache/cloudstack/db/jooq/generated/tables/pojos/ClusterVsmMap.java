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
@javax.persistence.Table(name = "cluster_vsm_map", schema = "cloud")
public class ClusterVsmMap implements java.io.Serializable {

	private static final long serialVersionUID = -1174716639;

	private java.lang.Long clusterId;
	private java.lang.Long vsmId;

	public ClusterVsmMap() {}

	public ClusterVsmMap(
		java.lang.Long clusterId,
		java.lang.Long vsmId
	) {
		this.clusterId = clusterId;
		this.vsmId = vsmId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "cluster_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(java.lang.Long clusterId) {
		this.clusterId = clusterId;
	}

	@javax.persistence.Column(name = "vsm_id", nullable = false, precision = 20)
	public java.lang.Long getVsmId() {
		return this.vsmId;
	}

	public void setVsmId(java.lang.Long vsmId) {
		this.vsmId = vsmId;
	}
}