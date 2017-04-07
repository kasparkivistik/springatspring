package eu.leisurify.website.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping("/player/")
    public String index(Model model) {
        return "kit/about-company";
    }

}
