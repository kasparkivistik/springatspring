package eu.leisurify.website.player;


import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findByEmail(String email);

    Player findByPlayerStatus(PlayerStatus status);
}
