package com.knyambe.cdfbackend.funding.general;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Funds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long referenceNo;
    private String fundType;
    private Date dateSubmitted;
    private int status;
    private BigDecimal amount;
    private String userId;

    public Funds(Long referenceNo, String fundType, int status, BigDecimal amount, String userId) {
        this.referenceNo = referenceNo;
        this.fundType = fundType;
        this.dateSubmitted = new Date();
        this.status = status;
        this.amount = amount;
        this.userId = userId;
    }

}
