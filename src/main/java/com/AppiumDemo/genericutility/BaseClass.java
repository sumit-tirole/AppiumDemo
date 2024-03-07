package com.AppiumDemo.genericutility;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.time.Duration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class BaseClass {
	public static AndroidDriver driver;
	FileUtility fileUtils = new FileUtility();
	ScreenRecorderUtil screenRecord = new ScreenRecorderUtil();	
	
	public static AndroidDriver getDriver() {
		return driver;
	}

	// Executing before test
	@BeforeMethod
	public void preConditions() throws Throwable{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:deviceName", fileUtils.getCapability("appium.deviceName"));
        cap.setCapability("appium:udid", fileUtils.getCapability("appium.udid"));
        cap.setCapability("platformName", fileUtils.getCapability("platformName"));
        cap.setCapability("appium:platformVersion", fileUtils.getCapability("appium.platformVersion"));
        cap.setCapability("appium:automationName", fileUtils.getCapability("appium.automationName"));
        cap.setCapability("appium:appPackage", fileUtils.getCapability("appium.appPackage"));
        cap.setCapability("appium:appActivity", fileUtils.getCapability("appium.appActivity"));
        cap.setCapability("recordVideo", true);
                
        URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url,cap);
		screenRecord.startRecording(driver);
		driver.startRecordingScreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
		
	//Executing after test
	@AfterMethod
	public void postConditions() throws IOException {
		screenRecord.stopRecording(driver);
		
}

}