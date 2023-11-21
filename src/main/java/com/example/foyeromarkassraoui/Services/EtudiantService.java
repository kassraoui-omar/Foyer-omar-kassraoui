package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements EtudiantInterface {
    EtudiantRepository repository;
}
