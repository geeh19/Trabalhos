package escalante.eugenio.projeto2.controller;

import escalante.eugenio.projeto2.model.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PokemonController {

    @GetMapping
    public String getMessage(){

        return "Guild Pokémon";
    }

    @GetMapping("/pokemon")
    public Pokemon getPokemon(){
        Pokemon pokemon = new Pokemon();
        pokemon.setName("Kingdra");
        pokemon.setMove1("Dragon Dance");
        pokemon.setMove2("Waterfall");
        pokemon.setMove3("Protect");
        pokemon.setMove4("Outrage");
        pokemon.setAbility("Swift Swim");

        return pokemon;
    }

    @GetMapping("/registers")
    public ArrayList<Pokemon> getRegisters(){
        Pokemon pokemon1 = new Pokemon();
        pokemon1.setName("Pelliper");
        pokemon1.setMove1("Protect");
        pokemon1.setMove2("Roost");
        pokemon1.setMove3("Rain Dance");
        pokemon1.setMove4("Outrage");
        pokemon1.setAbility("Rain Dish");

        Pokemon pokemon2 = new Pokemon();
        pokemon2.setName("Kyogre");
        pokemon2.setMove1("Calm Mind");
        pokemon2.setMove2("Protect");
        pokemon2.setMove3("Thunder");
        pokemon2.setMove4("Hydro Pump");
        pokemon2.setAbility("Drizzle");

        ArrayList<Pokemon> register = new ArrayList<>();
        register.add(pokemon1);
        register.add(pokemon2);

        return register;
    }

}
