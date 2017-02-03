package org.egov.eis.model;

import java.util.Date;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EducationalQualification {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("qualification")
	private String qualification = null;

	@JsonProperty("majorSubject")
	private String majorSubject = null;

	@JsonProperty("yearOfPassing")
	private Short yearOfPassing = null;

	@JsonProperty("university")
	private String university = null;

	@JsonProperty("documents")
	private byte[] documents = null;

	@JsonProperty("createdBy")
	private Long createdBy = null;

	@JsonProperty("createdDate")
	private Date createdDate = null;

	@JsonProperty("lastModifiedBy")
	private Long lastModifiedBy = null;

	@JsonProperty("lastModifiedDate")
	private Date lastModifiedDate = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public Short getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(Short yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public byte[] getDocuments() {
		return documents;
	}

	public void setDocuments(byte[] documents) {
		this.documents = documents;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + Arrays.hashCode(documents);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
		result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime * result + ((majorSubject == null) ? 0 : majorSubject.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((university == null) ? 0 : university.hashCode());
		result = prime * result + ((yearOfPassing == null) ? 0 : yearOfPassing.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EducationalQualification))
			return false;
		EducationalQualification other = (EducationalQualification) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (!Arrays.equals(documents, other.documents))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastModifiedBy == null) {
			if (other.lastModifiedBy != null)
				return false;
		} else if (!lastModifiedBy.equals(other.lastModifiedBy))
			return false;
		if (lastModifiedDate == null) {
			if (other.lastModifiedDate != null)
				return false;
		} else if (!lastModifiedDate.equals(other.lastModifiedDate))
			return false;
		if (majorSubject == null) {
			if (other.majorSubject != null)
				return false;
		} else if (!majorSubject.equals(other.majorSubject))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (university == null) {
			if (other.university != null)
				return false;
		} else if (!university.equals(other.university))
			return false;
		if (yearOfPassing == null) {
			if (other.yearOfPassing != null)
				return false;
		} else if (!yearOfPassing.equals(other.yearOfPassing))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EducationalQualification [id=" + id + ", qualification=" + qualification + ", majorSubject="
				+ majorSubject + ", yearOfPassing=" + yearOfPassing + ", university=" + university + ", documents="
				+ Arrays.toString(documents) + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
}
