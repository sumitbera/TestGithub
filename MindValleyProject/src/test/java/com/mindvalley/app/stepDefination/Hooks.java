package com.mindvalley.app.stepDefination;


import com.mindvalley.app.testcontext.AppTestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	AppTestContext appTestContext;
	
	public Hooks(AppTestContext context)
	{
		appTestContext = context;
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
