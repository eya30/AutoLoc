
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;
import java.util.List;

public interface IAgenceService {

    List<Agence> getAllAgences();

    Agence getAgenceById(Long id);

    Agence ajouterAgence(Agence agence);

    void supprimerAgence(Long id);
}
