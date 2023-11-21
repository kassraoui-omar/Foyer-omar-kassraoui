package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements ReservationInterface{
    ReservationRepository reservationRepository;
}
