package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.StoriesPage;
import testBase.BaseClass;

public class Test06_Stories extends BaseClass {
	
	@Test
	public void Test_stories() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Set_email(p.getProperty("email"));
		lp.Set_pass(p.getProperty("password"));
		lp.Check_Remember();
		lp.Click_SignIn();
		
		
		StoriesPage sp = new StoriesPage(driver);
		
		sp.Click_stories();
		sp.Click_likes();
		sp.Click_comment();
		sp.Set_comment("hello");
		sp.Click_send();
		sp.Click_close();
		
		
	}
	
	
}
