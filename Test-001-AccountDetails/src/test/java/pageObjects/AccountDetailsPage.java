package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetailsPage extends BasePage {

	public AccountDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement txt_lastname;
	
	@FindBy(xpath="//input[@id='dateofbirth']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement txt_country;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement txt_phone;
	
	@FindBy(xpath="//input[@id='whatsapp']")
	WebElement txt_whatsapp;
	
	@FindBy(xpath="//button[normalize-space()='Update Account']")
	WebElement btn_update;
	
	@FindBy(xpath="//div[contains(text(),'Profile updated successfully!!')]")
	WebElement msgconfirmation;
	
	public void Setfirstname(String fname) {
		txt_firstname.sendKeys(fname);
	}
	
	public void Setlastname(String lname) {
		txt_lastname.sendKeys(lname);
	}
	
	public void Set_DOB(String dob) {
		txt_DOB.sendKeys(dob);
	}
	
	public void Set_country(String country) {
		txt_country.sendKeys(country);
	}
	
	public void Set_phone(String phone) {
		txt_phone.sendKeys(phone);
	}
	
	public void Set_whatsapp(String phone) {
		 txt_whatsapp.sendKeys(phone);
	}
	
	public void Click_update() {
		btn_update.click();
	}
	
	public String GetconfirmationMsg() {
		try {
			return(msgconfirmation.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	
	
	
	

}
