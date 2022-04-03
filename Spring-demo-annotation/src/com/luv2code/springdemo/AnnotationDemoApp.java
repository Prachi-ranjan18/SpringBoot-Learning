package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		//read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		
		//call a method in the bean
		System.out.println(theCoach.getDailyWorkOut());
		//close the context
		context.close();
	}
}
