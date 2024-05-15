package com.barapp.api.controller;

import com.barapp.api.modele.Cocktail;
import com.barapp.api.service.CocktailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cocktail")
@AllArgsConstructor
public class CocktailController {

    private final CocktailService cocktailService;

    @PostMapping("/create")
    public Cocktail create(@RequestBody Cocktail cocktail){
        return cocktailService.creer(cocktail);
    }

    @GetMapping("/read")
    public List<Cocktail> read(){
        return cocktailService.lire();
    }

    @PutMapping("/update/{id_cocktail}")
    public Cocktail update(@PathVariable Integer id_cocktail, @RequestBody Cocktail cocktail){
        return cocktailService.modifier(id_cocktail, cocktail);
    }

    @DeleteMapping("/delete/{id_cocktail}")
    public String delete(@PathVariable Integer id_cocktail){
        return cocktailService.supprimer(id_cocktail);
    }
}
