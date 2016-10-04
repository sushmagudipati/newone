package groups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import wrappers.Opentapswrapper;


public class Createcontact extends Opentapswrapper {
	
 
 @Test(groups="smoke",dataProvider="fetchData")
	
 public void createContact(String comName,String fName,String lName) 
{
	  	
  System.out.println("the names are"+comName + fName + lName);
 
 }
 @Test
	

 @DataProvider(name="fetchData")
  
public Object[][] getData()
{
		
return new Object[][]{
{"Renault","sruthi","bhagavatula"},
{"nissan","sruthi1","bhagavatula"}
};
	
}
 
 

}
