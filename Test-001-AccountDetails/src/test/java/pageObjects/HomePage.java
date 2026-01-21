package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(@class,'font-normal text-[#61605f]')][normalize-space()='Mock Tests']")
	WebElement disp_MockTest;
	
	@FindBy(xpath="//a[normalize-space()='Contest Practice']")
	WebElement disp_contestPractice;
	
	@FindBy(xpath="//a[normalize-space()='Ask Doubts']")
	WebElement disp_askDoubt;
	
	@FindBy(xpath="//div//a[normalize-space()='Sign In']")
	WebElement btn_signin;
	
	@FindBy(xpath="//div//a[normalize-space()='Sign Up']")
	WebElement btn_signup;
	
	public void display_MockTest() {
		System.out.println(disp_MockTest.getText());
	}
	
	public void display_contestPractice() {
		System.out.println(disp_contestPractice.getText());
	}
	
	public void display_askDoubt() {
		System.out.println(disp_askDoubt.getText());
	}
	
	public void clickSignIn() {
		btn_signin.click();
	}
	
	public void clickSignUp() {
		btn_signup.click();
	}

}
