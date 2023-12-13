package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Entities.Etudiant;

import java.util.List;

public interface EtudiantInterface {
    Etudiant addEtudiant(Etudiant e);
    List<Etudiant> addAllEtudiants(List<Etudiant> Etudiants);
    Etudiant updateEtudiant(Etudiant e);
    List<Etudiant> updateAllEtudiants(List<Etudiant> Etudiants);
    List<Etudiant> findAllEtudiants();
    Etudiant findEtudiantById(long id);
    void deleteEtudiant(Etudiant e);
    void deleteEtudiantById(long id);
}
