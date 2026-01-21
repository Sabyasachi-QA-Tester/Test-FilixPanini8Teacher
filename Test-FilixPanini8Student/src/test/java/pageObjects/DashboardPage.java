package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/student/cohort/6881e6573ab5b1fe9311c807']//button")
	WebElement btn_view;
	
	@FindBy(xpath="//button[@class='mr-4 p-2 text-blue-500 hover:text-blue-600 bg-blue-50 rounded-lg border border-blue-100']")
	WebElement btn_back;
	
	@FindBy(xpath="//button[@class='px-4 py-2 rounded-lg flex items-center text-sm font-medium text-gray-600 hover:bg-gray-100/50'][normalize-space()='Previous']")
	WebElement btn_previous;
	
	@FindBy(xpath="//tr[1]//td[5]//button[@class='text-indigo-600 hover:text-indigo-800 flex justify-center items-center gap-x-1 w-full px-3 py-1.5 rounded-lg transition-colors']")
	WebElement btn_Report;
	
	public void Click_View() throws InterruptedException {
		Thread.sleep(2000);
		btn_view.click();
	}
	
	public void Click_ViewBack() throws InterruptedException {
		Thread.sleep(2000);
		btn_back.click();
	}
	
	public void Click_Previous() throws InterruptedException {
		Thread.sleep(2000);
		btn_previous.click();
	}
	
	public void Click_Report() throws InterruptedException {
		Thread.sleep(2000);
		btn_Report.click();
	}
	
	
	
	

}
