package eu.leisurify.website.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;


}
