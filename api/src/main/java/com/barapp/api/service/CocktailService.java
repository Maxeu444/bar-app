package com.barapp.api.service;

import com.barapp.api.modele.Cocktail;

import java.util.List;

public interface CocktailService {

    Cocktail creer(Cocktail cocktail);

    List<Cocktail> lire();

    Cocktail modifier(Integer id_cocktail, Cocktail cocktail);

    String supprimer(Integer id_cocktail);
}
