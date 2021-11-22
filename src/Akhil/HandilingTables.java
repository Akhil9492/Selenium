package Akhil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandilingTables {

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
		
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();

		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		
		//*[@id="resultTable"]/tbody/tr[1]/td[4]/a
		
		String before_xpath="//*[@id=\"resultTable\"]/tbody/tr[";
		String after_xpath="]/td[4]/a";
		
		for(int i=4; i<=49; i++) {
		
			String name=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			
			if(name.contains("Duval")) {

				driver.findElement(By.xpath("(//input[@type='checkbox'])[19]")).click();
				
			}
		}

	}

}
