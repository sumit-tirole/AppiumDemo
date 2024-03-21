package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customization {

public static WebDriver driver;	
	
	
	public Customization(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void synchronised(By locator, WebElement element)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		wait.until(ExpectedConditions.elementToBeClickable(element));	
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
		
	@FindBy(id="com.nosh.list.NoshList:id/customizationLayout")
	WebElement customizationButton;

	public WebElement getCustomizationButton() {
		return customizationButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/adding_customers_layout")
	WebElement addingCustomersButton;

	public WebElement getAddingCustomersButton() {
		return addingCustomersButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/phoneToggleButton")
	WebElement phoneToggleButton;

	public WebElement getPhoneToggleButton() {
		return phoneToggleButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/emailToggleButton")
	WebElement emailToggleButton;

	public WebElement getEmailToggleButton() {
		return emailToggleButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/statusToggleButton")
	WebElement statusToggleButton;

	public WebElement getStatusToggleButton() {
		return statusToggleButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/notesToggleButton")
	WebElement notesToggleButton;

	public WebElement getNotesToggleButton() {
		return notesToggleButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/partySizeToggleButton")
	WebElement partySizeToggleButton;

	public WebElement getPartySizeToggleButton() {
		return partySizeToggleButton;
	}
	
	
}
