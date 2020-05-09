package escalante.eugenio.projeto3.model;

import lombok.*;

/**
 @author Eugênio Escalante
 @Since 05/05/2020
 @version T1 Projeto1
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int founded;
    @Getter @Setter
    private String conference;
    @Getter @Setter
    private String division;

}
