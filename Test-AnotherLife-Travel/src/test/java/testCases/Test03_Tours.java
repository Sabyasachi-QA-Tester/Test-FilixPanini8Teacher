package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ToursPage;
import testBase.BaseClass;

public class Test03_Tours extends BaseClass {
	
	@Test
	public void Test_Tours() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Set_email(p.getProperty("email"));
		lp.Set_pass(p.getProperty("password"));
		lp.Check_Remember();
		lp.Click_SignIn();
		
		ToursPage tp = new ToursPage(driver);
		
		tp.Click_tour();
		tp.Search_title("Himalaya tour");
		tp.Click_ViewDetail();
		tp.drpdown_Date();
		tp.Click_tour();
		tp.Click_BookNow();
		tp.Set_MsgtoHost("Low cost");
		tp.Click_BookingReq();
		
		
		tp.Click_detail();
		tp.Click_CancelBooking();
		tp.Click_ConfirmCancelBooking();
		tp.btn_exploretours();
		
		
		
		
		
	}

}
