package com.example.taxiservice.services;

import com.example.taxiservice.dto.TaxiRequest;
import com.example.taxiservice.entity.Taxi;
import com.example.taxiservice.repository.TaxiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class TaxiService {

    private final TaxiRepository repository;

    public List<Taxi> getAll() {
        return repository.findAll();
    }

    public Taxi getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Taxi create(TaxiRequest request){
        var taxi = Taxi.builder().id(new Random().nextLong())
                .model(request.getModel())
                .color(request.getColor())
                .seats(request.getSeats())
                .trackNumber(request.getTrackNumber())
                .garage(request.getGarage())
                .build();
        return repository.save(taxi);
    }

    public Taxi update(Long id, TaxiRequest request){
        var taxi = Taxi.builder().id(id)
                .model(request.getModel())
                .color(request.getColor())
                .seats(request.getSeats())
                .trackNumber(request.getTrackNumber())
                .garage(request.getGarage())
                .build();
        return repository.save(taxi);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }


}
