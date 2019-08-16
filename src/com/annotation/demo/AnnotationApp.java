package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext mApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
//		Coach mCoach = mApplicationContext.getBean("tennisCoach",Coach.class);
		
		Coach mCoach = mApplicationContext.getBean("swimCoach",Coach.class);
		System.out.println(mCoach.getDailyWorkOut());
		System.out.println(mCoach.getDailyFortune());
		mApplicationContext.close();
	}

}
