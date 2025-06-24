package dev.java10x.cadastrodeninjas.Missoes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    @Autowired
    private MissoesRepository missoesRepository;

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }



}
