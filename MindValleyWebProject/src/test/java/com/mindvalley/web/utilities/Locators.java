package com.mindvalley.web.utilities;

public interface Locators {
	
	public interface HomeScreen
	{
		String login = "//a[@href='http://www.booknest.in/login']";
	}
	
	public interface LoginScreen
	{
		String emailId = "//input[@id='input-email']";
		String password = "//input[@id='input-password']";
		String login = "//input[@type='submit']";
		String errorAlert = "//div[@class='alert alert-danger']";
	}
	
	public interface MainScreen
	{
		String orderLink = "//h2[contains(., 'My Orders')]";
	}

}
