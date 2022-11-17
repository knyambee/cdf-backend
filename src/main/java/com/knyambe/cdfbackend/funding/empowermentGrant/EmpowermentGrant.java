package com.knyambe.cdfbackend.funding.empowermentGrant;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EmpowermentGrant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int status;
    private Long referenceNo;
    private  Date dateCreated;
    private String applicantName;
    private String district;
    private String constituency;
    private String ward;
    private String zone;
    private String businessAddress;
    private Date registrationDate;
    private String organiseSimilarEvents;
    private String similarExperience;
    private String mainProblems;
    private String problemAddressed;
    private String projectIdentification;
    private String communityBenefit;
    private int jobsCreated;
    private String takenOutLoan;
    private String firstLoanAndOrganisation;
    private String secondLoanAndOrganisation;
    private String loanStatus;
    private String bankName;
    private String bankBranch;
    private int branchCode;
    private String swiftCode;
    private long accountNumber;
    private long tpin;
    private String mobileMoney;
    private int numberOfMembersTrained;
    private String training;
    private String members;
    private String firstApplicantName;
    private String firstApplicantPhysicalAddress;
    private String firstApplicantPhone;
    private String firstApplicantNrc;
    private Date firstApplicantDateSigned;
    private String secondApplicantName;
    private String secondApplicantPhysicalAddress;
    private String secondApplicantPhone;
    private String secondApplicantNrc;
    private Date secondApplicantDateSigned;

    public EmpowermentGrant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(Long referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getOrganiseSimilarEvents() {
        return organiseSimilarEvents;
    }

    public void setOrganiseSimilarEvents(String organiseSimilarEvents) {
        this.organiseSimilarEvents = organiseSimilarEvents;
    }

    public String getSimilarExperience() {
        return similarExperience;
    }

    public void setSimilarExperience(String similarExperience) {
        this.similarExperience = similarExperience;
    }

    public String getMainProblems() {
        return mainProblems;
    }

    public void setMainProblems(String mainProblems) {
        this.mainProblems = mainProblems;
    }

    public String getProblemAddressed() {
        return problemAddressed;
    }

    public void setProblemAddressed(String problemAddressed) {
        this.problemAddressed = problemAddressed;
    }

    public String getProjectIdentification() {
        return projectIdentification;
    }

    public void setProjectIdentification(String projectIdentification) {
        this.projectIdentification = projectIdentification;
    }

    public String getCommunityBenefit() {
        return communityBenefit;
    }

    public void setCommunityBenefit(String communityBenefit) {
        this.communityBenefit = communityBenefit;
    }

    public int getJobsCreated() {
        return jobsCreated;
    }

    public void setJobsCreated(int jobsCreated) {
        this.jobsCreated = jobsCreated;
    }

    public String getTakenOutLoan() {
        return takenOutLoan;
    }

    public void setTakenOutLoan(String takenOutLoan) {
        this.takenOutLoan = takenOutLoan;
    }

    public String getFirstLoanAndOrganisation() {
        return firstLoanAndOrganisation;
    }

    public void setFirstLoanAndOrganisation(String firstLoanAndOrganisation) {
        this.firstLoanAndOrganisation = firstLoanAndOrganisation;
    }

    public String getSecondLoanAndOrganisation() {
        return secondLoanAndOrganisation;
    }

    public void setSecondLoanAndOrganisation(String secondLoanAndOrganisation) {
        this.secondLoanAndOrganisation = secondLoanAndOrganisation;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getTpin() {
        return tpin;
    }

    public void setTpin(long tpin) {
        this.tpin = tpin;
    }

    public String getMobileMoney() {
        return mobileMoney;
    }

    public void setMobileMoney(String mobileMoney) {
        this.mobileMoney = mobileMoney;
    }

    public int getNumberOfMembersTrained() {
        return numberOfMembersTrained;
    }

    public void setNumberOfMembersTrained(int numberOfMembersTrained) {
        this.numberOfMembersTrained = numberOfMembersTrained;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getFirstApplicantName() {
        return firstApplicantName;
    }

    public void setFirstApplicantName(String firstApplicantName) {
        this.firstApplicantName = firstApplicantName;
    }

    public String getFirstApplicantPhysicalAddress() {
        return firstApplicantPhysicalAddress;
    }

    public void setFirstApplicantPhysicalAddress(String firstApplicantPhysicalAddress) {
        this.firstApplicantPhysicalAddress = firstApplicantPhysicalAddress;
    }

    public String getFirstApplicantPhone() {
        return firstApplicantPhone;
    }

    public void setFirstApplicantPhone(String firstApplicantPhone) {
        this.firstApplicantPhone = firstApplicantPhone;
    }

    public String getFirstApplicantNrc() {
        return firstApplicantNrc;
    }

    public void setFirstApplicantNrc(String firstApplicantNrc) {
        this.firstApplicantNrc = firstApplicantNrc;
    }

    public Date getFirstApplicantDateSigned() {
        return firstApplicantDateSigned;
    }

    public void setFirstApplicantDateSigned(Date firstApplicantDateSigned) {
        this.firstApplicantDateSigned = firstApplicantDateSigned;
    }

    public String getSecondApplicantName() {
        return secondApplicantName;
    }

    public void setSecondApplicantName(String secondApplicantName) {
        this.secondApplicantName = secondApplicantName;
    }

    public String getSecondApplicantPhysicalAddress() {
        return secondApplicantPhysicalAddress;
    }

    public void setSecondApplicantPhysicalAddress(String secondApplicantPhysicalAddress) {
        this.secondApplicantPhysicalAddress = secondApplicantPhysicalAddress;
    }

    public String getSecondApplicantPhone() {
        return secondApplicantPhone;
    }

    public void setSecondApplicantPhone(String secondApplicantPhone) {
        this.secondApplicantPhone = secondApplicantPhone;
    }

    public String getSecondApplicantNrc() {
        return secondApplicantNrc;
    }

    public void setSecondApplicantNrc(String secondApplicantNrc) {
        this.secondApplicantNrc = secondApplicantNrc;
    }

    public Date getSecondApplicantDateSigned() {
        return secondApplicantDateSigned;
    }

    public void setSecondApplicantDateSigned(Date secondApplicantDateSigned) {
        this.secondApplicantDateSigned = secondApplicantDateSigned;
    }
}
