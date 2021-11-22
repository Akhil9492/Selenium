package Groping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC2 extends TC1{

	 WebDriver driver;
	 
	@Test(priority=1)
	
	public void Openbrowser() {
	
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		
	     driver = new ChromeDriver();
	     
	     String url = "https://opensource-demo.orangehrmlive.com/";
	
	     driver.get(url);
	       
	     //Capturing the title and validating if expected is equal to actual
	
	       String expectedTitle = "OrangeHRM";
	}
	
    @Test(priority=2)
	
	public void Loginpage() {
		
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.name("Submit")).click();
	   
	   driver.manage().window().maximize();
}
	
	
	@Test(priority=3)
	
	public void Requirement() {
		
		WebElement admin = driver.findElement(By.xpath("//b[normalize-space()='Recruitment']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(admin).perform();
		
		driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']//font//font[contains(text(),'candidate')]")).click();
		
	}
}
