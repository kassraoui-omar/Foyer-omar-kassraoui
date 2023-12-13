package com.example.foyeromarkassraoui.RestController;

import com.example.foyeromarkassraoui.DAO.Entities.Bloc;
import com.example.foyeromarkassraoui.Services.BlocService;
import lombok.AllArgsConstructor;
import org.springframework.cglib.core.Block;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;
@RestController
@AllArgsConstructor
public class BlockRestController {
    BlocService blocService;

    @GetMapping("AllBlocks")
    public List<Bloc> GetAll(){
        return blocService.findAllBlocs();
    }

    @PostMapping("AddBlocks")
    public Bloc addBlock(@RequestBody Bloc b)
    {
       return blocService.addBloc(b);
    }

    @DeleteMapping("DeleteBlock/{id}")
    public void deleteBlock(@PathVariable Bloc b) {
        blocService.deleteBlocById(b.getIdBloc());
    }

    @PutMapping("UpdateBlock")
    public void updateBlock(@RequestBody Bloc b) {
        blocService.updateBloc(b);
    }

}
