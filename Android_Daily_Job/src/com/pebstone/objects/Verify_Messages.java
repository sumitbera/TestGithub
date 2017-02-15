package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Verify_Messages 
{
	public static AndroidElement element = null;
	
	//page object of received message
		public static AndroidElement received_message(AndroidDriver wd)
		{
			element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/chatMsg"));
			return element;
		}
}
