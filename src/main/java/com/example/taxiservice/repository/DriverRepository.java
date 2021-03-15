package com.example.taxiservice.repository;

import com.example.taxiservice.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findDriverByFullName(String fullName);
    List<Driver> findAllByAgeBetween(BigDecimal number1, BigDecimal number2);
}
