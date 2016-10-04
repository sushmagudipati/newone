package myleads;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.ExcelToDB;
import wrappers.Opentapswrapper;

public class Editlead extends Opentapswrapper{
	@Test(dataProvider="fetchData")
	public void createLead(String Leadid, String fName, String lName) throws Exception{
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByName("id",Leadid);
		enterByLink("Find Leads");
		clickByLink("10024");
		clickByLink("Edit");
		clickById("updateLeadForm_firstName","sushm");
		clickByName("submitButton");
		throw new Exception();
	}
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException{		
		ExcelToDB excel = new ExcelToDB();
		return excel.readExcel();

		
		

}

	
}