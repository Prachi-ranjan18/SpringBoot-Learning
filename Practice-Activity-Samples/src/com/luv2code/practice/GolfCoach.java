package com.luv2code.practice;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

	@Override
	public String practiceDailyGolf() {
		// TODO Auto-generated method stub
		return "Practice 1 hour daily to become the best golf player in the city";
	}

}
