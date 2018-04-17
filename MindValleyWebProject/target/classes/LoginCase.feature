#Author: sumit.bera@live.in
Feature: Test case to verify successful login and identify main dashboard of web page


 
Scenario: Login with invalid credentials anc check error message
	Given user is on Login Page 
	When user enters Invalid Username and Password
	|sumitbera31@gmail.com | Test@123| 
	And clicks on login button
	Then web page should display validation message 
	
 
Scenario: Login with valid credentials and verify main page
	Given user is on Login Page 
	When user enters valid username and password 
	|sumitbera31@gmail.com | Books@31|
	And clicks on login button
	Then  dashboard should be successfully
	And close the browser  
	
