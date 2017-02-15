package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Add_Child {
	
	public static AndroidElement element = null;
	
public static AndroidElement first_child_fname(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/addChildEditText1"));
	return element;
}

public static AndroidElement first_child_lname(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/addChildLastNameEditText1"));
	return element;
}

public static AndroidElement start_button(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonstart"));
	return element;
}

}
