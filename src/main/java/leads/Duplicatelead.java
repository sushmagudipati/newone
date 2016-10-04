package leads;

import org.testng.annotations.Test;
import wrappers.Opentapswrapper;
public class Duplicatelead extends Opentapswrapper {
	@Test(dependsOnMethods={"leads.Createlead.createlead","leads.Merge.mergelead"})
	 

	public void  Duplicatelead()
	{
		System.out.println("from  Duplicatelead");
	}
	

}
