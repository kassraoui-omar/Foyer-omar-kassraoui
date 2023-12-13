package com.example.foyeromarkassraoui.RestController;

import com.example.foyeromarkassraoui.DAO.Entities.Chambre;
import com.example.foyeromarkassraoui.DAO.Entities.Chambre;

import com.example.foyeromarkassraoui.Services.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {
    ChambreService ChambreService;
    @GetMapping("AllChambres")
    public List<Chambre> GetAll(){
        return ChambreService.findAllChambres();
    }

    @PostMapping("AddChambres")
    public Chambre addChambrek(@RequestBody Chambre b)
    {
        return ChambreService.addChambre(b);
    }

    @DeleteMapping("DeleteChambre/{id}")
    public void deleteChambrek(@PathVariable Chambre b) {
        ChambreService.deleteChambreById(b.getIdChambre());
    }

    @PutMapping("UpdateChambre")
    public void updateChambrek(@RequestBody Chambre b) {
        ChambreService.updateChambre(b);
    }
}
