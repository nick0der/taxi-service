package com.example.taxiservice.services;

import com.example.taxiservice.dto.ChiefRequest;
import com.example.taxiservice.entity.Chief;
import com.example.taxiservice.repository.ChiefRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class ChiefService {

    private final ChiefRepository repository;

    public List<Chief> getAll() {
        return repository.findAll();
    }

    public Chief getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Chief create(ChiefRequest request){
        var chief = Chief.builder().id(new Random().nextLong())
                .fullName(request.getFullName())
                .salary(request.getSalary())
                .age(request.getAge())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .build();
        return repository.save(chief);
    }

    public Chief update(Long id, ChiefRequest request){
        var chief = Chief.builder().id(id)
                .fullName(request.getFullName())
                .salary(request.getSalary())
                .age(request.getAge())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .build();
        return repository.save(chief);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
