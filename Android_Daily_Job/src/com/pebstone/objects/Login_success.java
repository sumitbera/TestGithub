package com.pebstone.objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

public class Login_success 
{
	public static AndroidElement element=null;
	
	//page object for login success screen
	public static AndroidElement login_success_note(AndroidDriver wd)
	{
		element= (AndroidElement) Initialsetup.wd.findElement(By.name("Number verified successfully!"));
		return element;
	}
	
	public static AndroidElement home_success(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Create New Group"));
		return element;
	}

}
