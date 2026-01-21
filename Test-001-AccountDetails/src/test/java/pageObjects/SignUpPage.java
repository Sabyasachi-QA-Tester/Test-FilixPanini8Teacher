package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
	
	WebDriver driver;
	
	
	public SignUpPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//button[normalize-space()='Send Verification Code']")
	WebElement get_VerificationCode;
	
	
	public void set_Email() {
		txt_Email.sendKeys("ghoshsabyasachi31@gmail.com");
	}
	
	public void VerificationCode() throws InterruptedException {
		Thread.sleep(10000);
		get_VerificationCode.click();
	}
	
	

	

}
