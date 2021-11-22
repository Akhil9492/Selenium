package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest {
	
	//WebDriver driver;
	@Test
	void logoTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		AssertJUnit.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
	}
	
	@Test
	void homePageTitle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(5000);
	}
	
//	@AfterMethod
//	void tearDown() {
//		Driver.quite();
//	}

}
