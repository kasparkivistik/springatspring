package eu.leisurify.website.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player getPlayer(long playerId) {
        return playerRepository.findOne(playerId);
    }

    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player findByEmail(String email) {
        return playerRepository.findByEmail(email);
    }

    public List<Player> getPlayerByStatus(PlayerStatus status) {
        return null;
    }
}
