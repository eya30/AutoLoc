
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;
import java.util.List;

public interface IClientService {

    List<Client> getAll();

    Client getById(Long id);

    Client save(Client client);

    void deleteById(Long id);
}
