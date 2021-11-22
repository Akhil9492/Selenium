package Akhil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project2 {

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
		
		driver.switchTo().frame("mainpanel");
		
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[3]/a"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Company')]")).click();
		
		driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys("AkhilKumar");
		driver.findElement(By.xpath("//input[@name='industry']")).sendKeys("ABCDEFGH");
		driver.findElement(By.xpath("//input[@id='annual_revenue']")).sendKeys("150000");
		driver.findElement(By.xpath("//input[@name='num_of_employees']")).sendKeys("25");
		
		
		WebElement w2=driver.findElement(By.xpath("//select[@name='status']"));
		Select s1=new Select(w2);
		s1.selectByVisibleText("New");
		
		WebElement w3=driver.findElement(By.name("category"));
		Select s2=new Select(w3);
		s2.selectByVisibleText("Client");
		
		WebElement w4=driver.findElement(By.xpath("//select[@name='priority']"));
		Select s3=new Select(w4);
		s3.selectByVisibleText("High");
		
		driver.findElement(By.name("identifier")).sendKeys("AkhilKumar123");
		driver.findElement(By.xpath("//input[@name='vat_number']")).sendKeys("1025ABH");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("22154885");
		
		driver.findElement(By.xpath("//input[@id='website']")).sendKeys("AkhilKumar123@gmail.com");
		driver.findElement(By.id("email")).sendKeys("1025ABH@123.com");
		driver.findElement(By.xpath("//input[@id='symbol']")).sendKeys("012345");
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("nanityn");
		
		driver.findElement(By.xpath("//input[@name='address_title']")).sendKeys("AkhilKumar123");
		
		WebElement w5=driver.findElement(By.xpath("//select[@name='type']"));
		Select s4=new Select(w5);
		s4.selectByVisibleText("Billing Address");
		
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Hyderabad,JNTUH,SEC");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("AMPERPET");
		driver.findElement(By.name("state")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("012345");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("nanityn");
		driver.findElement(By.xpath("/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();
	
      // driver.close();
       // driver.switchTo().frame("1");
		
		WebElement w7=driver.findElement(By.xpath("//a[@title='Docs']"));
		//WebElement w7=driver.findElement(By.linkText("https://classic.freecrm.com/system/index.cfm?action=document"));
		
		Actions a2=new Actions(driver);
		a2.moveToElement(w7).build().perform();
		driver.findElement(By.xpath("//a[@title='New Document']")).click();
		
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Practice Selenium");
		driver.findElement(By.id("version")).sendKeys("4.15");
		
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("E:\\Assignments Stgntch\\Urban Ladder Project\\Java Programs.docx");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//select[@name='directory_id']")).click();
		
		driver.findElement(By.xpath("//input[@onclick=\"javascript:lookup('CONTACT', 'docForm' , this.form.contact_lookup.value);\"]")).click();
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("akhil");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
