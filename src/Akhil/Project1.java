 package Akhil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT'][2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a")).click();
		
		WebElement date =driver.findElement(By.id("//input[@id='ctl00_mainContent_view_date1']"));
		String dateVal="22-09-2021";
		
		selectDateByJS(driver, date, dateVal);
	}

	  public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		  
		  JavascriptExecutor js=((JavascriptExecutor) driver);
		  js.executeScript("arguments[0].setAttribute('value', '"+dateVal+"');", element);
		  
	}

}
