package com.example.taxiservice.services;

import com.example.taxiservice.dto.DispatcherRequest;
import com.example.taxiservice.entity.Dispatcher;
import com.example.taxiservice.repository.DispatcherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class DispatcherService {

    private final DispatcherRepository repository;

    public List<Dispatcher> getAll() {
        return repository.findAll();
    }

    public Dispatcher getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Dispatcher create(DispatcherRequest request){
        var dispatcher = Dispatcher.builder().id(new Random().nextLong())
                .fullName(request.getFullName())
                .salary(request.getSalary())
                .age(request.getAge())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .department(request.getDepartment())
                .build();
        return repository.save(dispatcher);
    }

    public Dispatcher update(Long id, DispatcherRequest request){
        var dispatcher = Dispatcher.builder().id(id)
                .fullName(request.getFullName())
                .salary(request.getSalary())
                .age(request.getAge())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .department(request.getDepartment())
                .build();
        return repository.save(dispatcher);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }


}
