package com.knyambe.cdfbackend.funding.empowermentGrant;

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
public class EmpowermentGrant extends FundApplication {
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
}
