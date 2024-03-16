package com.AppiumDemo.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateParty {

	public static WebDriver driver;	
	
	
	public CreateParty(WebDriver driver) {
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
	WebElement signInButton;
	
	public WebElement getSignInButton() {
		synchronised(By.id("com.nosh.list.NoshList:id/getStartedButton"), signInButton);
		return signInButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/addNewButton")
	WebElement addPartyButton;
	
	public WebElement getAddPartyButton()  throws InterruptedException {
		Thread.sleep(4000);
		return addPartyButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/nameField")
	WebElement nameTextField;
	
	public WebElement getNameTextField() {
		synchronised(By.id("com.nosh.list.NoshList:id/nameField"), nameTextField);
		return nameTextField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/phoneField")
	WebElement phoneTextField;
	
	public WebElement getPhoneTextField() {
		synchronised(By.id("com.nosh.list.NoshList:id/phoneField"), phoneTextField);
		return phoneTextField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/email")
	WebElement emailTextField;
	
	public WebElement getEmailTextField() {
		synchronised(By.id("com.nosh.list.NoshList:id/email"), emailTextField);
		return emailTextField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/edit_notes")
	WebElement notesTextField;
	
	public WebElement getNotesTextField() {
		synchronised(By.id("com.nosh.list.NoshList:id/edit_notes"), notesTextField);
		return notesTextField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/size7more")
	WebElement sizeTextField;
	
	public WebElement getSizeTextField() {
		return sizeTextField;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/adult")
	WebElement adultSelectionButton;
	
	public WebElement getAdultSelectionButton() {
		return adultSelectionButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/child")
	WebElement childSelectionButton;
	
	public WebElement getChildSelectionButton() {
		return childSelectionButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/senior")
	WebElement seniorSelectionButton;
	
	public WebElement getSeniorSelectionButton() {
		return seniorSelectionButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/greenButton")
	WebElement greenButton;
	
	public WebElement getGreenButton() {
	return greenButton;	
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/addPartyButton")
	WebElement nextButton;
	
	public WebElement getNextButton() {
		return nextButton;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.nosh.list.NoshList:id/table_name\" and @text=\"16\"]")
	WebElement assignButton;
	
	public WebElement getAssignButton() {
		return assignButton;
	}
	
	@FindBy(id="com.nosh.list.NoshList:id/addPartyButton")
	WebElement addPartyButton1;
	
	public WebElement getAddPartyButton1() {
		return addPartyButton1;
	}
	
	
	@FindBy(id="com.nosh.list.NoshList:id/cancelButton")
	WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
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
	
	
	