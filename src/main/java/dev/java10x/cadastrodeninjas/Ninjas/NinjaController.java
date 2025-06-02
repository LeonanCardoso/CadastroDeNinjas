package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "Bem vindo ao cadastro de ninjas";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Criado com sucesso!";
    }

    @GetMapping("/listar")
    public String mostrarNinja(){
        return "Todos os ninjas!";
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
