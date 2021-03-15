package com.example.taxiservice.controller;

import com.example.taxiservice.dto.DriverRequest;
import com.example.taxiservice.entity.Driver;
import com.example.taxiservice.services.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/drivers")
public class V1DriverController {

    private final DriverService service;

    @GetMapping
    public List<Driver> getAll(@RequestParam Integer size,
                                   @RequestParam(required = false, defaultValue = "1") Integer page){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Driver get(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Driver create(@RequestBody DriverRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public Driver update(@PathVariable Long id, @RequestBody DriverRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
