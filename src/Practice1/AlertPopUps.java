package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://register.rediff.com/commonreg/index.php?redr=//portfolio.rediff.com/portfolio");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("btn_register")).click();
		
		Thread.sleep(5000);
		
		Alert A1 =driver.switchTo().alert();
		System.out.println(A1.getText());
		
		// Validating Error Message
		
		String text=A1.getText();
		
		if(text.equals("Name is invalid"))
		{
			
			System.out.println("Correct Alert Message");
			
		} 
		else {
			System.out.println("In Correct Alert Message");
		}
		
		A1.accept();  // Accept
		
	   //  A1.dismiss();  Cancel
		
	}

}
