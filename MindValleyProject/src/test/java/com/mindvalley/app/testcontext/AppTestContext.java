package com.mindvalley.app.testcontext;

import com.mindvalley.app.objectManager.PageObjectManager;
import com.mindvalley.app.utility.InitialSetup;

public class AppTestContext {

	private PageObjectManager objectManager;
	
	public AppTestContext()
	{
		objectManager = new PageObjectManager(InitialSetup.getInstance().getAndroidDriver());
	}
	
	public PageObjectManager getPageObjectManager()
	{
		return objectManager;
	}
}
