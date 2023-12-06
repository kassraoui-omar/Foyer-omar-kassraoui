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
@Table(name="foyer")
public class foyer implements Serializable {
    @Id
    @Column(name="idfoyer")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idfoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne
    private Universelle universelle;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="f")
    private Set<Bloc> blocs;
}
