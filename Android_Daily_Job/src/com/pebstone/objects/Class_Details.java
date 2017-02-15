package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Class_Details {

	public static AndroidElement element =  null;
	

public static AndroidElement board_name(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/boardBtn"));
	return element;
}

public static AndroidElement board_menu(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/selectboard"));
	return element;
}

public static AndroidElement standard_detail(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/stdRow3C1"));
	return element;
}

public static AndroidElement division_detail(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/divRow"));
	return element;
}

public static AndroidElement save_details(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/proceed"));
	return element;
}

public static AndroidElement proceed_autojoin_btn(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/proceedAutoJoin"));
	return element;
}
	
}
