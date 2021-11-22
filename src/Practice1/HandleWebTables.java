package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTables {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

			WebDriver driver=new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://classic.freecrm.com/index.html");

			driver.findElement(By.name("username")).sendKeys("Nani3212");
			driver.findElement(By.name("password")).sendKeys("Akhil@3212");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().frame("mainpanel");   // Switch to main frame
			
			driver.findElement(By.xpath("//a[@title='Contacts']")).click();
			
			//*[@id="vContactsForm"]/table/tbody/tr[3]/td[1]
			
			//*[@id="vContactsForm"]/table/tbody/tr[5]/td[1]/input
			
			//*[@id="vContactsForm"]/table/tbody/tr[7]/td[1]
			
			String before_xpath="//*[@id=\"vContactsForm\"]/table/tbody/tr[";
			
			String After_xpath="]/td[2]/a";
			
			for(int i=3;i<=7;i++) {
				String name=driver.findElement(By.xpath(before_xpath+i+After_xpath)).getText();
				System.out.println(name);
				
				if(name.contains("smab Nani")) {
					
					//*[@id="vContactsForm"]/table/tbody/tr[6]/td[1] smab Nani name Xpath
					
					driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
					
				}
				
			}
			    
	}

}
