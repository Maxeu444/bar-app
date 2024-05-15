package com.barapp.api.repository;

import com.barapp.api.modele.Carte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteRepository extends JpaRepository<Carte, Integer>{
}
