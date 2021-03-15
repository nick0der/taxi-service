package com.example.taxiservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ChiefRequest {

    private String fullName;
    private BigDecimal salary;
    private BigDecimal age;
    private String email;
    private String mobile;

}
