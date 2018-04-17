package com.mindvalley.web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mindvalley.web.utilities.InitialSetup;
import com.mindvalley.web.utilities.Locators;

public class HomeScreen implements Locators.HomeScreen
{
	public HomeScreen(WebDriver webDriver)
	{
		PageFactory.initElements(webDriver, this);
	}
	
	//page object for login link
	@FindBy(how = How.XPATH, using = login)
	private WebElement loginLink;
	
	
	public void launchApplication()
	{
		InitialSetup.getInstance().setup();
		InitialSetup.getInstance().waitForPageLoadedState();
	}
	
	public void clickLoginLink()
	{
		loginLink.click();
		InitialSetup.getInstance().waitForPageLoadedState();
	}
	
	public void closeApplication()
	{
		InitialSetup.getInstance().tearDown();
	}
}
