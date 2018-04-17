package com.mindvalley.web.stepDefinition;


import com.mindvalley.web.testcontext.WebTestContext;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebTestContext webTestContext;
	
	public Hooks(WebTestContext context)
	{
		webTestContext = context;
	}
	
	@Before
    public void beforeScenarioStart()
	{
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	
	@After
	public void afterScenarioFinishes()
	{
		System.out.println("-----------------End of Scenario-----------------");
	}
}
