package com.knyambe.cdfbackend.funding.empowermentLoan;

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
public class EmpowermentLoan  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int status;
    private Long referenceNo;
    private  Date dateCreated;
    private Date borrowingDate;
    private String borrower;
    private String borrowerAddress;
    private String borrowerWard;
    private String borrowerConstituency;
    private String lender;
    private BigDecimal loanAmount;
    private String loanPurpose;
    private BigDecimal loanAmountBenficiary;
    private String loanAmountBenficiaryInWords;
    private int paybackPeriod;
    private long bankAccount;
    private String mobileMoney;
    private String eWallet;
    private String signatoryFinanceInst;
    private String financialInstitution;
    private Date dateSignedFinancialInstitution;
    private String positionSignatory;

}
