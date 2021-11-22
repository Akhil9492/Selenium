package TestNG;

public class DataProvider3 {
	
	@org.testng.annotations.DataProvider(name="LoginDataProvider")
	public Object[][]getData(){
		
		Object[][]data= {{"akhil@gmail.com","Akhil@3212"},{"Nikhil@gmail.com","abc123"},{"Nikhil@gmail.com","abc123"}};
		
		return data;
  }
	
	

}
