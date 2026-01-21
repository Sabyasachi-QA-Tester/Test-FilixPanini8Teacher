package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountDetailsPage;

public class TestCaseofAccountDetails extends BaseClass {
	
	
	@Test
	public void verify_AccountDetails() {
		
		AccountDetailsPage ap = new AccountDetailsPage(driver);
		
		ap.Setfirstname("sabyasachi");
		ap.Setlastname("Ghosh");
		ap.Set_DOB("21/10/2000");
		ap.Set_country("India");
		ap.Set_phone("67678678822");
		ap.Set_whatsapp("67678678822");
		ap.Click_update();
		
		String confmsg = ap.GetconfirmationMsg();
		Assert.assertEquals(confmsg, "Profile updated successfully!!");
		
		
		
		
		
		
	}

}
