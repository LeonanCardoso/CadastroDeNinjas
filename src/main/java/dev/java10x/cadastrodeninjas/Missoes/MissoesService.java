package dev.java10x.cadastrodeninjas.Missoes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    @Autowired
    private MissoesRepository missoesRepository;

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel listarMissaoPorId(Long id){
        Optional<MissoesModel> missoes = missoesRepository.findById(id);
        return missoes.orElse(null);
    }

    public MissoesModel criarMissao(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }
    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }







}
