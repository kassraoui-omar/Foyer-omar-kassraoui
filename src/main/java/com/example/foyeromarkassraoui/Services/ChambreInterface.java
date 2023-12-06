package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Entities.Bloc;
import com.example.foyeromarkassraoui.DAO.Entities.Chambre;

import java.util.List;

public interface ChambreInterface {
    Chambre addChambre(Chambre c);
    List<Chambre> addAllChambres(List<Chambre> chambres);
    Chambre updateChambre(Chambre c);
    List<Chambre> updateAllChambre(List<Chambre> chambres);
    List<Chambre> findAllChambres();
    Chambre findChambreById(long id);
    void deleteChambre(Chambre c);
    void deleteChambreById(long id);
}
