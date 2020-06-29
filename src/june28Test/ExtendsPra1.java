package june28Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExtendsPra1 extends Config{

	@Test (priority=8)
	public void appleSearchTest() {
		System.out.println("apple Search  link test");
		driver.findElement(By.xpath(SBLoc)).getText();

	}
	@Test (priority=1)
	public void appleMacTest() {
		System.out.println("apple Mac link test");
		driver.findElement(By.xpath(MacLoc)).getText();
	
	}
	@Test (priority=2)
	public void appleiPadTest() {
		System.out.println("apple iPad link test");
		driver.findElement(By.xpath(iPadLoc)).getText();
	}
	@Test (priority=3)
	public void appleiPhoneTest() {
		System.out.println("apple iphone link test");
		driver.findElement(By.xpath(iPhoneLoc)).getText();
	}

}
