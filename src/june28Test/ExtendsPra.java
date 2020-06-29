package june28Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExtendsPra extends SkipDisableTryCatch{

	@Test (priority=7)
	public void appleSupportTest() {
		System.out.println("apple Support link test");
		driver.findElement(By.xpath(SupportLoc)).getText();

	}

}
