package org.egov.eis.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.egov.eis.entity.enums.EmployeeStatus;
import org.egov.eis.entity.enums.Gender;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeInfo {

	@JsonProperty("code")
	private String code = null;

	@JsonProperty("employeeStatus")
	private EmployeeStatus employeeStatus = null;

	@JsonProperty("employeeType")
	private EmployeeType employeeType = null;

	@JsonProperty("assignments")
	private List<Assignment> assignments = new ArrayList<Assignment>();

	@JsonProperty("jurisdictions")
	private List<Jurisdiction> jurisdictions = new ArrayList<Jurisdiction>();

	@JsonProperty("bank")
	private Bank bank = null;

	@JsonProperty("bankBranch")
	private BankBranch bankBranch = null;

	@JsonProperty("bankAccount")
	private Long bankAccount = null;

	@JsonProperty("documents")
	private byte[] documents = null;

	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("userName")
	private String userName = null;

	@JsonProperty("password")
	private String password = null;

	@JsonProperty("salutation")
	private String salutation = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("gender")
	private List<Gender> gender = new ArrayList<Gender>();

	@JsonProperty("mobileNumber")
	private Long mobileNumber = null;

	@JsonProperty("emailId")
	private String emailId = null;

	@JsonProperty("pan")
	private String pan = null;

	@JsonProperty("aadhaarNumber")
	private String aadhaarNumber = null;

	@JsonProperty("active")
	private Boolean active = null;

	@JsonProperty("type")
	private List<EmployeeType> type = new ArrayList<EmployeeType>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public List<Jurisdiction> getJurisdictions() {
		return jurisdictions;
	}

	public void setJurisdictions(List<Jurisdiction> jurisdictions) {
		this.jurisdictions = jurisdictions;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public BankBranch getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(BankBranch bankBranch) {
		this.bankBranch = bankBranch;
	}

	public Long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Long bankAccount) {
		this.bankAccount = bankAccount;
	}

	public byte[] getDocuments() {
		return documents;
	}

	public void setDocuments(byte[] documents) {
		this.documents = documents;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public List<Gender> getGender() {
		return gender;
	}

	public void setGender(List<Gender> gender) {
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

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<EmployeeType> getType() {
		return type;
	}

	public void setType(List<EmployeeType> type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadhaarNumber == null) ? 0 : aadhaarNumber.hashCode());
		result = prime * result + ((assignments == null) ? 0 : assignments.hashCode());
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((bankAccount == null) ? 0 : bankAccount.hashCode());
		result = prime * result + ((bankBranch == null) ? 0 : bankBranch.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + Arrays.hashCode(documents);
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((employeeStatus == null) ? 0 : employeeStatus.hashCode());
		result = prime * result + ((employeeType == null) ? 0 : employeeType.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((jurisdictions == null) ? 0 : jurisdictions.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((salutation == null) ? 0 : salutation.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EmployeeInfo))
			return false;
		EmployeeInfo other = (EmployeeInfo) obj;
		if (aadhaarNumber == null) {
			if (other.aadhaarNumber != null)
				return false;
		} else if (!aadhaarNumber.equals(other.aadhaarNumber))
			return false;
		if (assignments == null) {
			if (other.assignments != null)
				return false;
		} else if (!assignments.equals(other.assignments))
			return false;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (bankAccount == null) {
			if (other.bankAccount != null)
				return false;
		} else if (!bankAccount.equals(other.bankAccount))
			return false;
		if (bankBranch == null) {
			if (other.bankBranch != null)
				return false;
		} else if (!bankBranch.equals(other.bankBranch))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (!Arrays.equals(documents, other.documents))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (employeeStatus != other.employeeStatus)
			return false;
		if (employeeType == null) {
			if (other.employeeType != null)
				return false;
		} else if (!employeeType.equals(other.employeeType))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (jurisdictions == null) {
			if (other.jurisdictions != null)
				return false;
		} else if (!jurisdictions.equals(other.jurisdictions))
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
		if (salutation == null) {
			if (other.salutation != null)
				return false;
		} else if (!salutation.equals(other.salutation))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [code=" + code + ", employeeStatus=" + employeeStatus + ", employeeType=" + employeeType
				+ ", assignments=" + assignments + ", jurisdictions=" + jurisdictions + ", bank=" + bank
				+ ", bankBranch=" + bankBranch + ", bankAccount=" + bankAccount + ", documents="
				+ Arrays.toString(documents) + ", id=" + id + ", userName=" + userName + ", password=" + password
				+ ", salutation=" + salutation + ", name=" + name + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + ", pan=" + pan + ", aadhaarNumber=" + aadhaarNumber
				+ ", active=" + active + ", type=" + type + "]";
	}

}