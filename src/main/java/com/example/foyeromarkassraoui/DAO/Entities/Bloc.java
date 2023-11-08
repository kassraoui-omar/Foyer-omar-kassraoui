package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Bloc")
public class Bloc {
    @Id
    @Column(name="idBloc")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idBloc;
    private String nomBloc;
    private long capciteBloc;
}
