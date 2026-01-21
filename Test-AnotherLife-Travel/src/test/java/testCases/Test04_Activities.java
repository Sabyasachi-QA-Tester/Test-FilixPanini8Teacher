package testCases;

import org.testng.annotations.Test;

import pageObjects.ActivitiesPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test04_Activities extends BaseClass {

	@Test
	public void Test_Activity() throws InterruptedException {
		
		
		ActivitiesPage ap = new ActivitiesPage(driver);
		
		ap.Click_Activities();
		ap.Search_title("test activity up");
		ap.Click_card();
		ap.Click_tour();
		ap.Click_viewtour();
		
		
		
	}
	
	
	
}
