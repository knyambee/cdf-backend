package com.knyambe.cdfbackend.funding.empowermentLoan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class EmpowermentLoan {
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

    public EmpowermentLoan() {
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

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrowerAddress() {
        return borrowerAddress;
    }

    public void setBorrowerAddress(String borrowerAddress) {
        this.borrowerAddress = borrowerAddress;
    }

    public String getBorrowerWard() {
        return borrowerWard;
    }

    public void setBorrowerWard(String borrowerWard) {
        this.borrowerWard = borrowerWard;
    }

    public String getBorrowerConstituency() {
        return borrowerConstituency;
    }

    public void setBorrowerConstituency(String borrowerConstituency) {
        this.borrowerConstituency = borrowerConstituency;
    }

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public BigDecimal getLoanAmountBenficiary() {
        return loanAmountBenficiary;
    }

    public void setLoanAmountBenficiary(BigDecimal loanAmountBenficiary) {
        this.loanAmountBenficiary = loanAmountBenficiary;
    }

    public String getLoanAmountBenficiaryInWords() {
        return loanAmountBenficiaryInWords;
    }

    public void setLoanAmountBenficiaryInWords(String loanAmountBenficiaryInWords) {
        this.loanAmountBenficiaryInWords = loanAmountBenficiaryInWords;
    }

    public int getPaybackPeriod() {
        return paybackPeriod;
    }

    public void setPaybackPeriod(int paybackPeriod) {
        this.paybackPeriod = paybackPeriod;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getMobileMoney() {
        return mobileMoney;
    }

    public void setMobileMoney(String mobileMoney) {
        this.mobileMoney = mobileMoney;
    }

    public String geteWallet() {
        return eWallet;
    }

    public void seteWallet(String eWallet) {
        this.eWallet = eWallet;
    }

    public String getSignatoryFinanceInst() {
        return signatoryFinanceInst;
    }

    public void setSignatoryFinanceInst(String signatoryFinanceInst) {
        this.signatoryFinanceInst = signatoryFinanceInst;
    }

    public String getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(String financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public Date getDateSignedFinancialInstitution() {
        return dateSignedFinancialInstitution;
    }

    public void setDateSignedFinancialInstitution(Date dateSignedFinancialInstitution) {
        this.dateSignedFinancialInstitution = dateSignedFinancialInstitution;
    }

    public String getPositionSignatory() {
        return positionSignatory;
    }

    public void setPositionSignatory(String positionSignatory) {
        this.positionSignatory = positionSignatory;
    }
}
