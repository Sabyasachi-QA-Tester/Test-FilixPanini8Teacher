package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_email;
	
	@FindBy(xpath="//button[normalize-space()='Send OTP']")
	WebElement btn_OTP;
	
	@FindBy(xpath="//input[@id='otp']")
	WebElement txt_OTP;
	
	@FindBy(xpath="//button[normalize-space()='Verify OTP']")
	WebElement btn_Verify;
	
	public void Click_login() {
		btn_login.click();
	}
	
	public void Set_email(String email) {
		txt_email.sendKeys(email);
	}
	
	public void click_OTP() {
		btn_OTP.click();
	}
	
	public void Set_OTP(String otp) {
		txt_OTP.sendKeys(otp);
	}
	
	public void Click_verify() {
		btn_Verify.click();
	}
	

}
