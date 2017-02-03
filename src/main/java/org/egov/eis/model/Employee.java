package org.egov.eis.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.egov.eis.entity.enums.EmployeeStatus;
import org.egov.eis.entity.enums.MaritalStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee extends User {
	@JsonProperty("code")
	private String code = null;

	@JsonProperty("dateOfAppointment")
	private Date dateOfAppointment = null;

	@JsonProperty("dateOfJoining")
	private Date dateOfJoining = null;

	@JsonProperty("dateOfRetirement")
	private Date dateOfRetirement = null;

	@JsonProperty("employeeStatus")
	private EmployeeStatus employeeStatus = null;

	@JsonProperty("recruitmentMode")
	public RecruitmentMode recruitmentMode = null;

	@JsonProperty("recruitmentType")
	public RecruitmentType recruitmentType = null;

	@JsonProperty("recruitmentQuota")
	public RecruitmentQuota recruitmentQuota = null;

	@JsonProperty("retirementAge")
	public Byte retirementAge = null;

	@JsonProperty("dateOfResignation")
	public Date dateOfResignation = null;

	@JsonProperty("dateOfTermination")
	public Date dateOfTermination = null;

	@JsonProperty("employeeType")
	private EmployeeType employeeType = null;

	@JsonProperty("assignments")
	private List<Assignment> assignments = new ArrayList<Assignment>();

	@JsonProperty("jurisdictions")
	private List<Jurisdiction> jurisdictions = new ArrayList<Jurisdiction>();

	@JsonProperty("motherTounge")
	private MotherTongue motherTongue = null;

	@JsonProperty("religion")
	private Religion religion = null;

 	@JsonProperty("community")
 	private Community community = null;

	@JsonProperty("category")
	private Category category = null;

	@JsonProperty("physicallyDisabled")
	private Boolean physicallyDisabled = null;

	@JsonProperty("medicalReportProduced")
	private Boolean medicalReportProduced = null;

	@JsonProperty("languagesKnown")
	private List<Languages> languagesKnown = new ArrayList<Languages>();

	@JsonProperty("maritalStatus")
	private MaritalStatus maritalStatus = null;

	@JsonProperty("passportNo")
	private String passportNo = null;

	@JsonProperty("gpfNo")
	private String gpfNo = null;

	@JsonProperty("bank")
	private Bank bank = null;

	@JsonProperty("bankBranch")
	private BankBranch bankBranch = null;

	@JsonProperty("bankAccount")
	private Long bankAccount = null;

	@JsonProperty("group")
	private Group group = null;

	@JsonProperty("placeOfBirth")
	private String placeOfBirth = null;

	@JsonProperty("documents")
	private byte[] documents = null;

	@JsonProperty("serviceHistory")
	private List<ServiceHistory> serviceHistory = new ArrayList<ServiceHistory>();

	@JsonProperty("probation")
	private List<Probation> probation = new ArrayList<Probation>();

	@JsonProperty("regularisation")
	private List<Regularisation> regularisation = new ArrayList<Regularisation>();

	@JsonProperty("technical")
	private List<TechnicalQualification> technical = new ArrayList<TechnicalQualification>();

	@JsonProperty("education")
	private List<EducationalQualification> education = new ArrayList<EducationalQualification>();

	@JsonProperty("test")
	private List<DepartmentalTest> test = new ArrayList<DepartmentalTest>();

	@JsonProperty("immovableProperty")
	private List<ImmovableProperty> immovableProperty = new ArrayList<ImmovableProperty>();

	@JsonProperty("movableProperty")
	private List<MovableProperty> movableProperty = new ArrayList<MovableProperty>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfRetirement() {
		return dateOfRetirement;
	}

	public void setDateOfRetirement(Date dateOfRetirement) {
		this.dateOfRetirement = dateOfRetirement;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public RecruitmentMode getRecruitmentMode() {
		return recruitmentMode;
	}

	public void setRecruitmentMode(RecruitmentMode recruitmentMode) {
		this.recruitmentMode = recruitmentMode;
	}

	public RecruitmentType getRecruitmentType() {
		return recruitmentType;
	}

	public void setRecruitmentType(RecruitmentType recruitmentType) {
		this.recruitmentType = recruitmentType;
	}

	public RecruitmentQuota getRecruitmentQuota() {
		return recruitmentQuota;
	}

	public void setRecruitmentQuota(RecruitmentQuota recruitmentQuota) {
		this.recruitmentQuota = recruitmentQuota;
	}

	public Byte getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(Byte retirementAge) {
		this.retirementAge = retirementAge;
	}

	public Date getDateOfResignation() {
		return dateOfResignation;
	}

	public void setDateOfResignation(Date dateOfResignation) {
		this.dateOfResignation = dateOfResignation;
	}

	public Date getDateOfTermination() {
		return dateOfTermination;
	}

	public void setDateOfTermination(Date dateOfTermination) {
		this.dateOfTermination = dateOfTermination;
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

	public MotherTongue getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(MotherTongue motherTongue) {
		this.motherTongue = motherTongue;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Boolean isPhysicallyDisabled() {
		return physicallyDisabled;
	}

	public void setPhysicallyDisabled(Boolean physicallyDisabled) {
		this.physicallyDisabled = physicallyDisabled;
	}

	public Boolean isMedicalReportProduced() {
		return medicalReportProduced;
	}

	public void setMedicalReportProduced(Boolean medicalReportProduced) {
		this.medicalReportProduced = medicalReportProduced;
	}

	public List<Languages> getlanguagesKnown() {
		return languagesKnown;
	}

	public void setlanguagesKnown(List<Languages> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getGpfNo() {
		return gpfNo;
	}

	public void setGpfNo(String gpfNo) {
		this.gpfNo = gpfNo;
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

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public byte[] getDocuments() {
		return documents;
	}

	public void setDocuments(byte[] documents) {
		this.documents = documents;
	}

	public List<ServiceHistory> getServiceHistory() {
		return serviceHistory;
	}

	public void setServiceHistory(List<ServiceHistory> serviceHistory) {
		this.serviceHistory = serviceHistory;
	}

	public List<Probation> getProbation() {
		return probation;
	}

	public void setProbation(List<Probation> probation) {
		this.probation = probation;
	}

	public List<Regularisation> getRegularisation() {
		return regularisation;
	}

	public void setRegularisation(List<Regularisation> regularisation) {
		this.regularisation = regularisation;
	}

	public List<TechnicalQualification> getTechnical() {
		return technical;
	}

	public void setTechnical(List<TechnicalQualification> technical) {
		this.technical = technical;
	}

	public List<EducationalQualification> getEducation() {
		return education;
	}

	public void setEducation(List<EducationalQualification> education) {
		this.education = education;
	}

	public List<DepartmentalTest> getTest() {
		return test;
	}

	public void setTest(List<DepartmentalTest> test) {
		this.test = test;
	}

	public List<ImmovableProperty> getImmovableProperty() {
		return immovableProperty;
	}

	public void setImmovableProperty(List<ImmovableProperty> immovableProperty) {
		this.immovableProperty = immovableProperty;
	}

	public List<MovableProperty> getMovableProperty() {
		return movableProperty;
	}

	public void setMovableProperty(List<MovableProperty> movableProperty) {
		this.movableProperty = movableProperty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((assignments == null) ? 0 : assignments.hashCode());
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((bankAccount == null) ? 0 : bankAccount.hashCode());
		result = prime * result + ((bankBranch == null) ? 0 : bankBranch.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((community == null) ? 0 : community.hashCode());
		result = prime * result + ((dateOfAppointment == null) ? 0 : dateOfAppointment.hashCode());
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + ((dateOfResignation == null) ? 0 : dateOfResignation.hashCode());
		result = prime * result + ((dateOfRetirement == null) ? 0 : dateOfRetirement.hashCode());
		result = prime * result + ((dateOfTermination == null) ? 0 : dateOfTermination.hashCode());
		result = prime * result + Arrays.hashCode(documents);
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((employeeStatus == null) ? 0 : employeeStatus.hashCode());
		result = prime * result + ((employeeType == null) ? 0 : employeeType.hashCode());
		result = prime * result + ((gpfNo == null) ? 0 : gpfNo.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((immovableProperty == null) ? 0 : immovableProperty.hashCode());
		result = prime * result + ((jurisdictions == null) ? 0 : jurisdictions.hashCode());
		result = prime * result + ((languagesKnown == null) ? 0 : languagesKnown.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((medicalReportProduced == null) ? 0 : medicalReportProduced.hashCode());
		result = prime * result + ((motherTongue == null) ? 0 : motherTongue.hashCode());
		result = prime * result + ((movableProperty == null) ? 0 : movableProperty.hashCode());
		result = prime * result + ((passportNo == null) ? 0 : passportNo.hashCode());
		result = prime * result + ((physicallyDisabled == null) ? 0 : physicallyDisabled.hashCode());
		result = prime * result + ((placeOfBirth == null) ? 0 : placeOfBirth.hashCode());
		result = prime * result + ((probation == null) ? 0 : probation.hashCode());
		result = prime * result + ((recruitmentMode == null) ? 0 : recruitmentMode.hashCode());
		result = prime * result + ((recruitmentQuota == null) ? 0 : recruitmentQuota.hashCode());
		result = prime * result + ((recruitmentType == null) ? 0 : recruitmentType.hashCode());
		result = prime * result + ((regularisation == null) ? 0 : regularisation.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((retirementAge == null) ? 0 : retirementAge.hashCode());
		result = prime * result + ((serviceHistory == null) ? 0 : serviceHistory.hashCode());
		result = prime * result + ((technical == null) ? 0 : technical.hashCode());
		result = prime * result + ((test == null) ? 0 : test.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
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
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (community == null) {
			if (other.community != null)
				return false;
		} else if (!community.equals(other.community))
			return false;
		if (dateOfAppointment == null) {
			if (other.dateOfAppointment != null)
				return false;
		} else if (!dateOfAppointment.equals(other.dateOfAppointment))
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (dateOfResignation == null) {
			if (other.dateOfResignation != null)
				return false;
		} else if (!dateOfResignation.equals(other.dateOfResignation))
			return false;
		if (dateOfRetirement == null) {
			if (other.dateOfRetirement != null)
				return false;
		} else if (!dateOfRetirement.equals(other.dateOfRetirement))
			return false;
		if (dateOfTermination == null) {
			if (other.dateOfTermination != null)
				return false;
		} else if (!dateOfTermination.equals(other.dateOfTermination))
			return false;
		if (!Arrays.equals(documents, other.documents))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (employeeStatus != other.employeeStatus)
			return false;
		if (employeeType == null) {
			if (other.employeeType != null)
				return false;
		} else if (!employeeType.equals(other.employeeType))
			return false;
		if (gpfNo == null) {
			if (other.gpfNo != null)
				return false;
		} else if (!gpfNo.equals(other.gpfNo))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (immovableProperty == null) {
			if (other.immovableProperty != null)
				return false;
		} else if (!immovableProperty.equals(other.immovableProperty))
			return false;
		if (jurisdictions == null) {
			if (other.jurisdictions != null)
				return false;
		} else if (!jurisdictions.equals(other.jurisdictions))
			return false;
		if (languagesKnown == null) {
			if (other.languagesKnown != null)
				return false;
		} else if (!languagesKnown.equals(other.languagesKnown))
			return false;
		if (maritalStatus != other.maritalStatus)
			return false;
		if (medicalReportProduced == null) {
			if (other.medicalReportProduced != null)
				return false;
		} else if (!medicalReportProduced.equals(other.medicalReportProduced))
			return false;
		if (motherTongue == null) {
			if (other.motherTongue != null)
				return false;
		} else if (!motherTongue.equals(other.motherTongue))
			return false;
		if (movableProperty == null) {
			if (other.movableProperty != null)
				return false;
		} else if (!movableProperty.equals(other.movableProperty))
			return false;
		if (passportNo == null) {
			if (other.passportNo != null)
				return false;
		} else if (!passportNo.equals(other.passportNo))
			return false;
		if (physicallyDisabled == null) {
			if (other.physicallyDisabled != null)
				return false;
		} else if (!physicallyDisabled.equals(other.physicallyDisabled))
			return false;
		if (placeOfBirth == null) {
			if (other.placeOfBirth != null)
				return false;
		} else if (!placeOfBirth.equals(other.placeOfBirth))
			return false;
		if (probation == null) {
			if (other.probation != null)
				return false;
		} else if (!probation.equals(other.probation))
			return false;
		if (recruitmentMode == null) {
			if (other.recruitmentMode != null)
				return false;
		} else if (!recruitmentMode.equals(other.recruitmentMode))
			return false;
		if (recruitmentQuota == null) {
			if (other.recruitmentQuota != null)
				return false;
		} else if (!recruitmentQuota.equals(other.recruitmentQuota))
			return false;
		if (recruitmentType == null) {
			if (other.recruitmentType != null)
				return false;
		} else if (!recruitmentType.equals(other.recruitmentType))
			return false;
		if (regularisation == null) {
			if (other.regularisation != null)
				return false;
		} else if (!regularisation.equals(other.regularisation))
			return false;
		if (religion == null) {
			if (other.religion != null)
				return false;
		} else if (!religion.equals(other.religion))
			return false;
		if (retirementAge == null) {
			if (other.retirementAge != null)
				return false;
		} else if (!retirementAge.equals(other.retirementAge))
			return false;
		if (serviceHistory == null) {
			if (other.serviceHistory != null)
				return false;
		} else if (!serviceHistory.equals(other.serviceHistory))
			return false;
		if (technical == null) {
			if (other.technical != null)
				return false;
		} else if (!technical.equals(other.technical))
			return false;
		if (test == null) {
			if (other.test != null)
				return false;
		} else if (!test.equals(other.test))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [code=" + code + ", dateOfAppointment=" + dateOfAppointment + ", dateOfJoining="
				+ dateOfJoining + ", dateOfRetirement=" + dateOfRetirement + ", employeeStatus=" + employeeStatus
				+ ", recruitmentMode=" + recruitmentMode + ", recruitmentType=" + recruitmentType
				+ ", recruitmentQuota=" + recruitmentQuota + ", retirementAge=" + retirementAge + ", dateOfResignation="
				+ dateOfResignation + ", dateOfTermination=" + dateOfTermination + ", employeeType=" + employeeType
				+ ", assignments=" + assignments + ", jurisdictions=" + jurisdictions + ", motherTongue=" + motherTongue
				+ ", religion=" + religion + ", community=" + community + ", category=" + category
				+ ", physicallyDisabled=" + physicallyDisabled + ", medicalReportProduced=" + medicalReportProduced
				+ ", languagesKnown=" + languagesKnown + ", maritalStatus=" + maritalStatus + ", passportNo=" + passportNo
				+ ", gpfNo=" + gpfNo + ", bank=" + bank + ", bankBranch=" + bankBranch + ", bankAccount=" + bankAccount
				+ ", group=" + group + ", placeOfBirth=" + placeOfBirth + ", documents=" + Arrays.toString(documents)
				+ ", serviceHistory=" + serviceHistory + ", probation=" + probation + ", regularisation="
				+ regularisation + ", technical=" + technical + ", education=" + education + ", test=" + test
				+ ", immovableProperty=" + immovableProperty + ", movableProperty=" + movableProperty + "]";
	}
}
