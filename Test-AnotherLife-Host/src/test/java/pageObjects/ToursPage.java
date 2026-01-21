package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToursPage extends BasePage {

	public ToursPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/tours']")
	WebElement btn_tour;
	
	@FindBy(xpath="//a[@href='/host/tours/create']")
	WebElement btn_CreateTour;
	
	
	
	
	
	
	
	
	

}
