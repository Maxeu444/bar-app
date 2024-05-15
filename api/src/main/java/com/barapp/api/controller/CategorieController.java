package com.barapp.api.controller;

import com.barapp.api.modele.Categorie;
import com.barapp.api.service.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
@AllArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;

    @PostMapping("/create")
    public Categorie create(@RequestBody Categorie categorie){
        return categorieService.creer(categorie);
    }

    @GetMapping("/read")
    public List<Categorie> read(){
        return categorieService.lire();
    }

    @PutMapping("/update/{id_categorie}")
    public Categorie update(@PathVariable Integer id_categorie, @RequestBody Categorie categorie){
        return categorieService.modifier(id_categorie, categorie);
    }

    @DeleteMapping("/delete/{id_categorie}")
    public String delete(@PathVariable Integer id_categorie){
        return categorieService.supprimer(id_categorie);
    }
}
