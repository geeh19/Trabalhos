package escalante.eugenio.T3.repository;

import escalante.eugenio.T3.model.PokemonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<PokemonEntity, Long> {
}
