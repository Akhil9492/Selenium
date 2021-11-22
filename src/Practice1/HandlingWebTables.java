package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

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
		
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		// html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table
		// /html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[1]/td[5]
		
	int rowcount=driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
	
	int statuscount = 0;
    for(int i=1; i<=rowcount; i++) {
		
		String staus = driver.findElement(By.xpath("//*[id='resultTable']/tbody/tr[" + i +"]/td[5]")).getText();
		
		if(staus.equals("Enabled")) {
			statuscount = statuscount +i;
			
		}
	}

	}

}
