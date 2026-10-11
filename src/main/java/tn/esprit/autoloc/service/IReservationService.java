
package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;
import java.util.List;

public interface IReservationService {

    List<Reservation> getAllReservations();

    Reservation getReservationById(Long id);

    Reservation ajouterReservation(Reservation reservation);

    void supprimerReservation(Long id);
}
