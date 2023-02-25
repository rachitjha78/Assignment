package com.example.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.service.CurrentTimeService;

import java.time.LocalTime;

@RestController
@RequestMapping(path = "/clock")


public class SpeakingClockController {

	@Autowired
	private CurrentTimeService currentTimeService;
	
	@GetMapping(path="/", produces = "application/json")
    public String getTimeInWord()
    {
    
    	LocalTime localtime = LocalTime.now();
    	return currentTimeService.getCurrentTimeInWord();
        
    }

}
