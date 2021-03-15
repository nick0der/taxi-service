package com.example.taxiservice.services;

import com.example.taxiservice.dto.GarageRequest;
import com.example.taxiservice.entity.Garage;
import com.example.taxiservice.repository.GarageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GarageService {

    private final GarageRepository repository;

    public List<Garage> getAll() {
        return repository.findAll();
    }

    public Garage getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Garage create(GarageRequest request){
        var garage = Garage.builder().id(new Random().nextLong())
                .number(request.getNumber())
                .area(request.getArea())
                .department(request.getDepartment())
                .build();
        return repository.save(garage);
    }

    public Garage update(Long id, GarageRequest request){
        var garage = Garage.builder().id(id)
                .number(request.getNumber())
                .area(request.getArea())
                .department(request.getDepartment())
                .build();
        return repository.save(garage);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }


}
