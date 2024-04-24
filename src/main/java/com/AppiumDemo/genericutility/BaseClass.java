package com.AppiumDemo.genericutility;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;


public class BaseClass {
    public static AndroidDriver driver;
    public ScreenRecorderUtil recordingUtil = new ScreenRecorderUtil();    
    
    public AndroidDriver getDriver() {
		return driver;
	}
        	
    	    	
    	@Parameters({"device"})
    	@BeforeTest()
    	public void setup(String device) throws Exception {
    		   		
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),CapabilitiesReader.getDesiredCapabilities(device, "src\\test\\resources\\configuration.json"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
    	recordingUtil.startRecording(driver);
    	}
        	  
    	@AfterTest
    	public void postConditions() throws IOException {
    	
    	recordingUtil.stopRecording(driver);
    	driver.quit();
    	
    	}
}