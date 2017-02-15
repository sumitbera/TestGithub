package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Message_Screen 
{
	public static AndroidElement element = null;

	//page object for group name
	public static AndroidElement msg_group_name(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/grpName"));
		return element;
	}
	//page object for no. of subscribers in group
	public static AndroidElement subscribers(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		return element;
	}
	//page object for message box
	public static AndroidElement msg_box(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/enter_message"));
		return element;
	}
	//page object for send message button
	public static AndroidElement sendmsg_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/send_button"));
		return element;
	}
	//page object for attachment option
	public static AndroidElement attachment_icon(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/attachBtn"));
		return element;
	}
	//page object for send attachment button
	public static AndroidElement sendattach_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/send_attachment_btn"));
		return element;
	}
	//page object for delete attachment button
	public static AndroidElement delete_attach(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/deleteAtt"));
		return element;
	}
	//page object for chat message
	public static AndroidElement chat_msg(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/chatMsg"));
		return element;
	}
	//page object for Message box layout
	public static AndroidElement chatbox_layout(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/lay_message"));
		return element;
	}
	//page object for Message blocker
	public static AndroidElement message_blocker(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@index='0']"));
		return element;
	}
	//page object for no subscribers
	public static AndroidElement no_subscribers(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/no_parents_students"));
		return element;
	}
	//page object for no subscribers
	public static AndroidElement wait_message(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/parentStudentHear"));
		return element;
	}

}
