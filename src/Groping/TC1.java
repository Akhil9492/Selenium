package Groping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC1 {

	@Test(groups= {"smoke"})
	
	public void TC1() {
		
		System.out.println("Car started");
	}
	
	@Test(groups= {"Regression"})
     public void TC2() {
		
		System.out.println("Car driving");
	}
	
	@Test(groups= {"Functional testing"})
    public void TC3() {
		
		System.out.println("Car Stopped");
	}
	
	@Test(groups= {"Sanity,Regression"})
    public void TC4() {
		
		System.out.println("Car parking");
	}
	
	@Test(groups= {"Sanity,Retesting"})
    public void TC5() {
		
		System.out.println("Go to Outside");
	}
	
}
