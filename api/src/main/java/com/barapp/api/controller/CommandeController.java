package com.barapp.api.controller;

import com.barapp.api.modele.Commande;
import com.barapp.api.service.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commande")
@AllArgsConstructor
public class CommandeController {

    private final CommandeService commandeService;

    @PostMapping("/create")
    public Commande create(@RequestBody Commande commande){
        return commandeService.creer(commande);
    }

    @GetMapping("/read")
    public List<Commande> read(){
        return commandeService.lire();
    }

    @PutMapping("/update/{id_commande}")
    public Commande update(@PathVariable Integer id_commande, @RequestBody Commande commande){
        return commandeService.modifier(id_commande, commande);
    }

    @DeleteMapping("/delete/{id_commande}")
    public String delete(@PathVariable Integer id_commande){
        return commandeService.supprimer(id_commande);
    }
}
