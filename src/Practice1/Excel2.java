package Practice1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
OutputStream file=new FileOutputStream("D:\\Selenium Practice\\WriteData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		
		for(int i=0; i<=10;i++) {
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<=3;j++) {
				row.createCell(j).setCellValue("AkhilKumar Thota");
			}
		}
		
		workbook.write(file);
		file.close();
		System.out.println("written data into Excel is completed");
		
	}

}
