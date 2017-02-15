package com.pebstone.userflow;

import io.appium.java_client.android.AndroidDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.pebstone.apputility.Randomnum;
import com.pebstone.objects.Group_Type;
import com.pebstone.objects.Login_Screen;
import com.pebstone.objects.Message_Screen;
import com.pebstone.objects.Mobile_number;
import com.pebstone.objects.OTP_screen;
import com.pebstone.objects.Subscribedgroup_List;
import com.pebstone.presetup.App_Permissions;
import com.pebstone.presetup.Initialsetup;

public class Admin_Workflow {

	public static AndroidDriver wd = null;
	static Dimension size;
	static String admin_opengrp_1, OTP, contact_no,group_name;
	static String propFile = "config.properties";
	static Properties propertyFile = Initialsetup.getPropertyFile(propFile);
	
@Test(priority=1)
public static void Admin_Mobileno_Confirmation() throws InterruptedException
{
	 Initialsetup.setup();
	 try{
		  size = Initialsetup.wd.manage().window().getSize();
		  System.out.println(size);
		  
		  Login_Screen.login_btn(wd).click();
		  Login_Screen.username(wd).sendKeys(propertyFile.getProperty("admin_name"));
		  try{
	   		  Initialsetup.wd.hideKeyboard();
		  	
	     }catch(WebDriverException e)
	      {
	    	 
	      }
		  Mobile_number.mobile_no(wd).sendKeys(propertyFile.getProperty("admin_mobileno"));
		  Thread.sleep(2000);
		  Mobile_number.submit_btn(wd).click();	
		  Thread.sleep(1000);
		  App_Permissions.sms_permission();
	    }catch(Throwable e)
	 	 {
	    	System.out.println("# TEST CASE FAILED: Error occured during mobile number confirmation from parent");
			Assert.fail(e.getMessage());
	 	 }
}

@Test(priority=2)
public static void Admin_OTP_Submission()
{
	try{
		  Thread.sleep(3000);
		  HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  String url = propertyFile.getProperty("get_otp_url");
	      url = url.replace("#MOB_NO#", propertyFile.getProperty("admin_mobileno") );
		  System.out.println(url);
		  driver.get(url);
		  String data=driver.getPageSource();
		  System.out.println(data);
		  String read_otp = data.substring(78,82);
		  driver.close();
		  System.out.println("OTP:" +read_otp);
		  OTP=read_otp;
		  Thread.sleep(2000);
		  try{
			    OTP_screen.otp_field(wd).sendKeys(OTP);
			  	Thread.sleep(2000);
			  	OTP_screen.submit_btn(wd).click();
			  	System.out.println("# TEST CASE PASS: OTP VERIFIED SUCCESSFULLY FOR ADMIN !!!");
		  	}
		  catch(NoSuchElementException e)
		  {
			  System.out.println("# TEST CASE FAILED: ERROR OCCURED WHILE ENTERING OTP...");
	  		  Assert.fail(e.getMessage());
		  }
	 }catch(Throwable e)
	  {
		  System.out.println("# TEST CASE FAILED: OTP VERIFICATION PROCESS FOR ADMIN...");
		  Assert.fail(e.getMessage());
	  }
	
	 App_Permissions.contact_permission();
	 
	 App_Permissions.phonecall_permission();
}

@Test(priority=3)
public static void Admin_Login_Verification()
{
	try
	  {
		  WebDriverWait wait = new WebDriverWait(Initialsetup.wd,90);
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Subscribedgroup_List.create_new_group(wd)));
		  System.out.println("# TEST CASE PASS: ADMIN LOGGED IN SUCCESSFULLY !!!!!");
		
	  }catch(Throwable e)
	  {
		  WebDriverWait wait = new WebDriverWait(Initialsetup.wd,90);
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Subscribedgroup_List.create_new_group(wd)));
		  System.out.println("# TEST CASE FAILED: TAKING TOO MUCH TIME TO LOAD... SYNC ISSUE");
		  Assert.fail(e.getMessage());
	  }
}
@Test(priority=4)
public static void Admin_Create_Group() throws InterruptedException
{
	  Thread.sleep(2000);
	  Subscribedgroup_List.more_option(wd).click();
	  Subscribedgroup_List.creategroup_btn(wd).click();
	  admin_opengrp_1=Randomnum.randomchar();
	  System.out.println("# Public group name:" +admin_opengrp_1);
	  Group_Type.group_name(wd).sendKeys(admin_opengrp_1);
	  Initialsetup.wd.hideKeyboard();
	  Group_Type.next_btn(wd).click();
	  Thread.sleep(1000);
	  
	  try
	   {
		  
		  Initialsetup.wd.scrollToExact(admin_opengrp_1).click();
		  if(Message_Screen.wait_message(wd).isDisplayed()==true)
		  {	  
			  System.out.println("# TEST CASE PASS: PUBLIC GROUP CREATED SUCCESSFULLY !!!!");
			  Mobile_number.back_btn(wd).click();
		  }
		 }catch(NoSuchElementException e)
	      {
			System.out.println("# TEST CASE FAILED: MESSAGE MISSING FROM CHAT SCREEN...");
			
	      }
}

@AfterTest
public static void tear_down()
{
	Initialsetup.wd.resetApp();
}
}
