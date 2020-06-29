package june28Test;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Config extends WebDriverFunction{
	
	public String url       = "https://www.apple.com";
	public String MacLoc    ="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a";
	public String iPadLoc   ="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[3]/a";
	public String iPhoneLoc ="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[4]/a";
	public String WatchLoc  ="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[5]/a";
	public String TVLoc     ="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[6]/a";
	public String MusicLoc  ="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[7]/a";
	public String SupportLoc="//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a";
	public String SBLoc     ="//*[@id=\"ac-gn-link-search\"]";
	
	@BeforeSuite
	public void dbConnect() throws SQLException {
//		dbConnection();
//		getCurrentTimef1();
		getCurrentTimef2();
	}
		
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\KL22020\\drivers\\chromedriver.exe");
		
		    driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.get(url);
			System.out.println("Chrome driver open");	
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println (" browser is about to close +++++++");
		driver.close();
		System.out.println (" browser is closed +++++++ ");
	}
   @AfterSuite
   public void teardown() {
	   System.out.println("Browser is Terminated+++++++");
	   driver.quit();
	   
   }

}
