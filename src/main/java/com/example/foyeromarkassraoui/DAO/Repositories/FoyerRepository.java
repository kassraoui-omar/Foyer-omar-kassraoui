package com.example.foyeromarkassraoui.DAO.Repositories;


import com.example.foyeromarkassraoui.DAO.Entities.Etudiant;
import com.example.foyeromarkassraoui.DAO.Entities.TypeChambre;
import com.example.foyeromarkassraoui.DAO.Entities.foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface foyerRepository extends JpaRepository<foyer,Long> {
    //select * from foyer where capacitefoyer > .....
    List<foyer> findByCapacitefoyerGreaterThan(int cf);
    //select * from foyer where capacitefoyer < .....
    List<foyer> findByCapacitefoyerLessThan(int cf);
    //select * from foyer where capacitefoyer > ..... and capacitefoyer < .....
    List<foyer> findByCapacitefoyerBetween(int cmin,int cmax);

    //  afficher le foyer de l'universite dont son nom est passe en parametre
    foyer findByUniverselleNom(String nom);
    //Afficher la liste des foyers qui comportent des chambres de meme type que le type passe en parametre

    List<foyer> getByBlocsChambrestypeChambre(TypeChambre typeC);


    foyer findByNomfoyer(String nom);
    //select * from foyer where capacitefoyer >


    foyer findByUniversiteNomUniversite (String nom);


    // 1- Recherche des foyers d'un bloc spécifique
    Set<foyer> findByBlocsNomBloc(String nomBloc);

    // 2- Recherche du foyer par son idfoyer pour un bloc donné
    foyer findByIdfoyerAndBlocsNomBloc(long idfoyer, String nomBloc);

    // 3- Recherche des foyers d'un bloc ayant une capacité spécifique
    Set<foyer> findByBlocsNomBlocAndCapacitefoyer(String nomBloc, int capacite);

    // 4- Recherche du foyer d'un bloc spécifique dans une université donnée
    foyer findByBlocsNomBlocAndUniversiteNomUniversite(String nomBloc, String nomUniversite);
}
