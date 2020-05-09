package escalante.eugenio.projeto1.model;

import lombok.*;

/**
 @author Eugênio Escalante
 @Since 05/05/2020
 @version T1 Projeto1
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Characters {

    @Getter @Setter
    private String personagem;
    @Getter @Setter
    private String manga;
    @Getter @Setter
    private String autor;
    @Getter @Setter
    private int lancamento;

}
