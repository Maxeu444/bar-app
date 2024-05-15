package com.barapp.api.controller;

import com.barapp.api.modele.Ingredient;
import com.barapp.api.service.IngredientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
@AllArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;

    @PostMapping("/create")
    public Ingredient create(@RequestBody Ingredient categorie){
        return ingredientService.creer(categorie);
    }

    @GetMapping("/read")
    public List<Ingredient> read(){
        return ingredientService.lire();
    }

    @PutMapping("/update/{id_ingredient}")
    public Ingredient update(@PathVariable Integer id_ingredient, @RequestBody Ingredient ingredient){
        return ingredientService.modifier(id_ingredient, ingredient);
    }

    @DeleteMapping("/delete/{id_ingredient}")
    public String delete(@PathVariable Integer id_ingredient){
        return ingredientService.supprimer(id_ingredient);
    }
}
