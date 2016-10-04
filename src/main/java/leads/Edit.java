package leads;

import org.testng.annotations.Test;
import wrappers.Opentapswrapper;

public class Edit extends  Opentapswrapper {
	
	@Test
	public void Leadcreate() throws Exception
	{	
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]", "sruthi");
		clickByXpath("(//button[@class='x-btn-text'])[6]");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		getTextById("sectionHeaderTitle_leads");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName","Renault");
		clickByClassName("smallSubmit");
		getTextByXpath("(//span[@class='tabletext'])[3]");
//		System.out.println("from edit lead");
		throw new Exception();
	}


}
