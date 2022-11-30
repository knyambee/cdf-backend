package com.knyambe.cdfbackend.funding.general;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Funds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String referenceNo;
    private String fundType;
    private Date dateSubmitted;
    private int status;
    private BigDecimal amount;
    private String userId;

    public Funds(String referenceNo, String fundType, BigDecimal amount, String userId) {
        this.referenceNo = referenceNo;
        this.fundType = fundType;
        this.dateSubmitted = new Date();
        this.status = 0;
        this.amount = amount;
        this.userId = userId;
    }
}
