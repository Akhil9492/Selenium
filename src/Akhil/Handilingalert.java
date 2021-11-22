package Akhil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handilingalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert A1= driver.switchTo().alert();
		
		System.out.println(A1.getText());
		A1.accept();
	}

}
