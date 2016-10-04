package week3homework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

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
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Phone").click();
		driver.findElementById("ext-gen270").sendKeys("9876543219");
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("10010");
			System.out.println("the first resulting lead id is captured:");
			File src =driver.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(src, new File("./snaps/snap.jpeg"));
		driver.findElementByLinkText("10010").click();
    	driver.findElementByLinkText("Delete").click();
    	driver.findElementByLinkText("Find Leads").click();
    	driver.findElementById("ext-gen246").sendKeys("10010");
    	driver.findElementByLinkText("Find Leads").click();
    	 driver.quit();
    	
    	
				
		  

}
}
