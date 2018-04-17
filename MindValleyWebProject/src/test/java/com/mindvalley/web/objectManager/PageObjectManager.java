package com.mindvalley.web.objectManager;

import org.openqa.selenium.WebDriver;

import com.mindvalley.web.pageObjects.HomeScreen;
import com.mindvalley.web.pageObjects.LoginScreen;
import com.mindvalley.web.pageObjects.MainDashboardScreen;
import com.mindvalley.web.utilities.InitialSetup;


public class PageObjectManager 
{
	WebDriver webDriver;
	HomeScreen homeScreen;
	LoginScreen loginScreen;
	MainDashboardScreen mainScreen;
	
	public PageObjectManager(WebDriver webDriver)
	{
		this.webDriver = webDriver;
	}
	
	public HomeScreen getHomeScreen()
	{
		return (homeScreen == null) ? new HomeScreen(InitialSetup.getInstance().getWebDriver()) : homeScreen;
	}
	
	public LoginScreen getLoginScreen()
	{
		return (loginScreen == null) ? new LoginScreen(InitialSetup.getInstance().getWebDriver()) : loginScreen;
	}
	
	public MainDashboardScreen getMainScreen()
	{
		return (mainScreen == null) ? new MainDashboardScreen(InitialSetup.getInstance().getWebDriver()) : mainScreen;
	}
}
