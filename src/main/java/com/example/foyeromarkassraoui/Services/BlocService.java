package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Entities.Bloc;
import com.example.foyeromarkassraoui.DAO.Repositories.BlockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements BlocInterface {
    BlockRepository blockRepository;

    @Override
    public Bloc addBloc(Bloc b) {
        return blockRepository.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return blockRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blockRepository.save(b);
    }

    @Override
    public List<Bloc> updateAllBlocs(List<Bloc> blocs) {
        return blockRepository.saveAll(blocs);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blockRepository.findAll();
    }

    @Override
    public Bloc findBlocById(long id) {
        return blockRepository.findById(id).get();
    }

    @Override
    public void deleteBloc(Bloc b) {
 blockRepository.delete(b);
    }

    @Override
    public void deleteBlocById(long id) {
blockRepository.deleteById(id);
    }
}
