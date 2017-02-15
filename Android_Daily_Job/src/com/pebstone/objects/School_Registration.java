package com.pebstone.objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

public class School_Registration 
{
	public static AndroidElement element=null;

	//page object for Teno header	
	public static AndroidElement header(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/textviewenterthepin"));
		return element;
	}
	//page object for school code field
	public static AndroidElement school_code(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextenterthepin"));
		return element;
	}
	//page object for submit button
	public static AndroidElement submit_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonproceed"));
		return element;
	}
	//page object for error message
	public static AndroidElement error_txt(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/errorText"));
		return element;
	}
	//page object for back button
	public static AndroidElement back_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Teno, Navigate up']"));
		return element;
	}

}
