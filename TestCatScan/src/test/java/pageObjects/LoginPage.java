package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='aadhaar']")
	WebElement txt_AadharNo;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement btn_SignIn;
	
	public void Set_AadharNo(String number) throws InterruptedException {
		Thread.sleep(2000);
		txt_AadharNo.sendKeys(number);
	}
	
	public void btn_SignIn() throws InterruptedException {
		Thread.sleep(2000);
		btn_SignIn.click();
	}
	
	

}
