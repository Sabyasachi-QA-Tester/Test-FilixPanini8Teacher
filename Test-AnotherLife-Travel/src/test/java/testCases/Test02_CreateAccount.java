package testCases;

import org.testng.annotations.Test;

import pageObjects.CreateAccountPage;
import testBase.BaseClass;

public class Test02_CreateAccount extends BaseClass {
	
	@Test
	public void Test_CreateAccount() throws InterruptedException {
		
		CreateAccountPage cp = new CreateAccountPage(driver);
		
		cp.Click_CreateAccount();
		cp.Set_EmailAddress(randomeString()+"@gmail.com");
		
		String password = randomeAlphaNumeric();
		
		cp.Set_Password(password);
		cp.Set_ConfPassword(password);
		cp.Click_continue();
		cp.Set_FirstName(randomeString().toLowerCase());
		cp.Set_LastName(randomeString().toLowerCase());
		cp.Set_DOB("05/22/1990");
		cp.Set_Location(randomeString().toLowerCase());
		cp.Set_Phonenumber(randomeNumber());
		cp.Click_continue();
		cp.Click_Interest();
		cp.Click_Interest1();
		cp.Click_Interest2();
		cp.Click_Terms();
		cp.Click_CreateAcc();
		
		
	}
	
	
	
	
	
	

}
