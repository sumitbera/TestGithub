package com.mindvalley.app.dataProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.mindvalley.app.utility.Constants;
import com.mindvalley.app.utility.InitialSetup;

public class ConfigFileReader 
{
	Properties propertyFile = ConfigFileReader.getPropertyFile(Constants.APPDETAILS.propertyFile);
	
	public static Properties getPropertyFile(String propFile)
	{
		 Properties properties = new Properties();
		 InputStream resourceAsStream = InitialSetup.class.getClassLoader().getResourceAsStream(propFile);
		 if(resourceAsStream!=null){
		 try {
		 		properties.load(resourceAsStream);
		 	 } catch (IOException e) {
		 e.printStackTrace();
		 	}
		 }
		 		return properties;
	}
}
