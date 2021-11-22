package Akhil;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

		System.setProperty("webdriver.chrome.driver",  "C://chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com/");
		 
		Set <Cookie> cookies=driver.manage().getCookies();  //capture all the cookies from the browser
		
		System.out.println("Size of cookies:" +cookies.size());   // print size of cookies
		
		for(Cookie cookie:cookies)  //read and print all the cookies
		{
			System.out.println(cookie.getName()+":" +cookie.getValue()); // print name and value of cookie
			
		}
		
		System.out.println(driver.manage().getCookieNamed("session-id-time"));  // print specific cookie
		
		
		// Cookie c1=new Cookie("mycookie","0123456788"); // add new cookie to the browser
		
		// driver.manage().addCookie(c1);
	}

}
