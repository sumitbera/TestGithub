$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/feature/LoginCase.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: sumit.bera@live.in"
    }
  ],
  "line": 2,
  "name": "Test case to verify successful login and identify main dashboard of web page",
  "description": "",
  "id": "test-case-to-verify-successful-login-and-identify-main-dashboard-of-web-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6678062513,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login with invalid credentials anc check error message",
  "description": "",
  "id": "test-case-to-verify-successful-login-and-identify-main-dashboard-of-web-page;login-with-invalid-credentials-anc-check-error-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters Invalid Username and Password",
  "rows": [
    {
      "cells": [
        "sumitbera31@gmail.com",
        "Test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "web page should display validation message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 2601179675,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_Invalid_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 150996896,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 451193690,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.web_page_should_display_validation_message()"
});
formatter.result({
  "duration": 25190363,
  "status": "passed"
});
formatter.after({
  "duration": 55484,
  "status": "passed"
});
formatter.before({
  "duration": 146890,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login with valid credentials and verify main page",
  "description": "",
  "id": "test-case-to-verify-successful-login-and-identify-main-dashboard-of-web-page;login-with-valid-credentials-and-verify-main-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enters valid username and password",
  "rows": [
    {
      "cells": [
        "sumitbera31@gmail.com",
        "Books@31"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "dashboard should be successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 2348847875,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 157019710,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 318861775,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.dashboard_should_be_successfully()"
});
formatter.result({
  "duration": 46195002,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 579230835,
  "status": "passed"
});
formatter.after({
  "duration": 54843,
  "status": "passed"
});
});