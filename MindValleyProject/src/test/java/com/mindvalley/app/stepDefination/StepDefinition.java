package com.mindvalley.app.stepDefination;

import io.appium.java_client.android.AndroidKeyCode;

import com.mindvalley.app.pageObjects.CarSelection;
import com.mindvalley.app.pageObjects.HomeScreen;
import com.mindvalley.app.testcontext.AppTestContext;
import com.mindvalley.app.utility.InitialSetup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition 
{
	HomeScreen homeScreen;
	CarSelection carSelectionScreen;
	AppTestContext appTestContext;
	
	public StepDefinition(AppTestContext context)
	{
		appTestContext = context;
		homeScreen = appTestContext.getPageObjectManager().getHomeScreen();
		carSelectionScreen = appTestContext.getPageObjectManager().getCarSelection();
	}
	
	@Given("^the user is on the home screen$")
	public void the_user_is_on_the_home_screen()
	{
		homeScreen.appLaunchScreen(); 
	}

	@Given("^user taps on Chrome icon$")
	public void user_taps_on_Chrome_icon()
	{
	    homeScreen.tapChromeBtn();   
	}

	@When("^user enters their own name$")
	public void user_enters_their_own_name() throws InterruptedException
	{
		carSelectionScreen.tapUserNameField();
		carSelectionScreen.clearExistingText();
		carSelectionScreen.fillUserName();
	}

	@When("^selects their favourite car$")
	public void selects_their_favourite_car()
	{
	    carSelectionScreen.selectYourFavouriteCar();
	}

	@When("^tap on send me your name$")
	public void tap_on_send_me_your_name()
	{
	   carSelectionScreen.sendYourName();
	}

	@Then("^your name and car is displayed$")
	public void your_name_and_car_is_displayed()
	{
	    carSelectionScreen.displayNameAndCarDetails();
	    InitialSetup.getInstance().getAndroidDriver().pressKeyCode(AndroidKeyCode.BACK);
	    InitialSetup.getInstance().getAndroidDriver().pressKeyCode(AndroidKeyCode.BACK);
	}

	@When("^the user enters name in text field$")
	public void the_user_enters_name_in_text_field()
	{
	    homeScreen.fillMyName();
	}

	@When("^click display text view$")
	public void click_display_text_view()
	{
	    homeScreen.tapDisplayViewBtn();
	}
	
	@When("^it should display visual message$")
	public void it_should_display_visual_message()
	{
		homeScreen.verifyVisibleTextMessage();
	}

	@When("^click on throw unhandled exception$")
	public void click_on_throw_unhandled_exception()
	{
	    homeScreen.tapExceptionBtn();
	}

	@Then("^verify the app crashes$")
	public void verify_the_app_crashes()
	{
	    homeScreen.verifyCrashErrorMessage();
	}


}
