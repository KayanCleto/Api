package com.uniso.api.demo.Controller;
import com.uniso.api.demo.Model.Matilha;
import com.uniso.api.demo.Service.MatilhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matilha")
public class MatilhaController {

    @Autowired
    private MatilhaService _ms;

    @PostMapping
    public Matilha adicionar(@RequestBody Matilha matilha) {
        Matilha mat = _ms.cadastrarNovoLobo(matilha);

        return mat;
    }

    @GetMapping
    public List<Matilha> listar() {
        List<Matilha> matilha = _ms.listarMatilha();

        return matilha;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Matilha> obterMatilha(@PathVariable(value = "id") Long id) {
        Matilha mat = _ms.obterMatilha(id);

        if (mat != null) {
            return new ResponseEntity<>(mat, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Matilha> atualizarMatilha(@PathVariable(value = "id") Long id) {
        Matilha mat = _ms.obterMatilha(id);

        if (mat != null) {
            _ms.cadastrarNovoLobo(mat);

            return new ResponseEntity<>(mat, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
