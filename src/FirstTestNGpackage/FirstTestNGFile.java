package FirstTestNGpackage;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public String baseUrl="http://newtours.demoaut.com/";
	 public WebDriver driver =new FirefoxDriver();
  @Test
  public void verifyHomepageTitle() {
	  driver.get(baseUrl);
	  String expectedTitle="Welcome:Mercury Tours";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(acctualTitle,expectedTitle);
	  driver.quit();
  }
}
