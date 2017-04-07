package eu.leisurify.website.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping("/kit/")
    public String welcome(Model model) {
        return "kit/index";
    }

}
