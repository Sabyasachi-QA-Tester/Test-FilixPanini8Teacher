package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignInPage;
import utilities.EmailOTPReader;

public class TestHomePage extends BaseClass {
	
	@Test
	public void verify_HomePage() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.display_MockTest();
		hp.display_contestPractice();
		hp.display_askDoubt();
		Thread.sleep(2000);
		hp.clickSignUp();
		
		SignInPage sp = new SignInPage(driver);
		
		String email = "ghoshsabyasachi31@gmail.com";
        String appPassword = "Sabya@21";
		sp.set_Email();
		sp.VerificationCode();
		
		String otp = EmailOTPReader.getOTP(email, appPassword);
        System.out.println("OTP Received: " + otp);
        
		sp.EnterOTP(otp);
		sp.Verify_OTPButton();
		
		
	}
	

}
