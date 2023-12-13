package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Entities.Etudiant;
import com.example.foyeromarkassraoui.DAO.Repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements EtudiantInterface {
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant e) {
     return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> addAllEtudiants(List<Etudiant> Etudiants) {
        return etudiantRepository.saveAll(Etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> updateAllEtudiants(List<Etudiant> Etudiants) {
        return etudiantRepository.saveAll(Etudiants);
    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findEtudiantById(long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public void deleteEtudiant(Etudiant e) {
      etudiantRepository.delete(e);
    }

    @Override
    public void deleteEtudiantById(long id) {
     etudiantRepository.deleteById(id);
    }
}
