package com.example.taxiservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dispatcher {
    @Id
    private Long id;

    private String fullName;
    private BigDecimal salary;
    private BigDecimal age;
    private String email;
    private String mobile;

    @ManyToOne
    private Department department;

}
