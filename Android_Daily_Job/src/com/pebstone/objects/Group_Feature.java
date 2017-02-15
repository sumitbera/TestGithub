package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Group_Feature 
{
	public static AndroidElement element = null;
	
	//page object for group info in list view
	public static AndroidElement group_info(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Show group info"));
		return element;
	}
	//page object for transfer group in list view
	public static AndroidElement transfer_group(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Transfer Group"));
		return element;
	}
	//page object for share group in list view
	public static AndroidElement share_group(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Share Group"));
		return element;
	}
	//page object for unsubscribe group in list view
	public static AndroidElement unsubscribe_group(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Unsubscribe Group"));
		return element;
	}
	//page object for auto reply in list view
	public static AndroidElement allow_reply(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Allow reply"));
		return element;
	}
	//page object for block reply in list view
	public static AndroidElement block_reply(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Block reply"));
		return element;
	}
	//page obect for group owners
	public static AndroidElement group_owners(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/groupOwners"));
		return element;
	}
	//page object for Unsubscribe group YES button
	public static AndroidElement yes_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonYes"));
		return element;
	}
	//page object for Unsubscribe group NO button
	public static AndroidElement no_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonNo"));
		return element;
	}
	//page object for Allow reply status
	public static AndroidElement allow_reply_status(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/allowReplyStatusLayout"));
		return element;
	}
	//page object for subscribers in profile
	public static AndroidElement subscribers(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/textViewSubscribers"));
		return element;
	}
}
