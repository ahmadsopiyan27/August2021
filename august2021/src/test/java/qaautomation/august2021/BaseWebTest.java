package qaautomation.august2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest implements IDriverManager {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	@BeforeMethod
	public void createChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		driver.get().get("https://testautomasi.com");
		driver.get().manage().window().maximize();

	}

	@AfterMethod
	public void quitChromeDriver() {
		// TODO Auto-generated method stub
		driver.get().quit();
	}

}
