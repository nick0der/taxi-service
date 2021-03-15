package com.example.taxiservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Taxi {
    @Id
    private Long id;

    private String model;
    private String color;
    private Long seats;
    private String trackNumber;

    @ManyToOne
    private Garage garage;

}
