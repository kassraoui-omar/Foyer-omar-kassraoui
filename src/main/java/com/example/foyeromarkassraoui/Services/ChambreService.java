package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreService implements ChambreInterface{
    ChambreRepository chambreRepository;
}
