package com.knyambe.cdfbackend.funding.communityProjects.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;


@Entity
public class CommunityProjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String district;
    private String constituency;
    private String ward;
    private String zone;
    private String landTitle;
    private String projectType;
    private int numberBeneficiary;
    private String communityBasedProjects;
    private String comunityFunding;
    private String mainProblems;
    private String problemAddressed;
    private String projectIdentification;
    private String doneBefore;
    private String doneBeforeExplaination;
    private String beneficiaries;
    private BigDecimal estimatedCost;
    private String communityContribution;
    private String committeMembers;
    private String communitySustainability;
    private String nameProjectProposer;
    private String nrcProjectProposer;
    private String addressProjectProposer;
    private String phoneProjectProposer;
    private Date dateSignedProposer;
    private String nameProjectSeconder;
    private String nrcProjectSeconder;
    private String addressProjectSeconder;
    private String phoneProjectSeconder;
    private Date dateSignedSeconder;

    public CommunityProjects() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getLandTitle() {
        return landTitle;
    }

    public void setLandTitle(String landTitle) {
        this.landTitle = landTitle;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public int getNumberBeneficiary() {
        return numberBeneficiary;
    }

    public void setNumberBeneficiary(int numberBeneficiary) {
        this.numberBeneficiary = numberBeneficiary;
    }

    public String getCommunityBasedProjects() {
        return communityBasedProjects;
    }

    public void setCommunityBasedProjects(String communityBasedProjects) {
        this.communityBasedProjects = communityBasedProjects;
    }

    public String getComunityFunding() {
        return comunityFunding;
    }

    public void setComunityFunding(String comunityFunding) {
        this.comunityFunding = comunityFunding;
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

    public String getDoneBefore() {
        return doneBefore;
    }

    public void setDoneBefore(String doneBefore) {
        this.doneBefore = doneBefore;
    }

    public String getDoneBeforeExplaination() {
        return doneBeforeExplaination;
    }

    public void setDoneBeforeExplaination(String doneBeforeExplaination) {
        this.doneBeforeExplaination = doneBeforeExplaination;
    }

    public String getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(String beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public BigDecimal getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public String getCommunityContribution() {
        return communityContribution;
    }

    public void setCommunityContribution(String communityContribution) {
        this.communityContribution = communityContribution;
    }

    public String getCommitteMembers() {
        return committeMembers;
    }

    public void setCommitteMembers(String committeMembers) {
        this.committeMembers = committeMembers;
    }

    public String getCommunitySustainability() {
        return communitySustainability;
    }

    public void setCommunitySustainability(String communitySustainability) {
        this.communitySustainability = communitySustainability;
    }

    public String getNameProjectProposer() {
        return nameProjectProposer;
    }

    public void setNameProjectProposer(String nameProjectProposer) {
        this.nameProjectProposer = nameProjectProposer;
    }

    public String getNrcProjectProposer() {
        return nrcProjectProposer;
    }

    public void setNrcProjectProposer(String nrcProjectProposer) {
        this.nrcProjectProposer = nrcProjectProposer;
    }

    public String getAddressProjectProposer() {
        return addressProjectProposer;
    }

    public void setAddressProjectProposer(String addressProjectProposer) {
        this.addressProjectProposer = addressProjectProposer;
    }

    public String getPhoneProjectProposer() {
        return phoneProjectProposer;
    }

    public void setPhoneProjectProposer(String phoneProjectProposer) {
        this.phoneProjectProposer = phoneProjectProposer;
    }

    public Date getDateSignedProposer() {
        return dateSignedProposer;
    }

    public void setDateSignedProposer(Date dateSignedProposer) {
        this.dateSignedProposer = dateSignedProposer;
    }

    public String getNameProjectSeconder() {
        return nameProjectSeconder;
    }

    public void setNameProjectSeconder(String nameProjectSeconder) {
        this.nameProjectSeconder = nameProjectSeconder;
    }

    public String getNrcProjectSeconder() {
        return nrcProjectSeconder;
    }

    public void setNrcProjectSeconder(String nrcProjectSeconder) {
        this.nrcProjectSeconder = nrcProjectSeconder;
    }

    public String getAddressProjectSeconder() {
        return addressProjectSeconder;
    }

    public void setAddressProjectSeconder(String addressProjectSeconder) {
        this.addressProjectSeconder = addressProjectSeconder;
    }

    public String getPhoneProjectSeconder() {
        return phoneProjectSeconder;
    }

    public void setPhoneProjectSeconder(String phoneProjectSeconder) {
        this.phoneProjectSeconder = phoneProjectSeconder;
    }

    public Date getDateSignedSeconder() {
        return dateSignedSeconder;
    }

    public void setDateSignedSeconder(Date dateSignedSeconder) {
        this.dateSignedSeconder = dateSignedSeconder;
    }
}
