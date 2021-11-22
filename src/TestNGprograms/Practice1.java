package TestNGprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Practice1 {
   
	 WebDriver driver;
	   @Test
	 
	   public void f() {
	 
	       System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
	
	     driver = new ChromeDriver();
	    String url = "https://opensource-demo.orangehrmlive.com/";
	
	       driver.get(url);
   //Capturing the title and validating if expected is equal to actual
	
	       String expectedTitle = "OrangeHRM";
	 
	       String actualTitle = driver.getTitle();
	
	       Assert.assertEquals(actualTitle, expectedTitle);
	     }
	
	   @BeforeMethod
	
	   public void beforeMethod() {
	
	       System.out.println("Starting the browser session");
	   }
	   
	   @AfterMethod
		   public void afterMethod() {
	 
	       System.out.println("Closing the browser session");
	 
	       driver.quit();
	  }
	}
	

