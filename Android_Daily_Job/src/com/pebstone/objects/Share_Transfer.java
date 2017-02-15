package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Share_Transfer 
{
	public static AndroidElement element = null;

	
	public static AndroidElement new_owner(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/searchView"));
		return element;
	}
	
	public static AndroidElement warning_message(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/warningMessage"));
		return element;
	}
	
	public static AndroidElement done_button(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonYes"));
		return element;
	}
	
	public static AndroidElement cancel_button(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonCancel"));
		return element;
	}
	
}
