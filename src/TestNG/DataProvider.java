package TestNG;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="LoginDataProvider")
	
	public void loginTest(String email, String Pwd) {
		System.out.println(email+" "+Pwd);
	}

	
	
	@org.testng.annotations.DataProvider(name="LoginDataProvider")
	public Object[][]getData(){
		
		Object[][]data= {{"akhil@gmail.com","Akhil@3212"},{"Nikhil@gmail.com","abc123"},{"Nikhil@gmail.com","abc123"}};
		
		return data;
	}
}
