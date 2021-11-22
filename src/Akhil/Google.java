package Akhil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		
		
		List<WebElement> list=driver.findElement(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println("Auto Sugest List : :"+list.size());
		
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium webDriver")) {
				list.get(i).click();
				break;
			}
		}
	}

}
