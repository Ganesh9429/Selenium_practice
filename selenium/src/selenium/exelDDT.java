package selenium;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class exelDDT {

	@Test
	public void getSheetName() throws Throwable  {
		FileInputStream fil = new FileInputStream("C:\\Users\\Ganesh\\Desktop\\appData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		
	//sheet count 
		int sheetcount = workbook.getNumberOfSheets();
		System.out.println(sheetcount);
		System.out.println("Currently active sheet "+workbook.getActiveSheetIndex());
		
		 for(int i =0;i<sheetcount;i++) {
			 System.out.println(workbook.getSheetName(i));
		 }
		 XSSFSheet sheet = workbook.getSheet("LoginDeatils");
			int roeCount = sheet.getLastRowNum();
			System.out.println(roeCount);
			XSSFRow row = sheet.getRow(0);
			System.out.println(row);
		
	}
	
		
		
	}
	
	
	


