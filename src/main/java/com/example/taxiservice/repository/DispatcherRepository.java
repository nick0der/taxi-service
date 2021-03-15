package com.example.taxiservice.repository;

import com.example.taxiservice.entity.Dispatcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface DispatcherRepository extends JpaRepository<Dispatcher, Long> {
    Optional<Dispatcher> findDispatcherByFullName(String fullName);
    List<Dispatcher> findAllByAgeBetween(BigDecimal number1, BigDecimal number2);
}
