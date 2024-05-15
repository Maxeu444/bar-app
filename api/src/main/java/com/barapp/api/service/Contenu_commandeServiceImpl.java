package com.barapp.api.service;

import com.barapp.api.modele.Contenu_commande;
import com.barapp.api.modele.Cocktail;
import com.barapp.api.repository.Contenu_commandeRepository;
import com.barapp.api.repository.CocktailRepository;
import com.barapp.api.service.Contenu_commandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Contenu_commandeServiceImpl implements Contenu_commandeService {

    private final Contenu_commandeRepository contenu_commandeRepository;
    private final CocktailRepository cocktailRepository;

    @Override
    public Contenu_commande creer(Contenu_commande contenu_commande) {
        Cocktail cocktail = contenu_commande.getId_cocktail();
        if (cocktail != null && cocktail.getId_cocktail() != null) {
            cocktail = cocktailRepository.findById(cocktail.getId_cocktail())
                    .orElseThrow(() -> new RuntimeException("Cocktail non trouvé"));
            contenu_commande.setId_cocktail(cocktail);
        } else {
            throw new RuntimeException("Cocktail non fourni ou non existant");
        }
        return contenu_commandeRepository.save(contenu_commande);
    }

    @Override
    public List<Contenu_commande> lire() {
        return contenu_commandeRepository.findAll();
    }

    @Override
    public Contenu_commande modifier(Integer id_contenu_commande, Contenu_commande contenu_commande) {
        return contenu_commandeRepository.findById(id_contenu_commande)
                .map(contcom -> {
                    contcom.setId_commande(contenu_commande.getId_commande());
                    contcom.setId_cocktail(contenu_commande.getId_cocktail());
                    contcom.setEtape_contcom(contenu_commande.getEtape_contcom());
                    return contenu_commandeRepository.save(contcom);
                }).orElseThrow(() -> new RuntimeException("Contenu_commande non trouvé"));
    }

    @Override
    public String supprimer(Integer id_contenu_commande) {
        contenu_commandeRepository.deleteById(id_contenu_commande);
        return "Contenu_commande supprimé";
    }
}
