
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;
import java.util.List;

public interface IVehiculeService {

    List<Vehicule> getAllVehicules();

    Vehicule getVehiculeById(Long id);

    Vehicule ajouterVehicule(Vehicule vehicule);

    Vehicule modifierVehicule(Long id, Vehicule vehicule);

    void supprimerVehicule(Long id);
}
