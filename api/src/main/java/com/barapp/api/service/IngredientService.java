package com.barapp.api.service;

import com.barapp.api.modele.Ingredient;

import java.util.List;

public interface IngredientService {

        Ingredient creer(Ingredient ingredient);

        List<Ingredient> lire();

        Ingredient modifier(Integer id_ingredient, Ingredient ingredient);

        String supprimer(Integer id_ingredient);
}
