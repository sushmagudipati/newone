package excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;
public class WriteExcel1 {
	@Test
	public void readExcel() throws IOException{
		// Read the file
		File src=new File("C:\\myexcel\\login.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		// go to first sheet
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		// get the row count
		sheet.getRow(0).createCell(3).setCellValue("pass");
		sheet.getRow(1).createCell(3).setCellValue("fail");
		sheet.getRow(2).createCell(3).setCellValue("14.6");
		
		FileOutputStream fos=new FileOutputStream(src);
		wbook.write(fos);
		wbook.close();
	}
}