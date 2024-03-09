package com.AppiumDemo.genericutility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;


public class BaseClass {
    public AndroidDriver driver;
        
    public AndroidDriver getDriver() {
		return driver;
	}
    	@Parameters({"device"})
    	@BeforeMethod()
    	public void setup(String device) throws Exception {
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),CapabilitiesReader.getDesiredCapabilities(device, "src\\test\\resources\\configuration.json"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
    	}
        	  
    	@AfterMethod
    	public void teardown() {
    	driver.quit();
    	
    	}
}