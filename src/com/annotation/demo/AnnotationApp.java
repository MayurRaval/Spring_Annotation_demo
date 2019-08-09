package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext mApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Coach mCoach = mApplicationContext.getBean("thatSillyCoach",Coach.class);
		
		System.out.println(mCoach.getDailyWorkOut());
		mApplicationContext.close();
	}

}
