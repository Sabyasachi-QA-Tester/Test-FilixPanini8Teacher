package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@role='checkbox']")
	WebElement chk_Remember;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_SignIn;
	
	public void Set_email(String text) throws InterruptedException {
		Thread.sleep(2000);
		txt_email.sendKeys(text);
	}
	
	public void Set_pass(String password) throws InterruptedException {
		Thread.sleep(2000);
		txt_password.sendKeys(password);
	}
	
	public void Check_Remember() throws InterruptedException {
		Thread.sleep(2000);
		chk_Remember.click();
	}
	
	public void Click_SignIn() {
		btn_SignIn.click();
	}
	
	
	
	
}
