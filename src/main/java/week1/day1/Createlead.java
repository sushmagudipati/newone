package week1.day1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createlead {
	

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();
   driver.get("http://demo1.opentaps.org");
   driver.manage().window().maximize();
   driver.findElementById("username").sendKeys("DemoCSR");
   driver.findElementById("password").sendKeys("crmsfa");
   driver.findElementByClassName("decorativeSubmit").click();
   driver.findElementByLinkText("CRM/SFA").click();
   driver.findElementByLinkText("Create Lead").click();
  
    driver.findElementByXPath("//*[@id='createLeadForm_companyName']").sendKeys("Photon interactive pvt ltd");
    driver.findElementById("createLeadForm_firstName").sendKeys("Kathick");
    driver.findElementById("createLeadForm_lastName").sendKeys("Ragunathan");
    driver.findElementByClassName("smallSubmit").click();
       
  
}

}

