package automation.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation.selenium.PageObjects.Page;
import automation.selenium.components.LoginSample;


public class LoginSampleTest extends SetupTests{
	
	@Test(priority=1)
	public void MyTest() {
		
		
		LoginSample login=new LoginSample(driver);
	//	System.out.println(workingDir);
		Page newPage=login.newLogin();
		
		Assert.assertTrue(newPage.isPageTitle("ITONICS Innovation Engine | Welcome to ITONICS Innovation Engine"), "Page not found!!");	
		System.out.println("Login test passed successfully");
	}

}
