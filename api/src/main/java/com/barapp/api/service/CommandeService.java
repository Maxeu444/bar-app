package com.barapp.api.service;

import com.barapp.api.modele.Commande;

import java.util.List;

public interface CommandeService {

        Commande creer(Commande commande);

        List<Commande> lire();

        Commande modifier(Integer id_commande, Commande commande);

        String supprimer(Integer id_commande);
}
