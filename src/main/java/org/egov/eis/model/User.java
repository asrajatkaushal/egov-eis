package org.egov.eis.model;

import java.util.Date;
import java.util.Arrays;
import java.util.List;

import org.egov.eis.entity.enums.BloodGroup;
import org.egov.eis.entity.enums.Gender;
import org.egov.eis.entity.enums.UserType;

import com.fasterxml.jackson.annotation.JsonProperty;


public class User {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("username")
	private String username = null;

	@JsonProperty("password")
	private String password = null;

	@JsonProperty("salutation")
	private String salutation = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("gender")
	public Gender gender = null;

	@JsonProperty("mobileNumber")
	private Long mobileNumber = null;

	@JsonProperty("emailId")
	private String emailId = null;

	@JsonProperty("altContactNumber")
	private Long altContactNumber = null;

	@JsonProperty("pan")
	private String pan = null;

	@JsonProperty("aadhaarNumber")
	private String aadhaarNumber = null;

 	@JsonProperty("permanentAddress")
 	private String permanentAddress = null;

 	@JsonProperty("permanentCity")
 	private String permanentCity = null;

 	@JsonProperty("permanentPincode")
 	private Integer permanentPincode = null;

 	@JsonProperty("correspondenceAddress")
 	private String correspondenceAddress = null;

 	@JsonProperty("correspondenceCity")
 	private String correspondenceCity = null;

 	@JsonProperty("CorrespondencePincode")
 	private Integer CorrespondencePincode = null;

	@JsonProperty("active")
	private Boolean active = null;

	@JsonProperty("dob")
	private Date dob = null;

	@JsonProperty("pwdExpiryDate")
	private Date pwdExpiryDate = null;

	@JsonProperty("locale")
	private String locale = null;

	@JsonProperty("type")
	public UserType type;

	@JsonProperty("signature")
	private byte[] signature = null;

	@JsonProperty("accountLocked")
	private Boolean accountLocked = null;

	@JsonProperty("roles")
	private List<Role> roles = null;

	@JsonProperty("fatherOrHusbandName")
	private String fatherOrHusbandName = null;

	@JsonProperty("bloodGroup")
	public BloodGroup bloodGroup = null;

	@JsonProperty("identificationMark")
	private String identificationMark = null;

	@JsonProperty("photo")
	private byte[] photo = null;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getAltContactNumber() {
		return altContactNumber;
	}

	public void setAltContactNumber(Long altContactNumber) {
		this.altContactNumber = altContactNumber;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPermanentCity() {
		return permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public Integer getPermanentPincode() {
		return permanentPincode;
	}

	public void setPermanentPincode(Integer permanentPincode) {
		this.permanentPincode = permanentPincode;
	}

	public String getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(String correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public String getCorrespondenceCity() {
		return correspondenceCity;
	}

	public void setCorrespondenceCity(String correspondenceCity) {
		this.correspondenceCity = correspondenceCity;
	}

	public Integer getCorrespondencePincode() {
		return CorrespondencePincode;
	}

	public void setCorrespondencePincode(Integer correspondencePincode) {
		CorrespondencePincode = correspondencePincode;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getPwdExpiryDate() {
		return pwdExpiryDate;
	}

	public void setPwdExpiryDate(Date pwdExpiryDate) {
		this.pwdExpiryDate = pwdExpiryDate;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	public Boolean isAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(Boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getFatherOrHusbandName() {
		return fatherOrHusbandName;
	}

	public void setFatherOrHusbandName(String fatherOrHusbandName) {
		this.fatherOrHusbandName = fatherOrHusbandName;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getIdentificationMark() {
		return identificationMark;
	}

	public void setIdentificationMark(String identificationMark) {
		this.identificationMark = identificationMark;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
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
		result = prime * result + ((CorrespondencePincode == null) ? 0 : CorrespondencePincode.hashCode());
		result = prime * result + ((aadhaarNumber == null) ? 0 : aadhaarNumber.hashCode());
		result = prime * result + ((accountLocked == null) ? 0 : accountLocked.hashCode());
		result = prime * result + ((altContactNumber == null) ? 0 : altContactNumber.hashCode());
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + ((correspondenceAddress == null) ? 0 : correspondenceAddress.hashCode());
		result = prime * result + ((correspondenceCity == null) ? 0 : correspondenceCity.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((fatherOrHusbandName == null) ? 0 : fatherOrHusbandName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((identificationMark == null) ? 0 : identificationMark.hashCode());
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
		result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
		result = prime * result + ((permanentCity == null) ? 0 : permanentCity.hashCode());
		result = prime * result + ((permanentPincode == null) ? 0 : permanentPincode.hashCode());
		result = prime * result + Arrays.hashCode(photo);
		result = prime * result + ((pwdExpiryDate == null) ? 0 : pwdExpiryDate.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((salutation == null) ? 0 : salutation.hashCode());
		result = prime * result + Arrays.hashCode(signature);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (CorrespondencePincode == null) {
			if (other.CorrespondencePincode != null)
				return false;
		} else if (!CorrespondencePincode.equals(other.CorrespondencePincode))
			return false;
		if (aadhaarNumber == null) {
			if (other.aadhaarNumber != null)
				return false;
		} else if (!aadhaarNumber.equals(other.aadhaarNumber))
			return false;
		if (accountLocked == null) {
			if (other.accountLocked != null)
				return false;
		} else if (!accountLocked.equals(other.accountLocked))
			return false;
		if (altContactNumber == null) {
			if (other.altContactNumber != null)
				return false;
		} else if (!altContactNumber.equals(other.altContactNumber))
			return false;
		if (bloodGroup != other.bloodGroup)
			return false;
		if (correspondenceAddress == null) {
			if (other.correspondenceAddress != null)
				return false;
		} else if (!correspondenceAddress.equals(other.correspondenceAddress))
			return false;
		if (correspondenceCity == null) {
			if (other.correspondenceCity != null)
				return false;
		} else if (!correspondenceCity.equals(other.correspondenceCity))
			return false;
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
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (fatherOrHusbandName == null) {
			if (other.fatherOrHusbandName != null)
				return false;
		} else if (!fatherOrHusbandName.equals(other.fatherOrHusbandName))
			return false;
		if (gender != other.gender)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (identificationMark == null) {
			if (other.identificationMark != null)
				return false;
		} else if (!identificationMark.equals(other.identificationMark))
			return false;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
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
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (permanentAddress == null) {
			if (other.permanentAddress != null)
				return false;
		} else if (!permanentAddress.equals(other.permanentAddress))
			return false;
		if (permanentCity == null) {
			if (other.permanentCity != null)
				return false;
		} else if (!permanentCity.equals(other.permanentCity))
			return false;
		if (permanentPincode == null) {
			if (other.permanentPincode != null)
				return false;
		} else if (!permanentPincode.equals(other.permanentPincode))
			return false;
		if (!Arrays.equals(photo, other.photo))
			return false;
		if (pwdExpiryDate == null) {
			if (other.pwdExpiryDate != null)
				return false;
		} else if (!pwdExpiryDate.equals(other.pwdExpiryDate))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (salutation == null) {
			if (other.salutation != null)
				return false;
		} else if (!salutation.equals(other.salutation))
			return false;
		if (!Arrays.equals(signature, other.signature))
			return false;
		if (type != other.type)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", salutation=" + salutation
				+ ", name=" + name + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", altContactNumber=" + altContactNumber + ", pan=" + pan + ", aadhaarNumber=" + aadhaarNumber
				+ ", permanentAddress=" + permanentAddress + ", permanentCity=" + permanentCity + ", permanentPincode="
				+ permanentPincode + ", correspondenceAddress=" + correspondenceAddress + ", correspondenceCity="
				+ correspondenceCity + ", CorrespondencePincode=" + CorrespondencePincode + ", active=" + active
				+ ", dob=" + dob + ", pwdExpiryDate=" + pwdExpiryDate + ", locale=" + locale + ", type=" + type
				+ ", signature=" + Arrays.toString(signature) + ", accountLocked=" + accountLocked + ", roles=" + roles
				+ ", fatherOrHusbandName=" + fatherOrHusbandName + ", bloodGroup=" + bloodGroup
				+ ", identificationMark=" + identificationMark + ", photo=" + Arrays.toString(photo) + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", lastModifiedBy=" + lastModifiedBy
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}
}
