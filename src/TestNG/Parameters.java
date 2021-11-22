package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


import com.beust.jcommander.Parameter;

public class Parameters {
	
	WebDriver driver;
	
	@BeforeClass
	
	@Parameter({"browser","url"})
	
	void setup(String browser,String app) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "\"C://chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "\"C://chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();	
		}
		driver.get(app);	
	}
	
	@Test(priority=1)
	void logoTest() {
		WebElement logo=driver.findElement(By.xpath(""));
		AssertJUnit.assertTrue(logo.isDisplayed(), "Logio not displayedon the page");
	}
	
	@Test(priority=2)
	
	void homepageTitle() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title, s1:"OrangeHRM",s2:"Title is not matched");
		
	}
	
	@AfterMethod
	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
