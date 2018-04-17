package com.mindvalley.web.utilities;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InitialSetup 
{
	private static InitialSetup initialSetUp;
	
	
	private WebDriver wd;
	
	private InitialSetup() 
	{
		setup();
	}
	
	public WebDriver getWebDriver()
	{
		return wd;
	}
	
	public static InitialSetup getInstance()
	{
		if(initialSetUp != null)
			return initialSetUp;
		
		synchronized (InitialSetup.class) 
		{
			if(initialSetUp == null)
				initialSetUp = new InitialSetup();
		}
		
		return initialSetUp; 
	}
	public void setup()
	{
		if(wd==null)
		{
			wd=new FirefoxDriver();
			wd.get(Constants.WEBDETAILS.WEB_URL);
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		}
	}
	
	public void waitForPageLoadedState() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver wd) 
                    {
                        return ((JavascriptExecutor) wd).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(wd, 60);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
	}
	
	public void tearDown()
	{
		wd.quit();
	}
}
