package com.example.taxiservice.services;

import com.example.taxiservice.dto.DriverRequest;
import com.example.taxiservice.entity.Driver;
import com.example.taxiservice.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository repository;

    public List<Driver> getAll() {
        return repository.findAll();
    }

    public Driver getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Driver create(DriverRequest request){
        var driver = Driver.builder().id(new Random().nextLong())
                .fullName(request.getFullName())
                .salary(request.getSalary())
                .age(request.getAge())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .taxi(request.getTaxi())
                .build();
        return repository.save(driver);
    }

    public Driver update(Long id, DriverRequest request){
        var driver = Driver.builder().id(id)
                .fullName(request.getFullName())
                .salary(request.getSalary())
                .age(request.getAge())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .taxi(request.getTaxi())
                .build();
        return repository.save(driver);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }


}
