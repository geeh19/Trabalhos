package escalante.eugenio.T3.model;



import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA - Java Persistence  API
@Entity
@Table(name= "pokemon")
public class PokemonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pokemon")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type1")
    private String type1;

    @Column(name = "type2")
    private String type2;
}
