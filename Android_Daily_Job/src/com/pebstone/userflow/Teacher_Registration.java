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
import com.pebstone.objects.Confirm_number;
import com.pebstone.objects.Group_Feature;
import com.pebstone.objects.Home_Screen;
import com.pebstone.objects.Landing_screen;
import com.pebstone.objects.Login_Screen;
import com.pebstone.objects.Login_success;
import com.pebstone.objects.Message_Screen;
import com.pebstone.objects.Mobile_number;
import com.pebstone.objects.OTP_screen;
import com.pebstone.objects.Registration_Screen;
import com.pebstone.objects.School_Registration;
import com.pebstone.objects.Subscribedgroup_List;
import com.pebstone.objects.Group_Type;
import com.pebstone.presetup.Initialsetup;
import com.pebstone.apputility.Randomnum;

public class Teacher_Registration {
	
	
	public static AndroidDriver wd = null;
	static String OTP, contact_no,opengrp;
	static String propFile = "config.properties";
	static Properties propertyFile = Initialsetup.getPropertyFile(propFile);
	
	
@Test(priority=1)
public static void teacher_mobileno_confirmation() throws InterruptedException
{
	 
	Initialsetup.setup();
	
	try
	{
	   Login_Screen.login_btn(wd).click();
	   Mobile_number.country_code(wd).sendKeys("91");
	   contact_no = Randomnum.randomnum();
	   System.out.println("=========================================================================================");
	   System.out.println("# Teacher mobile no:"+contact_no);
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
public static void teacher_otp_submission()
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
			   	  System.out.println("# TEST CASE PASS: OTP verified successfully for teacher !!!");
	   	  		}catch(Throwable e)
	   	   		{
	   	  			System.out.println("# TEST CASE FAILED: Error occured while OTP submission from teacher ");
	   	  			Assert.fail(e.getMessage());
	   	   		}
		}catch(Throwable e)
		 {
			System.out.println("# TEST CASE FAILED: OTP VERIFICATION PROCESS FOR TEACHER");
			Assert.fail(e.getMessage());
		 }
}
	
@Test(priority=3)
public static void teacher_personal_details() throws InterruptedException
{
   try{
	   	Landing_screen.teacher(wd).click();
	   	School_Registration.school_code(wd).sendKeys(propertyFile.getProperty("teacher_code"));
	   	School_Registration.submit_btn(wd).click();
	   	Home_Screen.start_btn(wd).click();
	   	Registration_Screen.f_name(wd).sendKeys(propertyFile.getProperty("teacher_fname"));
	   	Registration_Screen.l_name(wd).sendKeys(Randomnum.random_lname());
	   	Registration_Screen.create_password(wd).sendKeys(propertyFile.getProperty("create_password"));
	   	Registration_Screen.confirm_password(wd).sendKeys(propertyFile.getProperty("confirm_password"));
	   	Registration_Screen.proceed_btn(wd).click();
	   	Thread.sleep(3000);
	   	System.out.println("# TEST CASE PASS: Teacher Registered successfully !!!"); 
	   }
	catch(Throwable e)
	{
		System.out.println("# TEST CASE FAILED: Teacher Registration");
		Assert.fail(e.getMessage());
	}
}

@Test(priority=4)
public static void subscribe_group_teacher() throws InterruptedException
{
   try
   {
	 Subscribedgroup_List.more_option(wd).click();
	 Subscribedgroup_List.subscribegroup_list(wd).click();
	 Initialsetup.wd.scrollTo(propertyFile.getProperty("all_parent")).click();
	 Group_Feature.yes_btn(wd).click();
	 try{
		  Initialsetup.wd.scrollTo(propertyFile.getProperty("all_student")).click();
		  Group_Feature.yes_btn(wd).click();
		  Subscribedgroup_List.NEXT_btn(wd).click();
		  Thread.sleep(2000);
		  System.out.println("# TEST CASE PASS: Groups subscribed successfully by Teacher !!!");
	 	}catch(NoSuchElementException e)
     	 {
	 		System.out.println("# TEST CASE FAILED: Group not found by Teacher");
	 		Assert.fail(e.getMessage());
     	 }
   }
	catch(Throwable e)
	{
	  System.out.println("# TEST CASE FAILED: GROUP SUBSCRIPTION FROM TEACHER");
	  Assert.fail(e.getMessage());
	}
}

@Test(priority=5)
public static void send_message_teacher() throws InterruptedException
{
	Thread.sleep(2000);
	try{
		 Initialsetup.wd.scrollTo(propertyFile.getProperty("all_parent")).click();
		 Message_Screen.msg_box(wd).sendKeys(propertyFile.getProperty("message_1"));
		 Thread.sleep(1000);
		 Message_Screen.sendmsg_btn(wd).click();
		 System.out.println("# TEST CASE PASS: Message sent by teacher in All Parent group !!!");
		 Mobile_number.back_btn(wd).click();
	
		 Initialsetup.wd.scrollTo(propertyFile.getProperty("all_student")).click();
		 Message_Screen.msg_box(wd).sendKeys(propertyFile.getProperty("message_2"));
		 Thread.sleep(1000);
		 Message_Screen.sendmsg_btn(wd).click();
		 System.out.println("# TEST CASE PASS: Message sent by teacher in All Student group !!!");
		 Mobile_number.back_btn(wd).click();
	  }catch(Throwable e)
	   {
		  System.out.println("# TEST CASE FAILED: MESSAGE SENDING FROM TEACHER");
		  Assert.fail(e.getMessage());
	   }
}

@Test(priority=6)
public static void create_group_teacher() throws InterruptedException
{
	try{
		 Subscribedgroup_List.creategroup_btn(wd).click();
		 opengrp=Randomnum.randomchar();
		 System.out.println("# Group name:" +opengrp);
		 Group_Type.group_name(wd).sendKeys(opengrp);
		 Initialsetup.wd.hideKeyboard();
		 Group_Type.next_btn(wd).click();
		 Thread.sleep(1000);
		 Group_Type.create_btn(wd).click();
		 Thread.sleep(1000);
		 Initialsetup.wd.scrollTo(opengrp).click();
		 Mobile_number.back_btn(wd).click();
		 System.out.println("# TEST CASE PASS: Group created successfully !!!");
		 System.out.println("=========================================================================================");
	  }catch(Throwable e)
	   {
		  System.out.println("# TEST CASE FAILED: CREATE GROUP FROM TEACHER");
		  System.out.println("=========================================================================================");
		  Assert.fail(e.getMessage());
	   }
}

@AfterTest
public static void tear_down()
{
	Initialsetup.wd.resetApp();
}

}
