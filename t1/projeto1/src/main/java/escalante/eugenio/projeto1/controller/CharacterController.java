package escalante.eugenio.projeto1.controller;

import escalante.eugenio.projeto1.model.Characters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CharacterController {

    @GetMapping("/")
    public String getMensagem(){

        return "Personagem de anime";
    }

    @GetMapping("/personagem")
    public Characters getCharacter(){
        Characters personagem = new Characters();
        personagem.setPersonagem("Monkey D. Luffy");
        personagem.setManga("One Piece");
        personagem.setAutor("Eiichiro Oda");
        personagem.setLancamento(1997);

        return personagem;
    }

    @GetMapping("/cadastros")
    public ArrayList<Characters> getCadastros(){
        Characters persogem1 = new Characters();
        persogem1.setPersonagem("Yusuke Urameshi");
        persogem1.setManga("Yu Yu Hakusho");
        persogem1.setAutor("Yoshihiro Togashi");
        persogem1.setLancamento(1990);

        Characters persogem2 = new Characters();
        persogem2.setPersonagem("Red");
        persogem2.setManga("Pokémon");
        persogem2.setAutor("Satoshi Tajiri");
        persogem2.setLancamento(1996);

        ArrayList<Characters> cadastro = new ArrayList<>();
        cadastro.add(persogem1);
        cadastro.add(persogem2);

        return cadastro;
    }
}
