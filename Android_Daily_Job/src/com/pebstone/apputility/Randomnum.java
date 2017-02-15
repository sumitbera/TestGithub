package com.pebstone.apputility;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Randomnum 
{
	 public static String randomnum()

	 {
		 Random rand = new Random();

		 String phone_no = "1";
		 for(int i = 1;i<10;i++ )
		 {
			 phone_no = phone_no + Integer.toString(rand.nextInt(10));

		 }
	 return  phone_no ;
	 }
	 
	 public static  String randomchar() {

		 int stringLength = 16;

		 return RandomStringUtils.randomAlphabetic(stringLength);

		 }
	 public static String randomchildname()
	 {
		int child_name = 5;
		return RandomStringUtils.randomAlphabetic(child_name);	 
	 }
	 
	 //creating random firstname
	 public static String random_fname()
	 {
		 int first_name = 3;
		 return RandomStringUtils.randomAlphabetic(first_name);
	 }
	 
	 //creating random lastname
	 public static String random_lname()
	 {
		 int last_name = 3;
		 return RandomStringUtils.randomAlphabetic(last_name);
	 }

}
