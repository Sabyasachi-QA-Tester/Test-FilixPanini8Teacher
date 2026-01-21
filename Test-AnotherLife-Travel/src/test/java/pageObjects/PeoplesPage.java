package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PeoplesPage extends BasePage {

	public PeoplesPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@href='/people']")
	WebElement btn_people;
	
	@FindBy(xpath="//input[@placeholder='Search guides by all fields...']")
	WebElement txt_Searchguide;
	
	@FindBy(xpath="//div[@class='bg-card text-card-foreground flex flex-col gap-6 rounded-xl overflow-hidden hover:shadow-sm transition-all cursor-pointer group border-slate-200 border']")
	WebElement btn_guide;
	
	@FindBy(xpath="//a[@href='/activities/694672e870bf8f7f7ed52f31']")
	WebElement btn_Activity;
	
	public void Click_people() throws InterruptedException {
		Thread.sleep(2000);
		btn_people.click();
	}
	
	public void Search_title(String text) throws InterruptedException {
		Thread.sleep(2000);
		txt_Searchguide.sendKeys("test");
	}
	
	public void Click_guide() throws InterruptedException {
		Thread.sleep(2000);
		btn_guide.click();
	}
	
	public void Click_touractivities() throws InterruptedException {
		Thread.sleep(2000);
		btn_Activity.click();
	}
	
	
	
	

}
