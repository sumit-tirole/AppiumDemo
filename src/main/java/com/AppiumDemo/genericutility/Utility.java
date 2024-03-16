package com.AppiumDemo.genericutility;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;

public class Utility {

	
	public void performSwipe(AndroidDriver driver,int startx,int starty, int endx, int endy, int numberOfTimes) {
		
		for(int i=0; i< numberOfTimes; i++) {
		final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point start = new Point(startx, starty);
        Point end = new Point (endx, endy);
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
