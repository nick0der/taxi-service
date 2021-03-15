package com.example.taxiservice.dto;

import com.example.taxiservice.entity.Garage;
import lombok.Data;

@Data
public class TaxiRequest {

    private String model;
    private String color;
    private Long seats;
    private String trackNumber;

    private Garage garage;

}
