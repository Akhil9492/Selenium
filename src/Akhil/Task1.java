package Akhil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://dotnetfiddle.net/");
		
		driver.findElement(By.cssSelector("input.new-package.form-control.input-sm")).sendKeys("nunit");
		
        List<WebElement> options = driver.findElements(By.xpath("//a[@package-id='NUnit']"));
        
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("nunit"))
			{
				option.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//a[contains(text(),'3.12.0')])[1]")).click();
}
	
	}