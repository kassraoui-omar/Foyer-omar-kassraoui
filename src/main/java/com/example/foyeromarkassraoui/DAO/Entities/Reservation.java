package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Slf4j
@Data
@Table(name="Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name="idReservation")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idReservation;
    private long numeroChambre;
    private Date anneUniversitaire;

    @ManyToMany(mappedBy="reservations",cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

}
