package com.pebstone.userflow;

import io.appium.java_client.android.AndroidDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.pebstone.apputility.Randomnum;
import com.pebstone.objects.Confirm_number;
import com.pebstone.objects.Group_Feature;
import com.pebstone.objects.Home_Screen;
import com.pebstone.objects.Landing_screen;
import com.pebstone.objects.Login_Screen;
import com.pebstone.objects.Message_Screen;
import com.pebstone.objects.Mobile_number;
import com.pebstone.objects.OTP_screen;
import com.pebstone.objects.Registration_Screen;
import com.pebstone.objects.School_Registration;
import com.pebstone.objects.Subscribedgroup_List;
import com.pebstone.presetup.Initialsetup;

public class Student_Registration {
	
	public static AndroidDriver wd = null;
	static String OTP, contact_no,group_name;
	static String propFile = "config.properties";
	static Properties propertyFile = Initialsetup.getPropertyFile(propFile);
	
@Test(priority=1)
public static void student_mobileno_confirmation() throws InterruptedException
{
	 Initialsetup.setup();
	 try{
		   Login_Screen.login_btn(wd).click();
		   Mobile_number.country_code(wd).sendKeys("91");
		   contact_no = Randomnum.randomnum();
		   System.out.println("# Student mobile no:"+contact_no);
		   Mobile_number.mobile_no(wd).sendKeys(contact_no);
		   Thread.sleep(2000);
		   Initialsetup.wd.hideKeyboard();
		   Mobile_number.submit_btn(wd).click();
		   Thread.sleep(2000);
		   Confirm_number.ok_btn(wd).click();
		   Thread.sleep(2000);
	    }catch(Throwable e)
	 	 {
	    	System.out.println("# TEST CASE FAILED: Error occured during mobile number confirmation from teacher");
			Assert.fail(e.getMessage());
	 	 }
}
@Test(priority=2)
public static void student_otp_submission()
{
	try{
		  HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  String url = propertyFile.getProperty("get_otp_url");
		  url = url.replace("#MOB_NO#", contact_no);
		  driver.get(url);
		  Thread.sleep(1000);
		  String data=driver.getPageSource();
		  String read_otp = data.substring(78,82);
		  driver.navigate().refresh();
		  driver.quit();
		  System.out.println("# OTP:" +read_otp);
		  OTP=read_otp;
		  try{
			   OTP_screen.otp_field(wd).sendKeys(OTP);
			   Thread.sleep(2000);
			   OTP_screen.submit_btn(wd).click();
			   System.out.println("# TEST CASE PASS: OTP verified successfully for student !!!");
		  	 }catch(Throwable e)
	   	   	  {
		  		 System.out.println("# TEST CASE FAILED: Error occured while OTP submission from student");
	   	   	  }
	  	}
	  catch(Throwable e)
	  {
		  System.out.println("# TEST CASE FAILED: OTP VERIFICATION PROCESS FOR STUDENT");
		  Assert.fail(e.getMessage());
	  }
}
@Test(priority=3)
public static void student_personal_details() throws InterruptedException
{
   Thread.sleep(2000);
	try{ 
		 Landing_screen.student(wd).click();
	     School_Registration.school_code(wd).sendKeys(propertyFile.getProperty("student_code"));
	     School_Registration.submit_btn(wd).click();
	     Home_Screen.start_btn(wd).click();
	     Registration_Screen.f_name(wd).sendKeys(propertyFile.getProperty("student_fname"));
	     Registration_Screen.l_name(wd).sendKeys(Randomnum.random_lname());
	     Registration_Screen.proceed_btn(wd).click();
	     Thread.sleep(2000);
	      try
	      {
	    	  if(Subscribedgroup_List.teno_support(wd).isDisplayed()==true)
	    	  {
	    		 System.out.println("# TEST CASE PASS: Student registered successfully !!!");
	    	  }
	      }catch(Throwable e){}
	     
	    }catch(Throwable e)
		 {
	    	System.out.println("# TEST CASE FAILED: STUDENT REGISTRATION");
	    	Assert.fail(e.getMessage());
		 }
}

@Test(priority=4)
public static void read_message_student() throws InterruptedException
{
	try{
		 Initialsetup.wd.scrollTo(propertyFile.getProperty("all_student")).click();
		 Thread.sleep(1000);
		 try{
			  String msg=Message_Screen.chat_msg(wd).getText();
			  System.out.println(msg);
			  System.out.println("# TEST CASE PASS: Message received by student !!!");
	  	
  	   		}catch(NoSuchElementException e)
  			 {
  	   			Thread.sleep(2000);	
  	   			System.out.println("# TEST CASE FAILED: Message not received by student");
	   		    Assert.fail(e.getMessage());
  			 }
		  Mobile_number.back_btn(wd).click();
	   }catch(Throwable e)
	    {
		   System.out.println("# TEST CASE FAILED: READ MESSAGE FROM STUDENT");
		   Assert.fail(e.getMessage());
	    }
}

@Test(priority=5)
public static void subscribe_group_student() throws InterruptedException
{
	try{
		 Subscribedgroup_List.more_option(wd).click();
		 Subscribedgroup_List.show_all_group(wd).click();
		 Initialsetup.wd.scrollTo(Teacher_Registration.opengrp).click();
		 Group_Feature.yes_btn(wd).click();
		 Subscribedgroup_List.NEXT_btn(wd).click();
		 Thread.sleep(1000);
		 try{
			  Initialsetup.wd.scrollTo(Teacher_Registration.opengrp).click();
			  System.out.println("# TEST CASE PASS: Groups subscribed successfully by student !!!");
			  System.out.println("=========================================================================================");
		 	}
		 catch(NoSuchElementException e)
		 {
			 System.out.println("# TEST CASE FAILED: Group not found by student");
		     Assert.fail(e.getMessage());
		 }
	    }catch(Throwable e)
		 {
	    	System.out.println("# TEST CASE FAILED: GROUP SUBSCRIPTION FROM STUDENT");
	    	Assert.fail(e.getMessage());
	    	System.out.println("=========================================================================================");
		 }
}


}
