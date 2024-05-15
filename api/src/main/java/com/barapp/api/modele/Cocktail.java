package com.barapp.api.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cocktail")
@Getter
@Setter
@NoArgsConstructor
public class Cocktail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cocktail;
    @Column(length = 50)
    private String nom_cocktail;
    @Column(length = 25)
    private String categorie_cocktail;
    @Column(length = 25)
    private String ingredient_cocktail;
    private BigDecimal prixS_cocktail;
    private BigDecimal prixM_cocktail;
    private BigDecimal prixL_cocktail;
}
