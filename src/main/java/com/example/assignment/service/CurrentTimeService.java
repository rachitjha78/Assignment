package com.example.assignment.service;

import java.time.LocalTime;

public class CurrentTimeService {
	
	public String getCurrentTimeInWord() {
		
		String nums[] = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine", "thirty" , "thirty one",
                "twenty two", "thrty three", "thirty four",
                "thrity five", "thirty six", "thirty seven",
                "thirty eight", "thirty nine","forty",
                "forty one","forty two", "forty three", "forty four",
                "forty five", "forty six", "forty seven",
                "forty eight", "forty nine","fifty","fifty one",
                "fifty two", "fifty three", "fifty four",
                "fifty five", "fifty six", "fifty seven",
                "fifty eight", "fifty nine"
               };
		
		LocalTime localtime = LocalTime.now();
		int hh = localtime.getHour();
		int mm = localtime.getMinute();
		if(hh == 0 && mm == 0) {
			return "Its Midnight";
		}
		if(hh==12 && mm==0) {
			return "It's Midday";
		}
    	return "It's " + nums[localtime.getHour()] + " " + nums[localtime.getMinute()];
        
		
	}

}
