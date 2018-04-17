package com.mindvalley.app.objectManager;

import io.appium.java_client.android.AndroidDriver;

import com.mindvalley.app.pageObjects.CarSelection;
import com.mindvalley.app.pageObjects.HomeScreen;
import com.mindvalley.app.utility.InitialSetup;

public class PageObjectManager 
{
	AndroidDriver androidDriver;
	HomeScreen homeScreen;
	CarSelection carSelectionScreen;
	
	public PageObjectManager(AndroidDriver androidDriver)
	{
		this.androidDriver = androidDriver;
	}
	
	public HomeScreen getHomeScreen()
	{
		return (homeScreen == null) ? new HomeScreen(InitialSetup.getInstance().getAndroidDriver()) : homeScreen;
	}
	
	public CarSelection getCarSelection()
	{
		return (carSelectionScreen == null) ? new CarSelection(InitialSetup.getInstance().getAndroidDriver()) : carSelectionScreen;
	}
}
