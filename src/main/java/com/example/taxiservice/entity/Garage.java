package com.example.taxiservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
public class Garage {
    @Id
    private Long id;

    private String number;
    private BigDecimal area;

    @ManyToOne
    private Department department;

}
