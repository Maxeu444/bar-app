package com.barapp.api.repository;

import com.barapp.api.modele.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer>{
}
