package com.example.testingserver;

import org.springframework.web.bind.annotation.RestController;

import com.example.testingserver.entity.Station;
import com.example.testingserver.service.StationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class WebController {

    @Autowired
    private StationService stationService;

	@GetMapping("/")
    public String display() {
        return "Welcome to Azure project";
    }
	
     @PostMapping("/createstation")
    public Station createStation(@RequestBody Station station) {
        return stationService.createStation(station);
    }

    
    @GetMapping("/getallstations")
    public List<Station> getAllStations() {
        return stationService.Getallstations();
    }
	
}
