package com.example.foyeromarkassraoui.DAO.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
@Entity
@Slf4j
@Data
@Table(name="Bloc")
public class Bloc {
    @Id
    @Column(name="idBloc")
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
    private long idBloc;
    private String nomBloc;
    private long capciteBloc;
}
