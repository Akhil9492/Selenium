package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelBaseClass {
	public static WebDriver driver;

	@BeforeMethod
	public static void URLNavigate() {

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(dataProvider = "myDataProvider")
	public static void loginFunction(String UserName, String Password) {

		System.out.println(UserName);

		System.out.println(Password);

		driver.findElement(By.id("txtUsername")).sendKeys(UserName);

		driver.findElement(By.id("txtPassword")).sendKeys(Password);

	}

	@DataProvider
	public Object[][] myDataProvider() throws Exception {

		return ExcelFile.getData("D:\\Excel1.xlsx", "Sheet1");
	}
}
