package Practice1;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("enterimg")).click();
		
		// Firstname and Lastname
		driver.findElement(By.xpath(" //input[@placeholder='First Name']")).sendKeys("Akhilkumar");
		driver.findElement(By.xpath(" //input[@placeholder='Last Name']")).sendKeys("NikhilKumar");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(" //input[@ng-model='EmailAdress']")).sendKeys("XYZ@gmail.com");
		
		driver.findElement(By.xpath(" //input[@ng-model='Phone']")).sendKeys("1234567890");
		
		
		// Gender Radio Button
		System.out.println(driver.findElement(By.name("radiooptions")).isSelected());
		driver.findElement(By.name("radiooptions")).click();
		
		Thread.sleep(5000);
		// CheckBox
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		
		Thread.sleep(5000);
		// DropDown
		
		
		
		WebElement w1=driver.findElement(By.id("Skills"));
		Select s1=new Select(w1);

	
		List<WebElement> Options=s1.getOptions();
		int L1=Options.size();
		System.out.println("Total Count is "+L1);
		
		for(WebElement w2:Options) {
			String Country_name=w2.getText();
			System.out.println("Name Counts ==== "+Country_name);
	
			//s1.selectByIndex(40);
			
			s1.selectByVisibleText("AutoCAD");
			
		
		}
		
//		Thread.sleep(5000);
//		
//		
//		WebElement w2=driver.findElement(By.id("select2-country-container"));
//		Select s8=new Select(w2);
//
//	
//		List<WebElement> Options1=s8.getOptions();
//		int L2=Options1.size();
//		System.out.println("Total Count is "+L2);
//		
//		for(WebElement w3:Options1) {
//			String Country_name=w3.getText();
//			System.out.println("Name Counts ==== "+Country_name);
//	
//			//s1.selectByIndex(40);
//			
//			s8.selectByVisibleText("India");	
//		
		
		
//		WebElement w2=driver.findElement(By.id("select2-country-container"));
//		Select s2=new Select(w2);
//
//	
//		List<WebElement> O1=s2.getOptions();
//		int L2=O1.size();
//		System.out.println("Total Count is "+L2);
//		
//		for(WebElement Web:Options) {
//			String Country_name=Web.getText();
//			System.out.println("Name Counts ==== "+Country_name);
//	
//			//s1.selectByIndex(40);
//			
//			s1.selectByVisibleText("India");
//		
//		}
//		
		
		WebElement Year=driver.findElement(By.id("yearbox"));
       	Select ss1=new Select(Year);
       	ss1.selectByValue("1997");
       	
       	WebElement Month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
       	Select ss2=new Select(Month);
       	ss2.selectByVisibleText("November");
       	
    	WebElement Day=driver.findElement(By.id("daybox"));
       	Select ss3=new Select(Day);
       	ss3.selectByValue("16");
       	
       	
       	
       	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akhil@3212");
       	
    	driver.findElement(By.id("secondpassword")).sendKeys("Akhil@3212");
		
    	driver.findElement(By.name("signup")).click();
		
		
		
		
		
	}
	
	
	
	
	
		
	}


