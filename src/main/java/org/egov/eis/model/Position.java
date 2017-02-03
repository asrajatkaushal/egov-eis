package org.egov.eis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("deptdesig")
	private Object deptdesig = null;

	@JsonProperty("isPostOutsourced")
	private Boolean isPostOutsourced = null;

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

	public Object getDeptdesig() {
		return deptdesig;
	}

	public void setDeptdesig(Object deptdesig) {
		this.deptdesig = deptdesig;
	}

	public Boolean isIsPostOutsourced() {
		return isPostOutsourced;
	}

	public void setIsPostOutsourced(Boolean isPostOutsourced) {
		this.isPostOutsourced = isPostOutsourced;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptdesig == null) ? 0 : deptdesig.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isPostOutsourced == null) ? 0 : isPostOutsourced.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Position))
			return false;
		Position other = (Position) obj;
		if (deptdesig == null) {
			if (other.deptdesig != null)
				return false;
		} else if (!deptdesig.equals(other.deptdesig))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isPostOutsourced == null) {
			if (other.isPostOutsourced != null)
				return false;
		} else if (!isPostOutsourced.equals(other.isPostOutsourced))
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
		return "Position [id=" + id + ", name=" + name + ", deptdesig=" + deptdesig + ", isPostOutsourced="
				+ isPostOutsourced + "]";
	}
}
