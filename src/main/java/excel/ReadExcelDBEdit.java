package excel;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import org.testng.annotations.Test;
	public class ReadExcelDBEdit {
		@Test
		public void readExcel() throws IOException{
			// Read the file
			FileInputStream fis = new FileInputStream(new File("./data/login.xlsx"));
			
			XSSFWorkbook wbook = new XSSFWorkbook(fis);
			// go to first sheet
			XSSFSheet sheet = wbook.getSheet("Sheet1");
			// get the row count
			int rowCount = sheet.getLastRowNum();
			
			for (int i = 1; i <=rowCount; i++) {
				// go to the row
				XSSFRow row1 = sheet.getRow(i);
				// go to the cell 1
				XSSFCell cell1 = row1.getCell(0);
				// print the content of the cell
				System.out.println(cell1.getStringCellValue());
				// go to the cell 2
				XSSFCell cell2 = row1.getCell(1);
				// print the content of the cell
				System.out.println(cell2.getStringCellValue());
			}
			wbook.close();
		}
	}

