package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
//	@Autowired
//	public TennisCoach( FortuneService fortuneService) {
//		this.fortuneService= fortuneService;
//	}
	
	//default constructor
	public TennisCoach() {
		System.out.println(">>inside default constructor");
	}
	
	//define a setter method
//	@Autowired
//	public void doSomePractice(FortuneService theFortuneService) {
//		fortuneService= theFortuneService; 
//	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		
		return "Practice Your BackHand Volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
