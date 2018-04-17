package com.mindvalley.web.stepDefinition;

import com.mindvalley.web.pageObjects.HomeScreen;
import com.mindvalley.web.pageObjects.LoginScreen;
import com.mindvalley.web.pageObjects.MainDashboardScreen;
import com.mindvalley.web.testcontext.WebTestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition 
{
	
	HomeScreen homeScreen;
	LoginScreen loginScreen;
	MainDashboardScreen mainScreen;
	WebTestContext webTestContext;
	
	public LoginStepDefinition(WebTestContext context)
	{
		webTestContext = context;
		homeScreen = webTestContext.getPageObjectManager().getHomeScreen();
		loginScreen = webTestContext.getPageObjectManager().getLoginScreen();
		mainScreen = webTestContext.getPageObjectManager().getMainScreen();
	}
	
	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page()
	{
	    homeScreen.launchApplication();
	    homeScreen.clickLoginLink();
	}

	@When("^user enters Invalid Username and Password$")
	public void user_enters_Invalid_Username_and_Password(DataTable userCredentials)
	{
	    loginScreen.fillEmail(userCredentials);
	    loginScreen.fillIncorrectPassword(userCredentials);
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button()
	{
	    loginScreen.clickLoginButton();
	}

	@Then("^web page should display validation message$")
	public void web_page_should_display_validation_message()
	{
	    loginScreen.validateErrorMessage();
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password(DataTable userCredentials)
	{
		loginScreen.fillEmail(userCredentials);
		loginScreen.fillIncorrectPassword(userCredentials);
	}

	@Then("^dashboard should be successfully$")
	public void dashboard_should_be_successfully()
	{
	    mainScreen.loginSuccess();
	}

	@Then("^close the browser$")
	public void close_the_browser()
	{
	    homeScreen.closeApplication();
	}




}
