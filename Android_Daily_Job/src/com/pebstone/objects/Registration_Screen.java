package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Registration_Screen 
{
	public static AndroidElement element = null;
	
	//page object for first name field
	public static AndroidElement f_name(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextfirstname"));
		return element;
	}
	//page object for last name field
	public static AndroidElement l_name(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextlastname"));
		return element;
	}
	//page object for email id field
	public static AndroidElement email(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextemailaddress"));
		return element;
	}
	//page object for create password field
	public static AndroidElement create_password(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextpassword"));
		return element;
	}
	//page object for confirm password field
	public static AndroidElement confirm_password(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextconfirmpassword"));
		return element;
	}
	//page object for T&C check box
	public static AndroidElement terms_cond(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/texttermsandconditions"));
		return element;
	}
	//page object for proceed button
	public static AndroidElement proceed_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonprocesregister"));
		return element;
	}
	
}
