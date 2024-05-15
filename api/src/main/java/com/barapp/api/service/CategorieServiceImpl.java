package com.barapp.api.service;

import com.barapp.api.modele.Categorie;
import com.barapp.api.repository.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;

        @Override
        public Categorie creer(Categorie categorie) {
            return categorieRepository.save(categorie);
        }

        @Override
        public List<Categorie> lire() {
            return categorieRepository.findAll();
        }

        @Override
        public Categorie modifier(Integer id_categorie, Categorie categorie) {
            return categorieRepository.findById(id_categorie)
                    .map(cat -> {
                        cat.setNom_categorie(categorie.getNom_categorie());
                        return categorieRepository.save(cat);
                    }).orElseThrow(() -> new RuntimeException("Categorie non trouvée"));
        }

        @Override
        public String supprimer(Integer id_categorie) {
            categorieRepository.deleteById(id_categorie);
            return "Categorie supprimée";
        }
}
