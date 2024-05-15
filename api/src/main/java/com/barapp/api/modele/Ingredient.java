package com.barapp.api.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredient")
@Getter
@Setter
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ingredient;
    @Column(length = 50)
    private String nom_ingredient;
}