package com.mindvalley.web.testcontext;

import com.mindvalley.web.objectManager.PageObjectManager;
import com.mindvalley.web.utilities.InitialSetup;


public class WebTestContext {

	private PageObjectManager objectManager;
	
	public WebTestContext()
	{
		objectManager = new PageObjectManager(InitialSetup.getInstance().getWebDriver());
	}
	
	public PageObjectManager getPageObjectManager()
	{
		return objectManager;
	}
}
