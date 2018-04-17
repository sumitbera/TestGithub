package com.mindvalley.app.stepDefination;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		format = {"pretty", "json:target/json/output.json", "html:target/html/"},
		features = {"src/main/feature/TestCase.feature"},
		glue = {"com.mindvalley.app.stepDefination"}
		)
public class RunnerTest 
{
	@BeforeClass
	public static void setup()
	{	
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
	}

}
