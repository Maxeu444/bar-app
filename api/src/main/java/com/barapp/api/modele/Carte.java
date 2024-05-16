package com.barapp.api.modele;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "carte")
@Getter
@Setter
@NoArgsConstructor
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_carte;
    @Column(length = 50)
    private String nom_carte;
    private Integer id_user_carte ;
    @Column(length = 50)
    private String cocktail_carte;
    @OneToMany
    private List<Cocktail> cocktails;
}
