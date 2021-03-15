package com.example.taxiservice.dto;

import com.example.taxiservice.entity.Department;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GarageRequest {

    private String number;
    private BigDecimal area;

    private Department department;

}
