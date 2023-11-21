package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Repositories.BlockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlocService implements BlocInterface {
    BlockRepository blockRepository;
}
