package com.example.taxiservice.controller;

import com.example.taxiservice.dto.TaxiRequest;
import com.example.taxiservice.entity.Taxi;
import com.example.taxiservice.services.TaxiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/taxis")
public class V1TaxiController {

    private final TaxiService service;

    @GetMapping
    public List<Taxi> getAll(@RequestParam Integer size,
                               @RequestParam(required = false, defaultValue = "1") Integer page){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Taxi get(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Taxi create(@RequestBody TaxiRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public Taxi update(@PathVariable Long id, @RequestBody TaxiRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
