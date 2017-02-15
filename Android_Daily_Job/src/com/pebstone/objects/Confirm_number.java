package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Confirm_number 
{
	public static AndroidElement element = null;
	
	//page object for text in Pop up
	public static AndroidElement popup_txt(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView"));
		return element;
	}
	//page object for Edit button
	public static AndroidElement edit_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElementByName("Edit number");
		return element;
	}
	//page object for OK button
	public static AndroidElement ok_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElementByName("OK");
		return element;
	}	
}
