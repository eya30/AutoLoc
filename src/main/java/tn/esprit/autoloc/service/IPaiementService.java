
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;
import java.util.List;

public interface IPaiementService {

    List<Paiement> getAllPaiements();

    Paiement getPaiementById(Long id);

    Paiement ajouterPaiement(Paiement paiement);

    void supprimerPaiement(Long id);
}
