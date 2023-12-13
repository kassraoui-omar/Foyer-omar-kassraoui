package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Set;

@Entity
@Slf4j
@Data
@Table(name="Bloc")
public class Bloc implements Serializable {
    @Id
    @Column(name="idBloc")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idBloc;
    private String nomBloc;
    private long capciteBloc;

    @ManyToOne
    private foyer f;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;

    public long getIdBloc() {
        return idBloc;
    }
}
