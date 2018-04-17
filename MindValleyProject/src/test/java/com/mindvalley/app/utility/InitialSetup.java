package com.mindvalley.app.utility;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitialSetup 
{
	private static InitialSetup initialSetUp;
	
	
	private AndroidDriver wd;
	
	private InitialSetup() 
	{
		setup();
	}
	
	public AndroidDriver getAndroidDriver()
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
			
			File classpathRoot = new File(System.getProperty("user.dir"));
   	     	File appDir = new File(classpathRoot, "/app");
   	
   	     	File app = new File(appDir, Constants.APPDETAILS.APP_NAME);
   	     	DesiredCapabilities capabilities = new DesiredCapabilities();
   	     	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
   	        capabilities.setCapability("deviceName", Constants.APPDETAILS.DEVICE_NAME);
   	        capabilities.setCapability("platformVersion", Constants.APPDETAILS.DEVICE_OS);
   	     	capabilities.setCapability("platformName", Constants.APPDETAILS.PLATFORM);
   	     	capabilities.setCapability("app", app.getAbsolutePath());
   	     	capabilities.setCapability("appPackage", Constants.APPDETAILS.APP_PACKAGE);
   	     	capabilities.setCapability("appActivity", Constants.APPDETAILS.APP_LAUNCH_ACTIVITY);
   	  			
   	     	try { 
   	    	 	 	this.wd = new AndroidDriver(new URL(Constants.APPDETAILS.HUB_URL), capabilities);
   	    	 	
   			    }catch (MalformedURLException e) 
   	     	     {
   			    	e.printStackTrace();
   	     	     }
   	     		 wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
   			  }
	}
}
