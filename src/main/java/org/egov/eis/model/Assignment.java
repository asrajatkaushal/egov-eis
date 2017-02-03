package org.egov.eis.model;

import java.util.Date;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assignment {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("position")
	private Position position = null;

	@JsonProperty("fund")
	private String fund = null;

	@JsonProperty("functionary")
	private String functionary = null;

	@JsonProperty("function")
	private String function = null;

	@JsonProperty("designation")
	private Designation designation = null;

	@JsonProperty("department")
	private Department department = null;

	@JsonProperty("hod")
	private HODDepartment hod = null;

	@JsonProperty("primary")
	private Boolean primary = null;

	@JsonProperty("fromDate")
	private Date fromDate = null;

	@JsonProperty("toDate")
	private Date toDate = null;

	@JsonProperty("grade")
	private Grade grade = null;

	@JsonProperty("govtOrderNumber")
	private String govtOrderNumber = null;

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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getFunctionary() {
		return functionary;
	}

	public void setFunctionary(String functionary) {
		this.functionary = functionary;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public HODDepartment getHod() {
		return hod;
	}

	public void setHod(HODDepartment hod) {
		this.hod = hod;
	}

	public Boolean isPrimary() {
		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getGovtOrderNumber() {
		return govtOrderNumber;
	}

	public void setGovtOrderNumber(String govtOrderNumber) {
		this.govtOrderNumber = govtOrderNumber;
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
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + Arrays.hashCode(documents);
		result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((function == null) ? 0 : function.hashCode());
		result = prime * result + ((functionary == null) ? 0 : functionary.hashCode());
		result = prime * result + ((fund == null) ? 0 : fund.hashCode());
		result = prime * result + ((govtOrderNumber == null) ? 0 : govtOrderNumber.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((hod == null) ? 0 : hod.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
		result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((primary == null) ? 0 : primary.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Assignment))
			return false;
		Assignment other = (Assignment) obj;
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
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (!Arrays.equals(documents, other.documents))
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		if (functionary == null) {
			if (other.functionary != null)
				return false;
		} else if (!functionary.equals(other.functionary))
			return false;
		if (fund == null) {
			if (other.fund != null)
				return false;
		} else if (!fund.equals(other.fund))
			return false;
		if (govtOrderNumber == null) {
			if (other.govtOrderNumber != null)
				return false;
		} else if (!govtOrderNumber.equals(other.govtOrderNumber))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (hod == null) {
			if (other.hod != null)
				return false;
		} else if (!hod.equals(other.hod))
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
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (primary == null) {
			if (other.primary != null)
				return false;
		} else if (!primary.equals(other.primary))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Assignment [id=" + id + ", position=" + position + ", fund=" + fund + ", functionary=" + functionary
				+ ", function=" + function + ", designation=" + designation + ", department=" + department + ", hod="
				+ hod + ", primary=" + primary + ", fromDate=" + fromDate + ", toDate=" + toDate + ", grade=" + grade
				+ ", govtOrderNumber=" + govtOrderNumber + ", documents=" + Arrays.toString(documents) + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", lastModifiedBy=" + lastModifiedBy
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}
}
