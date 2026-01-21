package testCases;

import org.testng.annotations.Test;

import pageObjects.CohortsPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test01_Cohorts extends BaseClass {

	@Test
	public void Test_Cohorts() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		CohortsPage cp = new CohortsPage(driver);
		
		cp.Click_Cohorts();
		cp.Search_title("Class 2");
		cp.Click_title();
		cp.Click_Themes();
		cp.Click_Books();
		cp.Click_Dashboard();
		
		
		
		
		
		
	}
	
	
}
