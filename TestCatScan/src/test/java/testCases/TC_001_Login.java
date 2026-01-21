package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AllVisitsPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_Login extends BaseClass {
	
	@Test
	public void Test_Login() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.Set_AadharNo("100010001000");
		lp.btn_SignIn();
		
		DashboardPage dp = new DashboardPage(driver);
		
		String welcomepage = dp.GetwelcomeMsg();
		Assert.assertEquals(welcomepage, "Welcome, Rohan Singh");
		
		dp.Get_profileInfo();
		//dp.Click_eyeResult();
		dp.Click_eyeResults();
		dp.Click_editVisit();
//		dp.Get_status();
		dp.set_text(" left eye");
		dp.Click_save();
		dp.Click_editVisit();
		dp.Click_cancel();
		dp.Click_back();
		
		
		AllVisitsPage ap = new AllVisitsPage(driver);
		
		ap.Click_AllVisit();
		ap.Click_View();
		ap.Click_editVisit();
		ap.set_text(" right eye");
		ap.Click_save();
		ap.Click_editVisit();
		ap.Click_cancelVisit();
		ap.Click_back();
		ap.Click_delete();
		ap.Click_cancel();
		
		
	}

}
