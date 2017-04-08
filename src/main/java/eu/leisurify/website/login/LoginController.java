package eu.leisurify.website.login;

import eu.leisurify.website.player.Player;
import eu.leisurify.website.registration.RegistrationController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class LoginController {

    private static final Log LOG = LogFactory.getLog(RegistrationController.class);

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public ModelAndView login(Map<String, Object> model) {
        return new ModelAndView("login/index", "command", new Player());
    }

}
