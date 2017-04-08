package eu.leisurify.website.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value="game/register", method=RequestMethod.GET)
    public ModelAndView register(Map<String, Object> model) {
        return new ModelAndView("gameregistration/index", "command", new Game());
    }

    @RequestMapping(value="game", method=RequestMethod.GET)
    public ModelAndView list(Map<String, Object> model) {
        return new ModelAndView("statistics/game-table", "command", gameService.getAllGames());
    }

    @RequestMapping(value = "/game/add", method = RequestMethod.POST)
    public String add(Map<String, Object> model, @ModelAttribute("SpringWeb") Game game) {
        gameService.saveReagent(game);
        return "redirect:/";
    }

}
