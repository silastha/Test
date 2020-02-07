package automation.selenium.tests;

import org.testng.annotations.Test;

import automation.selenium.PageObjects.Page;
import automation.selenium.components.Entities;
import automation.selenium.components.Login;

public class CreateEntitiesTest extends SetupTests{
	
	
/*	@Test(priority=2)
	public void createMegatrend()
	{
		Login login = new Login(driver);
		Entities entity = new Entities (driver);
		Page newPage = login.myLogin();
	 	entity.megaTrendCreate();
	 	
	 	
	 	
	}*/
	
	
	@Test(priority=1)
	public void createTrend()
	{
		Login login = new Login(driver);
		Entities entity = new Entities (driver);
		Page newPage = login.myLogin();
	 	entity.trendCreate();
	 	
	 	
	 	
	}

}
