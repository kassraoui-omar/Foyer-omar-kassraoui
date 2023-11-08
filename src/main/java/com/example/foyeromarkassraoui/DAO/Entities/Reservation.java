package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    @Column(name="idReservation")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idReservation;
    private long numeroChambre;
    private Date anneUniversitaire;


}
