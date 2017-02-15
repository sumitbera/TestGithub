package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Group_Type 
{
		public static AndroidElement element = null;

	//page object for group name text field	
	public static AndroidElement group_name(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextcreategroup"));
		return element;
	}
	//page object for cancel button
	public static AndroidElement cancel_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonCancel"));
		return element;
	}
	//page object for Next button
	public static AndroidElement next_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonCreate"));
		return element;
	}
	//page object for open group radio button
	public static AndroidElement radiobtn_opengrp(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/radioOpenGroup"));
		return element;
	}
	//page object for private group radio button
	public static AndroidElement radiobtn_privategrp(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/radioPrivateGroup"));
		return element;
	}
	//page object for back button
	public static AndroidElement back(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonBack"));
		return element;
	}
	//page object for create button
	public static AndroidElement create_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonCreate2"));
		return element;
	}
	//page object for group PIN
	public static AndroidElement group_pin(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/textGroupPin"));
		return element;
	}
	//page object for Save button
	public static AndroidElement save_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonCreateTeacher"));
		return element;
	}
	//page object for submit group PIN
	public static AndroidElement submit_pin(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/edittextenterthepin"));
		return element;
	}
	//page object for create private group button
	public static AndroidElement proceed_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonproceed"));
		return element;
	}
	public static AndroidElement group_PIN_title(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/groupPinTitle"));
		return element;
	}
		
}
