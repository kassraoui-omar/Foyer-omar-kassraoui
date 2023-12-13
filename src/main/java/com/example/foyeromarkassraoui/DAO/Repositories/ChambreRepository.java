package com.example.foyeromarkassraoui.DAO.Repositories;


import com.example.foyeromarkassraoui.DAO.Entities.Chambre;
import com.example.foyeromarkassraoui.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    // 1- Recherche par numéro de chambre
    Chambre findByNumeroChambre(long numeroChambre);

    // 2- Recherche par type de chambre
    List<Chambre> findByTypeC(TypeChambre typeChambre);

    // 3- Recherche des chambres par bloc
    List<Chambre> findByBlocNomBloc(String nomBloc);

    // 4- Recherche des chambres par bloc et type de chambre
    List<Chambre> findByBlocNomBlocAndTypeC(String nomBloc, TypeChambre typeChambre);

    // 5- Recherche des chambres par numéro de chambre et type de chambre
    Chambre findByNumeroChambreAndTypeC(long numeroChambre, TypeChambre typeChambre);

    // 6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer,
    // l'année de réservation, le nom de l'étudiant dans la réservation et le numéro de chambre
    List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneeAndReservationsEtudiantNomEtudiantAndNumeroChambre(String nomUniversite, int annee, String nomEtudiant, long numeroChambre);
    int countByBlocFoyerNomFoyertypeChambre(String nomf, TypeChambre typeChambre);


}
