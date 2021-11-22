package Practice1;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

public class Log4j {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Logger logger=Logger.getLogger("Log4j");
		
		//DOMCongigurator.configure("Log4j.xml");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		
		
	}

}
