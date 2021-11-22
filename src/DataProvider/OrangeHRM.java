 package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRM extends OrangeHrmBaseClass{
	
	@Test(dataProvider = "myDataProvider")
	
	public static void addEmployeeFunction(String fname, String mname, String lname) throws Exception {
		
		
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Actions actions = new Actions(driver);
		actions.moveToElement(admin).perform();
		Thread.sleep(5000);

   //	 Job Title
		
		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		actions.moveToElement(job).perform();
		Thread.sleep(5000);

		WebElement jobTitle = driver.findElement(By.id("menu_admin_viewJobTitleList"));
		actions.click(jobTitle).perform();
		Thread.sleep(2000);
	
//		To save Job Title
		//driver.findElement(By.id("btnAdd")).click();	
//		WebElement PIMMenu = driver.findElement(By.xpath("//b[normalize-space()='PIM']"));
//
//		Actions actions = new Actions(driver);
//
//		actions.moveToElement(PIMMenu).perform();
//		WebElement PIMMenu1 = driver.findElement(By.xpath("//a[normalize-space()='Add Employee']"));
//
//		Actions actions1 = new Actions(driver);
//
//		actions1.moveToElement(PIMMenu1).perform();
//
//		driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
//
	     System.out.println(fname);
         System.out.println(mname);
         System.out.println(lname);
   
		WebElement fnameElement = driver.findElement(By.id("firstName"));
		WebElement mnameElement = driver.findElement(By.id("middleName"));
		WebElement lnameElement = driver.findElement(By.id("lastName"));

		fnameElement.sendKeys(fname);

		mnameElement.sendKeys(mname);

		lnameElement.sendKeys(lname);
		
       driver.findElement(By.id("btnSave")).click();
	   Thread.sleep(2000);
	
	}
//	
//	@Test(priority=2)
//	public void Verify()
//	{
//		
////		Verify in Table
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody"));
//		List<WebElement> TotalRows = table.findElements(By.tagName("tr"));
//		boolean valueFound = false;
//
//		for (int Row = 0; Row < TotalRows.size(); Row++) {
//			List<WebElement> TotalCells = TotalRows.get(Row).findElements(By.tagName("td"));
//			for (int Cell = 0; Cell < TotalCells.size(); Cell++) {
//				if (TotalCells.get(1).getText().equals("Akhil")) {
//					System.out.println("Add Job Title Found...In Row " + Row);
//					valueFound = true;
//					break;
//				}
//			}
//		}
//		if (valueFound == false) {
//			System.out.println("Add Job Title not found");
//		}
//		
//		Thread.sleep(2000);
////
////		//WebElement PIMMenu = driver.findElement(By.id("menu_pim_viewPimModule"));
////		actions.moveToElement(PIMMenu).perform();
////		Thread.sleep(5000);
//
////		Employee List
//		WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
//		actions.click(employeeList).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[5]/td[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[6]/a")).click();
//		driver.findElement(By.id("btnSave")).click();
//		
//		Thread.sleep(5000);
//
////		Verify in Employee Integration
//		WebElement element = driver.findElement(By.id("job_job_title"));
//		Select select = new Select(element);
//		String DDvalue = "Akhil";
//		
//		Thread.sleep(5000);
//
//		List<WebElement> allOptions = select.getOptions();
//		System.out.println(allOptions.size());
//
//		boolean found = false;
//		for (WebElement i : allOptions) {
//			if (i.getText().equals(DDvalue)) {
//				select.selectByVisibleText(i.getText());
//				found = true;
//				break;
//			}
//		}
//		if (found == true) {
//			System.out.println("Job Title Find in Employee Integration");
//		} else {
//			System.out.println("Job Title Not Find in Employee Integration");
//		}
//		
//	}
//	
  @DataProvider
	public Object[][] myDataProvider() throws Exception {

		return ExcelFile.getData("D:\\OrangeExcel.xlsx", "Sheet1");
	
	
}
}
