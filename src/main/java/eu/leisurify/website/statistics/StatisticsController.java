package eu.leisurify.website.statistics;

import eu.leisurify.website.game.GameService;
import eu.leisurify.website.player.PlayerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StatisticsController {

    private static final Log LOG = LogFactory.getLog(StatisticsController.class);

    @Autowired
    PlayerService playerService;

    @Autowired
    GameService gameService;

    @RequestMapping(value="/top-players/", method=RequestMethod.GET)
    public ModelAndView listTopPlayers(Map<String, Object> model) {

        ModelAndView response = new ModelAndView("statistics/index");
        response.addObject("players", playerService.getAllPlayers());
        return response;
    }
    @RequestMapping(value ="/all-games/", method = RequestMethod.GET)
    public ModelAndView listAllGames(Map<String, Object> model) {
        ModelAndView response = new ModelAndView("statistics/game-table");
        response.addObject("games", gameService.getAllGames());
        return response;
    }
}
