package com.knyambe.cdfbackend.funding.empowermentLoan;

import com.knyambe.cdfbackend.funding.general.FundApplication;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class EmpowermentLoan extends FundApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int status;
    private String referenceNo;
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
