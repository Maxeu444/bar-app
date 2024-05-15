package com.barapp.api.repository;

import com.barapp.api.modele.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Integer>{
}
