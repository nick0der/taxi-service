package com.example.taxiservice.repository;

import com.example.taxiservice.entity.Chief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ChiefRepository extends JpaRepository<Chief, Long> {
    Optional<Chief> findChiefByFullName(String fullName);
    List<Chief> findAllByAgeBetween(BigDecimal number1, BigDecimal number2);
}
