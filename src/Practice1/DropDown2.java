package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

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
		
		Select s1=new Select(Day);
		s1.selectByIndex(16);
		System.out.println(s1.isMultiple());
		
		List<WebElement> listDays=s1.getOptions();
		System.out.println(listDays.size());
		int TotalDays=listDays.size()-1;
		System.out.println("Total days are: "+ TotalDays);
		
		
		for(int i=0;i<listDays.size(); i++) {
			String dayVal =listDays.get(i).getText();
			System.out.println(dayVal);
		}

	}

}
