
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IMaintenanceService;

@RestController
@RequestMapping("/maintenances")
@AllArgsConstructor
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;
}
