package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp_Test {
	WebDriver driver;

	@BeforeClass

	public void initial() {

		WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.setHeadless(true);

		driver = new ChromeDriver(options);
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}
	
	@Test
	private void test1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
	}

	
}
