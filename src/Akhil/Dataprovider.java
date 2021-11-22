package Akhil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Dataprovider {

	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		 driver=new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	 
	}
		
	@Test(dataProvider="LoginData")
	public void loginTest(String user,String pwd,String exp) {
	
		driver.get("http://admin-demo.noncommerce.com/login");
		
		WebElement txtEmail=driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		WebElement txtPassword=driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	
	driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	
	String exp_title="Dashboard / nonCommerece administation";
	String act_title=driver.getTitle();
	
	if(exp.equals("valid")) {
		if(exp_title.equals(act_title)) {
			
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	else if(exp.equals("Invalid")) {
		if(exp_title.equals(act_title)) {
			
			driver.findElement(By.linkText("Logout")).click();
			
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	}
	
	@DataProvider(name="LoginData")
	
	public String [][] getData()
	
	{
		String loginData [][]= {
				
				{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","admn","InValid"},
				{"admin@yourstore.com","addmin","InValid"},
					{"admin@yourstore.com","adm","Invalid"}};
	   
		return loginData;
	   
	}
   @AfterClass
   void tearDown() {
	   driver.close();
   }
}
