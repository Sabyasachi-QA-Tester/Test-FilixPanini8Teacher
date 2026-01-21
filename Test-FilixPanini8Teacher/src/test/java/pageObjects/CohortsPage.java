package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CohortsPage extends BasePage {

	public CohortsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Cohorts']")
	WebElement btn_Cohort;
	
	@FindBy(xpath="//input[@placeholder='Search by title...']")
	WebElement txt_SearchTitle;
	
	@FindBy(xpath="//td//a[contains(.,'Class 2')]")
	WebElement btn_title;
	
	@FindBy(xpath="//button[@aria-selected='false']")
	WebElement btn_ThemesChapters;
	
	@FindBy(xpath="//h4[normalize-space()='Finland Content']")
	WebElement btn_books;
	
	@FindBy(xpath="//a[@href='/teacher/dashboard']")
	WebElement btn_backtoDashboard;
	
	public void Click_Cohorts() throws InterruptedException {
		Thread.sleep(2000);
		btn_Cohort.click();;
	}
	
	public void Search_title(String title) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchTitle.sendKeys(title);
	}
	
	public void Click_title() throws InterruptedException {
		Thread.sleep(2000);
		btn_title.click();
	}
	
	public void Click_Themes() throws InterruptedException {
		Thread.sleep(2000);
		btn_ThemesChapters.click();
	}
	
	public void Click_Books() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		btn_books.click();
	}
	
	public void Click_Dashboard() throws InterruptedException {
		Thread.sleep(2000);
		btn_backtoDashboard.click();
	}

}
