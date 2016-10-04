package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {

	@Test
	public void writeExcel() throws IOException {

		// Use output stream to write and append the data in excel
		FileOutputStream fos = new FileOutputStream(new File("./data/report.xlsx"));

		// Create work book
		XSSFWorkbook wbook = new XSSFWorkbook();

		// Create sheet
		XSSFSheet sheet1 = wbook.createSheet();
		// Create row
		
		XSSFRow row0 = sheet1.createRow(0);

		// create cell - 1
		
		XSSFCell cell0 = row0.createCell(0);

		// Give cell name
		cell0.setCellValue("TestCase Number");
		
		// create cell - 2
		XSSFCell cell1 = row0.createCell(1);

		// Give cell name
		cell1.setCellValue("TestCase Status");

		// Write is must , unless it doesn't write the data in your excel sheet
		wbook.write(fos);
		
		// Best practice close the file stream and work book for leakage issue

		wbook.close();
		
		fos.close();




	}
}
