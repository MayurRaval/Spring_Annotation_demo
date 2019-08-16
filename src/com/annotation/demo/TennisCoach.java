package com.annotation.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println(">> inside default constructor");
	}
	
	/*@Autowired
	public void dosetFortuneService(FortuneService fortuneService) {
		System.out.println(">> inside setter dosetFortuneService");
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public TennisCoach(FortuneService mFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = mFortuneService;
	}*/
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> inside doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> inside doMyStartupStuff");
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your back end";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
