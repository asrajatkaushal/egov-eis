package org.egov.eis.model;

import java.util.Date;
import java.util.Arrays;

import org.egov.eis.entity.enums.ModeOfAcquisition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImmovableProperty {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("place")
	private String place = null;

	@JsonProperty("modeOfAcquisition")
	private ModeOfAcquisition modeOfAcquisition = null;

	@JsonProperty("permissionObtained")
	private Boolean permissionObtained = null;

	@JsonProperty("presentValue")
	private Float presentValue = null;

	@JsonProperty("orderNo")
	private String orderNo = null;

	@JsonProperty("orderDate")
	private Date orderDate = null;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public ModeOfAcquisition getModeOfAcquisition() {
		return modeOfAcquisition;
	}

	public void setModeOfAcquisition(ModeOfAcquisition modeOfAcquisition) {
		this.modeOfAcquisition = modeOfAcquisition;
	}

	public Boolean isPermissionObtained() {
		return permissionObtained;
	}

	public void setPermissionObtained(Boolean permissionObtained) {
		this.permissionObtained = permissionObtained;
	}

	public Float getPresentValue() {
		return presentValue;
	}

	public void setPresentValue(Float presentValue) {
		this.presentValue = presentValue;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + Arrays.hashCode(documents);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
		result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime * result + ((modeOfAcquisition == null) ? 0 : modeOfAcquisition.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((permissionObtained == null) ? 0 : permissionObtained.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((presentValue == null) ? 0 : presentValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ImmovableProperty))
			return false;
		ImmovableProperty other = (ImmovableProperty) obj;
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
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
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
		if (modeOfAcquisition != other.modeOfAcquisition)
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (permissionObtained == null) {
			if (other.permissionObtained != null)
				return false;
		} else if (!permissionObtained.equals(other.permissionObtained))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (presentValue == null) {
			if (other.presentValue != null)
				return false;
		} else if (!presentValue.equals(other.presentValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ImmovableProperty [id=" + id + ", description=" + description + ", place=" + place
				+ ", modeOfAcquisition=" + modeOfAcquisition + ", permissionObtained=" + permissionObtained
				+ ", presentValue=" + presentValue + ", orderNo=" + orderNo + ", orderDate=" + orderDate
				+ ", documents=" + Arrays.toString(documents) + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
}
