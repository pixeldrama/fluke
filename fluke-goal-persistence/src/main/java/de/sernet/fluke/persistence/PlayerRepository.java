package de.sernet.fluke.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends CrudRepository<Player, Long> {

	List<Player> findByLastName(@Param("name") String name);

}
