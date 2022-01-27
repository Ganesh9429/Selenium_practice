package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class excelDDt {

	
	
	

	@Test
		public void getSheetName() throws Throwable  {
			FileInputStream fil = new FileInputStream("D:\\workspace3\\selenium\\appData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fil);
			
		//sheet count 
			int sheetcount = workbook.getNumberOfSheets();
			System.out.println(sheetcount);
			System.out.println("Currently active sheet "+workbook.getActiveSheetIndex());
			
			
			
			
		}
		
		
		
		
		

	}


