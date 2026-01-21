package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuidePage extends BasePage {

	public GuidePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@href='/host/guide']")
	WebElement btn_guide;
	
//	@FindBy(xpath="//button[normalize-space()='Add Your First Guide']")
//	WebElement btn_AddGuide;
	
	@FindBy(xpath="//button[normalize-space()='Add New Guide']")
	WebElement btn_AddGuide;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement txt_fname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement txt_lname;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Create Guide']")
	WebElement btn_createguide;
	
	@FindBy(xpath="//input[@placeholder='Search guides by name or email...']")
	WebElement txt_SearchGuide;
	
	public void Click_guide() throws InterruptedException {
		Thread.sleep(2000);
		btn_guide.click();
	}
	
	public void Click_Addguide() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddGuide.click();
	}
	
	public void Set_firstname(String fname) throws InterruptedException {
		Thread.sleep(2000);
		txt_fname.sendKeys(fname);
	}
	
	public void Set_lastname(String lname) throws InterruptedException {
		Thread.sleep(2000);
		txt_lname.sendKeys(lname);
	}
	
	public void Set_email(String email) throws InterruptedException {
		Thread.sleep(2000);
		txt_email.sendKeys(email);
	}
	
	public void Set_password(String password) throws InterruptedException {
		Thread.sleep(2000);
		txt_password.sendKeys(password);
	}
	
	public void Click_createguide() throws InterruptedException {
		Thread.sleep(2000);
		btn_createguide.click();
	}
	
	public void Search_guide(String guide) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchGuide.sendKeys(guide);
	}
	
	
}
