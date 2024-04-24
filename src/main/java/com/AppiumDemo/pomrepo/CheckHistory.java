package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckHistory {
	
public static WebDriver driver;	
	
	
	public CheckHistory(WebDriver driver) {
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
	
		
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/lblListHeader\"]")
	WebElement showHistoryButton;

	public WebElement getShowHistoryButton() {
		synchronised(By.xpath("//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/lblListHeader\"]"), showHistoryButton);
		return showHistoryButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/history_filter")
	WebElement historyFilterButton;

	public WebElement getHistoryFilterButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/history_filter"), historyFilterButton);
		return historyFilterButton;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Served\"]")
	WebElement servedFilter;
	
	public WebElement getServedFilter() {
		synchronised(By.xpath("//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Served\"]"), servedFilter);
		return servedFilter;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Removed\"]")
	WebElement removedFilter;
		
	public WebElement getRemovedFilter() {
		synchronised(By.xpath("//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Removed\"]"), removedFilter);
		return removedFilter;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Requests\"]")
	WebElement requestsFilter;

	public WebElement getRequestsFilter() {
		synchronised(By.xpath("//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"Requests\"]"), requestsFilter);
		return requestsFilter;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"All\"]")
	WebElement allFilter;
		
	public WebElement getAllFilter() {
		synchronised(By.xpath("//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/titleText\" and @text=\"All\"]"), allFilter);
		return allFilter;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.nosh.list.NoshList:id/notify_inside']")
	WebElement checkStatus;
		
	public WebElement getCheckStatus() {
		synchronised(By.xpath("//android.widget.TextView[@resource-id='com.nosh.list.NoshList:id/notify_inside']"), checkStatus);
		return checkStatus;
	}
	
	
	
}
