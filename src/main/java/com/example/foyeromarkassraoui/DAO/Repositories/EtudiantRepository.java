package com.example.foyeromarkassraoui.DAO.Repositories;

import com.example.foyeromarkassraoui.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends  JpaRepository<Etudiant,Long>{

    Etudiant findByCin(long cin);

    @Override
    List<Etudiant> findAll();

    List<Etudiant> findByNomELike();
    List<Etudiant> findByNomEContains();
    List<Etudiant> findByNomEContaining();

    Etudiant findByNomEAndprenomE(String nom,String prenom);
    Etudiant findBycin(long cin);

    List<Etudiant> findByNaissanceGreaterThan(LocalDate date);

    List<Etudiant> findByecole(String nomEcole);

    List<Etudiant> findByReservationsIdReservation(long id);

//6- Recherche des étudiants par réservation (année de réservation)
    List<Etudiant>findByReservationsAnneUniversitaire(Date anne);

    List<Etudiant> findByNaissanceGreaterThanAndecole(LocalDate date,String nomEcole);

    List<Etudiant> findByReservationsAnneUniversitaireOrderByNaissance(Date anne);

}
