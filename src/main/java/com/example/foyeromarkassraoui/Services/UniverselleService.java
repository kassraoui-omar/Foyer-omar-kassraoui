package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Repositories.UniverselleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniverselleService implements UniverselleInterface {
    UniverselleRepository universelleRepository;
}
