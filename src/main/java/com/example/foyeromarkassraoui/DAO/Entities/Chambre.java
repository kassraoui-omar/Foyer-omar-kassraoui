package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column(name="idChambre")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idChambre;
    private long numeroChambre;
    private TypeChambre typeChambre;
}
