
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(id="txtUsername")
	public static WebElement UserId;
	
	@FindBy(id="txtPassword")
	public static WebElement Password;
	
	@FindBy(name="Submit")
	public static WebElement LoginButton;

	}
	

