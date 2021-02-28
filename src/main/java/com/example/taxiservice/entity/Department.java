package com.example.taxiservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Department {
    @Id
    private Long id;

    private String address;

    @ManyToOne
    private Chief chief;

}
