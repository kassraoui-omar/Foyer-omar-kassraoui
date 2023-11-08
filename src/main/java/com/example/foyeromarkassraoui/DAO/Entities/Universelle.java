package com.example.foyeromarkassraoui.DAO.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Universelle")
public class Universelle {
    @Id
    @Column(name="idUniversite")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long id;
    private String nom;
    private String adresse;


}
