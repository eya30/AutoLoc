
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;
import java.util.List;

public interface IClientService {

    List<Client> getAllClients();

    Client getClientById(Long id);

    Client ajouterClient(Client client);

    Client modifierClient(Long id, Client client);

    void supprimerClient(Long id);
}
