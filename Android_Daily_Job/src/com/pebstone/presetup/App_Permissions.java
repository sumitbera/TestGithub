package com.pebstone.presetup;

import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.android.AndroidDriver;

import com.pebstone.objects.Device_Permissions;

public class App_Permissions {
	
	public static AndroidDriver wd=null;

//Method for SMS permission	
public static void sms_permission()
{
	try
	{
		if(Device_Permissions.permission_dialog(wd).isDisplayed()==true)
		{
			Device_Permissions.allow_permission(wd).click();
			System.out.println("# SMS permission granted !!!");
		}
	}catch(NoSuchElementException e)
	{
		System.out.println("# No SMS permission requested...");
	}
}
//Method for contact permission
public static void contact_permission()
{
	try
	{
		if(Device_Permissions.permission_dialog(wd).isDisplayed()==true)
		{
			Device_Permissions.allow_permission(wd).click();
			System.out.println("# Contact permission granted !!!");
		}
	}catch(NoSuchElementException e)
	{
		System.out.println("# No Contact permission requested...");
	}
}
//Method for phone call permission
public static void phonecall_permission()
{
	try
	{
		if(Device_Permissions.permission_dialog(wd).isDisplayed()==true)
		{
			Device_Permissions.allow_permission(wd).click();
			System.out.println("# Phone call permission granted !!!");
		}
	}catch(NoSuchElementException e)
	{
		System.out.println("# No phone call permission requested...");
	}
}
//Method for Media and Photo access
public static void photo_permission()
{
	try
	{
		if(Device_Permissions.permission_dialog(wd).isDisplayed()==true)
		{
			Device_Permissions.allow_permission(wd).click();
			System.out.println("# Photo and Media permission granted !!!");
		}
	}catch(NoSuchElementException e)
	{
		System.out.println("# No Photo and Media permission requested...");
	}
	
}



}
