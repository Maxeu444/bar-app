package com.barapp.api.service;

import com.barapp.api.modele.Contenu_commande;

import java.util.List;

public interface Contenu_commandeService {

        Contenu_commande creer(Contenu_commande contenu_commande);

        List<Contenu_commande> lire();

        Contenu_commande modifier(Integer id_contenu_commande, Contenu_commande contenu_commande);

        String supprimer(Integer id_contenu_commande);
}
