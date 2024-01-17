package com.example.moneytrustmicrofinnance.domain.repository;


import com.example.moneytrustmicrofinnance.domain.model.ModelResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataModelRepository extends JpaRepository<ModelResponse,Long> {
}
