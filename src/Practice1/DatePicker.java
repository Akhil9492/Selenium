package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	private static WebElement date;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		
		WebElement w1=driver.findElement(By.className("ui-datepicker-trigger"));
		
		String dateValue="16-11-1997";
		
		selectByJS(driver, date,dateValue);
	
	}
	
	public static void selectByJS(WebDriver driver, WebElement element, String dateValue) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');",element);
		
	}

}
