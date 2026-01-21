package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SessionScoresPage extends BasePage {

	public SessionScoresPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/student/scores']")
	WebElement btn_SessionScore;
	
	@FindBy(xpath="//a[@href='/student/scores/6882208b563343f9d7f80639']//button")
	WebElement btn_ViewMarks;
	
	@FindBy(xpath="//button[normalize-space()='Back to Dashboard']")
	WebElement btn_BacktoDashboard;
	
	public void Click_SessionScore() throws InterruptedException {
		Thread.sleep(2000);
		btn_SessionScore.click();
	}
	
	public void Click_ViewMarks() throws InterruptedException {
		Thread.sleep(2000);
		btn_ViewMarks.click();
	}
	
	public void Click_BacktoDashboard() throws InterruptedException {
		Thread.sleep(2000);
		btn_BacktoDashboard.click();
	}
	
	

}
