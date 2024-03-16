package com.AppiumDemo.genericutility;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;


public class BaseClass {
    public static AndroidDriver driver;
    public ScreenRecorderUtil recordingUtil = new ScreenRecorderUtil();    
    
    public AndroidDriver getDriver() {
		return driver;
	}
        	
    	@Parameters({"device"})
    	@BeforeMethod()
    	public void setup(String device) throws Exception {
    		   		
    	driver = new AndroidDriver(new URL("http://192.168.3.57:4723"),CapabilitiesReader.getDesiredCapabilities(device, "src\\test\\resources\\configuration.json"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
    	recordingUtil.startRecording(driver);
    	}
        	  
    	@AfterMethod
    	public void postConditions() throws IOException {
    	
    	recordingUtil.stopRecording(driver);
    	driver.quit();    	   
    	}
}