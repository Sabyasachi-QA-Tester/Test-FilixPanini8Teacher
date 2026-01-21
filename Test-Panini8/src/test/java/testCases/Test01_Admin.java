package testCases;

import org.testng.annotations.Test;

import pageObjects.AdminPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test01_Admin extends BaseClass {
	
	@Test
	public void Test_Admin() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_Login();
		lp.Click_LoginWithEmailPassword();
		lp.Set_Email(p.getProperty("email"));
		lp.Set_Password(p.getProperty("password"));
		lp.Click_SignIn();
		lp.Click_Close();
		lp.Click_SideMenu();
		
		AdminPage ap = new AdminPage(driver);
		
		ap.Click_Admin();
		ap.Click_CreatorSpace();
		ap.Click_Creator();
		
		
//		ap.Click_Tests();
//		ap.Click_AddNew();
//		ap.Set_TestName(randomeString());
//		ap.Set_DurationTest("10");
//		ap.Set_Description(randomeString());
//		ap.Click_Tags();
//		ap.Click_Article();
//		ap.Click_AddArticle();
//		ap.Set_AddTitle(randomeString());
//		ap.Set_Description(randomeString());
//		ap.Click_GetStartedArticle();
		
		
	}

}
