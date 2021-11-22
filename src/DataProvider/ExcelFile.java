package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	public static File f;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static int totalRows(String filepath,String sheetname) throws Exception
	{
		f=new File(filepath);
		fis=new FileInputStream(f);
		
		workbook=new XSSFWorkbook(fis);
		
		sheet=workbook.getSheet(sheetname);
		
		int totalRowsCount=sheet.getLastRowNum();
		
		return totalRowsCount;
		
		
		
	}
	
	public static int totalColumns(String filepath,String sheetname) throws Exception
	{
		f=new File(filepath);
		fis=new FileInputStream(f);
		
		workbook=new XSSFWorkbook(fis);
		
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(0);
		int totalColsCount=row.getLastCellNum();
		
		return totalColsCount;
		
		
		
	}
	
	public static String getCellData(String filepath,String sheetname,int rowNo,int colNo) throws Exception
	{
		f=new File(filepath);
		fis=new FileInputStream(f);
		
		workbook=new XSSFWorkbook(fis);
		
		sheet=workbook.getSheet(sheetname);
		//row=sheet.getRow(0);
	
		cell=sheet.getRow(rowNo).getCell(colNo);
		
		String CellData=null;
		
		
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
		 CellData=cell.getStringCellValue();
		
		}
		else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
				{
			int data=(int) cell.getNumericCellValue();
			
			CellData=String.valueOf(data);
				}
		return CellData;
		
	}
	
	
	
	
	public static Object[][] getData(String filepath,String sheetName) throws Exception
	{
		f=new File(filepath);
		fis=new FileInputStream(f);
		
		workbook=new XSSFWorkbook(fis);
		
		sheet=workbook.getSheet(sheetName);
		
		
		int totalRowCount=ExcelFile.totalRows(filepath, sheetName);
		
		int totalColsCount=ExcelFile.totalColumns(filepath, sheetName);
		
		
		Object[][] data=new Object[totalRowCount][totalColsCount];
		
		
		for(int rowNumber=1;rowNumber<=totalRowCount;rowNumber++)
		{
			
			for(int colNumber=0;colNumber<totalColsCount;colNumber++)
			{
				
	data[rowNumber-1]	[colNumber]	=	ExcelFile.getCellData(filepath, sheetName, rowNumber, colNumber);
				
			}
			
		}
		return data;
		
		
		
		
		
		
	}
}
