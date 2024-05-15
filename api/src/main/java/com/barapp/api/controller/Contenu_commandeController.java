package com.barapp.api.controller;

import com.barapp.api.modele.Contenu_commande;
import com.barapp.api.service.Contenu_commandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contenu_commande")
@AllArgsConstructor
public class Contenu_commandeController {

        private final Contenu_commandeService contenu_commandeService;

        @PostMapping("/create")
        public Contenu_commande create(@RequestBody Contenu_commande contenu_commande){
            return contenu_commandeService.creer(contenu_commande);
        }

        @GetMapping("/read")
        public List<Contenu_commande> read(){
            return contenu_commandeService.lire();
        }

        @PutMapping("/update/{id_contenu_commande}")
        public Contenu_commande update(@PathVariable Integer id_contenu_commande, @RequestBody Contenu_commande contenu_commande){
            return contenu_commandeService.modifier(id_contenu_commande, contenu_commande);
        }

        @DeleteMapping("/delete/{id_contenu_commande}")
        public String delete(@PathVariable Integer id_contenu_commande){
            return contenu_commandeService.supprimer(id_contenu_commande);
        }
}
