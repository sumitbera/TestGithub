package com.mindvalley.app.pageObjects;

import io.appium.java_client.android.AndroidDriver;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mindvalley.app.dataProvider.ConfigFileReader;
import com.mindvalley.app.utility.Constants;
import com.mindvalley.app.utility.InitialSetup;
import com.mindvalley.app.utility.Locators;

public class CarSelection implements Locators.CarSelection
{
	Properties propertyFile = ConfigFileReader.getPropertyFile(Constants.APPDETAILS.propertyFile);
	String favCarName;
	
	public CarSelection(AndroidDriver androidDriver)
	{
		PageFactory.initElements(androidDriver, this);
	}
	
	//page object for enter your name field
	@FindBy(how = How.XPATH, using = nameTextField)
	private WebElement userNameField;
	
	//page object for car selection pop up
	@FindBy(how = How.XPATH, using = carSelection)
	private WebElement carSelectionPopup;
	
	//page object for favorite car pop up
	@FindBy(how = How.XPATH, using = favouriteCarName)
	private WebElement favouriteCar;
	
	//page object for send me your name button
	@FindBy(how = How.NAME, using = nameBtn)
	private WebElement sendNameButton;
	
	//page object for my name text
	@FindBy(how = How.NAME, using = userName)
	private WebElement myNameText;
	

	public void userDetail(String userName)
	{
		userNameField.sendKeys(userName);
	}
	
	public void tapUserNameField() throws InterruptedException
	{
		try{
				WebDriverWait wait = new WebDriverWait(InitialSetup.getInstance().getAndroidDriver(),60);
				WebElement element = wait.until(ExpectedConditions.visibilityOf((userNameField)));
				userNameField.click();
			
		}catch(NoSuchElementException e)
		{
			Assert.fail("# User name field not present");
		}
		
	}
	
	public void clearExistingText()
	{
		userNameField.clear();
	}
	
	public void fillUserName()
	{
		String name = propertyFile.getProperty("user_name");
		userDetail(name);
	}
	
	public void selectYourFavouriteCar()
	{
		carSelectionPopup.click();
		favCarName = favouriteCar.getText();
		favouriteCar.click();
	}
	
	public void sendYourName()
	{
		sendNameButton.click();
	}
	
	public void displayNameAndCarDetails()
	{
		try
		{
			if(InitialSetup.getInstance().getAndroidDriver().getPageSource().contains(userName)==true)
			{
				System.out.println("# User name displayed as :"+userName);
			}
			else
			{
				System.out.println("# User name not visible...");
			}
		}catch(NoSuchElementException e)
		{
			Assert.fail("# Couldn't found name of the user...");
		}
		
		try
		{
			if(InitialSetup.getInstance().getAndroidDriver().getPageSource().contains(favCarName)==true)
			{
				System.out.println("# Car name displayed as :"+favCarName);
			}
			else
			{
				System.out.println("# Car name not visible");
			}
		}catch(NoSuchElementException e)
		{
			Assert.fail("# Couldn't found car name...");
		}
	}
	
}
