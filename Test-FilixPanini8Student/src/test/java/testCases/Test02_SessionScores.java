package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.SessionScoresPage;
import testBase.BaseClass;

public class Test02_SessionScores extends BaseClass {
	
	@Test
	public void Test_SessionScores() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		SessionScoresPage sp = new SessionScoresPage(driver);
		
		sp.Click_SessionScore();
		driver.navigate().refresh();
		sp.Click_ViewMarks();
		driver.navigate().refresh();
		sp.Click_BacktoDashboard();
		
		
		
	}
	
	
	
	
	

}
