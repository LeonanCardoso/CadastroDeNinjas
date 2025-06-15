package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "Bem vindo ao cadastro de ninjas";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Criado com sucesso!";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }


    @GetMapping("/listarID")
    public String mostrarNinjaPorID(){
        return "Filtrado ninja por ID!";
    }


    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar ninja por ID!";
    }


    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Deletar ninja por ID!";
    }
}
