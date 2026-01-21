package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
	
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//button[contains(text(),'Send Verification Code')]")
	WebElement btn_VerifyCode;
	
	@FindBy(xpath="//button[contains(text(),'Verify')]]")
	WebElement btn_OTP;
	
	@FindBy(xpath="//input[@placeholder='Enter 6-digit code']")
	WebElement txt_VerificationCode;
	
	public void set_Email() {
		txt_Email.sendKeys("ghoshsabyasachi31@gmail.com");
	}
	
	public void VerificationCode() {
		btn_VerifyCode.click();
	}
	
	public void EnterOTP(String otp) {
		btn_OTP.sendKeys(otp);
	}
	
	public void Verify_OTPButton() {
		txt_VerificationCode.click();
	}
	

}
