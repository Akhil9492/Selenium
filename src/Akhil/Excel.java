

package Akhil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

    File f=new File("D:\\Nani.xlsx");
		
	
	FileInputStream fis=new FileInputStream(f);
	
	
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
	XSSFSheet sheetName=workbook.getSheet("Sheet1");
	
	//System.out.println(sheetName.getRow(1).getCell(0).getStringCellValue());
	String S1= sheetName.getRow(1).getCell(0).getStringCellValue();
	String S2= sheetName.getRow(1).getCell(1).getStringCellValue();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(S1);
	driver.findElement(By.name("txtPassword")).sendKeys(S2);
	driver.findElement(By.id("btnLogin")).click();
	
     driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
     
     driver.manage().window().maximize();
     
     driver.findElement(By.id("menu_pim_addEmployee")).click();
     
     String S3= sheetName.getRow(1).getCell(2).getStringCellValue();
 	 String S4= sheetName.getRow(1).getCell(3).getStringCellValue();
 	 String S5= sheetName.getRow(1).getCell(4).getStringCellValue();
     
     driver.findElement(By.name("firstName")).sendKeys(S3);
 	 driver.findElement(By.id("lastName")).sendKeys(S4);
 	 driver.findElement(By.name("employeeId")).sendKeys(S4);
 	 
 	  driver.findElement(By.id("btnSave")).click();
 	  
 	  driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
 	

	}


	}


