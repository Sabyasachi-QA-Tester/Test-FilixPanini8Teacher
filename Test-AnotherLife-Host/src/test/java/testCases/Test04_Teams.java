package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.TeamsPage;
import testBase.BaseClass;

public class Test04_Teams extends BaseClass {
	
	@Test
	public void Test_Teams() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Set_email(p.getProperty("email"));
		lp.Set_pass(p.getProperty("password"));
		lp.Check_Remember();
		lp.Click_SignIn();
		
		
		TeamsPage tp = new TeamsPage(driver);
		
		tp.Click_Teams();
		tp.Click_createTeam();
		tp.Set_TeamName(randomeString().toLowerCase());
		tp.Set_Email(randomeString()+"@gmail.com");
		tp.Set_Phone(randomeNumber());
		tp.Set_description(randomeString().toLowerCase());
		tp.Set_specialities("abc");
		tp.Add_specialities();
		tp.Set_city(randomeString().toLowerCase());
		tp.Set_state(randomeString().toLowerCase());
		tp.Set_country(randomeString().toLowerCase());
		tp.Set_longitude("2");
		tp.Set_latitude("2");
		tp.Set_uploadImage("C:\\Users\\CHEENTA\\Pictures\\Screenshots\\New folder\\test.jpeg");
		tp.Click_AddCreateTeam();
		tp.Click_delete();
		
//		tp.Click_createTeam();
//		tp.Set_TeamName(randomeString().toLowerCase());
//		tp.Set_Email(randomeString()+"@gmail.com");
//		tp.Set_Phone(randomeNumber());
//		tp.Set_description(randomeString().toLowerCase());
//		tp.Set_specialities("abc");
//		tp.Add_specialities();
//		tp.Set_city(randomeString().toLowerCase());
//		tp.Set_state(randomeString().toLowerCase());
//		tp.Set_country(randomeString().toLowerCase());
//		tp.Set_longitude("2");
//		tp.Set_latitude("2");
//		tp.Click_ClearForm();
		
	}

}
