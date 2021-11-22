package Practice1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file=new FileInputStream("D:\\Selenium Practice\\Data1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");  //Providing sheet name
		
		//XSSFSheet sheet=workbook.getSheetAt(0); //Providing sheet name
		
		int rowcount=sheet.getLastRowNum(); // returns the row count
		
		int colcount=sheet.getRow(0).getLastCellNum();  // retuns colcomn/cell count
		
		for(int i=0;i<rowcount;i++) {
			XSSFRow currentrow=sheet.getRow(i);   // focused on current row
			
			for(int j=0; j<colcount;j++) {
				
				String value=currentrow.getCell(j).toString(); //read the value from the excel
				
				System.out.println(" "+value);
			}
			System.out.println();
		}
	}

}
