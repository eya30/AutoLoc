
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;
import java.util.List;

public interface IMaintenanceService {

    List<Maintenance> getAllMaintenances();

    Maintenance getMaintenanceById(Long id);

    Maintenance ajouterMaintenance(Maintenance maintenance);

    void supprimerMaintenance(Long id);
}
