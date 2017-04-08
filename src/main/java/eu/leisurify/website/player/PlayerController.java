package eu.leisurify.website.player;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    private static final Log LOG = LogFactory.getLog(PlayerController.class);

    @RequestMapping(value = "/rest/v1/player/id/{playerId}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable(value = "playerId") long playerId, HttpServletResponse response) throws IOException {
        LOG.debug("REST: Retrieving player by ID: " + playerId);

        Player player = playerService.getPlayer(playerId);
        if (player == null) {
             response.setStatus(HttpServletResponse.SC_NOT_FOUND);
             return null;
        }

        LOG.debug("Retrieved player from the database: " + player);
        return player;
    }

    @RequestMapping(value = "/rest/v1/player/all", method = RequestMethod.GET)
    public Iterable<Player> getAllPlayers() throws IOException {
        LOG.debug("REST: Retrieving all players");

        return playerService.getAllPlayers();
    }


}
