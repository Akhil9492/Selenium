package POM2;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistationTest {

	@Test
	public void VerifyFlightReg(){
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		RegistationPage RGPage =new RegistationPage(driver);

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		RGPage.clickRegLink();
		RGPage.setFirstName("Akhilkumar");
		RGPage.setLastName("Nani");
		RGPage.setphone("9945123655");
		RGPage.setUserName("abc@gmail.com");
		RGPage.setaddress("Hyderabad,JNTUH");
		RGPage.setCity("KPHB");
		RGPage.setState("Telangana");
		RGPage.setPostalCode("500086");
		RGPage.setUsername("Akhil123@gmail.com");
		RGPage.setpassword("Akhil@123456");
		RGPage.setconfirmPassword("Akhil@123456");
		RGPage.setregisterBtn();
		
		
		
		if(driver.getPageSource().contains("Thank you for Registation"))
		{
			System.out.println("Registation successfully");
		}
		
		else {
			System.out.println("Yor registation failed");
		}
	}
	
	
	
}
