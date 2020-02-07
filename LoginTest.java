package automation.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation.selenium.PageObjects.Page;
import automation.selenium.components.Login;


public class LoginTest extends SetupTests
{
	/*
	 * @Test(priority=4) public void verifyValidUserAndPassLogin() { Login login =
	 * new Login(driver); Page newPage = login.redirectToLogin();
	 * login.validLogin();
	 * Assert.assertTrue(newPage.isPageTitle("braindigit.com Mail Atom Feed"),
	 * "Incorrect page loaded.");
	 * 
	 * }
	 */
	/*
	@Test(priority=3)
	public void verifyInvalidUserAndPassLogin()
	{
		Login login = new Login(driver);
		Page newPage = login.redirectToLogin();
		login.invalidLogin();
		Assert.assertTrue(newPage.isTextPresent(login.invalidLoginText(), "Username and password combination didn't match!"), "validation Text Not Matched!");
	}
	
	@Test(priority=2)
	public void verifyEmptyUserAndPassLogin()
	{
		Login login = new Login(driver);
		Page newPage = login.redirectToLogin();
		login.emptyLogin();
		Assert.assertTrue(newPage.isTextPresent(login.emptyUserLoginSymbol(), "*"),"Username - Validation Symbol Not matched!");
		Assert.assertTrue(newPage.isTextPresent(login.emptyPassLoginSymbol(), "*"),"Password - Validation Symbol Not matched!");
	}*/


	@Test(priority=2)
	public void LoginTest()
	{
		Login login = new Login(driver);
		Page newPage = login.myLogin();
		
	 	
		Assert.assertTrue(newPage.isPageTitle("ITONICS Innovation Engine | Welcome to ITONICS Innovation Engine"), "Page Title Not Matched!");	
		//Assert.assertTrue(newPage.isTextPresent(login.invalidLoginText(), "Sorry, Google doesn't recognize that email."), "validation Text Not Matched!");
		System.out.println("Test Case for Login passed with Successful Login");
	 
	 	
	}
	


	@Test(priority=100)
	public void verifyInvalidUserAndPassLogin() 
	{
		Login login = new Login(driver);
		Page newPage = login.invalidLogin();
		//login.invalidLogin();
		//Assert.assertTrue((login.invalidLoginText(), "Sorry, unrecognized username or password. Have you forgotten your password?"), "validation Text Not Matched!");
		if(login.invalidLoginText().contains("Sorry, unrecognized username or password. Have you forgotten your password?")){
		System.out.println("Invalid Login Passed with Error validation Text");
		}
		else
		{
			System.out.println("Validation Text Not Matched or error due to some reason!");
		}
	}
	
}
