package com.mindvalley.web.pageObjects;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mindvalley.web.utilities.InitialSetup;
import com.mindvalley.web.utilities.Locators;

import cucumber.api.DataTable;

public class LoginScreen implements Locators.LoginScreen
{
	public LoginScreen(WebDriver webDriver)
	{
		PageFactory.initElements(webDriver, this);
	}
	
	//page object for email field
	@FindBy(how = How.XPATH, using = emailId)
	private WebElement emailTextField;
	
	//page object for password field
	@FindBy(how = How.XPATH, using = password)
	private WebElement passwordTextField;
	
	//page object for login button
	@FindBy(how = How.XPATH, using = login)
	private WebElement loginBtn;
	
	//page object for error message
	@FindBy(how = How.XPATH, using = errorAlert)
	private WebElement errorMessage;
	
	
	public void fillEmail(DataTable validEmail)
	{
		List<List<String>> data = validEmail.raw();
		emailTextField.sendKeys(data.get(0).get(0));
	}
	
	public void fillIncorrectPassword(DataTable incorrectPassword)
	{
		List<List<String>> data = incorrectPassword.raw();
		passwordTextField.sendKeys(data.get(0).get(1));
	}
	
	public void clickLoginButton()
	{
		loginBtn.click();
	}
	
	public void validateErrorMessage()
	{
		try
		{
			if(errorMessage.isDisplayed()==true)
			{
				System.out.println("# Validation message displayed after submitting invalid credentials !!!");
			}
		}catch(NoSuchElementException e)
		{
			System.err.println("# Error message not visible...");
		}
	}
	
	public void fillCorrectPassword(DataTable correctPassword)
	{
		List<List<String>> data = correctPassword.raw();
		passwordTextField.sendKeys(data.get(0).get(1));
	}
}
