package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	   WebDriver driver;
	
	   @BeforeMethod
	   public void beforeMethod() {
	
	       System.out.println("Starting the browser session");
	   }
	   
	   @Test(priority=1)
	 
	     public void f() {
	 
	     System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
	
	     driver = new ChromeDriver();
	     
	     String url = "https://opensource-demo.orangehrmlive.com/";
	
	     driver.get(url);
	       
	     //Capturing the title and validating if expected is equal to actual
	
	       String expectedTitle = "OrangeHRM";
	 
	       String actualTitle = driver.getTitle();
	
	       Assert.assertEquals(actualTitle, expectedTitle);
	       
	       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		   driver.findElement(By.name("Submit")).click();
		   
	 }
	   
	   @Test(priority=2)
	   
	   public void homepage() throws InterruptedException {
		   
			WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));

			Actions actions = new Actions(driver);

			actions.moveToElement(admin).perform();
			Thread.sleep(5000);

//			Job Title
			WebElement job = driver.findElement(By.id("menu_admin_Job"));
			actions.moveToElement(job).perform();
			Thread.sleep(5000);

			WebElement jobTitle = driver.findElement(By.id("menu_admin_viewJobTitleList"));
			actions.click(jobTitle).perform();
			Thread.sleep(2000);
	   }
	   
	   @Test(dependsOnMethods="homepage")
	   
	   public void adduser() {
		   driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		   driver.findElement(By.xpath("//input[@name='jobTitle[jobTitle]']")).sendKeys("Nani@123");
		   driver.findElement(By.xpath("//textarea[@id='jobTitle_jobDescription']")).sendKeys("Akhil@3212");
		   driver.findElement(By.xpath("//input[@name='jobTitle[jobSpec]']")).sendKeys("D:\\HTML.text");
		   driver.findElement(By.xpath("//textarea[@name='jobTitle[note]']")).sendKeys("asdfghjklzxcvbnm");
		   driver.findElement(By.xpath("//input[@name='btnSave']")).click();
		   
	   }
	
	   @AfterMethod
	   public void afterMethod() {
 
       System.out.println("Closing the browser session");
       
       driver.quit();
  }
}
