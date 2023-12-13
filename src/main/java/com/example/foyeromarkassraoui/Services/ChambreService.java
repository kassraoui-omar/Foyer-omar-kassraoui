package com.example.foyeromarkassraoui.Services;

import com.example.foyeromarkassraoui.DAO.Entities.Bloc;
import com.example.foyeromarkassraoui.DAO.Entities.Chambre;
import com.example.foyeromarkassraoui.DAO.Repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements ChambreInterface{
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> updateAllChambre(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> findAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findChambreById(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteChambre(Chambre c) {
chambreRepository.delete(c);
    }

    @Override
    public void deleteChambreById(long id) {
chambreRepository.deleteById(id);
    }
}
