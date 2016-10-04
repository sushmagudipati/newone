
package excel;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelToDBEdit {

	@Test
	public String[][] readExcel() throws IOException {
		
		String[][] data;

		// Create file input stream - For read use input Stream
		FileInputStream fis = new FileInputStream(new File("./data/editlead.xlsx"));

		// Open the workbook
		XSSFWorkbook wbook = new XSSFWorkbook(fis);

		// Go to the sheet
		XSSFSheet sheet1 = wbook.getSheet("Sheet1");

		// This return no of row in excel sheet
		int rowCount = sheet1.getLastRowNum();
		int colCount = sheet1.getRow(0).getLastCellNum();
		
		data = new String[rowCount][colCount];
	
		for (int i = 1; i <=rowCount; i++) {
			// go to row - 2
			XSSFRow row1 = sheet1.getRow(i);


			for (int j = 0; j <colCount; j++) {
				//go to cell - 0
				XSSFCell cell0 = row1.getCell(j);
				//System.out.println(cell0.getCellType());
				System.out.println(cell0.getStringCellValue());
				
				data[i-1][j]=cell0.getStringCellValue();

			}
			wbook.close();
		}
		return data;

	}
	
	



}
