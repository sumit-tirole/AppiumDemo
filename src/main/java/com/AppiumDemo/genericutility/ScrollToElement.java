package com.AppiumDemo.genericutility;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollToElement {
	
	public static void scroll(AndroidDriver driver,String MobileElementName) {
	
	WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+
																		".scrollIntoView(new UiSelector().text(\""+ MobileElementName +"\"))"));
	}
	
	}
