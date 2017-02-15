package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Device_Permissions {
	
	public static AndroidElement element;
	
//page object for permission dialogue alert
public static AndroidElement permission_dialog(AndroidDriver wd)
{
	element= (AndroidElement) Initialsetup.wd.findElement(By.id("com.android.packageinstaller:id/dialog_container"));
	return element;
}
//page object for allow permission button
public static AndroidElement allow_permission(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
	return element;
}
//page object for deny permission button
public static AndroidElement deny_permission(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.android.packageinstaller:id/permission_deny_button"));
	return element;
}
//page object for sms permission text on alert message
public static AndroidElement sms_permission_text(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.name("Allow Teno to send and view SMS messages?"));
	return element;
}
}
