package onceagain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFunction {
WebDriver driver;
	

	public void main(String[] args) {
		driver=new ChromeDriver();
		driver.getCurrentUrl();
	}

}
