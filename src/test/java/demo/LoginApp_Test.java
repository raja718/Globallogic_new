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
		
		
		driver.findElement(By.className("ico-login")).click();
		
		
	
	}
	}


