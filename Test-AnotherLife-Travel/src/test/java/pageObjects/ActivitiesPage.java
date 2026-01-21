package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivitiesPage extends BasePage {

	public ActivitiesPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@href='/activities']")
	WebElement btn_activities;
	
	@FindBy(xpath="//input[@placeholder='Search by activity name, location, or experience...']")
	WebElement txt_SearchActivity;
	
	@FindBy(xpath="//div[@data-slot='card'][.//h3[normalize-space()='test activity up']]")
	WebElement btn_card;
	
	@FindBy(xpath="//button[normalize-space()='Full Tour']")
	WebElement btn_tour;
	
	@FindBy(xpath="//div[@class='hidden lg:block space-y-6 sticky top-6']//button[normalize-space()='View Full Tour']")
	WebElement btn_viewtour;
	
	public void Click_Activities() throws InterruptedException {
		Thread.sleep(2000);
		btn_activities.click();
	}
	
	public void Search_title(String text) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchActivity.sendKeys(text);
	}
	
	public void Click_card() throws InterruptedException {
		Thread.sleep(2000);
		btn_card.click();
	}
	
	public void Click_tour() throws InterruptedException {
		Thread.sleep(2000);
		btn_tour.click();
	}
	
	public void Click_viewtour() throws InterruptedException {
		Thread.sleep(2000);
		btn_viewtour.click();
	}
	
	
	
	

}
