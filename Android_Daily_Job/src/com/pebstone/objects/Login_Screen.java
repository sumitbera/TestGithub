package com.pebstone.objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

public class Login_Screen 
{
public static AndroidElement element = null;
	
	//page object for login button
	public static AndroidElement login_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonLogin"));
		return element;
	}
	//Page object for Teno logo
	public static AndroidElement app_logo(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/logo"));
		return element;
	}
	//Page object for text Teacher note
	public static AndroidElement teacher_note(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/teacherNote"));
		return element;
	}
	//Page object for student image
	public static AndroidElement student_logo(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.ImageView[@index='2']"));
		return element;
	}
}
