package escalante.eugenio.projeto2.model;

import lombok.*;

/**
 @author Eugênio Escalante
 @Since 05/05/2020
 @version T1 Projeto1
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String move1;
    @Getter @Setter
    private String move2;
    @Getter @Setter
    private String move3;
    @Getter @Setter
    private String move4;
    @Getter @Setter
    private String ability;
}
