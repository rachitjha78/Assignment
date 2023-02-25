package com.example.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalTime;

@RestController
@RequestMapping(path = "/clock")
public class SpeakingClockController {
	
	@GetMapping(path="/", produces = "application/json")
    public String getTimeInWord()
    {
    
    	LocalTime localtime = LocalTime.now();
    	return localtime.getHour() + ":" + localtime.getMinute();
        
    }

}
