
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;
import java.util.List;

public interface IContratService {

    List<Contrat> getAllContrats();

    Contrat getContratById(Long id);

    Contrat ajouterContrat(Contrat contrat);

    void supprimerContrat(Long id);
}
