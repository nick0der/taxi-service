package com.example.taxiservice.controller;

import com.example.taxiservice.dto.DispatcherRequest;
import com.example.taxiservice.entity.Dispatcher;
import com.example.taxiservice.services.DispatcherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/dispatchers")
public class V1DispatcherController {

    private final DispatcherService service;

    @GetMapping
    public List<Dispatcher> getAll(@RequestParam Integer size,
                                   @RequestParam(required = false, defaultValue = "1") Integer page){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Dispatcher get(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Dispatcher create(@RequestBody DispatcherRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public Dispatcher update(@PathVariable Long id, @RequestBody DispatcherRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
