
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IEquipementService;

@RestController
@RequestMapping("/equipements")
@AllArgsConstructor
public class EquipementController {

    private final IEquipementService equipementService;
}
