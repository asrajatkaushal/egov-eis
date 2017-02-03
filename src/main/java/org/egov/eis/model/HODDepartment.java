package org.egov.eis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HODDepartment {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("department")
	private Department department = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof HODDepartment))
			return false;
		HODDepartment other = (HODDepartment) obj;
		if (department != other.department)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HODDepartment [id=" + id + ", department=" + department + "]";
	}
}