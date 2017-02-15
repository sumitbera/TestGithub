package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OTP_screen 
{
		public static AndroidElement element = null;
		
		//page object for help text defining on which number OTP is sent
		public static AndroidElement verf_note(AndroidDriver wd)
		{
			element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/otp_veri_text"));
			return element;
		}
		//page object for OTP text field
		public static AndroidElement otp_field(AndroidDriver wd)
		{
			element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/otp_four_digit_code"));
			return element;
		}
		//page object for submit button
		public static AndroidElement submit_btn(AndroidDriver wd)
		{
			element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonSubmit"));
			return element;
		}
		//page object for resend OTP link
		public static AndroidElement resend_code(AndroidDriver wd)
		{
			element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/reSendCode"));
			return element;
		}
		//page object for error message
		public static AndroidElement error_msg(AndroidDriver wd)
		{
			element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/invalidmobile"));
			return element;
		}
}
