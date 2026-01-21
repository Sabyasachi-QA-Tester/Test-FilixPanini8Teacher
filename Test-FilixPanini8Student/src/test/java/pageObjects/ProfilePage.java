package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@href='/student/profile']")
	WebElement btn_profile;
	
	@FindBy(xpath="//button[normalize-space()='Edit Profile']")
	WebElement btn_EditProfile;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement txt_FullName;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement txt_phone;
	
	@FindBy(xpath="//input[@name='address']")
	WebElement txt_Address;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_Save;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement btn_Cancel;
	
	public void Click_Profile() throws InterruptedException {
		Thread.sleep(2000);
		btn_profile.click();
	}
	
	public void Click_EditProfile() throws InterruptedException {
		Thread.sleep(2000);
		btn_EditProfile.click();
	}
	
	public void Set_FullName(String name) throws InterruptedException {
		Thread.sleep(2000);
		txt_FullName.sendKeys(name);
	}
	
	public void Set_DOB(String dob) throws InterruptedException {
		Thread.sleep(2000);
		txt_DOB.sendKeys("05/12/2025");
	}
	
	public void Set_Gender(String gendervalue) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='gender']//option[@value='"+gendervalue+"']")).click();
	}
	
	public void Set_Phone(String phone) throws InterruptedException {
		Thread.sleep(2000);
		txt_phone.sendKeys(phone);
	}
	
	public void Set_Address(String address) throws InterruptedException {
		Thread.sleep(2000);
		txt_Address.sendKeys(address);
	}
	
	public void Click_Save() throws InterruptedException {
		Thread.sleep(2000);
		btn_Save.click();
	}
	
	public void Click_Cancel() throws InterruptedException {
		Thread.sleep(2000);
		btn_Cancel.click();
	}

}
