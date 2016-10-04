package groups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.Opentapswrapper;


public class DeleteContact extends Opentapswrapper {

	@Test(groups="regression",dataProvider="fetchData")
	 public void Deletecontact(String comName,String fName,String lName) 
	{
		  	
	  System.out.println("the names are"+comName + fName + lName);
	 
	 }
	@Test
	

	 @DataProvider(name="fetchData")
	  
	public Object[][] getData()
	{
			
	return new Object[][]{
	{"Renault","suppu","gongura"},
	{"nissan","supraja","gudipati"}
	};
		
	}
	

}
