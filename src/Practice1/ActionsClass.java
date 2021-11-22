package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		// Admin
		
		Actions act=new Actions(driver);
		
		WebElement w1=driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
		WebElement w2=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement w3=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
//		act.moveToElement(w1).build().perform();
//		act.moveToElement(w2).build().perform();
//		act.moveToElement(w3).click().build().perform();
		
		act.moveToElement(w1).moveToElement(w2).moveToElement(w3).click().build().perform();
		
	}

}
