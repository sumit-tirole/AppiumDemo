package testCases;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.AppiumDemo.genericutility.BaseClass;
import com.AppiumDemo.genericutility.FileUtility;
import com.AppiumDemo.genericutility.Utility;
import com.AppiumDemo.pomrepo.CreateParty;
import com.AppiumDemo.pomrepo.RemoveParty;
import com.AppiumDemo.pomrepo.ServeParty;



public class TestClass1 extends BaseClass {
	FileUtility fileUtils = new FileUtility();
	Utility util = new Utility();			
	public Logger log = LogManager.getLogger(TestClass1.class);
	
	
	
	@Test(priority = 0, enabled =true)
	public void login() throws Throwable {
		CreateParty element = new CreateParty(driver);
		element.getLoginEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton().click();
		log.info("Login successful");	
		element.getMenuButton().click();
		element.getLogoutButton().click();
		
	}
	
	@Test(priority = 1,enabled =false)
	public void createParty() throws Throwable {
		CreateParty element = new CreateParty(driver);		
		element.getLoginEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton().click();
		element.getAddPartyButton().click();
		element.getNameTextField().sendKeys("John");
		element.getPhoneTextField().sendKeys("5169906822");
		element.getEmailTextField().sendKeys("John123@yopmail.com");
		element.getSizeTextField().sendKeys("5");
		element.getChildSelectionButton().click();
		element.getSeniorSelectionButton().click();
		element.getSeniorSelectionButton().click();
		element.getGreenButton().click();
		element.getNotesTextField().sendKeys("Test Notes");
		element.getNextButton().click();
		util.performSwipe(driver, 553, 1659, 570, 586,1);         
		element.getAssignButton().click();
		element.getNextButton().click();
		util.performSwipe(driver, 528, 574, 528, 512,1);
		element.getAddPartyButton1().click();
		element.getMenuButton().click();
		element.getLogoutButton().click();
			
		}
	
	@Test(priority = 2,enabled = true)
	public void removeParty() throws IOException {
		CreateParty element = new CreateParty(driver);
		RemoveParty element1 = new RemoveParty(driver);
		element.getLoginEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton().click();
		element1.getWaitListParty().click();
		String name = element1.getWaitingPartyName().getAttribute("text");
		if(name.equalsIgnoreCase("John")) {
			element1.getRemoveButton().click();
		}
		element1.getConfirmButton().click();
		element1.getShowHistoryButton().click();
		String status = element1.getCheckRemovedStatus().getAttribute("text");
		Assert.assertTrue(status.contains("removed"));
		log.info("Current Status of Waitlist party is"+" "+status);
		element.getMenuButton().click();
		element.getLogoutButton().click();
	}
	
	@Test(priority = 3, enabled=true)
	public void serveParty() throws IOException {
		CreateParty element = new CreateParty(driver);
		RemoveParty element1 = new RemoveParty(driver);
		ServeParty element2 = new ServeParty(driver);
		element.getLoginEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton().click();
		element1.getShowHistoryButton().click();
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
		element.getMenuButton().click();
		element.getLogoutButton().click();
	}
	
	@Test(priority = 4, enabled=true)
	public void reAddParty() throws IOException {
		CreateParty element = new CreateParty(driver);
		RemoveParty element1 = new RemoveParty(driver);
		ServeParty element2 = new ServeParty(driver);
		element.getLoginEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton().click();
		element1.getShowHistoryButton().click();
		element1.getWaitListParty().click();
		element2.getReAddButton().click();
		element2.getConfirmReAdd().click();
		element.getMenuButton().click();
		element.getLogoutButton().click();
	}
	
	}
	
	
