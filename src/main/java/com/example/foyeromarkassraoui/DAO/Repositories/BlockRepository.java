package com.example.foyeromarkassraoui.DAO.Repositories;

import com.example.foyeromarkassraoui.DAO.Entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlockRepository extends JpaRepository<Bloc,Long> {
    //select * from Bloc where nomBloc=...
    Bloc findByNomBloc(String nomBloc);
    //select * from Bloc where nomBloc=... and capaciteBloc=...

    //recherche par om bloc
    Bloc getByNomBloc(String nomBloc);
    //recherche par capacité
    Bloc  findBlocByCapaciteBloc(int cap);

    //select * from bloc where nombloc= and capacity=
    Bloc getByNomBlocAndCapaciteBloc(String nomBloc , int capaciteBloc);

    Bloc getByNomblocContainingIgnoreCase(String nomBloc);

    // recherche pa capacité> a une valeur

    Bloc getByCapaciteBlocGreaterThan(int mincap);

    List<Bloc> getOrOrderByNombloc();
    Bloc getByNomBlocOrCapaciteBloc(String nomBloc , int capaciteBloc);
    Bloc findBlocByFIdFoyer(int idFoyer);
    Bloc findBlocByFUniv(int idUniversity);

}
