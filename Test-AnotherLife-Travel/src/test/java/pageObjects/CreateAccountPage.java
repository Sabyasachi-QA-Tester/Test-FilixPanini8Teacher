package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Create account']")
	WebElement btn_createacc;
	
	@FindBy(xpath="//input[@placeholder='Enter your email address']")
	WebElement txt_emailAddress;
	
	@FindBy(xpath="//input[@placeholder='Create a secure password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@placeholder='Confirm your password']")
	WebElement txt_confpassword;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btn_continue;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement txt_lastname;
	
	@FindBy(xpath="//input[@name='birthDate']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//input[@placeholder='City, Country']")
	WebElement txt_Location;
	
	@FindBy(xpath="//input[@placeholder='+1 (555) 000-0000']")
	WebElement txt_phoneNo;
	
	@FindBy(xpath="//button[normalize-space()='Adventure Travel']")
	WebElement btn_Interest;
	
	@FindBy(xpath="//button[normalize-space()='Cultural Experiences']")
	WebElement btn_Interest1;
	
	@FindBy(xpath="//button[@type='button'][3]")
	WebElement btn_Interest2;
	
	@FindBy(xpath="//button[@role='checkbox']")
	WebElement chk_Terms;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement btn_createAcc;
	
	public void Click_CreateAccount() {
		btn_createacc.click();
	}
	
	public void Set_EmailAddress(String email) throws InterruptedException {
		Thread.sleep(2000);
		txt_emailAddress.sendKeys(email);
	}
	
	public void Set_Password(String password) throws InterruptedException {
		Thread.sleep(2000);
		txt_password.sendKeys(password);
	}
	
	public void Set_ConfPassword(String password) throws InterruptedException {
		Thread.sleep(2000);
		txt_confpassword.sendKeys(password);
	}
	
	public void Click_continue() throws InterruptedException {
		Thread.sleep(2000);
		btn_continue.click();
	}
	
	public void Set_FirstName(String fname) throws InterruptedException {
		Thread.sleep(2000);
		txt_firstname.sendKeys(fname);
	}
	
	public void Set_LastName(String lname) throws InterruptedException {
		Thread.sleep(2000);
		txt_lastname.sendKeys(lname);
	}
	
	public void Set_DOB(String dob) throws InterruptedException {
		Thread.sleep(2000);
		txt_DOB.sendKeys(dob);
	}
	
	public void Set_Location(String location) throws InterruptedException {
		Thread.sleep(2000);
		txt_Location.sendKeys(location);
	}
	
	public void Set_Phonenumber(String phone) throws InterruptedException {
		Thread.sleep(2000);
		txt_phoneNo.sendKeys(phone);
	}
	
	public void Click_Interest() {
		btn_Interest.click();
	}
	
	public void Click_Interest1() {
		btn_Interest1.click();
	}
	
	public void Click_Interest2() {
		btn_Interest2.click();
	}
	
	public void Click_Terms() throws InterruptedException {
		Thread.sleep(2000);
		chk_Terms.click();
	}
	
	public void Click_CreateAcc() throws InterruptedException {
		Thread.sleep(2000);
		btn_createAcc.click();
	}
	
	
	
	
	
	

}
