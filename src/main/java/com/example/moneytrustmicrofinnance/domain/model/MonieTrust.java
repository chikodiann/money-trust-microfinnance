package com.example.moneytrustmicrofinnance.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table

public class MonieTrust {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private String message;

    @OneToOne(cascade = CascadeType.REMOVE,mappedBy = "model",orphanRemoval = true)
    private ModelResponse datas;



}
