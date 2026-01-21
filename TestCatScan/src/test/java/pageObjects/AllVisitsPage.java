package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllVisitsPage extends BasePage {

	public AllVisitsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='All Visits']")
	WebElement btn_AllVisit;
	
	@FindBy(xpath="//tbody//tr[1]//td[6]//button[contains(@class,'cursor-pointer')][1]")
	WebElement btn_view;
	
	@FindBy(xpath="//button[normalize-space()='Edit Visit']")
	WebElement btn_editVisit;
	
	@FindBy(xpath="//textarea[@id='notes']")
	WebElement txt_notes;
	
	@FindBy(xpath="//button[normalize-space()='Save Changes']")
	WebElement btn_SaveChanges;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement btn_CancelVisit;
	
	@FindBy(xpath="//button[@class=\"inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium transition-all disabled:pointer-events-none disabled:opacity-50 [&_svg]:pointer-events-none [&_svg:not([class*='size-'])]:size-4 shrink-0 [&_svg]:shrink-0 outline-none focus-visible:border-ring focus-visible:ring-ring/50 focus-visible:ring-[3px] aria-invalid:ring-destructive/20 dark:aria-invalid:ring-destructive/40 aria-invalid:border-destructive border bg-background shadow-xs hover:bg-accent hover:text-accent-foreground dark:bg-input/30 dark:border-input dark:hover:bg-input/50 h-9 px-4 py-2 has-[>svg]:px-3 gap-2\"]")
	WebElement btn_back;
	
	@FindBy(xpath="//tbody//tr[1]//td[6]//button[contains(@class,'cursor-pointer')][2]")
	WebElement btn_delete;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement btn_cancel;
	
	public void Click_AllVisit() {
		btn_AllVisit.click();
	}
	
	public void Click_View() {
		btn_view.click();
	}
	
	public void Click_editVisit() {
		 btn_editVisit.click();
	}
	
	public void set_text(String text) {
		txt_notes.sendKeys(text);
	}
	
	public void Click_save() throws InterruptedException {
		Thread.sleep(2000);
		btn_SaveChanges.click();
	}
	
	public void Click_cancelVisit() throws InterruptedException {
		Thread.sleep(2000);
		btn_CancelVisit.click();
	}
	
	public void Click_back() {
		btn_back.click();
	}
	
	public void Click_delete() {
		btn_delete.click();
	}
	
	public void Click_cancel() {
		btn_cancel.click();
	}
	
}
