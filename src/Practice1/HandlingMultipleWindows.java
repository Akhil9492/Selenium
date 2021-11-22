package Practice1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("newbrowserwindow123")).click();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-438c6d78 elementor-align-center elementor-widget elementor-widget-button']//a[@role='button']")).click();
		//Thread.sleep(5000);
		
		Set <String> s=driver.getWindowHandles();
		
		for(String i:s) {
			
			//System.out.println(i);
			
			
			String t=driver.switchTo().window(i).getTitle();
			
			if(t.contains("Frames & windows")) {
				
				driver.close();
			// System.out.println(t);
		}
		
		
		
	}

	}}
