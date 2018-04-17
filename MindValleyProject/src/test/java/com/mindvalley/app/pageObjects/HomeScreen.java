package com.mindvalley.app.pageObjects;

import java.util.Properties;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mindvalley.app.dataProvider.ConfigFileReader;
import com.mindvalley.app.utility.Constants;
import com.mindvalley.app.utility.InitialSetup;
import com.mindvalley.app.utility.Locators;


public class HomeScreen implements Locators.HomeScreen
{
	Properties propertyFile = ConfigFileReader.getPropertyFile(Constants.APPDETAILS.propertyFile);
	
	public HomeScreen(AndroidDriver androidDriver)
	{
		PageFactory.initElements(androidDriver, this);
	}
	
	//page object for my text field
	@FindBy(how = How.ID, using = myTextField)
	private WebElement myNameTextField;
	
	//page object for display text view button
	@FindBy(how = How.ID, using = displayBtn)
	private WebElement displayTextViewBtn;
	
	//page object for visible message
	@FindBy(how = How.ID, using = message)
	private WebElement visibleTextMessage;
	
	//page object for exception message
	@FindBy(how = How.ID, using = exceptionMessage)
	private WebElement exceptionAlertView;

	//page object for home screen title
	@FindBy(how = How.NAME, using = title)
	private WebElement appScreenTitle;
		
	//page object for chrome button
	@FindBy(how = How.ID, using = appChromeBtn)
	private WebElement chromeButton;
	
	//page object for expection handle button
	@FindBy(how = How.ID, using = exceptionBtn)
	private WebElement unhandledExceptionButton;
	
	
	public void appLaunchScreen()
	{
		try{
			 if(appScreenTitle.isDisplayed()==true)
			 {
				 System.out.println("# User is on home screen !!!!");
			 }
		   }catch(NoSuchElementException e)
			{
			   Assert.fail("# Issue with app launch....");
			}
	}
	public void tapChromeBtn()
	{
		try{
			 if(chromeButton.isDisplayed()==true)
			 {
				 chromeButton.click();
			 }
		   }catch(NoSuchElementException e)
			{
			   Assert.fail("# Could not found chrome button....");
			}
	}
	
	public void myDetail(String userName)
	{
		myNameTextField.sendKeys(userName);
	}
    public void fillMyName()
    {
    	String myName = propertyFile.getProperty("user_name");
    	myDetail(myName);
    	try{
			 InitialSetup.getInstance().getAndroidDriver().hideKeyboard();
		   }catch (Exception e) 
    		{
    		}
    }
	
	public void tapDisplayViewBtn()
	{
		try{
				if(displayTextViewBtn.isDisplayed()==true)
				{
					displayTextViewBtn.click();
				}
		}catch(NoSuchElementException e)
		{
			Assert.fail("# Display text view button not visible on home screen");
		}
	}
	
	public void verifyVisibleTextMessage()
	{
		String expectedMessage = "Text is sometimes displayed";
		String actualMessage = visibleTextMessage.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	public void tapExceptionBtn()
	{
		unhandledExceptionButton.click();
	}
	
	public void verifyCrashErrorMessage()
	{
		try{
			 if(exceptionAlertView.isDisplayed()==true)
			 {
				 System.out.println("# Application not responding !!!");
				 exceptionAlertView.click();
			 }
			
		}catch(NoSuchElementException e)
		{
			System.out.println("# No crash alert found....");
		}
	}
	
}
