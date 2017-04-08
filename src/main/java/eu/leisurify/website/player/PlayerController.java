package eu.leisurify.website.player;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

//@Controller
@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    private static final Log LOG = LogFactory.getLog(PlayerController.class);

    @RequestMapping(value = "/rest/v1/player/{playerId}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable(value = "playerId") long playerId) throws IOException {
        LOG.debug("REST: Retrieving player by ID: " + playerId);

        Player player = playerService.getPlayer(playerId);
        LOG.debug("Retrieved player from the database: " + player);
        return player;
    }


}
