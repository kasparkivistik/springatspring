package eu.leisurify.website.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @RequestMapping("/registration/")
    public String register(Map<String, Object> model) {
        return "registration/index";
    }

    @RequestMapping("/registration/add")
    public String add(Map<String, Object> model) {
        return "welcome/index";
    }

}
