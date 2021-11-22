package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		
		WebElement Day=driver.findElement(By.id("day"));
		WebElement Month=driver.findElement(By.id("month"));
		WebElement Year=driver.findElement(By.id("year"));
		
		
		
		String dob="16-Nov-1997";
		String dobArr[] = dob.split("-");
		
		selectvalue(Day, dobArr[0]);
		selectvalue(Month, dobArr[1]);
		selectvalue(Year, dobArr[2]);		

	}
		
		public static void selectvalue(WebElement e1, String value) {
			Select s1=new Select(e1);
			s1.selectByVisibleText(value);
			
	}	
		
		
	}


