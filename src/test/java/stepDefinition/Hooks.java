package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	
	@Before(order = 0)
	public void beforeScnario0() {
		System.out.println("Before 0 Scenario");
		
	}
	
	@Before(order = 1)
	public void beforeScnario() {
		System.out.println("Before Every Scenario");
		
	}
	
	@Before("@Monthly")
	public void beforeSmoke1() {
		System.out.println("Before Mobthly1 only");
	}
	
	
//	@After("@Smoke1")
//	public void afterSmoke1() {
//		System.out.println("After Smoke 1 only");
//	}
	
	@After(order = 1)
	public void afterScenario() {
		System.out.println("After Every Scenario");
	}

//	@After(order = 0)
//	public void afterScenario0() {
//		System.out.println("After 0 Scenario");
//	}

	
	
}
