
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IPaiementService;

@RestController
@RequestMapping("/paiements")
@AllArgsConstructor
public class PaiementController {

    private final IPaiementService paiementService;
}
