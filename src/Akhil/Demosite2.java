
package Akhil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demosite2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=20_26");
		driver.manage().window().maximize();
       
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Desktops (13)']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]/i")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(2000);
		driver.findElement(By.name("option[218]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='9']")).click();
		driver.findElement(By.xpath("//input[@value='10']")).click();
		driver.findElement(By.xpath("//input[@value='11']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-option208']")).sendKeys("Pulihora");
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//select[@name='option[217]']"));
		Select s1=new Select(w1);
		s1.selectByIndex(02);
		
		driver.findElement(By.xpath("//textarea[@placeholder='Textarea']")).sendKeys("Saikumar Pulihora.com Address:Pulihora area");
		   Thread.sleep(3000);
		   
		     // FILE UPLOADING USING SENDKEYS ....
		   
	// driver.findElement(By.xpath("//button[@id='button-upload222']")).sendKeys("E:\\Assignments Stgntch\\Urban Ladder Project\\Java Programs.docx");
	//	   System.out.println("File is Uploaded Successfully");
		   
		   // Calander
		   
		  // driver.findElement(By.xpath("//input[@name='option[219]']")).click()
		     
		   WebElement date =driver.findElement(By.xpath("//input[@name='option[219]']"));
			String dateVal="16-11-1997";
			
			selectDateByJS(driver, date, dateVal);
		}

		
		  public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
			  
			  JavascriptExecutor js=((JavascriptExecutor) driver);
			  js.executeScript("arguments[0].setAttribute('value', '"+dateVal+"');", element);
			  
			  driver.findElement(By.xpath("//input[@name='option[221]']")).sendKeys("10:45");
			  
			  driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("2");
			  
			  driver.findElement(By.xpath("//button[@id='button-cart']")).click();

	
	}

}
