package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.SessionsPage;
import testBase.BaseClass;

public class Test02_Sessions extends BaseClass {
	
	@Test
	public void Test_Session() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		
		SessionsPage sp = new SessionsPage(driver);
		
//		sp.Click_Sessions();
		//sp.Set_SessionDate("12/30");
//		sp.Click_SessionList();
//		sp.Click_BackToDashboard();
//		sp.Click_Sessions();
//		sp.Click_Session();
//		sp.Click_Cohort();
//		sp.Search_Cohort("Class 2");
//		sp.Click_SearchCohort();
//		sp.Click_Theme();
//		sp.Search_Theme("All About Me");
//		sp.Click_SessionTheme();
//		sp.Click_Chapter();
//		sp.Search_Chapter("Length - Blocks LV_1");
//		sp.Click_SessionChapter();
//		sp.Click_Activity();
//		sp.Click_SessionActivity();
//		sp.Session_Title("Testing");
//		sp.Set_Description("Test Activity");
//		sp.Set_StartTime("12/20/2025");
//		sp.Set_EndTime("01/05/2026");
//		sp.Click_CreateNewSession();
		
		sp.Click_Session();
		sp.Session_drpdown("Past Sessions");
		sp.Set_Sessions("check 1");
		sp.Click_SessionList();
		sp.User_drpdown("686f9bfcaf0800c3ea638df0");
		sp.Click_Assessment();
		sp.Click_emoji();
		sp.Click_SubmitFeedback();
		sp.Click_Participants();
		sp.Click_Dashboard();
		
		
	}

}
