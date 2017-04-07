package eu.leisurify.website.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping("/location/")
    public String index(Model model) {
        return "kit/about-company";
    }

}
