package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import testBase.BaseClass;

public class Test04_Profile extends BaseClass {
	
	@Test
	public void Test_Profile() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		ProfilePage pp = new ProfilePage(driver);
		
		pp.Click_Profile();
		pp.Click_EditProfile();
		pp.Set_FullName(randomeString());
		pp.Set_DOB("11/22/1999");
		pp.Set_Gender("male");
		pp.Set_Phone(randomeNumber());
		pp.Set_Address("Calcutta");
		pp.Click_Save();
		
		pp.Click_EditProfile();
		pp.Click_Cancel();
		
	}
	

}
