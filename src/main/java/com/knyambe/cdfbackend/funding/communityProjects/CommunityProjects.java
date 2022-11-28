package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.FundApplication;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class CommunityProjects extends FundApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int status;
    private Long referenceNo;
    private  Date dateCreated;
    private String district;
    private String constituency;
    private String ward;
    private String zone;
    private String landTitle;
    private String projectType;
    private int numberBeneficiary;
    private String communityBasedProjects;
    private String communityFunding;
    private String mainProblems;
    private String problemAddressed;
    private String projectIdentification;
    private String doneBefore;
    private String doneBeforeExplanation;
    private String beneficiaries;
    private BigDecimal estimatedCost;
    private String communityContribution;
    private String committeeMembers;
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
}
