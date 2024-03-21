package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {
	
	
public static WebDriver driver;	
	
	
	public Signup(WebDriver driver) {
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
	
	@FindBy(id="com.nosh.list.NoshList:id/leftSegment2")
	WebElement signupButton;

	public WebElement getSignupButton() {
		return signupButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/manual_info")
	WebElement enterManuallyButton;

	public WebElement getEnterManuallyButton() {
		return enterManuallyButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessName")
	WebElement businessNameField;


	public WebElement getBusinessNameField() {
		return businessNameField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessPhone")
	WebElement businessPhoneField;

	public WebElement getBusinessPhoneField() {
		return businessPhoneField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessAddress")
	WebElement businessAddressField;

	public WebElement getBusinessAddressField() {
		return businessAddressField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessCity")
	WebElement businessCityField;

	public WebElement getBusinessCityField() {
		return businessCityField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessZip")
	WebElement businessZipField;

	public WebElement getBusinessZipField() {
		return businessZipField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessWebsite")
	WebElement businessWebsite;

	public WebElement getBusinessWebsite() {
		return businessWebsite;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessIndustryInfo")
	WebElement businessInfo;


	public WebElement getBusinessInfo() {
		return businessInfo;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Entertainment\"]")
	WebElement entertainmentBusiness;
		
	public WebElement getEntertainmentBusiness() {
		return entertainmentBusiness;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/businessTimezone")
	WebElement businessTimezone;
	
	public WebElement getBusinessTimezone() {
		return businessTimezone;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Europe/London (GMT+00:00)\"]")
	WebElement londonTimezone;

	public WebElement getLondonTimezone() {
		return londonTimezone;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/create_account")
	WebElement saveBusinessButton;

	public WebElement getSaveBusinessButton() {
		return saveBusinessButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/firstNameField")
	WebElement firstNameField;
		
	public WebElement getFirstNameField() {
		return firstNameField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/lastNameField")
	WebElement lastNameField;


	public WebElement getLastNameField() {
		return lastNameField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/emailField")
	WebElement emailField;

	public WebElement getEmailField() {
		return emailField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/passwordField")
	WebElement passwordField;
		
	public WebElement getPasswordField() {
		return passwordField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/confirmPasswordField")
	WebElement confirmPasswordField;

	public WebElement getConfirmPasswordField() {
		return confirmPasswordField;
	}

	
	
}
