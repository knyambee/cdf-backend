package com.knyambe.cdfbackend.funding.skillsTrainingBursary.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SkillsTrainingBursary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String surname;

    private String otherNames;

    private String gender;

    private String nationality;

    private String nrc;

    private Date dateOfBirth;

    private String placeOfBirth;

    private String district;

    private String constituency;

    private String ward;

    private String zone;

    private String postalAddress;

    private String mobilePhone;

    private String email;

    private String orphanStatus;

    private String disability;

    private String financialChallenge;

    private String schoolLeaver;

    private String lastGradeAttended;

    private String lastSchoolAttended;

    private String lastSchoolAttendedDistrict;
    private Date fromDate;

    private Date toDate;

    private String highestCertificate;

    private String receivedAcceptanceLetter;

    private String nameOfAcceptingInstitution;

    private String programmeOfStudy;

    private String programmeDuration;

    private String receivedSponsorshipBefore;

    private String otherSponsorshipDetails;

    private String cdfSponsorship;

    private String cdfSponsorshipDetails;

    private String guardianSurname;

    private String guardianOtherName;

    private String guardianGender;

    private Date guardianDateOfBirth;

    private String guardianNationality;

    private String guardianNRC;

    private String relationshipToApplicant;

    private String guardianVillage;

    private String guardianChief;

    private String guardianDistrict;

    private String guardianAddress;

    private String guardianConstituency;

    private String guardianDistrictDistrict;

    private String guardianProvince;

    private String guardianPostalAddress;

    private String guardianPhoneNumber;

    private String guardianEmail;

    private String occupationFather;

    private String occupationMother;

    private String occupationGuardian;

    private String employerFather;

    private String employerMother;

    private String employerGuardian;

    private String positionFather;

    private String positionMother;

    private String positionGuardian;

    private Date applicantSigningDate;

    private Date parentGuardianSigningDate;

    private String nrcCopy;

    private String disabilityCard;

    private String recommendationLetter;
    private String certificates;

    public SkillsTrainingBursary() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
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

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrphanStatus() {
        return orphanStatus;
    }

    public void setOrphanStatus(String orphanStatus) {
        this.orphanStatus = orphanStatus;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getFinancialChallenge() {
        return financialChallenge;
    }

    public void setFinancialChallenge(String financialChallenge) {
        this.financialChallenge = financialChallenge;
    }

    public String getSchoolLeaver() {
        return schoolLeaver;
    }

    public void setSchoolLeaver(String schoolLeaver) {
        this.schoolLeaver = schoolLeaver;
    }

    public String getLastGradeAttended() {
        return lastGradeAttended;
    }

    public void setLastGradeAttended(String lastGradeAttended) {
        this.lastGradeAttended = lastGradeAttended;
    }

    public String getLastSchoolAttended() {
        return lastSchoolAttended;
    }

    public void setLastSchoolAttended(String lastSchoolAttended) {
        this.lastSchoolAttended = lastSchoolAttended;
    }

    public String getLastSchoolAttendedDistrict() {
        return lastSchoolAttendedDistrict;
    }

    public void setLastSchoolAttendedDistrict(String lastSchoolAttendedDistrict) {
        this.lastSchoolAttendedDistrict = lastSchoolAttendedDistrict;
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

    public String getHighestCertificate() {
        return highestCertificate;
    }

    public void setHighestCertificate(String highestCertificate) {
        this.highestCertificate = highestCertificate;
    }

    public String getReceivedAcceptanceLetter() {
        return receivedAcceptanceLetter;
    }

    public void setReceivedAcceptanceLetter(String receivedAcceptanceLetter) {
        this.receivedAcceptanceLetter = receivedAcceptanceLetter;
    }

    public String getNameOfAcceptingInstitution() {
        return nameOfAcceptingInstitution;
    }

    public void setNameOfAcceptingInstitution(String nameOfAcceptingInstitution) {
        this.nameOfAcceptingInstitution = nameOfAcceptingInstitution;
    }

    public String getProgrammeOfStudy() {
        return programmeOfStudy;
    }

    public void setProgrammeOfStudy(String programmeOfStudy) {
        this.programmeOfStudy = programmeOfStudy;
    }

    public String getProgrammeDuration() {
        return programmeDuration;
    }

    public void setProgrammeDuration(String programmeDuration) {
        this.programmeDuration = programmeDuration;
    }

    public String getReceivedSponsorshipBefore() {
        return receivedSponsorshipBefore;
    }

    public void setReceivedSponsorshipBefore(String receivedSponsorshipBefore) {
        this.receivedSponsorshipBefore = receivedSponsorshipBefore;
    }

    public String getOtherSponsorshipDetails() {
        return otherSponsorshipDetails;
    }

    public void setOtherSponsorshipDetails(String otherSponsorshipDetails) {
        this.otherSponsorshipDetails = otherSponsorshipDetails;
    }

    public String getCdfSponsorship() {
        return cdfSponsorship;
    }

    public void setCdfSponsorship(String cdfSponsorship) {
        this.cdfSponsorship = cdfSponsorship;
    }

    public String getCdfSponsorshipDetails() {
        return cdfSponsorshipDetails;
    }

    public void setCdfSponsorshipDetails(String cdfSponsorshipDetails) {
        this.cdfSponsorshipDetails = cdfSponsorshipDetails;
    }

    public String getGuardianSurname() {
        return guardianSurname;
    }

    public void setGuardianSurname(String guardianSurname) {
        this.guardianSurname = guardianSurname;
    }

    public String getGuardianOtherName() {
        return guardianOtherName;
    }

    public void setGuardianOtherName(String guardianOtherName) {
        this.guardianOtherName = guardianOtherName;
    }

    public String getGuardianGender() {
        return guardianGender;
    }

    public void setGuardianGender(String guardianGender) {
        this.guardianGender = guardianGender;
    }

    public Date getGuardianDateOfBirth() {
        return guardianDateOfBirth;
    }

    public void setGuardianDateOfBirth(Date guardianDateOfBirth) {
        this.guardianDateOfBirth = guardianDateOfBirth;
    }

    public String getGuardianNationality() {
        return guardianNationality;
    }

    public void setGuardianNationality(String guardianNationality) {
        this.guardianNationality = guardianNationality;
    }

    public String getGuardianNRC() {
        return guardianNRC;
    }

    public void setGuardianNRC(String guardianNRC) {
        this.guardianNRC = guardianNRC;
    }

    public String getRelationshipToApplicant() {
        return relationshipToApplicant;
    }

    public void setRelationshipToApplicant(String relationshipToApplicant) {
        this.relationshipToApplicant = relationshipToApplicant;
    }

    public String getGuardianVillage() {
        return guardianVillage;
    }

    public void setGuardianVillage(String guardianVillage) {
        this.guardianVillage = guardianVillage;
    }

    public String getGuardianChief() {
        return guardianChief;
    }

    public void setGuardianChief(String guardianChief) {
        this.guardianChief = guardianChief;
    }

    public String getGuardianDistrict() {
        return guardianDistrict;
    }

    public void setGuardianDistrict(String guardianDistrict) {
        this.guardianDistrict = guardianDistrict;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }

    public String getGuardianConstituency() {
        return guardianConstituency;
    }

    public void setGuardianConstituency(String guardianConstituency) {
        this.guardianConstituency = guardianConstituency;
    }

    public String getGuardianDistrictDistrict() {
        return guardianDistrictDistrict;
    }

    public void setGuardianDistrictDistrict(String guardianDistrictDistrict) {
        this.guardianDistrictDistrict = guardianDistrictDistrict;
    }

    public String getGuardianProvince() {
        return guardianProvince;
    }

    public void setGuardianProvince(String guardianProvince) {
        this.guardianProvince = guardianProvince;
    }

    public String getGuardianPostalAddress() {
        return guardianPostalAddress;
    }

    public void setGuardianPostalAddress(String guardianPostalAddress) {
        this.guardianPostalAddress = guardianPostalAddress;
    }

    public String getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public void setGuardianPhoneNumber(String guardianPhoneNumber) {
        this.guardianPhoneNumber = guardianPhoneNumber;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public void setGuardianEmail(String guardianEmail) {
        this.guardianEmail = guardianEmail;
    }

    public String getOccupationFather() {
        return occupationFather;
    }

    public void setOccupationFather(String occupationFather) {
        this.occupationFather = occupationFather;
    }

    public String getOccupationMother() {
        return occupationMother;
    }

    public void setOccupationMother(String occupationMother) {
        this.occupationMother = occupationMother;
    }

    public String getOccupationGuardian() {
        return occupationGuardian;
    }

    public void setOccupationGuardian(String occupationGuardian) {
        this.occupationGuardian = occupationGuardian;
    }

    public String getEmployerFather() {
        return employerFather;
    }

    public void setEmployerFather(String employerFather) {
        this.employerFather = employerFather;
    }

    public String getEmployerMother() {
        return employerMother;
    }

    public void setEmployerMother(String employerMother) {
        this.employerMother = employerMother;
    }

    public String getEmployerGuardian() {
        return employerGuardian;
    }

    public void setEmployerGuardian(String employerGuardian) {
        this.employerGuardian = employerGuardian;
    }

    public String getPositionFather() {
        return positionFather;
    }

    public void setPositionFather(String positionFather) {
        this.positionFather = positionFather;
    }

    public String getPositionMother() {
        return positionMother;
    }

    public void setPositionMother(String positionMother) {
        this.positionMother = positionMother;
    }

    public String getPositionGuardian() {
        return positionGuardian;
    }

    public void setPositionGuardian(String positionGuardian) {
        this.positionGuardian = positionGuardian;
    }

    public Date getApplicantSigningDate() {
        return applicantSigningDate;
    }

    public void setApplicantSigningDate(Date applicantSigningDate) {
        this.applicantSigningDate = applicantSigningDate;
    }

    public Date getParentGuardianSigningDate() {
        return parentGuardianSigningDate;
    }

    public void setParentGuardianSigningDate(Date parentGuardianSigningDate) {
        this.parentGuardianSigningDate = parentGuardianSigningDate;
    }

    public String getNrcCopy() {
        return nrcCopy;
    }

    public void setNrcCopy(String nrcCopy) {
        this.nrcCopy = nrcCopy;
    }

    public String getDisabilityCard() {
        return disabilityCard;
    }

    public void setDisabilityCard(String disabilityCard) {
        this.disabilityCard = disabilityCard;
    }

    public String getRecommendationLetter() {
        return recommendationLetter;
    }

    public void setRecommendationLetter(String recommendationLetter) {
        this.recommendationLetter = recommendationLetter;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }
}
