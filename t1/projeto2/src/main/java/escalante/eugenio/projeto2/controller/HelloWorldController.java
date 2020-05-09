package escalante.eugenio.projeto2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/index")
    public String index(){
        return "Welcome to the Pokémon API Test system!";
    }
}
