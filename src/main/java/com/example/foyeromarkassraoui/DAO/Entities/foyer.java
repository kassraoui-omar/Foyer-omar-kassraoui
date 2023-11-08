package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="foyer")
public class foyer {
    @Id
    @Column(name="idfoyer")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idfoyer;
    private String nomFoyer;
    private long capaciteFoyer;
}
