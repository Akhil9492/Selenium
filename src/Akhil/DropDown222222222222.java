package Akhil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown222222222222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
//		WebElement w1=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
//		Select s1=new Select(w1);
//		
//		List l1= new ArrayList();
//		List<WebElement> options=s1.getOptions();	
//		
//		for(WebElement e:options) {
//			l1.add(e.getText());
//		}
//		System.out.println(l1);
		
//		
//		WebElement select = driver.findElement(By.id("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
//		List<WebElement> options = select.findElements(By.xpath("//option[contains(text(),'Belarus')]"));
//		for (WebElement option : options) {
//		if("Belarus".equals(option.getText()))
//		option.click();
//		}
//	
		
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select s1=new Select(w1);
	
	  // s1.selectByIndex(40);
	
		List<WebElement> Options=s1.getOptions();
		int L1=Options.size();
		System.out.println("Total Count is "+L1);
		
		for(WebElement w2:Options) {
			String Country_name=w2.getText();
			System.out.println("Name Counts ==== "+Country_name);
	
			s1.selectByIndex(40);
			
		
		}
		
	}

}
