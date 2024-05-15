package com.barapp.api.service;

import com.barapp.api.modele.Cocktail;
import com.barapp.api.repository.CocktailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CocktailServiceImpl  implements CocktailService {

    private final CocktailRepository cocktailRepository;

    @Override
    public Cocktail creer(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }

    @Override
    public List<Cocktail> lire() {
        return cocktailRepository.findAll();
    }

    @Override
    public Cocktail modifier(Integer id_cocktail, Cocktail cocktail) {
        return cocktailRepository.findById(id_cocktail)
                .map(co -> {
                    co.setNom_cocktail(cocktail.getNom_cocktail());
                    co.setCategorie_cocktail(cocktail.getCategorie_cocktail());
                    co.setIngredient_cocktail(cocktail.getIngredient_cocktail());
                    co.setPrixS_cocktail(cocktail.getPrixS_cocktail());
                    co.setPrixM_cocktail(cocktail.getPrixM_cocktail());
                    co.setPrixL_cocktail(cocktail.getPrixL_cocktail());
                    return cocktailRepository.save(co);
                }).orElseThrow(() -> new RuntimeException("Cocktail non trouvée"));
    }

    @Override
    public String supprimer(Integer id_cocktail) {
        cocktailRepository.deleteById(id_cocktail);
        return "Cocktail supprimé";
    }


}
