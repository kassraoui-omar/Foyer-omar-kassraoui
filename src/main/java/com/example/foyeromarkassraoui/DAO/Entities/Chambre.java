package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Slf4j
@Data
@Table(name="Chambre")
public class Chambre implements Serializable {
    @Id
    @Column(name="idChambre")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idChambre;
    private long numeroChambre;
    private TypeChambre typeChambre;

    @ManyToOne
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
