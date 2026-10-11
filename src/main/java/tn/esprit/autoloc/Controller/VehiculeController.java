
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IVehiculeService;

@RestController
@RequestMapping("/vehicules")
@AllArgsConstructor
public class VehiculeController {

    private final IVehiculeService vehiculeService;
}
