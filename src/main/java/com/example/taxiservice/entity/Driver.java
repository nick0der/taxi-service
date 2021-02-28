package com.example.taxiservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Driver {
    @Id
    private Long id;

    private String fullName;
    private BigDecimal salary;
    private BigDecimal age;
    private String email;
    private String mobile;

    @ManyToOne
    private Taxi taxi;

}
