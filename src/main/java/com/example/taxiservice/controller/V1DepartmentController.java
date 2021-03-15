package com.example.taxiservice.controller;

import com.example.taxiservice.dto.DepartmentRequest;
import com.example.taxiservice.entity.Department;
import com.example.taxiservice.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/departments")
public class V1DepartmentController {

    private final DepartmentService service;

    @GetMapping
    public List<Department> getAll(@RequestParam Integer size,
                              @RequestParam(required = false, defaultValue = "1") Integer page){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Department create(@RequestBody DepartmentRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable Long id, @RequestBody DepartmentRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
