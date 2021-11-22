package Akhil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dotnettask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();


		driver.get("https://dotnetfiddle.net/");
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.xpath("//*[@id=\"CodeForm\"]/div[2]/div[3]/div[1]/input"));
		name.sendKeys("III");
		String value = name.getAttribute("value");
		System.out.println("Entered text is: " + value);

		if (value.startsWith("A") || value.startsWith("B") || value.startsWith("C") || value.startsWith("D")
				|| value.startsWith("E") || value.startsWith("F") || value.startsWith("G") || value.startsWith("H")) {
			Actions actions = new Actions(driver);

			WebElement nunit = driver.findElement(By.xpath("//*[@id=\"CodeForm\"]/div[2]/div[2]/div[5]/div/div/input"));
			nunit.sendKeys("nunit");
			actions.click(nunit).perform();
			String nunitValue = nunit.getAttribute("value");
			System.out.println("Entered text is: " + nunitValue);

			Thread.sleep(3000);

			WebElement nunit1 = driver.findElement(By.id("ui-id-1"));
			actions.moveToElement(nunit1).perform();
			Thread.sleep(3000);
//			WebElement version = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[1]/ul/li[4]/a"));
//			actions.click(version).perform();
//			
			//	WebElement nunit2 = driver.findElement(By.className("ui-menu ui-widget ui-widget-content ui-corner-all"));
//				List<WebElement> options = driver.findElements(By.xpath("//a[@package-id='NUnit']"));
//		        
//				for(WebElement option :options)
//				{
//					if(option.getText().equalsIgnoreCase("nunit"))
//					{
//						option.click();
//						break;
//					}
//				}
//			//			Select select = new Select(nunit2);
//			//			select.selectByVisibleText("3.12.0");
//
		}

		if (value.startsWith("I") || value.startsWith("J") || value.startsWith("K") || value.startsWith("L")
				|| value.startsWith("M") || value.startsWith("N")) {
			WebElement share = driver.findElement(By.id("Share"));
			share.click();
			WebElement shareLink = driver.findElement(By.id("ShareLink"));
			String shareLinkValue = shareLink.getAttribute("value");
//
//			if (shareLinkValue.startsWith("https://dotnetfiddle.net/")) {
//				System.out.println("ShareLinkValue....." + shareLinkValue);
//			}else {
//				System.out.println("ShareLinkValue not Displayed..." + shareLinkValue);
//			}
		}
//
//		if (value.startsWith("O") || value.startsWith("P") || value.startsWith("Q") || value.startsWith("R")
//				|| value.startsWith("S") || value.startsWith("T")) {
//			driver.findElement(By.id("save-button")).click();
//			WebElement logIn = driver.findElement(By.id("login-modal-label"));
//			boolean loginEnable = logIn.isEnabled();
//			if (loginEnable == true) {
//				System.out.println("Login Screen Displayed.." + loginEnable);
//			} else {
//				System.out.println("Login Screen Not Displayed.." + loginEnable);
//			}
//		}
//
//		if (value.startsWith("U") || value.startsWith("V") || value.startsWith("W") || value.startsWith("X")
//				|| value.startsWith("Y") || value.startsWith("Z")) {
//			driver.findElement(By.xpath("//*[@id=\"top-navbar\"]/div[2]/div[2]/div[5]/a")).click();
//			WebElement backTo = driver.findElement(By.linkText("Back To Editor"));
//			boolean backToEditor = backTo.isEnabled();
//			if (backToEditor == true) {
//				System.out.println("Back to Editor Displayed.." + backToEditor);
//			} else {
//				System.out.println("Back to Editor Not Displayed.." + backToEditor);
//			}
//		}

	}

}
