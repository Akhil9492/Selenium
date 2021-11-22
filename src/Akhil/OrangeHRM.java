package Akhil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

//		Admin 
		Thread.sleep(5000);
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));

		Actions actions = new Actions(driver);

		actions.moveToElement(admin).perform();
		Thread.sleep(5000);

//		Job Title
		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		actions.moveToElement(job).perform();
		Thread.sleep(5000);

		WebElement jobTitle = driver.findElement(By.id("menu_admin_viewJobTitleList"));
		actions.click(jobTitle).perform();
		Thread.sleep(2000);

//		To save Job Title
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.name("jobTitle[jobTitle]")).sendKeys("Akhil");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		
//		Verify in Table
		WebElement table = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody"));
		List<WebElement> TotalRows = table.findElements(By.tagName("tr"));
		boolean valueFound = false;

		for (int Row = 0; Row < TotalRows.size(); Row++) {
			List<WebElement> TotalCells = TotalRows.get(Row).findElements(By.tagName("td"));
			for (int Cell = 0; Cell < TotalCells.size(); Cell++) {
				if (TotalCells.get(1).getText().equals("Akhil")) {
					System.out.println("Add Job Title Found...In Row " + Row);
					valueFound = true;
					break;
				}
			}
		}
		if (valueFound == false) {
			System.out.println("Add Job Title not found");
		}
		
		Thread.sleep(2000);

		WebElement PIMMenu = driver.findElement(By.id("menu_pim_viewPimModule"));
		actions.moveToElement(PIMMenu).perform();
		Thread.sleep(5000);

//		Employee List
		WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		actions.click(employeeList).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[5]/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[6]/a")).click();
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(5000);

//		Verify in Employee Integration
		WebElement element = driver.findElement(By.id("job_job_title"));
		Select select = new Select(element);
		String DDvalue = "Akhil";
		
		Thread.sleep(5000);

		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());

		boolean found = false;
		for (WebElement i : allOptions) {
			if (i.getText().equals(DDvalue)) {
				select.selectByVisibleText(i.getText());
				found = true;
				break;
			}
		}
		if (found == true) {
			System.out.println("Job Title Find in Employee Integration");
		} else {
			System.out.println("Job Title Not Find in Employee Integration");
		}
		
		
	}

}
