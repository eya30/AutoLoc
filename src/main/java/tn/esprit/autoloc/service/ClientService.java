
package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Client introuvable : " + id));
    }

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Long id, Client client) {
        Client clientExistant = clientRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Client introuvable : " + id));

        // Remplacer ces champs par les vrais attributs de ton entité Client.
        clientExistant.setNom(client.getNom());
        clientExistant.setPrenom(client.getPrenom());
        clientExistant.setEmail(client.getEmail());
        clientExistant.setTelephone(client.getTelephone());

        return clientRepository.save(clientExistant);
    }

    @Override
    public void supprimerClient(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new RuntimeException("Client introuvable : " + id);
        }

        clientRepository.deleteById(id);
    }
}
