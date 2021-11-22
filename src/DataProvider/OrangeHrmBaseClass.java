package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class OrangeHrmBaseClass {
	public static WebDriver driver;

	@BeforeSuite
	public static void login() throws Exception {
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
         driver.manage().window().maximize();
		Thread.sleep(3000);
	}
} 
