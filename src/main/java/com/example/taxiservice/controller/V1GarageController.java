package com.example.taxiservice.controller;

import com.example.taxiservice.dto.GarageRequest;
import com.example.taxiservice.entity.Garage;
import com.example.taxiservice.services.GarageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/garages")
public class V1GarageController {

    private final GarageService service;

    @GetMapping
    public List<Garage> getAll(@RequestParam Integer size,
                                   @RequestParam(required = false, defaultValue = "1") Integer page){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Garage get(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Garage create(@RequestBody GarageRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public Garage update(@PathVariable Long id, @RequestBody GarageRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
