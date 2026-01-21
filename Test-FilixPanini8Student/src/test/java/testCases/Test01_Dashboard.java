package testCases;



import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test01_Dashboard extends BaseClass {
	
	@Test
	public void Test_Dashboard() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		
		DashboardPage dp = new DashboardPage(driver);
		
	 
		dp.Click_View();
		driver.navigate().refresh();
		dp.Click_ViewBack();
		driver.navigate().refresh();
		dp.Click_Previous();
		driver.navigate().refresh();
		dp.Click_Report();
		
		
		
		
		
		
		
		
		
	}

}
