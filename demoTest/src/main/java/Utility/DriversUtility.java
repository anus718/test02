package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriversUtility {
	
	public static WebDriver getDriver(String Browser) {
		WebDriver driver;
		switch (Browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			driver = null;
		
	}
		return driver;

}
}