package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveParty {

	public static WebDriver driver;	
	
	
	public RemoveParty(WebDriver driver) {
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
	
	@FindBy(xpath="//android.widget.TextView[@text='John']")
	WebElement waitlistParty;
	
	public WebElement getWaitListParty() {
		synchronised(By.xpath("//android.widget.TextView[@text='John']"),waitlistParty);
		return waitlistParty;
	}

	@FindBy(id="com.nosh.list.NoshList:id/titleText")
	WebElement waitingPartyName;
	
	public WebElement getWaitingPartyName() {
		synchronised(By.id("com.nosh.list.NoshList:id/titleText"),waitingPartyName);
		return waitingPartyName;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/removeButton")
	WebElement removeButton;
	
	public WebElement getRemoveButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/removeButton"),removeButton);
		return removeButton;
	}
	
	@FindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
	WebElement confirmRemove;
	
	public WebElement getConfirmButton() {
		synchronised(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"),confirmRemove);
		return confirmRemove;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/parent_layout")
	WebElement showHistoryButton;
	
	public WebElement getShowHistoryButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/parent_layout"),showHistoryButton);
		return showHistoryButton;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='John']/following-sibling::android.widget.TextView[contains(@text,'removed')]")
	WebElement checkRemovedStatus;
	
	public WebElement getCheckRemovedStatus() {
		synchronised(By.xpath("//android.widget.TextView[@text='John']/following-sibling::android.widget.TextView[contains(@text,'removed')]"),checkRemovedStatus);
		return checkRemovedStatus;
	}
}
	
	
	