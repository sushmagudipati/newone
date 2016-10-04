package classwork;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Irctcwin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set <String> allwin= driver.getWindowHandles();
		for(String eachwin:allwin)
		{
			driver.switchTo().window(eachwin);
			System.out.println(driver.getWindowHandle());
		}
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		System.out.println(allwin.size());
		

	}

}
