package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import testBase.BaseClass;

public class TC_002_RegisterAccount extends BaseClass {
	
	@Test
	public void Test_AccountRegister() {
		
		AccountRegistrationPage ap = new AccountRegistrationPage(driver);
		
		ap.Click_Register();
		ap.Set_AadharNo("122012201220");
		ap.Set_Fullname("test123");
		ap.Set_DOB("02/12/1990");
		ap.btn_Gender();
		ap.Set_PhoneNo("1234567890");
		ap.Set_Image("C:\\Users\\CHEENTA\\Pictures\\Screenshots\\New folder");
		ap.Click_Account();
		
		
		
		
		
	}

}
