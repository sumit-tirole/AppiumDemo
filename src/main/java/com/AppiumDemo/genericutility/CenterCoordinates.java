package com.AppiumDemo.genericutility;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CenterCoordinates {
	
	public static Point getCenterCoordinates(WebDriver driver, WebElement element) {
        // Get the location of the element
        Point elementLocation = element.getLocation();

        // Get the size of the element
        int elementWidth = element.getSize().getWidth();
        int elementHeight = element.getSize().getHeight();

        // Calculate the center coordinates
        int centerX = elementLocation.getX() + elementWidth / 2;
        int centerY = elementLocation.getY() + elementHeight / 2;

        // Return the center coordinates
        return new Point(centerX, centerY);
    }
}
