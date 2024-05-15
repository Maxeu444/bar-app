package com.barapp.api.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "categorie")
@Getter
@Setter
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categorie;
    @Column(length = 50)
    private String nom_categorie;
}
