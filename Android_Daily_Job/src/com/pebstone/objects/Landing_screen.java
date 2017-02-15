package com.pebstone.objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

public class Landing_screen 
{
	public static AndroidElement element = null;
	
	//page object for parent as a option on landing screen
	public static AndroidElement parent(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/imageviewparent"));
		return element;
	}
	//page object for teacher as a option on landing screen
	public static AndroidElement  teacher(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/imageviewteacher"));
		return element;
	}
	//page object for student as a option on landing screen
	public static AndroidElement student(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/imageviewstudent"));
		return element;
	}

}
