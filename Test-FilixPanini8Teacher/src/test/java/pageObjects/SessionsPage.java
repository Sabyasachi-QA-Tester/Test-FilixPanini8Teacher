package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SessionsPage extends BasePage {

	public SessionsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/teacher/session/my-session']")
	WebElement btn_Sessions;
	
	@FindBy(xpath="//input[@placeholder='Search sessions...']")
	WebElement txt_SearchSession;
	
	@FindBy(xpath="//a[@href='/teacher/session/694f89e94c1846532ac1b554']//button")
	WebElement btn_Sessionlist;
	
	@FindBy(xpath="//button[normalize-space()='Self Assessment']")
	WebElement btn_SelfAssessment;
	
	@FindBy(xpath="//label[@for='liked-yes']")
	WebElement btn_emoji;
	
	@FindBy(xpath="//button[normalize-space()='Submit Feedback']")
	WebElement btn_submit;
	
	@FindBy(xpath="//button[@id='radix-«r35»']//button[contains(@value,'on')]")
	WebElement btn_participants;
	
	@FindBy(xpath="//a[contains(.,'Back to Dashboard')]")
	WebElement btn_backtoDashboard;
	
	public void Click_Session() throws InterruptedException {
		Thread.sleep(2000);
		btn_Sessions.click();
	}
	
	public void Session_drpdown(String sessiondrp) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@class,'hover:border-gray-400 transition-all duration-200 appearance-none cursor-pointer')]//option[@value='"+sessiondrp+"']")).click();
	}
	
	public void Set_Sessions(String session) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchSession.sendKeys(session);
	}
	
	public void Click_SessionList() throws InterruptedException {
		Thread.sleep(2000);
		btn_Sessionlist.click();
	}
	
	public void User_drpdown(String user) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@tabindex='-1']//option[@value='"+user+"']")).click();
	}
	
	public void Click_Assessment() throws InterruptedException {
		Thread.sleep(2000);
		btn_SelfAssessment.click();
	}
	
	public void Click_emoji() throws InterruptedException {
		Thread.sleep(2000);
		btn_emoji.click();
	}
	
	public void Click_SubmitFeedback() throws InterruptedException {
		Thread.sleep(2000);
		btn_submit.click();
	}
	
	public void Click_Participants() throws InterruptedException {
		Thread.sleep(2000);
		btn_participants.click();
	}
	
	public void Click_Dashboard() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	Thread.sleep(2000);
    	js.executeScript("window.scrollTo(0, 0);");
		btn_backtoDashboard.click();
	}

}
