package com.example.moneytrustmicrofinnance.domain.repository;


import com.example.moneytrustmicrofinnance.domain.model.MonieTrust;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<MonieTrust,Long> {
}
