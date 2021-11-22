package Akhil;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("Nani3212");
		driver.findElement(By.name("password")).sendKeys("Akhil@3212");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		screenshot(driver);
	}

	public static void screenshot(WebDriver driver) throws Exception{
	TakesScreenshot sc=(TakesScreenshot) driver;
	File source = sc.getScreenshotAs(OutputType.FILE);
	
	String path =System.getProperty("User.dir")+ "/screenshot/IMAGE"+System.currentTimeMillis()+".png";
    File dest =new File(path);
   
   FileUtils.copyFile(source,dest);
   
		
	}

}
