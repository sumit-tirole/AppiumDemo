package com.AppiumDemo.genericutility;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollToElement {
	
	public static void scroll(AndroidDriver driver,String mobileElementName,String scrollViewId) {
	
		WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).resourceIdMatches(\".*" + scrollViewId + "\")).scrollIntoView(new UiSelector().text(\"" + mobileElementName + "\"))"));
	
	}
	
	}
