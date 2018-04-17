$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/feature/TestCase.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: sumit.bera@live.in"
    }
  ],
  "line": 4,
  "name": "To Test the car selection and capture app crash",
  "description": "",
  "id": "to-test-the-car-selection-and-capture-app-crash",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16855646994,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Scenario to verify my name after car selection",
  "description": "",
  "id": "to-test-the-car-selection-and-capture-app-crash;scenario-to-verify-my-name-after-car-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the user is on the home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user taps on Chrome icon",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters their own name",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "selects their favourite car",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "tap on send me your name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "your name and car is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_is_on_the_home_screen()"
});
formatter.result({
  "duration": 597593551,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_taps_on_Chrome_icon()"
});
formatter.result({
  "duration": 1335255310,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_their_own_name()"
});
formatter.result({
  "duration": 22999468311,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.selects_their_favourite_car()"
});
formatter.result({
  "duration": 1895767288,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.tap_on_send_me_your_name()"
});
formatter.result({
  "duration": 819265440,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.your_name_and_car_is_displayed()"
});
formatter.result({
  "duration": 768181410,
  "status": "passed"
});
formatter.after({
  "duration": 141133,
  "status": "passed"
});
formatter.before({
  "duration": 384908,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Scenario to verify expections and logs",
  "description": "",
  "id": "to-test-the-car-selection-and-capture-app-crash;scenario-to-verify-expections-and-logs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "the user is on the home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the user enters name in text field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "click display text view",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "it should display visual message",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on throw unhandled exception",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "verify the app crashes",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_is_on_the_home_screen()"
});
formatter.result({
  "duration": 616298054,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_enters_name_in_text_field()"
});
formatter.result({
  "duration": 6607384085,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_display_text_view()"
});
formatter.result({
  "duration": 287619546,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_should_display_visual_message()"
});
formatter.result({
  "duration": 567405434,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_throw_unhandled_exception()"
});
formatter.result({
  "duration": 278896494,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_the_app_crashes()"
});
formatter.result({
  "duration": 5222094260,
  "error_message": "org.openqa.selenium.WebDriverException: Not yet implemented. Please help us: http://appium.io/get-involved.html (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10 milliseconds\nBuild info: version: \u00272.50.1\u0027, revision: \u0027d7fc91b29de65b790abb01f3ac5f7ea2191c88a7\u0027, time: \u00272016-01-29 11:11:26\u0027\nSystem info: host: \u0027Sumit-PC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{app\u003dD:\\workspace\\MindValleyProject\\app\\testApp.apk, appPackage\u003dio.selendroid.testapp, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003dTA38501TF4, platform\u003dLINUX, appActivity\u003dio.selendroid.testapp.HomeScreenActivity, desired\u003d{app\u003dD:\\workspace\\MindValleyProject\\app\\testApp.apk, appPackage\u003dio.selendroid.testapp, appActivity\u003dio.selendroid.testapp.HomeScreenActivity, platformVersion\u003d6.0, browserName\u003d, platformName\u003dAndroid, deviceName\u003dTA38501TF4}, platformVersion\u003d6.0, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, browserName\u003d, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dAndroid}]\nSession ID: ce7913d5-1a01-4d97-87ff-b1d95d7c5937\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:206)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:1047)\r\n\tat com.mindvalley.app.pageObjects.HomeScreen.verifyCrashErrorMessage(HomeScreen.java:129)\r\n\tat com.mindvalley.app.stepDefination.StepDefinition.verify_the_app_crashes(StepDefinition.java:94)\r\n\tat ✽.Then verify the app crashes(src/main/feature/TestCase.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 95971,
  "status": "passed"
});
});