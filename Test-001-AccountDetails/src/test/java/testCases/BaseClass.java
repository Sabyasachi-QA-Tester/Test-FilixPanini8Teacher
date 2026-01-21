package testCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public Logger logger;;
	public Properties p;
	
	@BeforeClass
	public void setup(String os, String br) throws IOException {
		
		FileReader file = new FileReader("/Test-001-AccountDetails/src/test/resources/config.properties");
		p = new Properties();
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass());
		switch(br.toLowerCase()) {
		case "chrome" : 
			driver=new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser name");
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://panini8.com/");
		//driver.get("https://panini8.com/dashboard/details");
	}
	

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	public String randomeString() {
		String generatestring = RandomStringUtils.randomAlphabetic(5);
		return generatestring;
	}
	
	
	public String randomeNumber() {
		String generatenumber = RandomStringUtils.randomNumeric(10);
		return generatenumber;
	}
	
	public String randomeAlphaNumeric() {
		String generatestring = RandomStringUtils.randomAlphabetic(3);
		String generatenumber = RandomStringUtils.randomNumeric(3);
		return(generatestring+"@"+generatenumber);
	}
	
	public String captureScreen(String tname) {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir")+"\\screenshots\\"+ tname + "_" +timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
