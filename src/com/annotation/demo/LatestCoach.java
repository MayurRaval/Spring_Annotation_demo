package com.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class LatestCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Test 78f 87 87 87 87we98r7greg 87897 897 ";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
