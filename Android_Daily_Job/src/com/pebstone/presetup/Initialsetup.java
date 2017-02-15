package com.pebstone.presetup;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.pebstone.presetup.Initialsetup;

public class Initialsetup 
{

	public static AndroidDriver wd;
	
	public static AndroidDriver setup(){
	
	if(wd==null)
    {
    	File classpathRoot = new File(System.getProperty("user.dir"));
	     	File appDir = new File(classpathRoot, "/app");
	     	
			//Read property file//
			String propFile = "config.properties";
			Properties propertyFile = getPropertyFile(propFile);
			
	     	File app = new File(appDir, propertyFile.getProperty("app_Name"));
	     	DesiredCapabilities capabilities = new DesiredCapabilities();
	     	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	     	capabilities.setCapability("deviceName", "192.168.56.101:5555");
	     	//capabilities.setCapability("deviceName", "93937e6b");
	     	capabilities.setCapability("platformVersion", "5.1");
	     	capabilities.setCapability("PlatformName", "Android");
	     	capabilities.setCapability("app", app.getAbsolutePath());
	     	capabilities.setCapability("appPackage", "com.pebstone.teno");
	     	capabilities.setCapability("appActivity", "com.pebstone.teno.MainActivity");
	  			
	       try { 
	    	 	wd = new AndroidDriver(new URL(propertyFile.getProperty("hub_url")), capabilities);
	    	 	
			   }catch (MalformedURLException e) 
	     	    {
				  e.printStackTrace();
	     	    }
	     		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
			}
    	return wd;
    }

public static Properties getPropertyFile(String propFile)
{
	Properties properties = new Properties();
	InputStream resourceAsStream = Initialsetup.class.getClassLoader().getResourceAsStream(propFile);
	if(resourceAsStream!=null){
	try {
 			properties.load(resourceAsStream);
 	    }catch (IOException e) {
 	 e.printStackTrace();
 	}
 }

 		return properties;
}	

}
