package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ToursPage extends BasePage {

	public ToursPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/tours']")
	WebElement btn_tour;
	
	@FindBy(xpath="//input[@placeholder='Search tours by title, location, or description...']")
	WebElement txt_SearchTitle;
	
	@FindBy(xpath="//div[@class='container mx-auto px-4 py-12']//div[1]//div[1]//div[2]//div[4]//a[1]//button[1]")
	WebElement btn_viewdetail;
	
	@FindBy(xpath="//select[@class='w-full p-3 border border-slate-300 rounded-lg focus:ring-2 focus:ring-primary-500 focus:border-primary-500']")
	WebElement drp_Date;
	
	@FindBy(xpath="(//button[normalize-space()='Book Now'])[1]")
	WebElement btn_BookNow;
	
	@FindBy(xpath="//textarea[@placeholder='Any special requests or questions for the host...']")
	WebElement txt_MsgtoHost;
	
	@FindBy(xpath="//button[normalize-space()='Send Booking Request']")
	WebElement btn_BookingReq;
	
	@FindBy(xpath="(//button[normalize-space()='View Details'])[1]")
	WebElement btn_detail;
	
	@FindBy(xpath="//button[normalize-space()='Cancel Booking']")
	WebElement btn_CancelBooking;
	
	@FindBy(xpath="//button[normalize-space()='Confirm Cancellation']")
	WebElement btn_ConfirmCancel;
	
	@FindBy(xpath="//button[contains(text(),'Explore New Tours →')]")
	WebElement btn_exploretour;
	
	public void Click_tour() throws InterruptedException {
		Thread.sleep(2000);
		btn_tour.click();
	}
	
	public void Search_title(String title) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchTitle.sendKeys(title);
	}
	
	public void Click_ViewDetail() {
		btn_viewdetail.click();
	}
	
	public void drpdown_Date() throws InterruptedException {
		Select sl = new Select(drp_Date);
		Thread.sleep(2000);
		sl.selectByValue("2025-10-23T00:00:00.000Z");
	}
	
	public void Click_BookNow() throws InterruptedException {
		Thread.sleep(2000);
		btn_BookNow.click();
	}
	
	public void Set_MsgtoHost(String text) throws InterruptedException {
		Thread.sleep(2000);
		txt_MsgtoHost.sendKeys(text);
	}
	
	public void Click_BookingReq() throws InterruptedException {
		Thread.sleep(2000);
		btn_BookingReq.click();
	}
	
	public void Click_detail() throws InterruptedException {
		Thread.sleep(2000);
		btn_detail.click();
	}
	
	public void Click_CancelBooking() throws InterruptedException {
		Thread.sleep(2000);
		btn_CancelBooking.click();
	}
	
	public void Click_ConfirmCancelBooking() throws InterruptedException {
		Thread.sleep(2000);
		btn_ConfirmCancel.click();
	}
	
	public void btn_exploretours() throws InterruptedException {
		Thread.sleep(2000);
		btn_exploretour.click();
	}
	
	

}
