package eu.leisurify.website.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;


}
