package week2.hw2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Mergelead {

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
		Thread.sleep(5000);
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		//System.out.println("You have clicked From icon");
		for (String winHandle1 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle1);
		}
		driver.findElementByName("id").sendKeys("10062");
		driver.findElementById("ext-gen279").click();               
		driver.findElementByLinkText("10062").click();
		//System.out.println("Switching to parent frame");
		for (String winHandle2 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle2);
		}
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		//System.out.println("You have clicked To icon");
		for (String winHandle3 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle3);
		}
		driver.findElementByName("id").sendKeys("10053");
		driver.findElementById("ext-gen112").click();
		driver.findElementByLinkText("10053").click();
		//System.out.println("Switching to parent frame");
		for (String winHandle4 : driver.getWindowHandles()) {		
			driver.switchTo().window(winHandle4);
		}
		driver.findElementByClassName("buttonDangerous").click();
		//System.out.println("You have clicked on Merge button");
		driver.switchTo().alert();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//System.out.println("You have clicked on Accept!!!");
		String s= driver.getTitle();
		System.out.println("Actual Title:"+s);
		if(s.contains("View Lead")){
			System.out.println("Title is Verified");
			}
		else{
			System.out.println("Title is not Verified");
		}
		
	}
	
}
