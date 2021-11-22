package TestNG;

import org.testng.annotations.Test;

public class DataProvider2 {
	

	@Test(dataProvider="LoginDataProvider",dataProviderClass=DataProvider3.class)
	
	public void loginTest(String email, String Pwd) {
		System.out.println(email+" "+Pwd);
	}
}
