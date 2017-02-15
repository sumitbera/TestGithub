package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Home_Screen 
{
	public static AndroidElement element = null;
	
	//page object for school logo
	public static AndroidElement school_logo(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/imageviewparent"));
		return element;
	}
	//page object for school name
	public static AndroidElement school_name(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/textviewschoolname"));
		return element;
	}
	//page object for back button
	public static AndroidElement back_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("android:id/home"));
		return element;
	}
	//page object for start button
	public static AndroidElement start_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonstart"));
		return element;
	}

}
