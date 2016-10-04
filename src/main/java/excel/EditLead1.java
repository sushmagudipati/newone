package excel;

	import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	import wrappers.Opentapswrapper;

	public class EditLead1 extends  Opentapswrapper {
		
		@Test(dataProvider="fetchData")
		public void createLead(String Qeagle, String fName, String lName) throws Exception{
			clickByLink("Leads");
			clickByLink("Find Leads");
			enterById("ext-gen252",Qeagle);
			clickByLink("Find Leads");
			clickByLink("10004");
			clickByLink("Edit");
			clickByName("firstName","sushm");
			clickByName("submitButton");
			throw new Exception();
		}
		@DataProvider(name="fetchData")
		public String[][] getData() throws IOException{		
			ExcelToDB excel = new ExcelToDB();
			return excel.readExcel();

			
			

	}

		
	}