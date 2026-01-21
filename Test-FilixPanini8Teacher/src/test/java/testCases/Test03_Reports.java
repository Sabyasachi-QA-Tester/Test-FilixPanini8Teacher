package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ReportsPage;
import testBase.BaseClass;

public class Test03_Reports extends BaseClass {
	
	@Test
	public void Test_Report() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);

		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		ReportsPage rp = new ReportsPage(driver);
		
		rp.Click_Reports();
		rp.Search_Report("Cool John");
		rp.Click_Cross();
		rp.Click_ViewReport();
		rp.Click_SelectCohort();
		rp.Click_CohortReport();
		rp.Click_ViewProgressReport();
		
	}

}
