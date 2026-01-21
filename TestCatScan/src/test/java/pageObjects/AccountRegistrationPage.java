package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Register now']")
	WebElement btn_Register;
	
	@FindBy(xpath="//input[@placeholder='Enter 12-digit Aadhaar']")
	WebElement txt_AadharNo;
	
	@FindBy(xpath="//input[@placeholder='Enter your full name']")
	WebElement txt_FullName;
	
	@FindBy(xpath="//input[@name='date_of_birth']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//button[@role='combobox']")
	WebElement btn_Gender;
	
	@FindBy(xpath="//input[@placeholder='Enter 10-digit phone number']")
	WebElement txt_PhoneNo;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement btn_UploadImg;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement btn_CreateAcc;
	
	public void Click_Register() {
		btn_Register.click();
	}
	
	public void Set_AadharNo(String no) {
		txt_AadharNo.sendKeys(no);
	}
	
	public void Set_Fullname(String name) {
		txt_FullName.sendKeys(name);
	}
	
	public void Set_DOB(String dob) {
		txt_DOB.sendKeys(dob);
	}
	
	public void btn_Gender() {
		btn_Gender.click();
	}
	
	public void Set_PhoneNo(String phone) {
		txt_PhoneNo.sendKeys(phone);
	}
	
	public void Set_Image(String file) {
		btn_UploadImg.sendKeys(file);
	}
	
	public void Click_Account() {
		btn_CreateAcc.click();
	}

}
