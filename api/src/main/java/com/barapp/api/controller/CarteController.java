package com.barapp.api.controller;

import com.barapp.api.modele.Carte;
import com.barapp.api.service.CarteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carte")
@AllArgsConstructor
public class CarteController {

    private final CarteService carteService;

    @PostMapping("/create")
    public Carte create(@RequestBody Carte carte){
        return carteService.creer(carte);
    }

    @GetMapping("/read")
    public List<Carte> read(){
        return carteService.lire();
    }

    @PutMapping("/update/{id_carte}")
    public Carte update(@PathVariable Integer id_carte, @RequestBody Carte carte){
        return carteService.modifier(id_carte, carte);
    }

    @DeleteMapping("/delete/{id_carte}")
    public String delete(@PathVariable Integer id_carte){
        return carteService.supprimer(id_carte);
    }
}
