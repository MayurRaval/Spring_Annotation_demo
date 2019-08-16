package com.annotation.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return email + " and  " + team;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return email + " and  " + team;
	}

}
