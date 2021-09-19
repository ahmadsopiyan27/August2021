package qaautomation.august2021;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseWebTest {
	/**
	 * Rigorous Test :-)
	 */

	@Test(testName = "verify login is failed", description = "login will be failed")
	public void test() {
		String username = "fullstackdemo";
		String password = "fullstackdemo";
		driver.get().findElement(By.xpath("//a[normalize-space()='Log In/Register As Student']")).click();
		driver.get().findElement(By.id("username")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String actualText = driver.get()
				.findElement(By.xpath(String.format("//strong[normalize-space()='fullstackdemo']", username)))
				.getText();
		String failedText = actualText + "failed";
		System.out.println(failedText);
		assertEquals(failedText, username);
	}

	@Test(testName = "verify login successful", description = "login will be working fime")
	public void test1() {
		String username = "fullstackdemo";
		String password = "fullstackdemo";
		driver.get().findElement(By.xpath("//a[normalize-space()='Log In/Register As Student']")).click();
		driver.get().findElement(By.id("username")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String actualText = driver.get()
				.findElement(By.xpath(String.format("//strong[normalize-space()='fullstackdemo']", username)))
				.getText();
		assertEquals(actualText, username);
	}

}
