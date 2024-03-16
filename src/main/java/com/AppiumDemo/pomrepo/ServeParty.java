package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServeParty {

	public static WebDriver driver;	
	
	
	public ServeParty(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void synchronised(By locator, WebElement element)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(element));	
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
	
	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id="com.nosh.list.NoshList:id/linLayoutCheckoff")
	WebElement reAddButton;
	
	public WebElement getReAddButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/linLayoutCheckoff"), reAddButton);
		return reAddButton;
	}
	
	@FindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
	WebElement confirmReAdd;
	
	public WebElement getConfirmReAdd() {
		synchronised(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"), confirmReAdd);
		return confirmReAdd;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/linLayoutCheckoff")
	WebElement checkOffButton;
	
	public WebElement getCheckOffButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/linLayoutCheckoff"), checkOffButton);
		return checkOffButton;
	}
	
	@FindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
	WebElement confirmCheckOff;
	
	public WebElement getConfirmCheckOff() {
		synchronised(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"), confirmCheckOff);
		return confirmCheckOff;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='John']/following-sibling::android.widget.TextView[contains(@text,'served')]")
	WebElement checkServedStatus;
	
	public WebElement getCheckServedStatus() {
		synchronised(By.xpath("//android.widget.TextView[@text='John']/following-sibling::android.widget.TextView[contains(@text,'served')]"),checkServedStatus);
		return checkServedStatus;
	}
}
	
	
	