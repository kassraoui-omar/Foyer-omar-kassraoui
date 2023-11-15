package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
@Entity
@Slf4j
@Data
@Table(name="foyer")
public class foyer {
    @Id
    @Column(name="idfoyer")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idfoyer;
    private String nomFoyer;
    private long capaciteFoyer;
}
