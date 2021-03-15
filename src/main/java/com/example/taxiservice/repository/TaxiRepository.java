package com.example.taxiservice.repository;

import com.example.taxiservice.entity.Chief;
import com.example.taxiservice.entity.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Long> {
    Optional<Taxi> findTaxiByTrackNumber(String trackNumber);
    List<Chief> findAllByModel(String model);
}
