package testCases;

import org.testng.annotations.Test;

import pageObjects.GuidePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test03_Guide extends BaseClass {

	@Test
	public void Test_Guide() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Set_email(p.getProperty("email"));
		lp.Set_pass(p.getProperty("password"));
		lp.Check_Remember();
		lp.Click_SignIn();
		
		GuidePage gp = new GuidePage(driver);
		
		gp.Click_guide();
		gp.Click_Addguide();
		gp.Set_firstname(randomeString().toLowerCase());
		gp.Set_lastname(randomeString().toLowerCase());
		gp.Set_email(randomeString()+"@gmail.com");
		
		String password = randomeAlphaNumeric();
		gp.Set_password(password);
		
		gp.Click_createguide();
		gp.Search_guide(randomeString().toLowerCase());
		
		
		
	}
		
}
