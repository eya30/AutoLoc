
package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepository.deleteById(id);
    }
}
