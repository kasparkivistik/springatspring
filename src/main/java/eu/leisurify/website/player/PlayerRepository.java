package eu.leisurify.website.player;


import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findByEmail(String email);
    List<Player> findByStatus(PlayerStatus status);
}
