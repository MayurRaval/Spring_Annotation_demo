package com.annotation.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext mApplicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
	
//		Coach mCoach = mApplicationContext.getBean("tennisCoach",Coach.class);
		
		Coach mCoach = mApplicationContext.getBean("tennisCoach",Coach.class);
		System.out.println(mCoach.getDailyWorkOut());
		System.out.println(mCoach.getDailyFortune());
		mApplicationContext.close();
	}

}
