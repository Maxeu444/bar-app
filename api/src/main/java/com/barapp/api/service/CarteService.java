package com.barapp.api.service;

import com.barapp.api.modele.Carte;

import java.util.List;

public interface CarteService {

    Carte creer(Carte carte);

    List<Carte> lire();

    Carte modifier(Integer id_carte, Carte carte);

    String supprimer(Integer id_carte);
}
