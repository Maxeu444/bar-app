package com.barapp.api.service;

import com.barapp.api.modele.Commande;
import com.barapp.api.repository.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeServiceImpl implements CommandeService {

        private final CommandeRepository commandeRepository;
        @Override
        public Commande creer(Commande commande) {
            return commandeRepository.save(commande);
        }

        @Override
        public List<Commande> lire() {
            return commandeRepository.findAll();
        }

        @Override
        public Commande modifier(Integer id_commande, Commande commande) {
            return commandeRepository.findById(id_commande)
                    .map(c -> {
                        c.setMail_client_commande(commande.getMail_client_commande());
                        c.setPrix_commande(commande.getPrix_commande());
                        c.setStatut_commande(commande.getStatut_commande());
                        return commandeRepository.save(c);
                    }).orElseThrow(() -> new RuntimeException("Commande non trouvée"));
        }

        @Override
        public String supprimer(Integer id_commande) {
            commandeRepository.deleteById(id_commande);
            return "Commande supprimée";
        }
}
