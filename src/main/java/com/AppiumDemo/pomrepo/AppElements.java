package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppElements {

	public static WebDriver driver;	
	
	
	public AppElements(WebDriver driver) {
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
	
	@FindBy(id="com.nosh.list.NoshList:id/emailField")
	WebElement emailTextField;
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	@FindBy(id="com.nosh.list.NoshList:id/passwordField")
	WebElement passwordTextField;
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/getStartedButton")
	WebElement signInButton;
	
	public WebElement getSignInButton() {
		return signInButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/menuButton")
	WebElement menuButton;
	
	public WebElement getMenuButton() {
		return menuButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/logout_view")
	WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}
}
	
	
	