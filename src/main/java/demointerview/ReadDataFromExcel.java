package demointerview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	
	static String filePath = "c://test.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] readExcelData(String sheetName) {
		Object [][] data = null;
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			book = WorkbookFactory.create(fis);
			sheet = book.getSheet(sheetName);
			
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i=0; i<sheet.getLastRowNum();i++) {
				
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					
					data [i][j] = sheet.getRow(i+1).getCell(j).toString();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return data;
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object [][] data = ReadDataFromExcel.readExcelData("Sheet Name");
		
		return data;
		
	}
	
	
	@Test(dataProvider = "getData")
	public void getTestDataTest(String firstName, String lastName, String dob) {
		
		
	}
	
	
	@DataProvider
	public void dataRead() {
		
		//Object [][] data = new Object[3][2];
		
		//return new Object["abc",10,"klm",20];
	}
	
}
