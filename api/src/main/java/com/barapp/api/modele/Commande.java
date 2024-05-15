package com.barapp.api.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "commande")
@Getter
@Setter
@NoArgsConstructor
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_commande;
    @Column(length = 50)
    private String mail_client_commande;
    private Integer statut_commande;
    private BigDecimal prix_commande;
}
