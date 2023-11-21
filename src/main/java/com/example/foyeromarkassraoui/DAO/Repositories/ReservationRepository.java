package com.example.foyeromarkassraoui.DAO.Repositories;


import com.example.foyeromarkassraoui.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
