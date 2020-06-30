package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
