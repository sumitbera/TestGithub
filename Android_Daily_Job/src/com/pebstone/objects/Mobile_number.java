package com.pebstone.objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

public class Mobile_number {

	public static AndroidElement element = null;

//page object for back button
public static AndroidElement back_btn(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("android:id/home"));
	return element;
}
//page object for help text "Enter country code and mobile number"
public static AndroidElement mobileno_note(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/otp_enter_mob"));
	return element;
}
//page object for country code
public static AndroidElement country_code(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/otp_country_code"));
	return element;
}
//page object for mobile number
public static AndroidElement mobile_no(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/otp_ten_digit_no"));
	return element;
}
//page object for submit button
public static AndroidElement submit_btn(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonprocesregister"));
	return element;
}
//page object for footer text
public static AndroidElement bottom_note(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='We do not spam, your number is secure with us']"));
	return element;
}
//page object for support text
public static AndroidElement support_text(AndroidDriver wd)
{
	element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='Having trouble using Teno. Reach us at support@tenoapp.com']"));
	return element;
}
	
}
