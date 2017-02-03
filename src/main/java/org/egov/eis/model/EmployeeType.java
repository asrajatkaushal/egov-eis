package org.egov.eis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeType {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("chartOfAccounts")
	private String chartOfAccounts = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return chartOfAccounts;
	}

	public void setDescription(String chartOfAccounts) {
		this.chartOfAccounts = chartOfAccounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chartOfAccounts == null) ? 0 : chartOfAccounts.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EmployeeType))
			return false;
		EmployeeType other = (EmployeeType) obj;
		if (chartOfAccounts == null) {
			if (other.chartOfAccounts != null)
				return false;
		} else if (!chartOfAccounts.equals(other.chartOfAccounts))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecruitmentMode [id=" + id + ", name=" + name + ", chartOfAccounts=" + chartOfAccounts + "]";
	}
}
