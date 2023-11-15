package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
@Entity
@Slf4j
@Data
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column(name="idChambre")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idChambre;
    private long numeroChambre;
    private TypeChambre typeChambre;
}
