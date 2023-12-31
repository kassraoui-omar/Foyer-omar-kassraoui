package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Entities.Bloc;

import java.util.List;

public interface BlocInterface {
    Bloc addBloc(Bloc b);
    List<Bloc> addAllBlocs(List<Bloc> blocs);
    Bloc updateBloc(Bloc b);
    List<Bloc> updateAllBlocs(List<Bloc> blocs);
    List<Bloc> findAllBlocs();
    Bloc findBlocById(long id);
    void deleteBloc(Bloc b);
    void deleteBlocById(long id);
}
