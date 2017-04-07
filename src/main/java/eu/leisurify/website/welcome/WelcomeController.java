package eu.leisurify.website.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String redirect(Map<String, Object> model) {
        return "welcome/index";
    }

}
