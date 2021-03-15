package com.example.taxiservice.dto;

import com.example.taxiservice.entity.Department;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DispatcherRequest {

    private String fullName;
    private BigDecimal salary;
    private BigDecimal age;
    private String email;
    private String mobile;

    private Department department;
}
