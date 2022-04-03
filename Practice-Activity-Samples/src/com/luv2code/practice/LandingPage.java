package com.luv2code.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LandingPage {

	public static void main(String[] args) {
		// Read the spring Config file i.e. applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from spring container
		Coach golfCoach = context.getBean("golfCoach",Coach.class);
		//call a method in the bean
		System.out.println(golfCoach.practiceDailyGolf());
		//close the context
		context.close();
		
	}

}
