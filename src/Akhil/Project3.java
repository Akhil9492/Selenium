package Akhil;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		int j = 0;

		String[] itemsneeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot", "Potato" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1 Kg

			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
                       Thread.sleep(2000);
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in array or not

			List itemsneededList = Arrays.asList(itemsneeded);

			if (itemsneededList.contains(formattedname)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == 5) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector(" img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		// Explicitwait
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		 driver.findElement(By.xpath("//option[@value='Australia']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();

		
	}

}
