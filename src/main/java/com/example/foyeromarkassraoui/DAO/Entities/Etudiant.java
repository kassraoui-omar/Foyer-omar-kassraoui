package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Etudiant")
public class Etudiant {
    @Id
    @Column(name="idEtudiant")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idEtudiant;
    private String nomE;
    private String prenomE;

    private long cin;
    private String ecole;

    private LocalDate Naissance ;

}