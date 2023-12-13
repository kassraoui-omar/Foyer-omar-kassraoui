package com.example.foyeromarkassraoui.DAO.Repositories;


import com.example.foyeromarkassraoui.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

  //  Recherche des réservations validées



    List<Reservation> findReservationByEstValide(boolean Valdie);
   // Recherche des réservations par l'id de l'étudiant
    List<Reservation> findByEtudiantsIdEtudiant(long idEtudian);
   // Recherche des réservations par année et validité

    List<Reservation> findReservationByEstValideAndAnneUniversitaire(boolean Valdie, Date anne);
}
