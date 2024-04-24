package com.AppiumDemo.genericutility;


	
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;

public class Utility {

	
	public void performSwipe(AndroidDriver driver,WebElement frameElement, int numberOfTimes) {
		
		Dimension viewportSize = driver.manage().window().getSize();
        int viewportWidth = viewportSize.getWidth();
        int viewportHeight = viewportSize.getHeight();

        // Get frame location and size
        Point frameLocation = frameElement.getLocation();
        Dimension frameSize = frameElement.getSize();
        int frameX = frameLocation.getX();
        int frameY = frameLocation.getY();
        int frameWidth = frameSize.getWidth();
        int frameHeight = frameSize.getHeight();

        // Calculate start and end points for the scroll within the frame
        int startX = frameX + frameWidth / 2;
        int startY = frameY + frameHeight * 2 / 5; // Starting from 80% down
        int endX = startX;
        int endY = frameY + frameHeight * 1 / 5;   // Scrolling to 20% down

		
		for(int i=0; i< numberOfTimes; i++) {
		final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point start = new Point(startX, startY);
        Point end = new Point (endX, endY);
        Sequence swipe = new Sequence(finger,1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(500),
            PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		}
	}
	
	
}
