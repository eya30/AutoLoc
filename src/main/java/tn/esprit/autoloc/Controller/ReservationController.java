
package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IReservationService;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
public class ReservationController {

    private final IReservationService reservationService;
}
