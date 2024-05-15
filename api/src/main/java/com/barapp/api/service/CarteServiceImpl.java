package com.barapp.api.service;

import com.barapp.api.modele.Carte;
import com.barapp.api.repository.CarteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarteServiceImpl implements CarteService{

    private final CarteRepository carteRepository;
    @Override
    public Carte creer(Carte carte) {
        return carteRepository.save(carte);
    }

    @Override
    public List<Carte> lire() {
        return carteRepository.findAll();
    }

    @Override
    public Carte modifier(Integer id_carte, Carte carte) {
        return carteRepository.findById(id_carte)
                .map(c -> {
                    c.setCocktail_carte(carte.getCocktail_carte());
                    c.setId_user_carte(carte.getId_user_carte());
                    return carteRepository.save(c);
                }).orElseThrow(() -> new RuntimeException("Carte non trouvée"));
    }

    @Override
    public String supprimer(Integer id_carte) {
        carteRepository.deleteById(id_carte);
        return "Carte supprimée";
    }
}
