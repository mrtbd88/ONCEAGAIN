package june28Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDisableTryCatch extends Config{

	@Test (priority=4)
	public void SkipWatchTest(){
		System.out.println (" This test is going to be skipped since no longer needed");
		driver.findElement(By.xpath(WatchLoc)).getText();
		throw new SkipException ("skipping this test because business requiment is changed. Here is the JIRA Ticket # AP-001");
		
	}
	
	@Test(priority=5, enabled=true)
	public void distableTVTest(){
		System.out.println (" Don't want to exectue the test at all and it won't show up in report");
		driver.findElement(By.xpath(TVLoc)).getText();	
		}

	@Test(priority=6, enabled=true)
	public void tryCatchWatchTest(){
		System.out.println (" try catch block test");
		driver.findElement(By.xpath(MusicLoc)).getText();
	
		String actual 		= "Musics";
		String expected 	= "Music";
	
		try {
			Assert.assertEquals(actual, expected);
		}catch (Throwable issue){
			System.err.println ("actual is not matching with expected" + issue);
			
		}
		
		
		
		
		
		
	}

}
