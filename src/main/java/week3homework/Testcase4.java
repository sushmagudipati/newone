package week3homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		for (String winHandle1 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle1);
		}
		driver.findElementByName("id").sendKeys("10000");
		driver.findElementById("ext-gen114").click();
		driver.findElementByLinkText("10000").click();
		for (String winHandle2 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle2);
		}
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		//System.out.println("You have clicked To icon");
		for (String winHandle3 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle3);
		}
		driver.findElementByName("id").sendKeys("10001");
		driver.findElementById("ext-gen112").click();
		driver.findElementByLinkText("10001").click();
		for (String winHandle4 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle4);
		}
		driver.findElementByClassName("buttonDangerous").click();
		driver.switchTo().alert();
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); 
		String s= driver.getTitle();
		System.out.println("Actual Title:"+s);
		driver.quit();
			}
		

}
