package com.knyambe.cdfbackend.funding.skillsTrainingBursary;

import com.knyambe.cdfbackend.funding.general.FundApplication;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SkillsTrainingBursary extends FundApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int status;
    private Long referenceNo;
    private  Date dateCreated;
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
}
