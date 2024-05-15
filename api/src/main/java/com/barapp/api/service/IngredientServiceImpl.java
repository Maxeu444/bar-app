package com.barapp.api.service;

import com.barapp.api.modele.Ingredient;
import com.barapp.api.repository.IngredientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

        @Override
        public Ingredient creer(Ingredient categorie) {
            return ingredientRepository.save(categorie);
        }

        @Override
        public List<Ingredient> lire() {
            return ingredientRepository.findAll();
        }

        @Override
        public Ingredient modifier(Integer id_ingredient, Ingredient categorie) {
            return ingredientRepository.findById(id_ingredient)
                    .map(cat -> {
                        cat.setNom_ingredient(categorie.getNom_ingredient());
                        return ingredientRepository.save(cat);
                    }).orElseThrow(() -> new RuntimeException("Categorie non trouvée"));
        }

        @Override
        public String supprimer(Integer id_ingredient) {
            ingredientRepository.deleteById(id_ingredient);
            return "Ingredient supprimé";
        }
}
