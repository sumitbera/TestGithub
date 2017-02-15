package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Subscribedgroup_List 
{
		public static AndroidElement element = null;
	
	//page object for Teno support group	
	public static AndroidElement teno_support(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Teno Support"));
		return element;
	}
	//page object for screen title
	public static AndroidElement screen_title(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("android:id/action_bar_title"));
		return element;
	}
	//page object for create group button on home screen
	public static AndroidElement creategroup_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonCreateNewGroup"));
		return element;
	}
	//page object for more options
	public static AndroidElement more_option(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("More options"));
		return element;
	}
	//page object for subscribe group option in list view
	public static AndroidElement subscribegroup_list(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Subscribe groups"));
		return element;
	}
	//page object for show all group
	public static AndroidElement show_all_group(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Show all groups"));
		return element;
	}
	//page object for profile option in list view
	public static AndroidElement profile(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Profile"));
		return element;
	}
	//page object for message count for All parents
	public static AndroidElement message_count_allparent(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='All Parents']"));
		return element;
	}
	//page object for message count for All students
	public static AndroidElement message_count_allstudent(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='All Students']"));
		return element;
	}
	//page object for subscribe group list next button
	public static AndroidElement NEXT_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/subscription_list_next_button"));
		return element;
	}
	//page object for create group button on group list
	public static AndroidElement create_new_group(AndroidDriver wd)
	{
		//element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonCreateNewGroup"));
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/baseFloatingActionButton"));
		return element;
	}
}
