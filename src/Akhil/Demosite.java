package Akhil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demosite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=20_26");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Desktops (13)']")).click();
		
		driver.findElement(By.xpath("//select[@id='input-sort']")).click();
		
		 List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"input-sort\"]/option[5]"));
	        
			for(WebElement option :options)
			{
				if(option.getText().equalsIgnoreCase("Price (High > Low)"))
				{
					option.click();
					break;
				}
			}
			driver.findElement(By.xpath("//select[@id='input-limit']")).click();
	driver.findElement(By.xpath("//option[@value='http://tutorialsninja.com/demo/index.php?route=product/category&path=20&sort=p.price&order=DESC&limit=75']")).click();
	boolean found = false;
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]")).click();
	found = true;
	if (found == true) {
		System.out.println("Success: You have added Sony VAIO to your shopping cart!");
	} else {
		System.out.println("unsuccessfully added");
	}
	
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
	  
	  String before_xpath="//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[";
		String after_xpath="]/td[1]";
		
		for(int i=1; i<=3; i++) {
		
			String name=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);		
	}
		
		   driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
		   
//		  driver.findElement(By.name("quantity[35093]")).sendKeys("12");
//		   driver.findElement(By.xpath("//button[@type='submit']")).click();
//		   
//		   driver.findElement(By.xpath("//a[@class='accordion-toggle']")).click();
//                    
	}
	}
