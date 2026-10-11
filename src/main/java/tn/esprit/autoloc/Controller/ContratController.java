
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IContratService;

@RestController
@RequestMapping("/contrats")
@AllArgsConstructor
public class ContratController {

    private final IContratService contratService;
}
