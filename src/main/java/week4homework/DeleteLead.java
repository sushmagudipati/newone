package week4homework;

import org.testng.annotations.Test;

import wrappers.Opentapswrapper;

public class DeleteLead  extends Opentapswrapper{
	@Test(dependsOnMethods="Createlead")
	public void  DeleteLead()
	{
		//System.out.println("from delete lead");
		clickByLink("Leads");
		
		clickByLink("Find Leads");
				
		clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
				
		enterByName("phoneNumber","9094385789");
				
		clickByXpath("(//button[@class='x-btn-text'])[6]");
				
		getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
				
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
				
		clickByClassName("subMenuButtonDangerous");
				
		clickByLink("Find Leads");
				
		enterByXpath("(//input[@class=' x-form-text x-form-field'])[21]", "10032");
				
		clickByXpath("(//button[@class='x-btn-text'])[6]");
				
		getTextByClassName("x-paging-info");
				
		closeBrowser();
		}

	
	}

	

	
		
	
		

	
	



