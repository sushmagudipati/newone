package week3homework;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://demo1.opentaps.org");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("xyz");
		driver.findElementById("createLeadForm_firstName").sendKeys("Abhiradh");
		driver.findElementById("createLeadForm_lastName").sendKeys("V");
		Select dropDown=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dropDown.selectByVisibleText("Cold Call");
		Select dropDown1=new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		dropDown1.selectByVisibleText("Affiliate Sites");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876543210");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sushmavadaparthi@gmail.com");
		driver.findElementByName("submitButton").click();
		 File src =driver.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src, new File("./snaps/snap.jpeg"));
		   driver.quit();
		
		
	  

		
		
	}

	
	
	
}

