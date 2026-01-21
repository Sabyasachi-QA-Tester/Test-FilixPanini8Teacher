package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoriesPage extends BasePage {

	public StoriesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='hidden lg:flex items-center gap-8']//a[4]")
	WebElement btn_stories;
	
	@FindBy(xpath="//body[1]/div[2]/main[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/article[1]/div[1]/div[4]/div[1]/button[1]")
	WebElement btn_likes;
	
	@FindBy(xpath="//body[1]/div[2]/main[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/article[1]/div[1]/div[4]/div[1]/button[2]")
	WebElement btn_comment;
	
	@FindBy(xpath="//input[@placeholder='Write a comment...']")
	WebElement txt_comment;
	
	@FindBy(xpath="//button[@class='p-3 rounded-full transition-all bg-primary-600 hover:bg-primary-700 text-white shadow-lg']")
	WebElement btn_send;
	
	@FindBy(xpath="//button[@class='p-2 rounded-full hover:bg-gray-100 transition']")
	WebElement btn_close;
	
	public void Click_stories() throws InterruptedException {
		Thread.sleep(2000);
		btn_stories.click();
	}
	
	public void Click_likes() throws InterruptedException {
		Thread.sleep(2000);
		btn_likes.click();
	}
	
	public void Click_comment() throws InterruptedException {
		Thread.sleep(2000);
		btn_comment.click();
	}
	
	public void Set_comment(String text) throws InterruptedException {
		Thread.sleep(2000);
		txt_comment.sendKeys(text);
	}
	
	public void Click_send() throws InterruptedException {
		Thread.sleep(2000);
		btn_send.click();
	}
	
	public void Click_close() {
		btn_close.click();
	}
	
	
	
}
