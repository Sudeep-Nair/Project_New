package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Util.SetUp;

public class ValidLogin extends SetUp{
	
	
	@Test
	public void test()
	{
		LoginPage lp=new LoginPage();
		lp.EnterUsername(driver, "admin");
		lp.EnterPassword(driver, "Admin123");
		lp.SelectLocator(driver);
		lp.ClickLoginButton(driver);
	}
}
