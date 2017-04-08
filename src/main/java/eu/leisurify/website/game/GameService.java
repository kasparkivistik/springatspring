package eu.leisurify.website.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class GameService {
    @Autowired
    GameRepository gameRepository;


    public Game saveReagent(Game game) {
        return gameRepository.save(game);
    }

    public void deleteReagent(Game game) {
        gameRepository.delete(game);
    }

    public Iterable<Game> getAllGames() {
        return gameRepository.findAll();
    }

}
