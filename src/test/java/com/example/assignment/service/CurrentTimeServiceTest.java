package com.example.assignment.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CurrentTimeServiceTest {
    
	@InjectMocks
    private CurrentTimeService currentTimeService;
	
	@Test
	void testCurrentTimeService() {
		LocalTime localtime = LocalTime.now();
		System.out.println(currentTimeService.getCurrentTimeInWord());
		assertNotNull(currentTimeService.getCurrentTimeInWord());
	}

}
