package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Slf4j
@Data
@Table(name="Etudiant")
public class Etudiant implements Serializable {
    @Id
    @Column(name="idEtudiant")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idEtudiant;
    private String nomE;
    private String prenomE;

    private long cin;
    private String ecole;

    private LocalDate Naissance ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
