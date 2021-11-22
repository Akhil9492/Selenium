package Practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
     FileInputStream file=new FileInputStream("D://Selenium Practice//ReadData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");  //Providing sheet name
		
		//XSSFSheet sheet=workbook.getSheetAt(0); //Providing sheet name
		
		int  noOfRows = sheet.getLastRowNum(); // returns the row count
		
	
		System.out.println("No. of Records in the Excel Sheet:" + noOfRows);
		
		for(int row=1; row <= noOfRows; row++) {
			
			XSSFRow current_row= sheet.getRow(row);
			
			
			String FirstName=current_row.getCell(0).getStringCellValue();
			String LastName=current_row.getCell(1).getStringCellValue();
			String Phone=current_row.getCell(2).getStringCellValue();
			String Email=current_row.getCell(3).getStringCellValue();
			String Address=current_row.getCell(4).getStringCellValue();
			String City=current_row.getCell(5).getStringCellValue();
			String State=current_row.getCell(6).getStringCellValue();
			String PostelCode=current_row.getCell(7).getStringCellValue();
			String Country=current_row.getCell(8).getStringCellValue();
			String UserName=current_row.getCell(9).getStringCellValue();
			String Password=current_row.getCell(10).getStringCellValue();
			String Conform_Password=current_row.getCell(11).getStringCellValue();
			
			
			
//			// Registration Process
//			
//			driver.findElement(By.linkText("REGISITER")).click();
			
			// Entering Contact Inforamation
			
			driver.findElement(By.name("firstName")).sendKeys(FirstName);
			driver.findElement(By.name("lastName")).sendKeys(LastName);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			// Entering mailing information
			
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(PostelCode);
			
			//Country Selection
			
			Select dropdown=new Select(driver.findElement(By.name("Country"))) ;
			dropdown.selectByVisibleText(Country);
		
			// Entering User information
			
			driver.findElement(By.name("email")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Conform_Password);
			
			// Submitting Form
			
			driver.findElement(By.name("submit")).click();
			
			
			if(driver.getPageSource().contains("Thank you for registering")) {
				
				System.out.println("Registration Completed for " + row + "record");
			}
			else {
				
				System.out.println("Registration Failed for " + row + "record");
				
			}
				
		}
		

	}

}
