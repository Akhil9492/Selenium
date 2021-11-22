package POM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddEmployee extends BaseClass {
	
	 static Login LoginObject;
	
	@Test
	public static void Login(POM.Login pageFactory) {
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		driver.get("https://opensource-demo.orangehrmlive.com/");

		LoginObject=pageFactory.initElements(driver, Login.class);
		
		LoginObject.UserId.sendKeys("admin");
		LoginObject.Password.sendKeys("admin123");
		LoginObject.LoginButton.click();		
	}

}
