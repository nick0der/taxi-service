package com.example.taxiservice.dto;

import com.example.taxiservice.entity.Taxi;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DriverRequest {

    private String fullName;
    private BigDecimal salary;
    private BigDecimal age;
    private String email;
    private String mobile;

    private Taxi taxi;
}
