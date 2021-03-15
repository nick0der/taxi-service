package com.example.taxiservice.services;

import com.example.taxiservice.dto.DepartmentRequest;
import com.example.taxiservice.entity.Department;
import com.example.taxiservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository repository;

    public List<Department> getAll() {
        return repository.findAll();
    }

    public Department getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Department create(DepartmentRequest request){
        var department = Department.builder().id(new Random().nextLong())
                .address(request.getAddress())
                .chief(request.getChief())
                .build();
        return repository.save(department);
    }

    public Department update(Long id, DepartmentRequest request){
        var department = Department.builder().id(id)
                .address(request.getAddress())
                .chief(request.getChief())
                .build();
        return repository.save(department);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }


}
