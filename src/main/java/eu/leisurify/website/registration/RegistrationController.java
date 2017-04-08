package eu.leisurify.website.registration;

import eu.leisurify.website.player.Player;
import eu.leisurify.website.player.PlayerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class RegistrationController {

    private static final Log LOG = LogFactory.getLog(RegistrationController.class);

    @Autowired
    PlayerService playerService;

    @RequestMapping(value="/registration", method=RequestMethod.GET)
    public ModelAndView register(Map<String, Object> model) {
        return new ModelAndView("registration/index", "command", new Player());
    }

    @RequestMapping(value = "/registration/add", method = RequestMethod.POST)
    public String add(Map<String, Object> model, @ModelAttribute("SpringWeb") Player player) {
        LOG.debug("Adding new player: " + player);
        playerService.savePlayer(player);
        return "redirect:/";
    }

}
