package testCases;

import org.testng.annotations.Test;

import pageObjects.PeoplesPage;
import testBase.BaseClass;

public class Test05_Peoples extends BaseClass {
	
	@Test
	public void Test_Peoples() throws InterruptedException {
		
		PeoplesPage pa = new PeoplesPage(driver);
		
		pa.Click_people();
		pa.Search_title("test test");
		pa.Click_guide();
		pa.Click_touractivities();
		
		
		
	}
	

}
