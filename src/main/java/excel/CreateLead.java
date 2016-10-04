package excel;
import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.ExcelToDB;
import wrappers.Opentapswrapper;

public class CreateLead extends Opentapswrapper {
	
	@Test(dataProvider="fetchData")
	public void createLead(String comName, String fName, String lName) throws Exception{
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",comName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException{		
		ExcelToDB excel = new ExcelToDB();
		return excel.readExcel();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
















}
