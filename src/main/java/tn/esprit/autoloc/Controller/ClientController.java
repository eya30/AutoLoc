
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IClientService;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    private final IClientService ClientService;
}
