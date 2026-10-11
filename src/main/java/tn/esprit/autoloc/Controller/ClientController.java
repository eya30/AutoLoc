
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PostMapping
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping("/{id}")
    public Client modifierClient(
            @PathVariable Long id,
            @RequestBody Client client) {
        return clientService.modifierClient(id, client);
    }

    @DeleteMapping("/{id}")
    public void supprimerClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }
}
