package Akhil;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();  //radio button
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ABCDEFGH");
		
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
		Select s1=new Select(w1);
		s1.selectByIndex(1);
		
		// checkbox
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		
		//open window
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> h1=driver.getWindowHandles();
		Iterator<String>it=h1.iterator();
		String s2=it.next();
		String s3=it.next();
		driver.switchTo().window(s3);
		driver.switchTo().window(s2);
		
		//open Tab
		
		driver.findElement(By.xpath("//a[normalize-space()='Open Tab']")).click();
		Set<String> h2=driver.getWindowHandles();
		Iterator<String>it1=h2.iterator();
		String s4=it1.next();
		String s5=it1.next();
		driver.switchTo().window(s5);
		driver.switchTo().window(s4);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Akhilkumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		
		driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("ABCDEFGH");
		
		
		String before_xpath="//*[@id=\"resultTable\"]/tbody/tr[";
		String after_xpath="]/td[4]/a";
		
		for(int i=4; i<=49; i++) {
		
			String name=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
	}

}}
