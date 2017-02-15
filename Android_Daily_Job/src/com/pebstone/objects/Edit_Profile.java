package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Edit_Profile {
	
	public static AndroidElement element = null;
	
	//page object for Edit profile button
	public static AndroidElement edit_profile_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edit"));
		return element;
	}
	//page object for save profile button
	public static AndroidElement save_profile_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/save"));
		return element;
	}
	//page object for first name field
	public static AndroidElement profile_fname(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/editProfileFname"));
		return element;
	}
	//page object for last name field
	public static AndroidElement profile_lname(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/editProfileLname"));
		return element;
	} 
	//page object for edit mobile number field
	public static AndroidElement edit_mobileno(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/editProfileMob"));
		return element;
	}
	//page object for send verification code button
	public static AndroidElement sendverfcode_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/submit"));
		return element;
	}
	//page object for email address
	public static AndroidElement edit_email_id(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/editProfileEmail"));
		return element;
	}
	//page object for error message of first name
	public static AndroidElement error_msg_fname(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/invalidfirstname"));
		return element;
	}
	//page object for error message of last name
	public static AndroidElement error_msg_lname(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/invalidlastname"));
		return element;
	}
}
