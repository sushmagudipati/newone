package week4homework;

import org.testng.annotations.Test;
import wrappers.Opentapswrapper;

public class Mergelead extends  Opentapswrapper {
	
	@Test(invocationTimeOut=20000)
	public void mergelead()
	{
		//System.out.println("from merge lead");
		clickByLink("Leads");
		
		clickByLink("Merge Leads");
				
		clickByXpath("(//img[@alt='Lookup'])[1]");
				
		switchToLastWindow();
				
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
				
		switchToParentWindow();
				
		clickByXpath("(//img[@alt='Lookup'])[2]");
				
		switchToLastWindow();
				
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
				
		switchToParentWindow();
				
		clickByLink("Merge");
				
		acceptAlert();
				
		clickByLink("Find Leads");
				
		enterByXpath("//input[@class=' x-form-text x-form-field '])", "Renult");
				
		clickByXpath("(//button[@class='x-btn-text'])[6]");
				
		getTextByXpath("(//div[@class='x-paging-info'])");
		}
		

	}
	


