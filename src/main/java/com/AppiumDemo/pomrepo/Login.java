package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static WebDriver driver;
	
	public Login(WebDriver driver) {
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
	
	@FindBy(id="com.nosh.list.NoshList:id/rightSegment2")
	WebElement signInButton;
	
	
	public WebElement getSignInButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/rightSegment2"), signInButton);
		return signInButton;
	}

	@FindBy(id="com.nosh.list.NoshList:id/emailField")
	WebElement LoginEmailTextField;
	
	public WebElement getLoginEmailTextField() {
		synchronised(By.id("com.nosh.list.NoshList:id/emailField"), LoginEmailTextField);
		return LoginEmailTextField;
	}

	@FindBy(id="com.nosh.list.NoshList:id/passwordField")
	WebElement passwordTextField;
	
	public WebElement getPasswordTextField() {
		synchronised(By.id("com.nosh.list.NoshList:id/passwordField"), passwordTextField);
		return passwordTextField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/getStartedButton")
	WebElement signInButton1;
	
	public WebElement getSignInButton1() {
		synchronised(By.id("com.nosh.list.NoshList:id/getStartedButton"), signInButton1);
		return signInButton1;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/menuButton")
	WebElement menuButton;
	
	public WebElement getMenuButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/menuButton"), menuButton);
		return menuButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/logout_view")
	WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/logout_view"), logoutButton);
		return logoutButton;
	}
}
