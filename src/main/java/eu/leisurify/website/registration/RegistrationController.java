package eu.leisurify.website.registration;

import eu.leisurify.website.player.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class RegistrationController {

    @RequestMapping(value="/registration/", method=RequestMethod.GET)
    public ModelAndView register(Map<String, Object> model) {
        return new ModelAndView("registration/index", "command", new Player());
    }

    @RequestMapping("/registration/add")
    public String add(Map<String, Object> model) {
        return "welcome/index";
    }

}
