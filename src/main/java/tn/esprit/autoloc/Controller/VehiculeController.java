
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@AllArgsConstructor
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @PostMapping
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/{id}")
    public Vehicule modifierVehicule(
            @PathVariable Long id,
            @RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(id, vehicule);
    }

    @DeleteMapping("/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }
}
