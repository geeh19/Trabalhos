package escalante.eugenio.T3.controller;

import escalante.eugenio.T3.model.PokemonEntity;
import escalante.eugenio.T3.repository.PokemonRepository;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class pokemonController {

    @Autowired
    private PokemonRepository  pokemonRepository;

    // salvando diversos funcionarios...
    //resposta da Entidade..findAll - buscar no BD todos os Funcionarios
    //retorna a lista
    @GetMapping
    public ResponseEntity<List<PokemonEntity>> findAll (){  // get
        return new ResponseEntity<List<PokemonEntity>>(
                (List<PokemonEntity>) this.pokemonRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);//error 404
    }

    // buscar um funcionario
    //  /funcionario/2

    @GetMapping(path = "/{id}")
    // só um objeto
    public ResponseEntity<PokemonEntity> findById(@PathVariable ("id") long id) {
        if(this.pokemonRepository.findById(id).isPresent()){
            return new ResponseEntity<PokemonEntity>(
                    this.pokemonRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<PokemonEntity>(HttpStatus.NOT_FOUND);
    }


    // criando o método para salvar...enviando um novo objeto - criando um novo
    //@PostMapping

    public ResponseEntity<PokemonEntity> register (@RequestBody PokemonEntity pokemonEntity) {
        return new ResponseEntity<PokemonEntity> (
                this.pokemonRepository.save(pokemonEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );

    }

    // criando o método para atualizar...vai analisar se existe e depois salvar
    @PutMapping(value = "/{id}")
    public ResponseEntity<PokemonEntity> update (@PathVariable("id") long id,
                                                        @RequestBody PokemonEntity pokemonEntity) throws Exception {

        if (id == 0 || !this.pokemonRepository.existsById(id)){
            throw  new Exception("Código não encontrado ou inexistente!");

        }
        return new ResponseEntity<PokemonEntity>(
                this.pokemonRepository.save(pokemonEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }

    // criando o método para deletar...

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PokemonEntity> delete (@PathVariable("id") long id ){
        this.pokemonRepository.deleteById(id);
        return new ResponseEntity<PokemonEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}// fim da classe