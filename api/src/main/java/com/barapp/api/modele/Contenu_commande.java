package com.barapp.api.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "contenu_commande")
@Getter
@Setter
@NoArgsConstructor
public class Contenu_commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_contenu_commande;

    @ManyToOne
    @JoinColumn(name="id_commande_contcom", nullable = false)
    private Commande id_commande;

    @ManyToOne
    @JoinColumn(name="id_cocktail_contcom", nullable = false)
    private Cocktail id_cocktail;

    private Integer etape_contcom;
}
