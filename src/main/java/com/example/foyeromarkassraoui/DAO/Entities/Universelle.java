package com.example.foyeromarkassraoui.DAO.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Slf4j
@Data
@Table(name="Universelle")
public class Universelle implements Serializable {
    @Id
    @Column(name="idUniversite")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long id;
    private String nom;
    private String adresse;

    @OneToOne
    private foyer f;

}
