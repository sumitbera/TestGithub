package com.mindvalley.app.utility;

public interface Locators {
	
	public interface HomeScreen
	{
		String title = "selendroid-test-app";
		String myTextField = "io.selendroid.testapp:id/my_text_field";
		String appChromeBtn = "io.selendroid.testapp:id/buttonStartWebview";
		String exceptionBtn = "io.selendroid.testapp:id/exceptionTestButton";
		String displayBtn = "io.selendroid.testapp:id/visibleButtonTest";
		String message = "io.selendroid.testapp:id/visibleTextView";
		String exceptionMessage = "android:id/buttonPanel";
	
	}
	
	public interface CarSelection
	{
		String nameTextField = "//android.widget.EditText[@index='2']";
		String carSelection = "//android.widget.Spinner[@index='2']";
		String favouriteCarName = "//android.widget.CheckedTextView[@index='1']";
		String nameBtn = "Send me your name!";
		String userName = "Sumit";
	}

}
