package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext mApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Coach mCoach = mApplicationContext.getBean("tennisCoach", Coach.class);

		Coach otherCoach = mApplicationContext.getBean("tennisCoach", Coach.class);

		System.out.println("Is Result Same || " + (mCoach == otherCoach));

		System.out.println("Is mCoach referance || " + mCoach + " Other Coach Reference || " + otherCoach);

		mApplicationContext.close();
	}

}
