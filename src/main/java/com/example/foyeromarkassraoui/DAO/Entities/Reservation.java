package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Slf4j
@Data
@Table(name="Reservation")
public class Reservation {
    @Id
    @Column(name="idReservation")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idReservation;
    private long numeroChambre;
    private Date anneUniversitaire;


}
