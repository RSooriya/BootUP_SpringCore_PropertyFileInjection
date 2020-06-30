package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String args[])
	{
		//creating spring container and loading configuration file into container
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieving beans from container
		CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		//calling methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
