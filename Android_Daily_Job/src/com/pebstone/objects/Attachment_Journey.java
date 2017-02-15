package com.pebstone.objects;

import org.openqa.selenium.By;

import com.pebstone.presetup.Initialsetup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Attachment_Journey 
{
	public static AndroidElement element = null;
	
	//page object for My files
	public static AndroidElement my_files(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("My Files"));
		return element;
	}
	//page object for Test Data folder
	public static AndroidElement data_folder(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Test_Data"));
		return element;
	}
	//page object for doc file
	public static AndroidElement doc_file(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("text_doc.doc"));
		return element;
	}
	//page object for ppt file
	public static AndroidElement ppt_file(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("test_ppt.ppt"));
		return element;
	}
	//page object for xls file
	public static AndroidElement xls_file(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("test_excel.xls"));
		return element;
	}
	//page object for pdf file
	public static AndroidElement pdf_file(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("text_pdf.pdf"));
		return element;
	}
	//page object for png file
	public static AndroidElement png_image(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("BVT.PNG"));
		return element;
	}
	//page object for heavy image
	public static AndroidElement heavy_image(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("image_8MB.png"));
		return element;
	}
	//page object for invalid file
	public static AndroidElement invalid_file(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("teno_production.apk"));
		return element;
	}
	//page object for done button
	public static AndroidElement done_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Done"));
		return element;
	}
	//page object for OK button
	public static AndroidElement ok_btn(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.id("com.pebstone.teno:id/buttonOk"));
		return element;
	}
	//page object for invalid attachment message
	public static AndroidElement invalid_file_message(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Only files with following extensions are allowed: .doc, .docx, .xls, .xlsx, .pdf,  .pptx"));
		return element;
	}
	//page object object for exceed file limit
	public static AndroidElement exceed_file_size(AndroidDriver wd)
	{
		element = (AndroidElement) Initialsetup.wd.findElement(By.name("Select a file size less than 5MB"));
		return element;
	}
}
