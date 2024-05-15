package com.barapp.api.repository;

import com.barapp.api.modele.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Integer>{
}
