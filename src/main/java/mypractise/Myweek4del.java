package mypractise;

import org.testng.annotations.Test;

import wrappers.Opentapswrapper;

public class Myweek4del extends Opentapswrapper{
	@Test
	public void deletelead(){

		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByLink("Delete");
							

			   
		}

}
