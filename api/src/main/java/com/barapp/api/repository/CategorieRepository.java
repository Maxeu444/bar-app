package com.barapp.api.repository;

import com.barapp.api.modele.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{
}
