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
@javax.persistence.Table(name = "version", schema = "cloud")
public class Version implements java.io.Serializable {

	private static final long serialVersionUID = 966386367;

	private java.lang.Long     id;
	private java.lang.String   version;
	private java.sql.Timestamp updated;
	private java.lang.String   step;

	public Version() {}

	public Version(
		java.lang.Long     id,
		java.lang.String   version,
		java.sql.Timestamp updated,
		java.lang.String   step
	) {
		this.id = id;
		this.version = version;
		this.updated = updated;
		this.step = step;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "version", unique = true, nullable = false, length = 40)
	public java.lang.String getVersion() {
		return this.version;
	}

	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	@javax.persistence.Column(name = "updated", nullable = false)
	public java.sql.Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(java.sql.Timestamp updated) {
		this.updated = updated;
	}

	@javax.persistence.Column(name = "step", nullable = false, length = 32)
	public java.lang.String getStep() {
		return this.step;
	}

	public void setStep(java.lang.String step) {
		this.step = step;
	}
}