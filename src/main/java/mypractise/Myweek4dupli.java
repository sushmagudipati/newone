package mypractise;

import org.testng.annotations.Test;

import wrappers.Opentapswrapper;

public class Myweek4dupli extends Opentapswrapper {
	@Test
	 public void duplicateLead()  {
		 
	 invokeApp("chrome", "http://demo1.opentaps.org/");
			
	enterById("username", "DemoCSR");
			
	enterById("password", "crmsfa");
			
	clickByClassName("decorativeSubmit");
			
	clickByLink("CRM/SFA");
			
	clickByLink("Leads");
			
	clickByLink("Find Leads");
			
	clickByXpath("(//a[@class='x-tab-right'])[3]");
			
	enterByName("emailAddress", "sruthir91@gmail.com");
			
	clickByXpath("(//button[@class='x-btn-text'])[6]");
			
	
			
	getTextByXpath("(//a[@class='linktext'])[6]");
			
	clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
			
	clickByClassName("subMenuButton");
			
	getTextByXpath("(//div[@class='x-panel-header sectionHeaderTitle'])");
			
	clickByClassName("smallSubmit");
			
	
			
	getTextByXpath("(//span[@id='viewLead_firstName_sp'])");
			
	
	}
	

}
