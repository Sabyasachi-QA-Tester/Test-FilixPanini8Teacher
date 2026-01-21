package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test01_Login extends BaseClass {
	
	@Test
	public void Test_Login() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Set_email(p.getProperty("email"));
		lp.Set_pass(p.getProperty("password"));
		lp.Check_Remember();
		lp.Click_SignIn();
		
	}
	
	
	
	
	
	

}
