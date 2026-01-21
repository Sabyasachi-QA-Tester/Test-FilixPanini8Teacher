package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamsPage extends BasePage {

	public TeamsPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@href='/host/teams']")
	WebElement btn_Teams;
	
	@FindBy(xpath="//a[@href='/host/teams/create']")
	WebElement btn_CreateTeam;
	
	@FindBy(xpath="//input[@placeholder='e.g., Mount Everest Expeditions']") // //input[@id='_r_19_-form-item']
	WebElement txt_TeamName;
	
	@FindBy(xpath="//input[@name='contact.email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@name='contact.phone']")
	WebElement txt_Phone;
	
	@FindBy(xpath="//textarea[@name='description']") // //textarea[@id='_r_1c_-form-item']
	WebElement txt_description;
	
	@FindBy(xpath="//input[@placeholder='e.g., Trekking, Cultural Tours, Wildlife Safaris']")
	WebElement txt_specialities;
	
	@FindBy(xpath="//button[@type='button' and contains(@class,'h-12') and contains(@class,'w-12')]")
	WebElement add_speciality;
	
	@FindBy(xpath="//input[@placeholder='Kolkata']")
	WebElement txt_City;
	
	@FindBy(xpath="//input[@placeholder='West Bengal']")
	WebElement txt_State;
	
	@FindBy(xpath="//input[@placeholder='India']")
	WebElement txt_Country;
	
	@FindBy(xpath="//input[@placeholder='e.g., 88.3639']")
	WebElement txt_Longitude;
	
	@FindBy(xpath="//input[@placeholder='e.g., 22.5726']")
	WebElement txt_Latitude;
	
	@FindBy(xpath="//input[@id='file-upload-coverImage']")
	WebElement upload_img;
	
	@FindBy(xpath="//button[normalize-space()='Create Team']")
	WebElement btn_AddCreateTeam;
	
	
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement btn_del;
	
	@FindBy(xpath="//button[contains(@class,'rounded-full') and contains(@class,'border-primary-200') and contains(@class,'h-9')]")
	WebElement btn_back;
	
	@FindBy(xpath="//button[normalize-space()='Clear Form']")
	WebElement btn_ClearForm;
	
	
	public void Click_Teams() throws InterruptedException {
		Thread.sleep(2000);
		btn_Teams.click();
	}
	
	public void Click_createTeam() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateTeam.click();
	}
	
	public void Set_TeamName(String tname) throws InterruptedException {
		Thread.sleep(2000);
		txt_TeamName.sendKeys(tname);
	}
	
	public void Set_Email(String email) throws InterruptedException {
		Thread.sleep(2000);
		txt_Email.sendKeys(email);
	}
	
	public void Set_Phone(String phone) throws InterruptedException {
		Thread.sleep(2000);
		txt_Phone.sendKeys(phone);
	}
	
	public void Set_description(String desc) throws InterruptedException {
		Thread.sleep(2000);
		txt_description.sendKeys(desc);
	}
	
	public void Set_specialities(String special) throws InterruptedException {
		Thread.sleep(2000);
		txt_specialities.sendKeys(special);
	}
	
	public void Add_specialities() throws InterruptedException {
		Thread.sleep(2000);
		add_speciality.click();
	}
	
	public void Set_city(String city) throws InterruptedException {
		Thread.sleep(2000);
		txt_City.sendKeys(city);
	}
	
	public void Set_state(String state) throws InterruptedException {
		Thread.sleep(2000);
		txt_State.sendKeys(state);
	}
	
	public void Set_country(String country) throws InterruptedException {
		Thread.sleep(2000);
		txt_Country.clear();
		txt_Country.sendKeys(country);
	}
	
	public void Set_longitude(String longitude) throws InterruptedException {
		Thread.sleep(2000);
		txt_Longitude.sendKeys(longitude);
	}
	
	public void Set_latitude(String latitude) throws InterruptedException {
		Thread.sleep(2000);
		txt_Latitude.sendKeys(latitude);
	}
	
	public void Set_uploadImage(String img) throws InterruptedException {
		Thread.sleep(2000);
		upload_img.sendKeys(img);
	}
	
	public void Click_AddCreateTeam() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddCreateTeam.click();
	}
	
	public void Click_delete() throws InterruptedException {
		Thread.sleep(2000);
		btn_del.click();
	}
	
	public void Click_back() throws InterruptedException {
		Thread.sleep(2000);
		btn_back.click();
	}
	
	public void Click_ClearForm() throws InterruptedException {
		Thread.sleep(2000);
		btn_ClearForm.click();
	}

}
