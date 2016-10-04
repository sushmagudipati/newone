package groups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.Opentapswrapper;

public class Mergecontact extends Opentapswrapper{
	@Test(groups="regression",dataProvider="fetchData")
	 public void mergecontact(String comName,String fName,String lName) 
	{
		  	
	  System.out.println("the names are"+comName + fName + lName);
	 
	 }
	@Test
	

	 @DataProvider(name="fetchData")
	  
	public Object[][] getData()
	{
			
	return new Object[][]{
	{"vcl","sush","vadaparthi"},
	
	};
		
	}
	

}
