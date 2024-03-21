package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AppiumDemo.genericutility.BaseClass;
import com.AppiumDemo.genericutility.FileUtility;
import com.AppiumDemo.genericutility.Utility;
import com.AppiumDemo.pomrepo.CreateParty;
import com.AppiumDemo.pomrepo.Login;
import com.AppiumDemo.pomrepo.RemoveParty;
import com.AppiumDemo.pomrepo.ServeParty;
import com.AppiumDemo.pomrepo.Signup;



public class TestClass2 extends BaseClass {
	FileUtility fileUtils = new FileUtility();
	Utility util = new Utility();			
	public Logger log = LogManager.getLogger(TestClass2.class);
	
	
	
	
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
		util.performSwipe(driver, 474, 555, 479, 394,14);
		element.getLondonTimezone().click();
		element.getSaveBusinessButton().click();
		element.getFirstNameField().sendKeys("Steve");
		element.getLastNameField().sendKeys("Willaims");
		element.getEmailField().sendKeys("steve1234@yopmail.com");
		element.getPasswordField().sendKeys("Test@1234");
		element.getConfirmPasswordField().sendKeys("Test@1234");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}
	
	
	
	@Test(priority = 1, enabled =true)
	public void loginScenario() throws Throwable {
		Login element = new Login(driver);
		element.getSignInButton().click();
		element.getLoginEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton1().click();
		log.info("Login successful");	
				
	}
	
	@Test(priority = 2,enabled =true)
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
		Thread.sleep(2000);
		util.performSwipe(driver, 553, 1659, 570, 586,1);         
		element.getAssignButton().click();
		element.getNextButton().click();
		util.performSwipe(driver, 528, 574, 528, 512,8);
//		element.getAddPartyButton1().click();
		element.getCancelButton().click();
		Thread.sleep(500);
		element.getCancelButton().click();
		Thread.sleep(500);
		element.getCancelButton().click();
		Thread.sleep(500);
		element1.getMenuButton().click();
		element1.getLogoutButton().click();
		
		}
	
	@Test(priority = 3,enabled = false)
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
	
	@Test(priority = 4, enabled=false)
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
	
	
