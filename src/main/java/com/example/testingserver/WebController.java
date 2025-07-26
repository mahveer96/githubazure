package com.example.testingserver;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WebController {

	@GetMapping("/")
    public String home() {
        return "Spring Boot App Deployed Successfully!";
    }
	
	
}
