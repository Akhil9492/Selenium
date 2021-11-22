package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistationPage {

	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement RegLink;
	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement phone;

	@FindBy(name="userName")
	WebElement UserName;

	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;

	@FindBy(name="state")
	WebElement State;

	@FindBy(name="postalCode")
	WebElement PostalCode;

	@FindBy(name="email")
	WebElement Username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
  
	
	@FindBy(name="submit")
	WebElement registerBtn;
	
	
	        RegistationPage(WebDriver d){        // Constactor Created 
	        
	        	//this.driver=driver;
	        	
	        	driver=d;
	        	
	     PageFactory.initElements(d, this);	
	}
	     
	   public void clickRegLink() {
	  
		   RegLink.click();
	}
	        	
	  public void setFirstName(String fname)   {
	
		  FirstName.sendKeys(fname);
	  }
	  
	  public void setLastName(String lname)   {
			
		  LastName.sendKeys(lname);
	  }
	        	
	  public void setphone(String ph)   {
			
		  phone.sendKeys(ph);
	  }
	  
	  public void setUserName(String UN)   {
			
		  UserName.sendKeys(UN);
	  }
	        	  	
	        	
	  public void setaddress(String ad1)   {
			
		  address.sendKeys(ad1);
	  }
	  
	  public void setCity(String Cty)   {
			
		  city.sendKeys(Cty);
	  }
	        	
	  public void setState(String ste)   {
			
		  State.sendKeys(ste);
	  }
	  
	  public void setPostalCode(String PC)   {
			
		  PostalCode.sendKeys(PC);
	  } 	
	        	
	  public void setUsername(String email)   {
			
		  Username.sendKeys(email);
	  }
	        	
	  public void setpassword(String Pwd)   {
			
		  password.sendKeys(Pwd);
	  }
	  
	  public void setconfirmPassword(String Pwd1)   {
			
		  confirmPassword.sendKeys(Pwd1);
	  } 	
	        		
	        	
	  public void setregisterBtn()   {
			
		  registerBtn.click();
	  }	        }
  

