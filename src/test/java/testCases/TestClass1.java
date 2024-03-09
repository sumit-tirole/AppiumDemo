package testCases;

import org.testng.annotations.Test;

import com.AppiumDemo.genericutility.BaseClass;
import com.AppiumDemo.genericutility.FileUtility;
import com.AppiumDemo.pomrepo.AppElements;

public class TestClass1 extends BaseClass {
	FileUtility fileUtils = new FileUtility();
			
	@Test
	public void Login() throws Throwable{
		
		AppElements element = new AppElements(driver);
		element.getEmailTextField().sendKeys(fileUtils.getCredentials("email"));
		element.getPasswordTextField().sendKeys(fileUtils.getCredentials("pass"));
		element.getSignInButton().click();
		element.getMenuButton().click();
		element.getLogoutButton().click();
				
		}
		
	}
	
	
