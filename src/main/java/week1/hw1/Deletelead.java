package week1.hw1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
						
						
						
						driver.get("http://demo1.opentaps.org");
						driver.manage().window().maximize();
						
						driver.findElementById("username").sendKeys("DemoCSR");
						driver.findElementById("password").sendKeys("crmsfa");
						driver.findElementByClassName("decorativeSubmit").click();
						driver.findElementByLinkText("CRM/SFA").click();
						driver.findElementByLinkText("Leads").click();
						driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
						driver.findElementByLinkText("Delete").click();
						driver.close();

		   
	}

}
