package Akhil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("Akhilkumar Thota");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("Nani@123");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
        driver.findElement(By.xpath("//a[@type='button']")).click();
        	
	}

}
