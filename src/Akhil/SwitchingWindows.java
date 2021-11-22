package Akhil;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		System.out.println(driver.getTitle());
		
	}

}
