package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Select_Child 
{
	public static AndroidElement element=null;
	
public static AndroidElement first_child(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/checkBox1"));
	return element;
}

public static AndroidElement second_child(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/checkBox2"));
	return element;
}

}
