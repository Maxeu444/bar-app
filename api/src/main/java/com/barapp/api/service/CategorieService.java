package com.barapp.api.service;

import com.barapp.api.modele.Categorie;
import java.util.List;

public interface CategorieService {

        Categorie creer(Categorie categorie);

        List<Categorie> lire();

        Categorie modifier(Integer id_categorie, Categorie categorie);

        String supprimer(Integer id_categorie);
}
