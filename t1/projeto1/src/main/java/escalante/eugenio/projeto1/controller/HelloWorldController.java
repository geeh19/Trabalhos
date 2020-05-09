package escalante.eugenio.projeto1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/index")
    public String index(){
        return "Seja Bem vindo ao Sistema Anime API Teste!";
    }
}
