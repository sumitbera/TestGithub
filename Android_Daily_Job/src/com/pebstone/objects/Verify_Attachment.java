package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Verify_Attachment {

	public static AndroidElement element = null;
	
	//page object of received PDF
	public static AndroidElement received_PDF(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='text_pdf.pdf']"));
		return element;
	}
	//page object of received XLS
	public static AndroidElement received_XLS(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='test_excel.xls']"));
		return element;
	}
	//page object of received PPT
	public static AndroidElement received_PPT(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='test_ppt.ppt']"));
		return element;
	}
	//page object of received DOC
	public static AndroidElement received_DOC(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.xpath("//android.widget.TextView[@text='text_doc.doc']"));
		return element;
	}
	//page object for download button
	public static AndroidElement download_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/iconArrow"));
		return element;
	}
}
