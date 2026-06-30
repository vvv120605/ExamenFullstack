package cl.duoc.itinerary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/itineraries")
public class ItineraryController {

    @GetMapping
    public String getItineraries() {
        return "Itinerary service is running";
    }
}
