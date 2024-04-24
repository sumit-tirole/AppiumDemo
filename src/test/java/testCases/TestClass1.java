package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AppiumDemo.genericutility.BaseClass;
import com.AppiumDemo.genericutility.FileUtility;
import com.AppiumDemo.genericutility.ScrollToElement;
import com.AppiumDemo.genericutility.Utility;
import com.AppiumDemo.pomrepo.CheckHistory;
import com.AppiumDemo.pomrepo.CreateParty;
import com.AppiumDemo.pomrepo.Customization;
import com.AppiumDemo.pomrepo.Login;
import com.AppiumDemo.pomrepo.RemoveParty;
import com.AppiumDemo.pomrepo.ServeParty;
import com.AppiumDemo.pomrepo.Signup;

import io.appium.java_client.AppiumBy;



public class TestClass1 extends BaseClass {
	FileUtility fileUtils = new FileUtility();
	Utility util = new Utility();			
	public Logger log = LogManager.getLogger(TestClass1.class);
	
	
	
	
	@Test(priority=0,enabled=true)
	public void signupScenario() throws Throwable {
		Signup element = new Signup(driver);
		element.getSignupButton().click();
		element.getEnterManuallyButton().click();
		element.getBusinessNameField().sendKeys("Abc entertainment ltd.");
		element.getBusinessPhoneField().sendKeys("1234567890");
		element.getBusinessAddressField().sendKeys("9369 Park Avenue");
		element.getBusinessCityField().sendKeys("London");
		element.getBusinessZipField().sendKeys("SE32 6FV");
		element.getBusinessWebsite().sendKeys("Abc@xyz.com");
		element.getBusinessInfo().click();
		element.getEntertainmentBusiness().click();
		element.getBusinessTimezone().click();
		ScrollToElement.scroll(driver, "Europe/London (GMT+00:00)","com.nosh.list.NoshList:id/notes_list");
		element.getLondonTimezone().click();
		element.getSaveBusinessButton().click();
		element.getFirstNameField().sendKeys("Steve");
		element.getLastNameField().sendKeys("Willaims");
		element.getEmailField().sendKeys("steve1234@yopmail.com");
		element.getPasswordField().sendKeys("Test@1234");
		element.getConfirmPasswordField().sendKeys("Test@1234");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().back();
	}
	
	
	
	@Test(priority = 1, enabled =false)
	public void loginScenario() throws Throwable {
		Login element = new Login(driver);
		element.getSignInButton().click();
		element.getLoginEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton1().click();
		log.info("Login successful");	
				
	}
	
	@Test(priority = 2,enabled =false)
	public void createPartyScenario() throws Throwable {
		CreateParty element = new CreateParty(driver);		
		Login element1 = new Login(driver);
		element.getAddPartyButton().click();
		element.getNameTextField().sendKeys("Smith");
		element.getPhoneTextField().sendKeys("5169906822");
		element.getEmailTextField().sendKeys("Smith123@yopmail.com");
		element.getSizeTextField().sendKeys("5");
		element.getChildSelectionButton().click();
		element.getSeniorSelectionButton().click();
		element.getSeniorSelectionButton().click();
		element.getGreenButton().click();
		element.getNotesTextField().sendKeys("Test Notes");
		element.getNextButton().click();
		ScrollToElement.scroll(driver,"16","com.nosh.list.NoshList:id/resource_list");
		element.getAssignButton().click();
		element.getNextButton().click();
		
		
		// 1 com.nosh.list.NoshList:id/waitlist_picker        //android.widget.LinearLayout[@resource-id="com.nosh.list.NoshList:id/waitlist_picker"]
		// 2 com.nosh.list.NoshList:id/waitETACombinedPicker    //android.widget.LinearLayout[@resource-id="com.nosh.list.NoshList:id/waitETACombinedPicker"]
		Thread.sleep(3000);
		
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.nosh.list.NoshList:id/picker_view\").scrollable(true).instance(0)).scrollForward()"));

		//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"//android.widget.FrameLayout[@resource-id='android:id/content']\").scrollable(true).instance(0)).scrollForward()"));

		//driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"com.nosh.list.NoshList:id/leftSegment2\"]")).click();
		
		//log.info("element clicked");
		
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"//android.widget.FrameLayout[@resource-id='android:id/statusBarBackground']\").scrollable(true).instance(0)).scrollForward()"));

		
		// Locate the element using the given XPath
		//MobileElement element = (MobileElement) appiumdriver.findElementByXPath("//android.view.View[@resource-id='com.nosh.list.NoshList:id/wait_time_wheel_view']");

		// Scroll to the element
		//appiumdriver.scrollTo(element);

		
		util.performSwipe(driver, element.getWaitTimeScroll() ,5);	
		element.getAddPartyButton1().click();
		
		Thread.sleep(4000);
		element.getCancelButton().click();
		Thread.sleep(500);
		element.getCancelButton().click();
		Thread.sleep(500);
		element.getCancelButton().click();
		Thread.sleep(500);
				
		}
	
	@Test(priority = 3,enabled =false)
	public void Customization() throws Throwable {
		CreateParty element = new CreateParty(driver);		
		Customization element1 = new Customization(driver);
		Login element2 = new Login(driver);
		element2.getMenuButton().click();
		element1.getCustomizationButton().click();
		element1.getAddingCustomersButton().click();
		element1.getPhoneToggleButton().click();
		element1.getEmailToggleButton().click();
		element1.getStatusToggleButton().click();
		element1.getNotesToggleButton().click();
		element1.getPartySizeToggleButton().click();
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		element.getAddPartyButton().click();
		Thread.sleep(2000);
					
		element.getCancelButton().click();
		element2.getMenuButton().click();
		element1.getCustomizationButton().click();
		element1.getAddingCustomersButton().click();
		element1.getPhoneToggleButton().click();
		element1.getEmailToggleButton().click();
		element1.getStatusToggleButton().click();
		element1.getNotesToggleButton().click();
		element1.getPartySizeToggleButton().click();
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		
		element.getAddPartyButton().click();
		//Assertions
		Assert.assertEquals(element.getEmailTextField().isDisplayed(), true);
		Assert.assertEquals(element.getSizeTextField().isDisplayed(), true);
		Assert.assertEquals(element.getNotesTextField().isDisplayed(), true);
		//Assertions
		element.getCancelButton().click();
		
		
		}
	
	
	@Test(priority = 4,enabled =false)
	public void checkHistoryFilters() throws Throwable {
		CheckHistory element1 = new CheckHistory(driver);
		Login element2 = new Login(driver);
		
		element1.getShowHistoryButton().click();
		element1.getHistoryFilterButton().click();
		element1.getServedFilter().click();
//		Assert.assertEquals(element1.getCheckStatus().getText().contains("served"),true);
		element1.getHistoryFilterButton().click();
		element1.getRemovedFilter().click();
//		Assert.assertEquals(element1.getCheckStatus().getText().contains("removed"), true);
		element1.getHistoryFilterButton().click();
		element1.getRequestsFilter().click();
		element1.getHistoryFilterButton().click();
		element1.getAllFilter().click();
		element2.getMenuButton().click();
		element2.getLogoutButton().click();
		
	}
	
	
	
	
	
	@Test(priority = 4,enabled = false)
	public void removeParty() throws Throwable {
		CreateParty element = new CreateParty(driver);
		RemoveParty element1 = new RemoveParty(driver);
		Thread.sleep(1000);
		element1.getWaitListParty().click();
		String name = element1.getWaitingPartyName().getAttribute("text");
		if(name.equalsIgnoreCase("Smith")) {
			element1.getRemoveButton().click();
		}
		element1.getConfirmButton().click();
		element1.getShowHistoryButton().click();
		String status = element1.getCheckRemovedStatus().getAttribute("text");
		Assert.assertTrue(status.contains("removed"));
		log.info("Current Status of Waitlist party is"+" "+status);
		
	}
	
	@Test(priority = 5, enabled=false)
	public void serveParty() throws Throwable {
		CreateParty element = new CreateParty(driver);
		RemoveParty element1 = new RemoveParty(driver);
		ServeParty element2 = new ServeParty(driver);
		Thread.sleep(1000);
		element1.getWaitListParty().click();
		element2.getReAddButton().click();
		element2.getConfirmReAdd().click();
		element1.getWaitListParty().click();
		element2.getCheckOffButton().click();
		element2.getConfirmCheckOff().click();
		String status = element2.getCheckServedStatus().getAttribute("text");
		System.out.println(status);
		Assert.assertTrue(status.contains("served"));      // Assertion for checking status
		log.info("Current Status of Waitlist party is"+" "+status);
		
	}
	
}