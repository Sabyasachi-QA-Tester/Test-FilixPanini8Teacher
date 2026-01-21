package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Welcome, Rohan Singh']")
	WebElement txt_welcome;
	
	@FindBy(xpath="//div[@data-slot='card'][1]")
	WebElement txt_profile;
	
	@FindBy(xpath="//div//a[@href='/visits/17']")
	WebElement btn_eyeResult;
	
//	@FindBy(xpath="//div[@class='space-y-4']") // all cards in my visit history section
//	WebElement btn_eyeResults;
	
	@FindBy(xpath="//button[normalize-space()='Edit Visit']")
	WebElement btn_editVisit;
	
	@FindBy(xpath="//div[@class='flex items-center space-x-2 p-2 border rounded-md bg-muted/50']")
	WebElement txt_CataractStatus;
	
	@FindBy(xpath="//textarea[@id='notes']")
	WebElement txt_notes;
	
	@FindBy(xpath="//button[normalize-space()='Save Changes']")
	WebElement btn_SaveChanges;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement btn_Cancel;
	
	@FindBy(xpath="//button[@class=\"inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium transition-all disabled:pointer-events-none disabled:opacity-50 [&_svg]:pointer-events-none [&_svg:not([class*='size-'])]:size-4 shrink-0 [&_svg]:shrink-0 outline-none focus-visible:border-ring focus-visible:ring-ring/50 focus-visible:ring-[3px] aria-invalid:ring-destructive/20 dark:aria-invalid:ring-destructive/40 aria-invalid:border-destructive border bg-background shadow-xs hover:bg-accent hover:text-accent-foreground dark:bg-input/30 dark:border-input dark:hover:bg-input/50 h-9 px-4 py-2 has-[>svg]:px-3 gap-2\"]")
	WebElement btn_back;
	
	
	public String GetwelcomeMsg() {
		try {
			return(txt_welcome.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public void Get_profileInfo() {
		System.out.println(txt_profile.getText());
	}
	
	public void Click_eyeResults() {
		btn_eyeResult.click();
//		btn_eyeResults.click();
	}
	
	public void Click_editVisit() throws InterruptedException {
		Thread.sleep(2000);
		btn_editVisit.click();
	}
	
//	public void Get_status() {
//		System.out.println(txt_CataractStatus.getText());
//	}
	
	public void set_text(String text) {
		txt_notes.sendKeys(text);
	}
	
	public void Click_save() throws InterruptedException {
		Thread.sleep(2000);
		btn_SaveChanges.click();
	}
	
	public void Click_cancel() {
		btn_Cancel.click();
	}
	
	public void Click_back() {
		btn_back.click();
	}
	
	
	
	

}
