package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    private java.time.LocalDate dateDebut;
    private java.time.LocalDate dateFin;

    private String description;
    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicule;
}