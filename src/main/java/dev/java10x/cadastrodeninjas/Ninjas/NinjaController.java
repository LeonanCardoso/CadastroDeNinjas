package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "Bem vindo ao cadastro de ninjas";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Criado com sucesso!";
    }

    @GetMapping("/todos")
    public String mostrarNinja(){
        return "Todos os ninjas!";
    }


    @GetMapping("/todosID")
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
