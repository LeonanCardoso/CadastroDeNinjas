package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "Bem vindo ao cadastro de ninjas";
    }
}
