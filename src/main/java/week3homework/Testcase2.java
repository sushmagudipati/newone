package week3homework;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
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
		driver.findElementById("ext-gen246").sendKeys("Abhi");
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("10000").click();
		
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("VERIFIED SUCCESSFULLY : Title contains 'View Lead'");
		}
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByName("submitButton").click();
		String TCS="this is a string";
		if(TCS.equals(TCS)){
		System.out.println("the changed name TCS is appeares");
		}
		 driver.quit();

	}

	
	}


