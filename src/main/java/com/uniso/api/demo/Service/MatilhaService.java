package com.uniso.api.demo.Service;

import com.uniso.api.demo.Model.Matilha;
import com.uniso.api.demo.Repository.MatilhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatilhaService{

    @Autowired
    private MatilhaRepository _mr;

    public Matilha cadastrarNovoLobo(Matilha matilha) {
        _mr.save(matilha);

        return matilha;
    }

    public Matilha obterMatilha(Long id) {
        Matilha matilha = _mr.findById(id).get();

        return matilha;
    }

    public List<Matilha> listarMatilha(){
        return _mr.findAll();

    }

}
